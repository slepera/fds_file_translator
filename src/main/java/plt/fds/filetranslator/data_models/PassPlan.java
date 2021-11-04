package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class PassPlan {

    public SignalHeaderType signalHeaderType;
    public ArrayList<VisibilityType> visibilityType;

    public PassPlan()
    {
        this.signalHeaderType = new SignalHeaderType();
        this.visibilityType = new ArrayList<VisibilityType>();

    }

    public static class VisibilityType {
         public String contactID;
         //public EnumMissionID missionrefID;
         public String missionrefID;
         public EnumSatID spacecraftrefID;
         public EnumGroundStationID groundstationrefID;
         //public DateTimeType startEpoch;
         public String startEpoch;
         //public DateTimeType stopEpoch;
         public String stopEpoch;
         public String visibilitymaskID;
         public EnumContactLookingGeometry looksideGeometry;
         public String remarks;
    }

    public void addVisibilityType (VisibilityType visibilityType)
    {
        this.visibilityType.add(visibilityType);
    }
}
