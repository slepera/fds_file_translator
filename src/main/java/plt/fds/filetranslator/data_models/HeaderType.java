package plt.fds.filetranslator.data_models;

public class HeaderType {
    public String getMissionID() {
        return missionID;
    }

    public void setMissionID(String missionID) {
        this.missionID = missionID;
    }

    //public EnumMissionID missionID;
    public String missionID;
    //public EnumSatID satelliteID;
    public String satelliteID;
    public String originatorID;
    public String originatorRole;
    //public DateTimeType creationTime;
    public String creationTime;
    //public EnumSubjectTypes subjectType;
    public String subjectType;
    public String spare;
    //public EnumSignalAim signalAim;
    public String signalAim;

    public HeaderType()
    {
        this.missionID = new String();
        this.satelliteID = new String();
        this.originatorID = new String();
        this.originatorRole = new String();
        this.creationTime = new String();
        this.subjectType = new String();
        this.spare = new String();
        this.signalAim = new String();
    }

}
