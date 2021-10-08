package plt.fds.filetranslator.data_models;

public class PassPlan {
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
        public String missionID;
        public String satelliteID;
        //to be completed with info in figure
    }

    public class VisibilityType {
     public String missionID;
     public String satelliteID;
     public String stationID;
    //to be completed with info in figure

    }
}
