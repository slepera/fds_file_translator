package plt.fds.filetranslator.format_manager;

import plt.fds.filetranslator.data_models.BulletinAOutputModel;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class BulletinATranslator {

    public static BulletinAOutputModel Translate(String string) {

        int TAI_UTC = 0;
        ArrayList<String> x_values = new ArrayList<>();
        ArrayList<String> y_values = new ArrayList<>();
        ArrayList<String> UT1_UTC_values = new ArrayList<>();

        BulletinAOutputModel aom = new BulletinAOutputModel();

        try {

            BufferedReader br = new BufferedReader(new FileReader(string));
            String line;

            while ((line = br.readLine()) != null) {
                boolean b1 = Pattern.matches(".*TAI-UTC =.*", line);
                final int cte_TAI_UTC = 19;
                if (b1) {
                    String[] tmp = line.trim().split(" ");
                    String[] tmp_1 = tmp[2].split("\\.");
                    Integer tmp_2 = Integer.valueOf(tmp_1[0]);
                    TAI_UTC = tmp_2 - cte_TAI_UTC;
                }

                boolean b2 = Pattern.matches(".* x = .*", line);
                if (b2) {
                    String[] tmp1 = line.trim().split(" ");
                    for (int i = 0; i < tmp1.length; i++) {
                        if (tmp1[i].equals("-")) {
                            x_values.add(tmp1[i] + tmp1[i + 1]);
                            i++;
                        } else if (Pattern.matches("\\d\\..*", tmp1[i])) {
                            x_values.add(tmp1[i]);
                        }
                    }
                }

                boolean b3 = Pattern.matches(".* y = .*", line);
                if (b3) {
                    String[] tmp2 = line.trim().split(" ");
                    for (int i = 0; i < tmp2.length; i++) {
                        if (tmp2[i].equals("-")) {
                            y_values.add(tmp2[i] + tmp2[i + 1]);
                            i++;
                        } else if (Pattern.matches("\\d\\..*", tmp2[i])) {
                            y_values.add(tmp2[i]);
                        }
                    }
                }

                boolean b4 = Pattern.matches(".* UT1-UTC = .*", line);
                if (b4) {
                    String[] tmp3 = line.trim().split(" ");
                    for (int i = 0; i < tmp3.length; i++) {
                        if ((Pattern.matches("[-+]\\d\\..*", tmp3[i]))) {
                            UT1_UTC_values.add(tmp3[i]);
                        } else if (Pattern.matches("\\d\\..*", tmp3[i])) {
                            UT1_UTC_values.add(tmp3[i]);
                        }
                        if (tmp3[i].equals("-")) {
                            if (Pattern.matches("\\d\\..*", tmp3[i + 1])) {
                                UT1_UTC_values.add(tmp3[i] + tmp3[i + 1]);
                                i++;
                            }
                        }

                    }
                }
            }
            br.close();

            aom.TAI_UTC = TAI_UTC;
            aom.x_values = x_values;
            aom.y_values = y_values;
            aom.UT1_UTC_values = UT1_UTC_values;



            //System.out.println("TAI-UTC: " + this.TAI_UTC);
            //System.out.println("x_values: " + this.x_values);
            //System.out.println("y_values: " + this.y_values);
            //System.out.println("UT1_UTC_values: " + this.UT1_UTC_values);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return aom;

    }
}
