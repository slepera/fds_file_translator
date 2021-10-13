package plt.fds.filetranslator.data_models;

public class OrbitalEvents {

    public SignalHeaderType signalHeaderType;
    public OrbitalEvent[] orbitalEventsData;

    public  OrbitalEvents() {

        this.signalHeaderType = new SignalHeaderType();
        this.orbitalEventsData = new OrbitalEvent[2];

        for (int i = 0; i < orbitalEventsData.length; i++)
        {
            this.orbitalEventsData[i] = new OrbitalEvent();
        }
    }

    public class OrbitalEvent {
        //public EnumMissionID missionRefID;
        public String missionRefID;
        //public EnumSatID spacecraftRefID;
        public String spacecraftRefID;
        //public enumOrbitalEventTypes orbitalEventType;
        public String orbitalEventType;
        public String eventName;
        public String eventID;
        //public DateTimeType startEpoch;
        public String startEpoch;
        //public DateTimeType stopEpoch;
        public String stopEpoch;
        public String remarks;

    }

}
