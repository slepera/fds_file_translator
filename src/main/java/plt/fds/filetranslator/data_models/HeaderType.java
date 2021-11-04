package plt.fds.filetranslator.data_models;

public class HeaderType {

    //public EnumMissionID missionID;
    public String missionID;
    public EnumSatID satelliteID;
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
        this.originatorID = new String();
        this.originatorRole = new String();
        this.creationTime = new String();
        this.subjectType = new String();
        this.spare = new String();
        this.signalAim = new String();
    }

    public String getMissionID() {
        return missionID;
    }

    public void setMissionID(String missionID) {
        this.missionID = missionID;
    }

    public EnumSatID getSatelliteID() {
        return satelliteID;
    }

    public void setSatelliteID(EnumSatID satelliteID) {
        this.satelliteID = satelliteID;
    }

    public String getOriginatorID() {
        return originatorID;
    }

    public void setOriginatorID(String originatorID) {
        this.originatorID = originatorID;
    }

    public String getOriginatorRole() {
        return originatorRole;
    }

    public void setOriginatorRole(String originatorRole) {
        this.originatorRole = originatorRole;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare;
    }

    public String getSignalAim() {
        return signalAim;
    }

    public void setSignalAim(String signalAim) {
        this.signalAim = signalAim;
    }

}
