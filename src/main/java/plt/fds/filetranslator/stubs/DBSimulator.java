package plt.fds.filetranslator.stubs;

import plt.fds.filetranslator.data_models.AttitudeFile;
import plt.fds.filetranslator.data_models.ManoeuvrePlan;
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

    public static AttitudeFile getAttitudeFile()
    {
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

    public static ManoeuvrePlan getManoeuvrePlan()
    {
        ManoeuvrePlan manoeuvrePlan = new ManoeuvrePlan();

        manoeuvrePlan.manPlanHeader.nbManLeg = 123;
        manoeuvrePlan.manPlanHeader.signalID = "324";
        manoeuvrePlan.manPlanHeader.recipientID = "1298";
        manoeuvrePlan.manPlanHeader.validityTimeWindow = "hi";
        manoeuvrePlan.manPlanHeader.missionID = "010101";
        manoeuvrePlan.manPlanHeader.satelliteID = "2222";
        manoeuvrePlan.manPlanHeader.originatorID = "8888";
        manoeuvrePlan.manPlanHeader.originatorRole = "bye";
        manoeuvrePlan.manPlanHeader.creationTime = "12:02";
        manoeuvrePlan.manPlanHeader.subjectType = "role";
        manoeuvrePlan.manPlanHeader.spare = "food";
        manoeuvrePlan.manPlanHeader.signalAim = "good";

        manoeuvrePlan.manLeg[0].legID = "209";
        manoeuvrePlan.manLeg[0].legManType = "man";
        manoeuvrePlan.manLeg[0].legStartTime = "14:30";
        manoeuvrePlan.manLeg[0].legStopTime = "15:45";
        manoeuvrePlan.manLeg[0].blockingFlag = "woman";
        manoeuvrePlan.manLeg[0].legNBMan = 763;
        manoeuvrePlan.manLeg[0].remarks = "adiós";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].targetReferenceMode = "Adele";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].attManParams[0] = 23.9;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].attManParams[1] = 32.8;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].downlinkParameter.antennaVers = "easy";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].downlinkParameter.stationPos = "on me";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].localOrbitalParameters.q_ORB2BRF = "peaches";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.nbWayPoints = 964;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[0].wayPointID = 2534;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[0].epoch = "light";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[0].q_ECI2BRF = "dark";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[0].w_BRF = "dawn";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[0].w_dot_BRF = "night";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[1].wayPointID = 98754;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[1].epoch = "today";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[1].q_ECI2BRF = "tomorrow";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[1].w_BRF = "day";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[1].w_dot_BRF = "afternoon";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[2].wayPointID = 21133;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[2].epoch = "tomorrow";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[2].q_ECI2BRF = "evening";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[2].w_BRF = "night";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].customParameters.customWayPoint[2].w_dot_BRF = "foodie";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].manID = "no room";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].execStartTime = "16:07";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].execStopTime = "16:35";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].initialAttitude = "Hello";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].finalAttitude = "no signal";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].manType = "ATTITUDE";

        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.signalID = "awpo";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.recipientID = "btbb";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.validityTimeWindow = "cwcc";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.missionID = "dddw";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.satelliteID = "eewe";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.originatorID = "ffwf";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.originatorRole = "gwgg";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.creationTime = "hhwh";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.subjectType = "jjwj";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.spare = "kkwk";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].signalHeaderType.signalAim = "wlll";

        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.taskName = "mmwm";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.taskType = "nnnw";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.parameterSetName = "ñwññ";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.parameterValueSetName = "owoo";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.destination = "ppwp";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.source = "qqwq";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.nbRecords = 9587;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.releaseTime = "rwrr";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.earliestReleaseTime = "ssws";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.latestReleaseTime = "ttwt";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.executionTime = "uuwu";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.subScheduleID = 222242;
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfHeader.tpfRemarks = "vvwv";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramName = "twww";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValueType = "wrww2";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValue = "xxxr";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValueUnit = "ryyy";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValueRadix = "zrzz";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramRemarks = "z2zr";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramName = "www34r";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValueType = "1rwww2";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValue = "xxx67r";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValueUnit = "y3r2yy";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValueRadix = "zzr42z";
        manoeuvrePlan.manLeg[0].attitudeManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramRemarks = "z2z98r";

        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].orbMansParams[0] = 2.1;
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].orbMansParams[1] = 3.9;
        /*
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].manID = "sunny";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].execStartTime = "09:26";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].execStopTime = "11:30";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].initialAttitude = "9875";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].finalAttitude = "18765";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].manType = "ORBITAL";

        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.satelliteID = "eee";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.taskType = "nnn";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.destination = "ppp";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.source = "qqq";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramName = "www";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValueType = "www2";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValue = "xxx";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValueUnit = "yyy";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramValueRadix = "zzz";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[0].paramRemarks = "z2z";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramName = "www34";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValueType = "1www2";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValue = "xxx67";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValueUnit = "y32yy";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramValueRadix = "zz42z";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[0].tpf[0].tpfBody.tpfRecord[1].paramRemarks = "z2z98"; */

        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].orbMansParams[0] = 7.8;
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].orbMansParams[1] = 0.9;
        /*
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].manID = "cloudy";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].execStartTime = "09:26";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].execStopTime = "11:30";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].initialAttitude = "9875";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].finalAttitude = "18765";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].manType = "ORBITAL";

        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.satelliteID = "eee";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.taskType = "nnn";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.destination = "ppp";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.source = "qqq";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[0].paramName = "www";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[0].paramValueType = "www2";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[0].paramValue = "xxx";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[0].paramValueUnit = "yyy";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[0].paramValueRadix = "zzz";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[0].paramRemarks = "z2z";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[1].paramName = "www34";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[1].paramValueType = "1www2";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[1].paramValue = "xxx67";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[1].paramValueUnit = "y32yy";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[1].paramValueRadix = "zz42z";
        manoeuvrePlan.manLeg[0].orbitalManoeuvre[1].tpf[1].tpfBody.tpfRecord[1].paramRemarks = "z2z98";
        */

        return manoeuvrePlan;

    }

}
