package plt.fds.filetranslator.data_models;

public class ManLeg {

    public String legID;
    public String legManType;
    //public DateTimeType legStartTime;
    public String legStartTime;
    //public DateTimeType legStopTime;
    public String legStopTime;
    //public EnumBlockingFlag blockingFlag;
    public String blockingFlag;
    public int legNBMan;
    public String remarks;
    public AttitudeManoeuvre[] attitudeManoeuvre;
    public OrbitalManoeuvre [] orbitalManoeuvre;

    public ManLeg()
    {
        this.legID = new String();
        this.legManType = new String();
        this.legStartTime = new String();
        this.legStopTime = new String();
        this.blockingFlag = new String();
        int legNBMan = this.legNBMan;
        //this.legNBMan = new Integer();
        this.remarks = new String();
        this.attitudeManoeuvre = new AttitudeManoeuvre[2];
        for (int i = 0; i < this.attitudeManoeuvre.length; i++) {
            this.attitudeManoeuvre[i] = new AttitudeManoeuvre();
        }

        this.orbitalManoeuvre = new OrbitalManoeuvre[1];
        for (int j = 0; j < this.orbitalManoeuvre.length; j++) {
            this.orbitalManoeuvre[j] = new OrbitalManoeuvre();
        }




    }

}
