package plt.fds.filetranslator.data_models;

import java.util.ArrayList;

public class OrbitalEvents {

    public SignalHeaderType signalHeaderType;
    public ArrayList<OrbitalEvent> orbitalEventsData;

    public  OrbitalEvents() {

        this.signalHeaderType = new SignalHeaderType();
        this.orbitalEventsData = new ArrayList<OrbitalEvent>();

    }

    public static class OrbitalEvent {
        //public EnumMissionID missionRefID;
        public String missionRefID = new String();
        public EnumSatID spacecraftRefID ;
        public EnumOrbitalEventTypes orbitalEventType;
        public String eventName = new String();
        public String eventID = new String();
        //public DateTimeType startEpoch;
        public String startEpoch = new String();
        //public DateTimeType stopEpoch;
        public String stopEpoch = new String();
        public String remarks = new String();

    }

    public void addOrbitalEvent (OrbitalEvent orbitalEventsData)
    {
        this.orbitalEventsData.add(orbitalEventsData);
    }

}
