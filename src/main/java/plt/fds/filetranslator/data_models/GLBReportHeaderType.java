package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class GLBReportHeaderType extends HeaderType {

    public ArrayList<String> keyParamID;
    //public DateTimeType startTimestamp;
    public String startTimestamp;
    //public DateTimeType stopTimestamp;
    public String stopTimestamp;

    public GLBReportHeaderType(){
        keyParamID = new ArrayList<>();
        startTimestamp = new String();
        stopTimestamp = new String();
    }

    public void addkeyParamID (String keyParamID) {
        this.keyParamID.add(keyParamID);
    }

}
