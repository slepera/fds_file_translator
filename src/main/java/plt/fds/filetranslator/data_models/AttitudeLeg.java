package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class AttitudeLeg {
    //public DateTimeType legStartTime;
    public String legStartTime;
    //public DateTimeType legStopTime;
    public String legStopTime;
    //public EnumLegAttitudeType legAttitudeType;
    public String legAttitudeType;
    public ArrayList<Integer> legNBAttitudeDataPoints;
    public ArrayList<AttitudeFileRecords> attitudeFileRecords;

    public AttitudeLeg() {
        this.legStartTime = new String();
        this.legStopTime = new String();
        this.legAttitudeType = new String();
        this.legNBAttitudeDataPoints = new ArrayList<Integer>();
        this.attitudeFileRecords = new ArrayList<AttitudeFileRecords>();
    }

    public  void addLegNBAttitudeDataPoints(Integer legNBAttitudeDataPoints)
    {
        this.legNBAttitudeDataPoints.add(legNBAttitudeDataPoints);
    }


    public void addAttitudeFileRecords(AttitudeFileRecords attitudeFileRecords)
    {
        this.attitudeFileRecords.add(attitudeFileRecords);
    }

}
