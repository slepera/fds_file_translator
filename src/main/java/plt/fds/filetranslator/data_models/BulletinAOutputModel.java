package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class BulletinAOutputModel {

    public int TAI_UTC;
    public ArrayList<String> x_values;
    public ArrayList<String> y_values;
    public ArrayList<String> UT1_UTC_values;

    public BulletinAOutputModel(){
        x_values = new ArrayList<>();
        y_values = new ArrayList<>();
        UT1_UTC_values = new ArrayList<>();

    }



}
