package plt.fds.filetranslator.stubs;

import plt.fds.filetranslator.data_models.*;

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

        passPlan.addVisibilityType(new PassPlan.VisibilityType());
        passPlan.visibilityType.get(0).contactID = "Sat1";
        passPlan.visibilityType.get(0).missionrefID = "Station1";
        passPlan.visibilityType.get(0).spacecraftrefID = "0909";
        passPlan.visibilityType.get(0).groundstationrefID = "03030";
        passPlan.visibilityType.get(0).startEpoch = "13:50";
        passPlan.visibilityType.get(0).stopEpoch = "14:30";
        passPlan.visibilityType.get(0).visibilitymaskID = "1234";
        passPlan.visibilityType.get(0).looksideGeometry = "LEFT";
        passPlan.visibilityType.get(0).remarks = "none";
        passPlan.addVisibilityType(new PassPlan.VisibilityType());
        passPlan.visibilityType.get(1).contactID = "Sat1";
        passPlan.visibilityType.get(1).missionrefID = "Station2";
        passPlan.visibilityType.get(1).spacecraftrefID = "7453";
        passPlan.visibilityType.get(1).groundstationrefID = "7070";
        passPlan.visibilityType.get(1).startEpoch = "13:00";
        passPlan.visibilityType.get(1).stopEpoch = "15:00";
        passPlan.visibilityType.get(1).visibilitymaskID = "6789";
        passPlan.visibilityType.get(1).looksideGeometry = "RIGHT";
        passPlan.visibilityType.get(1).remarks = "null";
        passPlan.addVisibilityType(new PassPlan.VisibilityType());
        passPlan.visibilityType.get(2).contactID = "Sat1";
        passPlan.visibilityType.get(2).missionrefID = "Station3";
        passPlan.visibilityType.get(2).spacecraftrefID = "1954";
        passPlan.visibilityType.get(2).groundstationrefID = "2054";
        passPlan.visibilityType.get(2).startEpoch = "12:00";
        passPlan.visibilityType.get(2).stopEpoch = "13:00";
        passPlan.visibilityType.get(2).visibilitymaskID = "1111";
        passPlan.visibilityType.get(2).looksideGeometry = "RIGHT";
        passPlan.visibilityType.get(2).remarks = "maybe";

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

        attitudeFile.addAttitudeLeg(new AttitudeLeg());
        attitudeFile.attitudeLegs.get(0).legStartTime = "12:30";
        attitudeFile.attitudeLegs.get(0).legStopTime = "12:45";
        attitudeFile.attitudeLegs.get(0).legAttitudeType = "high";
        attitudeFile.attitudeLegs.get(0).addLegNBAttitudeDataPoints(320);
        attitudeFile.attitudeLegs.get(0).addLegNBAttitudeDataPoints(876);
        attitudeFile.attitudeLegs.get(0).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).epoch = "idea";
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).quaternion = "derecha";
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).angularVelocity = "positive";
        attitudeFile.attitudeLegs.get(0).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).epoch = "magari";
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).quaternion = "izquierda";
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).angularVelocity = "negative";

        attitudeFile.addAttitudeLeg(new AttitudeLeg());
        attitudeFile.attitudeLegs.get(1).legStartTime = "15:28";
        attitudeFile.attitudeLegs.get(1).legStopTime = "18:00";
        attitudeFile.attitudeLegs.get(1).legAttitudeType = "low";
        attitudeFile.attitudeLegs.get(1).legNBAttitudeDataPoints.add(0,817);
        attitudeFile.attitudeLegs.get(1).legNBAttitudeDataPoints.add(1, 290);
        attitudeFile.attitudeLegs.get(1).legNBAttitudeDataPoints.add(2, 947);
        attitudeFile.attitudeLegs.get(1).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).epoch = "summer";
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).quaternion = "down";
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).angularVelocity = "gym";
        attitudeFile.attitudeLegs.get(1).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).epoch = "oppure";
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).quaternion = "dritto";
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).angularVelocity = "citofono";

        attitudeFile.addAttitudeLeg(new AttitudeLeg());
        attitudeFile.attitudeLegs.get(2).legStartTime = "09:15";
        attitudeFile.attitudeLegs.get(2).legStopTime = "10:00";
        attitudeFile.attitudeLegs.get(2).legAttitudeType = "high";
        attitudeFile.attitudeLegs.get(2).legNBAttitudeDataPoints.add(0,123);
        attitudeFile.attitudeLegs.get(2).legNBAttitudeDataPoints.add(1, 456);
        attitudeFile.attitudeLegs.get(2).legNBAttitudeDataPoints.add(2, 789);
        attitudeFile.attitudeLegs.get(2).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).epoch = "winter";
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).quaternion = "down";
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).angularVelocity = "gym";
        attitudeFile.attitudeLegs.get(2).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(1).epoch = "oppure";
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(1).quaternion = "dritto";
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(1).angularVelocity = "citofono";

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

        orbitalEvents.addOrbitalEvent(new OrbitalEvents.OrbitalEvent());
        orbitalEvents.orbitalEventsData.get(0).missionRefID = "wjgt";
        orbitalEvents.orbitalEventsData.get(0).spacecraftRefID = "ajhjf";
        orbitalEvents.orbitalEventsData.get(0).orbitalEventType = "lcmfhg";
        orbitalEvents.orbitalEventsData.get(0).eventName = "lakdget";
        orbitalEvents.orbitalEventsData.get(0).eventID = "qqqq";
        orbitalEvents.orbitalEventsData.get(0).startEpoch = "17:32";
        orbitalEvents.orbitalEventsData.get(0).stopEpoch = "18:00";
        orbitalEvents.orbitalEventsData.get(0).remarks = "out";
        orbitalEvents.addOrbitalEvent(new OrbitalEvents.OrbitalEvent());
        orbitalEvents.orbitalEventsData.get(1).missionRefID = "hola";
        orbitalEvents.orbitalEventsData.get(1).spacecraftRefID = "adios";
        orbitalEvents.orbitalEventsData.get(1).orbitalEventType = "buenas";
        orbitalEvents.orbitalEventsData.get(1).eventName = "malas";
        orbitalEvents.orbitalEventsData.get(1).eventID = "interesante";
        orbitalEvents.orbitalEventsData.get(1).startEpoch = "17:";
        orbitalEvents.orbitalEventsData.get(1).stopEpoch = "18:32";
        orbitalEvents.orbitalEventsData.get(1).remarks = "in";

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

        manoeuvrePlan.addManLeg(new ManLeg());
        manoeuvrePlan.manLeg.get(0).legID = "209";
        manoeuvrePlan.manLeg.get(0).legManType = "man";
        manoeuvrePlan.manLeg.get(0).legStartTime = "14:30";
        manoeuvrePlan.manLeg.get(0).legStopTime = "15:45";
        manoeuvrePlan.manLeg.get(0).blockingFlag = "woman";
        manoeuvrePlan.manLeg.get(0).legNBMan = 763;
        manoeuvrePlan.manLeg.get(0).remarks = "adiós";

        manoeuvrePlan.manLeg.get(0).addAttitudeManoeuvre(new AttitudeManoeuvre());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).targetReferenceMode = "Adele";

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).addAttManParams(23.9);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).addAttManParams(32.8);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.antennaVers = "easy";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.stationPos = "on me";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).localOrbitalParameters.q_ORB2BRF = "peaches";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.nbWayPoints = 964;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.addCustomWayPoint(new CustomWayPoint());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).wayPointID = 2534;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).epoch = "light";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).q_ECI2BRF = "dark";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_BRF = "dawn";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_dot_BRF = "night";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.addCustomWayPoint(new CustomWayPoint());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).wayPointID = 98754;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).epoch = "today";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).q_ECI2BRF = "tomorrow";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_BRF = "day";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_dot_BRF = "afternoon";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.addCustomWayPoint(new CustomWayPoint());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).wayPointID = 21133;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).epoch = "tomorrow";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).q_ECI2BRF = "evening";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_BRF = "night";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_dot_BRF = "foodie";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).manID = "no room";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).execStartTime = "16:07";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).execStopTime = "16:35";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).initialAttitude = "Hello";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).finalAttitude = "no signal";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).manType = "ATTITUDE";

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.signalID = "awpo";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.recipientID = "btbb";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.validityTimeWindow = "cwcc";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.missionID = "dddw";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.satelliteID = "eewe";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorID = "ffwf";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorRole = "gwgg";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.creationTime = "hhwh";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.subjectType = "jjwj";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.spare = "kkwk";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.signalAim = "wlll";

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.taskName = "mmwm";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.taskType = "nnnw";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.parameterSetName = "ñwññ";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.parameterValueSetName = "owoo";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.destination = "ppwp";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.source = "qqwq";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.nbRecords = 9587;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.releaseTime = "rwrr";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.earliestReleaseTime = "ssws";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.latestReleaseTime = "ttwt";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.executionTime = "uuwu";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.subScheduleID = 222242;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.tpfRemarks = "vvwv";

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramName = "twww";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueType = "wrww2";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValue = "xxxr";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueUnit = "ryyy";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueRadix = "zrzz";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramRemarks = "z2zr";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramName = "www34r";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueType = "1rwww2";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValue = "xxx67r";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueUnit = "y3r2yy";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueRadix = "zzr42z";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98r";

        manoeuvrePlan.manLeg.get(0).addOrbitalManoeuvre(new OrbitalManoeuvre());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addOrbMansParams(2.1);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addOrbMansParams(32.4);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addOrbMansParams(18.33);

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).manID = "sunny";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).execStartTime = "09:26";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).execStopTime = "11:30";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).initialAttitude = "9875";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).finalAttitude = "18765";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).manType = "ORBITAL";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.satelliteID = "eee";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.taskType = "nnn";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.destination = "ppp";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.source = "qqq";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueType = "www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueRadix = "zzz";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueType = "1www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueUnit = "y32yy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueRadix = "zz42z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramName = "prueba";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValueType = "prueba";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValue = "prueba";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValueUnit = "prueba";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValueRadix = "prueba";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramRemarks = "prueba";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.satelliteID = "eee";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.taskType = "nnn";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.destination = "ppp";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.source = "qqq";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueType = "www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueRadix = "zzz";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueType = "1www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueUnit = "y32yy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueRadix = "zz42z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        manoeuvrePlan.manLeg.get(0).addOrbitalManoeuvre(new OrbitalManoeuvre());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addOrbMansParams(7.8);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addOrbMansParams(0.9);

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).manID = "cloudy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).execStartTime = "09:26";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).execStopTime = "11:30";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).initialAttitude = "9875";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).finalAttitude = "18765";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).manType = "ORBITAL";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.satelliteID = "eee";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.taskType = "nnn";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.destination = "ppp";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.source = "qqq";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueType = "www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueRadix = "zzz";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueType = "1www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueUnit = "y32yy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueRadix = "zz42z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.satelliteID = "eee";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.taskType = "nnn";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.destination = "ppp";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.source = "qqq";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueType = "www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueRadix = "zzz";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueType = "1www2";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueUnit = "y32yy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueRadix = "zz42z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        return manoeuvrePlan;

    }

    public static TPF getTPF(){

        TPF tpf = new TPF();

        tpf.tpfHeader.taskName = "01234567";
        tpf.tpfHeader.taskType = "9";
        tpf.tpfHeader.parameterSetName = "11-15-18";
        tpf.tpfHeader.parameterValueSetName = "20-25-27";
        tpf.tpfHeader.destination = "1";
        tpf.tpfHeader.source = "3";
        tpf.tpfHeader.nbRecords = 157;
        tpf.tpfHeader.releaseTime = "01234567890123456789";
        tpf.tpfHeader.earliestReleaseTime = "98765432109876543210";
        tpf.tpfHeader.latestReleaseTime = "01234567890123456789";
        tpf.tpfHeader.executionTime = "01234567890123456789";
        tpf.tpfHeader.subScheduleID = 21225;
        tpf.tpfHeader.tpfRemarks = "vvv";
        tpf.tpfBody.addTPFRecords(new TPFRecords());
        tpf.tpfBody.tpfRecord.get(0).paramName = "01234567";
        tpf.tpfBody.tpfRecord.get(0).paramValueType = "9";
        tpf.tpfBody.tpfRecord.get(0).paramValue = "01234567890123456789";
        tpf.tpfBody.tpfRecord.get(0).paramValueUnit = "3235";
        tpf.tpfBody.tpfRecord.get(0).paramValueRadix = "7";
        tpf.tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        tpf.tpfBody.addTPFRecords(new TPFRecords());
        tpf.tpfBody.tpfRecord.get(1).paramName = "www34po";
        tpf.tpfBody.tpfRecord.get(1).paramValueType = "1";
        tpf.tpfBody.tpfRecord.get(1).paramValue = "abcdefghijklmñnopqrt";
        tpf.tpfBody.tpfRecord.get(1).paramValueUnit = "y32y";
        tpf.tpfBody.tpfRecord.get(1).paramValueRadix = "z";
        tpf.tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        return tpf;
    }

}
