package plt.fds.filetranslator;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class BulletinATranslator {

    int TAI_UTC;
    ArrayList<String> x_values = new ArrayList<>();
    ArrayList<String> y_values = new ArrayList<>();
    ArrayList<String> UT1_UTC_values = new ArrayList<>();

    public BulletinATranslator(String string) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(string));
            String line;

            while ((line = br.readLine()) != null) {
            boolean b1 = Pattern.matches(".*TAI-UTC =.*", line);
            int cte_TAI_UTC = 19;
            if (b1) {
                String [] tmp = line.trim().split(" ");
                String [] tmp_1 = tmp[2].split("\\.");
                Integer tmp_2 = Integer.valueOf(tmp_1[0]);
                this.TAI_UTC = tmp_2 - cte_TAI_UTC;
                System.out.println("TAI-UTC: " + this.TAI_UTC);
            }

            boolean b2 = Pattern.matches(".* x = .*", line);
            if (b2) {
                String [] tmp1 = line.trim().split(" ");
                //System.out.println("tmp1: " + Arrays.toString(tmp1));
                for (int i = 0; i<tmp1.length; i++){
                    //System.out.println("value of i:" + i);
                    if (tmp1[i].equals("-")){
                        this.x_values.add(tmp1[i]+tmp1[i+1]);
                        i++;
                    } else if (Pattern.matches("\\d\\..*", tmp1[i])){
                        this.x_values.add(tmp1[i]);
                    }
                }
                System.out.println("x_values: " + this.x_values);

                line = br.readLine();
                String [] tmp2 = line.trim().split(" ");
                for (int i = 0; i<tmp2.length; i++){
                    if (tmp2[i].equals("-")){
                        this.y_values.add(tmp2[i]+tmp2[i+1]);
                        i ++;
                    } else if (Pattern.matches("\\d\\..*", tmp2[i])){
                        this.y_values.add(tmp2[i]);
                    }
                }
                System.out.println("y_values: " + this.y_values);

                line = br.readLine();
                String [] tmp3 = line.trim().split(" ");
                System.out.println("tmp3: " + Arrays.toString(tmp3));
                for (int i = 0; i<tmp3.length ; i++){
                    //System.out.println("value of i:" + i);
                    if ((Pattern.matches("(-|\\+)\\d\\..*", tmp3[i]))){
                        this.UT1_UTC_values.add(tmp3[i]);
                    } else if (Pattern.matches("\\d\\..*", tmp3[i])) {
                        this.UT1_UTC_values.add(tmp3[i]);
                    }
                    if (tmp3[i].equals("-")) {
                        if (Pattern.matches("\\d\\..*", tmp3[i+1])) {
                            this.UT1_UTC_values.add(tmp3[i]+tmp3[i+1]);
                            i++;
                        }
                    }

                }
                System.out.println("UT1_UTC_values: " + this.UT1_UTC_values);

            }
            }	br.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
