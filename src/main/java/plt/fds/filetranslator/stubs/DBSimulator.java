package plt.fds.filetranslator.stubs;

import plt.fds.filetranslator.data_models.AttitudeFile;
import plt.fds.filetranslator.data_models.OrbitalEvents;
import plt.fds.filetranslator.data_models.PassPlan;

public class DBSimulator {

    public static PassPlan getPassPlan()
    {
        PassPlan passPlan = new PassPlan();

        passPlan.signalHeaderType.signalID = "000";
        passPlan.signalHeaderType.recipientID = "111";
        passPlan.signalHeaderType.validityTimeWindow = "hi";
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

    public static AttitudeFile getAttitudeFile() {

        AttitudeFile attitudeFile = new AttitudeFile();

        attitudeFile.attitudeFileHeader.nbAttitudelegs = 234;
        attitudeFile.attitudeFileHeader.referenceFrame = "de acuerdo";
        attitudeFile.attitudeFileHeader.principalPlane = "desacuerdo";
        attitudeFile.attitudeFileHeader.columnLabelsAndUnits = "imparcial";
        attitudeFile.attitudeFileHeader.signalID = "333";
        attitudeFile.attitudeFileHeader.recipientID = "222";
        attitudeFile.attitudeFileHeader.validityTimeWindow = "bye";
        attitudeFile.attitudeFileHeader.missionID = "090909";
        attitudeFile.attitudeFileHeader.satelliteID = "777";
        attitudeFile.attitudeFileHeader.originatorID = "abc";
        attitudeFile.attitudeFileHeader.originatorRole = "xyz";
        attitudeFile.attitudeFileHeader.creationTime = "12:20";
        attitudeFile.attitudeFileHeader.subjectType = "actor";
        attitudeFile.attitudeFileHeader.spare = "meat";
        attitudeFile.attitudeFileHeader.signalAim = "bad";

        attitudeFile.attitudeLegs[0].legStartTime = "12:30";
        attitudeFile.attitudeLegs[0].legStopTime = "12:45";
        attitudeFile.attitudeLegs[0].legAttitudeType = "high";
        attitudeFile.attitudeLegs[0].legNBAttitudeDataPoints[0] = 321;
        attitudeFile.attitudeLegs[0].legNBAttitudeDataPoints[1] = 876;
        attitudeFile.attitudeLegs[0].attitudeFileRecords[0].epoch = "idea";
        attitudeFile.attitudeLegs[0].attitudeFileRecords[0].quaternion = "derecha";
        attitudeFile.attitudeLegs[0].attitudeFileRecords[0].angularVelocity = "positive";
        attitudeFile.attitudeLegs[0].attitudeFileRecords[1].epoch = "magari";
        attitudeFile.attitudeLegs[0].attitudeFileRecords[1].quaternion = "izquierda";
        attitudeFile.attitudeLegs[0].attitudeFileRecords[1].angularVelocity = "negative";

        attitudeFile.attitudeLegs[1].legStartTime = "15:28";
        attitudeFile.attitudeLegs[1].legStopTime = "18:00";
        attitudeFile.attitudeLegs[1].legAttitudeType = "low";
        attitudeFile.attitudeLegs[1].legNBAttitudeDataPoints[0] = 817;
        attitudeFile.attitudeLegs[1].legNBAttitudeDataPoints[1] = 290;
        attitudeFile.attitudeLegs[1].attitudeFileRecords[0].epoch = "summer";
        attitudeFile.attitudeLegs[1].attitudeFileRecords[0].quaternion = "down";
        attitudeFile.attitudeLegs[1].attitudeFileRecords[0].angularVelocity = "gym";
        attitudeFile.attitudeLegs[1].attitudeFileRecords[1].epoch = "oppure";
        attitudeFile.attitudeLegs[1].attitudeFileRecords[1].quaternion = "dritto";
        attitudeFile.attitudeLegs[1].attitudeFileRecords[1].angularVelocity = "citofono";

        return attitudeFile;
    }

    public static OrbitalEvents getOrbitalEvents()
    {
        OrbitalEvents orbitalEvents = new OrbitalEvents();

        orbitalEvents.signalHeaderType.signalID = "555";
        orbitalEvents.signalHeaderType.recipientID = "008";
        orbitalEvents.signalHeaderType.validityTimeWindow = "hello";
        orbitalEvents.signalHeaderType.missionID = "2876";
        orbitalEvents.signalHeaderType.satelliteID = "9154";
        orbitalEvents.signalHeaderType.originatorID = "94444";
        orbitalEvents.signalHeaderType.originatorRole = "hi";
        orbitalEvents.signalHeaderType.creationTime = "17:16";
        orbitalEvents.signalHeaderType.subjectType = "end";
        orbitalEvents.signalHeaderType.spare = "comida";
        orbitalEvents.signalHeaderType.signalAim = "bad";

        orbitalEvents.orbitalEventsData[0].missionRefID = "wjgt";
        orbitalEvents.orbitalEventsData[0].spacecraftRefID = "ajhjf";
        orbitalEvents.orbitalEventsData[0].orbitalEventType = "lcmfhg";
        orbitalEvents.orbitalEventsData[0].eventName = "lakdget";
        orbitalEvents.orbitalEventsData[0].eventID = "qqqq";
        orbitalEvents.orbitalEventsData[0].startEpoch = "17:32";
        orbitalEvents.orbitalEventsData[0].stopEpoch = "18:00";
        orbitalEvents.orbitalEventsData[0].remarks = "out";

        orbitalEvents.orbitalEventsData[1].missionRefID = "hola";
        orbitalEvents.orbitalEventsData[1].spacecraftRefID = "adios";
        orbitalEvents.orbitalEventsData[1].orbitalEventType = "buenas";
        orbitalEvents.orbitalEventsData[1].eventName = "malas";
        orbitalEvents.orbitalEventsData[1].eventID = "interesante";
        orbitalEvents.orbitalEventsData[1].startEpoch = "17:";
        orbitalEvents.orbitalEventsData[1].stopEpoch = "18:32";
        orbitalEvents.orbitalEventsData[1].remarks = "in";

        return orbitalEvents;
    }


}
