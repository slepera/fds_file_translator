package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class KeyParamBodyType {

    //public ArrayList<DateTimeType> keyParamTimestamp;
    public ArrayList<String> keyParamTimestamp;
    public ArrayList<Double> keyParamValue;
    public ArrayList<String> keyParamEngineeringValue;
    public String reportMessage;

    public KeyParamBodyType(){
        keyParamTimestamp = new ArrayList<>();
        keyParamValue = new ArrayList<>();
        keyParamEngineeringValue = new ArrayList<>();
        reportMessage = new String();

    }

    public void addkeyParamTimestamp (String keyParamTimestamp) {
        this.keyParamTimestamp.add(keyParamTimestamp);
    }

    public void addkeyParamValue (Double keyParamValue) {
        this.keyParamValue.add(keyParamValue);
    }

    public void addkeyParamEngineeringValue (String keyParamEngineeringValue){
        this.keyParamEngineeringValue.add(keyParamEngineeringValue);
    }


}
