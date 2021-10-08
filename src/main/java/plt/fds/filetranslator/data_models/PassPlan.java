package plt.fds.filetranslator.data_models;

public class PassPlan {
    /*
    signalHeaderType + HeaderType = 11 variables
    visibility = 9 variables for each block
     */
    public SignalHeaderType signalHeaderType;
    public VisibilityType[] visibilityTypes;

    public PassPlan()
    {
        this.signalHeaderType = new SignalHeaderType();
        this.visibilityTypes = new VisibilityType[3];
        for(int i = 0; i < visibilityTypes.length; i++)
        {
            this.visibilityTypes[i] = new VisibilityType();
        }
    }


    public class SignalHeaderType {
        public String signalID;
        public String recipientID;
        //public TimeWindowType ValidityTimeWindow;
        public String validitytimeWindow;
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
    }

    public class VisibilityType {
         public String contactID;
         //public EnumMissionID missionrefID;
         public String missionrefID;
         //public EnnumSatID spacecraftrefID;
         public String spacecraftrefID;
         //public EnumGroundStationID groundstationrefID;
         public String groundstationrefID;
         //public DateTimeType startEpoch;
         public String startEpoch;
         //public DateTimeType stopEpoch;
         public String stopEpoch;
         public String visibilitymaskID;
         //public EnumContactLookingGeometry looksideGeometry;
         public String looksideGeometry;
         public String remarks;
    }
}
