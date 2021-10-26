package plt.fds.filetranslator;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class EOPTranslator {

    public String output_file_eop;

    private class OutputStructure {
        String MJD_utc;
        String flags;
        String PM_x;
        String PM_y;
        String ut1_utc;
    }

    public EOPTranslator(String string) {

        ArrayList <OutputStructure> osa = new ArrayList<OutputStructure>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(string));
            String line;
            boolean no_values;
            while ((line = br.readLine()) != null) {
                OutputStructure tmp1 = new OutputStructure();

                boolean value_MJD_utc = line.substring(7,15).trim().isEmpty(); // || line.substring(7,15) == null
                boolean value_flags = line.substring(16,17).trim().isEmpty(); // || line.substring(16,17) == null
                boolean value_PM_x = line.substring(18,27).trim().isEmpty(); // || line.substring(18,27) == null
                boolean value_PM_y = line.substring(37,46).trim().isEmpty(); // || line.substring(37,46) == null
                boolean value_ut1_utc = line.substring(58,68).trim().isEmpty(); // || line.substring(58,68) == null

                if (value_MJD_utc || value_flags || value_PM_x || value_PM_y || value_ut1_utc) {
                   no_values = true;
                } else {
                    no_values = false;
                }

                if (no_values){
                    line = br.readLine();
                } else {
                    tmp1.MJD_utc = line.substring(7,15);
                    tmp1.flags = line.substring(16,17);
                    tmp1.PM_x = line.substring(18,27);
                    tmp1.PM_y = line.substring(37,46);
                    tmp1.ut1_utc = line.substring(58,68);
                    osa.add(tmp1);
                }
            }

            br.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter rb = null;

        try {

            String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
            DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
            this.output_file_eop = "./data/output/EOP/ut1utc.dat " + europeanDateFormatter.format(LocalDateTime.now()) + ".txt";
            rb = new BufferedWriter(new FileWriter(this.output_file_eop));

            for (int i = 0; i<osa.size(); i++) {
            /* CAREFUL with the whitespaces, due to the positive/negative numbers, that CAN NOT BE REMOVED */
                rb.write("      " + osa.get(i).MJD_utc + "      " + osa.get(i).flags + "         " + osa.get(i).PM_x + "      " + osa.get(i).PM_y + "       " + osa.get(i).ut1_utc);
                rb.newLine();
                rb.flush();

            }

            rb.close();

        } catch (IOException e) {
            System.out.println("Issue writing the information into the file.");
            e.printStackTrace();
        }


    }

}
