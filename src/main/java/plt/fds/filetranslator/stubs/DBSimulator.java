package plt.fds.filetranslator.stubs;

import plt.fds.filetranslator.data_models.PassPlan;

public class DBSimulator {
    public static PassPlan getPassPlan()
    {
        PassPlan passPlan = new PassPlan();

        passPlan.signalHeaderType.missionID = "mission";
        passPlan.signalHeaderType.satelliteID = "satellite";
        // to be completed according with figure

        passPlan.visibilityTypes[0].satelliteID= "Sat1";
        passPlan.visibilityTypes[0].stationID= "Station1";
        // to be completed according with figure

        passPlan.visibilityTypes[1].satelliteID= "Sat1";
        passPlan.visibilityTypes[1].stationID= "Station2";
        // to be completed according with figure


        passPlan.visibilityTypes[2].satelliteID= "Sat2";
        passPlan.visibilityTypes[2].stationID= "Station3";
        // to be completed according with figure

        return passPlan;
    }
}
