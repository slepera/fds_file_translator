package plt.fds.filetranslator.data_models;

public class AttitudeLeg extends AttitudeFileRecords {
    //public DateTimeType legStartTime;
    public String legStartTime;
    //public DateTimeType legStopTime;
    public String legStopTime;
    //public EnumLegAttitudeType legAttitudeType;
    public String legAttitudeType;
    public int[] legNBAttitudeDataPoints;
    public AttitudeFileRecords[] attitudeFileRecords;

    public AttitudeLeg() {
        this.legStartTime = new String();
        this.legStopTime = new String();
        this.legAttitudeType = new String();
        this.legNBAttitudeDataPoints = new int[2];
        for (int i = 0; i < legNBAttitudeDataPoints.length; i++)
        {
            int legNBAttitudeDataPoint = this.legNBAttitudeDataPoints[i];
        }

        this.attitudeFileRecords = new AttitudeFileRecords[2];
        for (int j = 0; j < attitudeFileRecords.length; j++)
        {
            this.attitudeFileRecords[j] = new AttitudeFileRecords();
        }


    }
}
