package plt.fds.filetranslator.stubs;

import plt.fds.filetranslator.data_models.PassPlan;

public class DBSimulator {
    public static PassPlan getPassPlan()
    {
        PassPlan passPlan = new PassPlan();

        passPlan.signalHeaderType.signalID = "000";
        passPlan.signalHeaderType.recipientID = "111";
        passPlan.signalHeaderType.validitytimeWindow = "hi";
        passPlan.signalHeaderType.missionID = "010101";
        passPlan.signalHeaderType.satelliteID = "2222";
        passPlan.signalHeaderType.originatorID = "8888";
        passPlan.signalHeaderType.originatorRole = "bye";
        passPlan.signalHeaderType.creationTime = "12:02";
        passPlan.signalHeaderType.subjectType = "role";
        passPlan.signalHeaderType.spare = "food";
        passPlan.signalHeaderType.signalAim = "good";

        passPlan.visibilityTypes[0].contactID = "Sat1";
        passPlan.visibilityTypes[0].missionrefID = "Station1";
        passPlan.visibilityTypes[0].spacecraftrefID = "0909";
        passPlan.visibilityTypes[0].groundstationrefID = "03030";
        passPlan.visibilityTypes[0].startEpoch = "13:50";
        passPlan.visibilityTypes[0].stopEpoch = "14:30";
        passPlan.visibilityTypes[0].visibilitymaskID = "1234";
        passPlan.visibilityTypes[0].looksideGeometry = "LEFT";
        passPlan.visibilityTypes[0].remarks = "none";

        passPlan.visibilityTypes[1].contactID = "Sat1";
        passPlan.visibilityTypes[1].missionrefID = "Station2";
        passPlan.visibilityTypes[1].spacecraftrefID = "7453";
        passPlan.visibilityTypes[1].groundstationrefID = "7070";
        passPlan.visibilityTypes[1].startEpoch = "13:00";
        passPlan.visibilityTypes[1].stopEpoch = "15:00";
        passPlan.visibilityTypes[1].visibilitymaskID = "6789";
        passPlan.visibilityTypes[1].looksideGeometry = "RIGHT";
        passPlan.visibilityTypes[1].remarks = "null";

        passPlan.visibilityTypes[2].contactID = "Sat1";
        passPlan.visibilityTypes[2].missionrefID = "Station3";
        passPlan.visibilityTypes[2].spacecraftrefID = "1954";
        passPlan.visibilityTypes[2].groundstationrefID = "2054";
        passPlan.visibilityTypes[2].startEpoch = "12:00";
        passPlan.visibilityTypes[2].stopEpoch = "13:00";
        passPlan.visibilityTypes[2].visibilitymaskID = "1111";
        passPlan.visibilityTypes[2].looksideGeometry = "RIGHT";
        passPlan.visibilityTypes[2].remarks = "maybe";

        return passPlan;
    }
}
