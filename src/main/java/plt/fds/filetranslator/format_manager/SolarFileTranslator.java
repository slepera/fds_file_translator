package plt.fds.filetranslator.format_manager;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class SolarFileTranslator {

    public  String output_file_solar_flux;
    private String Lines =  "// this data is taken from Mean Nominal Long term Schatten predicts\r\n"
            + "\r\n" // = new line
            + "// data is given as F10.7 flux and Ap\r\n"
            + "\r\n"
            + "JR File\r\n"
            + "\r\n"
            + "F10.7 Ap\r\n"
            + "\r\n";

    private class OutputStructure {
        String date;
        String Ap;
        String Flux;
    }

    ArrayList <OutputStructure> osa = new ArrayList<OutputStructure>();

    public SolarFileTranslator(String string) {

        //ArrayList <OutputStructure> osa = new ArrayList<OutputStructure>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(string));
            String line;
            int j = 0;
            boolean flux = false;
            boolean b1;
            while ((line = br.readLine()) != null) {
                b1 = Pattern.matches(".*FLUX.*", line);
                if (b1) {
                    j = 0;
                    flux = true;
                }

                boolean b3 = Pattern.matches("[0-9]{2}[a-zA-Z]{3}[0-9]{2}.*", line);

                if (b3) {
                    String[] tmp = line.split(" ");
                    int i = 0;
                    while (i < tmp.length) {
                        if (flux) {
                            if (i%2 == 0) {
                                i ++;
                            } else {
                                osa.get(j).Flux = tmp[i];
                                i++;
                                j++;
                            }
                        } else {
                            if (i%2 == 0) {
                                OutputStructure tmp1 = new OutputStructure();
                                tmp1.date = tmp[i];
                                osa.add(tmp1);
                                i ++;
                            } else {
                                osa.get(j).Ap = tmp[i];
                                i++;
                                j++;
                            }
                        }
                    }
                }
            }	br.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter rb = null;

        try {

            String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
            DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
            this.output_file_solar_flux = "./data/output/solar flux/" + europeanDateFormatter.format(LocalDateTime.now()) + ".txt";
            rb = new BufferedWriter(new FileWriter(this.output_file_solar_flux));
            rb.write(Lines);
            for (int i = 0; i<osa.size(); i++) {
                String month,year,day;
                day = osa.get(i).date.substring(0, 2);
                month = osa.get(i).date.substring(2, 5);
                year = osa.get(i).date.substring(5, 7);

                String date_final = month.toUpperCase() + " " + day + " " + "20" + year;

                rb.write("      " + date_final + "    " + osa.get(i).Flux + "    " + osa.get(i).Ap);
                rb.newLine();
                rb.newLine();
                rb.flush();
            } rb.close();

        } catch (IOException e) {
            System.out.println("Issue writing the information into the file.");
            e.printStackTrace();
        }
    }

}
