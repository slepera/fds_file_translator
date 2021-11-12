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
        passPlan.signalHeaderType.satelliteID = EnumSatID.S01;
        passPlan.signalHeaderType.originatorID = "8888";
        passPlan.signalHeaderType.originatorRole = "bye";
        passPlan.signalHeaderType.creationTime = "12:02";
        passPlan.signalHeaderType.subjectType = "role";
        passPlan.signalHeaderType.spare = "food";
        passPlan.signalHeaderType.signalAim = "good";

        passPlan.addVisibilityType(new PassPlan.VisibilityType());
        passPlan.visibilityType.get(0).contactID = "Sat1";
        passPlan.visibilityType.get(0).missionrefID = "Station1";
        passPlan.visibilityType.get(0).spacecraftrefID = EnumSatID.S02;
        passPlan.visibilityType.get(0).groundstationrefID = EnumGroundStationID.STATION01;
        passPlan.visibilityType.get(0).startEpoch = "13:50";
        passPlan.visibilityType.get(0).stopEpoch = "14:30";
        passPlan.visibilityType.get(0).visibilitymaskID = "1234";
        passPlan.visibilityType.get(0).looksideGeometry = EnumContactLookingGeometry.LEFT;
        passPlan.visibilityType.get(0).remarks = "none";
        passPlan.addVisibilityType(new PassPlan.VisibilityType());
        passPlan.visibilityType.get(1).contactID = "Sat1";
        passPlan.visibilityType.get(1).missionrefID = "Station2";
        passPlan.visibilityType.get(1).spacecraftrefID = EnumSatID.S02;
        passPlan.visibilityType.get(1).groundstationrefID = EnumGroundStationID.STATION02;
        passPlan.visibilityType.get(1).startEpoch = "13:00";
        passPlan.visibilityType.get(1).stopEpoch = "15:00";
        passPlan.visibilityType.get(1).visibilitymaskID = "6789";
        passPlan.visibilityType.get(1).looksideGeometry = EnumContactLookingGeometry.RIGHT;
        passPlan.visibilityType.get(1).remarks = "null";
        passPlan.addVisibilityType(new PassPlan.VisibilityType());
        passPlan.visibilityType.get(2).contactID = "Sat1";
        passPlan.visibilityType.get(2).missionrefID = "Station3";
        passPlan.visibilityType.get(2).spacecraftrefID = EnumSatID.S02;
        passPlan.visibilityType.get(2).groundstationrefID = EnumGroundStationID.STATION03;
        passPlan.visibilityType.get(2).startEpoch = "12:00";
        passPlan.visibilityType.get(2).stopEpoch = "13:00";
        passPlan.visibilityType.get(2).visibilitymaskID = "1111";
        passPlan.visibilityType.get(2).looksideGeometry = EnumContactLookingGeometry.LEFT;
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
        attitudeFile.attitudeFileHeader.satelliteID = EnumSatID.S01;
        attitudeFile.attitudeFileHeader.originatorID = "abc";
        attitudeFile.attitudeFileHeader.originatorRole = "xyz";
        attitudeFile.attitudeFileHeader.creationTime = "12:20";
        attitudeFile.attitudeFileHeader.subjectType = "actor";
        attitudeFile.attitudeFileHeader.spare = "meat";
        attitudeFile.attitudeFileHeader.signalAim = "bad";

        attitudeFile.addAttitudeLeg(new AttitudeLeg());
        attitudeFile.attitudeLegs.get(0).legStartTime = "12:30";
        attitudeFile.attitudeLegs.get(0).legStopTime = "12:45";
        attitudeFile.attitudeLegs.get(0).legAttitudeType = EnumLegAttitudeType.CUSTOM;
        attitudeFile.attitudeLegs.get(0).addLegNBAttitudeDataPoints(320);
        attitudeFile.attitudeLegs.get(0).addLegNBAttitudeDataPoints(876);
        attitudeFile.attitudeLegs.get(0).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).epoch = "idea";
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).quaternion.q1 = 63467;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).quaternion.q2 = 73656;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).quaternion.q3 = 93737;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).quaternion.q4 = 49535;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).angularVelocity.x = 744635;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).angularVelocity.y = 46374;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(0).angularVelocity.z = 5767685;
        attitudeFile.attitudeLegs.get(0).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).epoch = "magari";
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).quaternion.q1 = 73656;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).quaternion.q2 = 73656;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).quaternion.q3 = 93737;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).quaternion.q4 = 73656;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).angularVelocity.x = 744635;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).angularVelocity.y = 46374;
        attitudeFile.attitudeLegs.get(0).attitudeFileRecords.get(1).angularVelocity.z = 5767685;

        attitudeFile.addAttitudeLeg(new AttitudeLeg());
        attitudeFile.attitudeLegs.get(1).legStartTime = "15:28";
        attitudeFile.attitudeLegs.get(1).legStopTime = "18:00";
        attitudeFile.attitudeLegs.get(1).legAttitudeType = EnumLegAttitudeType.LOCAL_ORBITAL_1;
        attitudeFile.attitudeLegs.get(1).legNBAttitudeDataPoints.add(0,817);
        attitudeFile.attitudeLegs.get(1).legNBAttitudeDataPoints.add(1, 290);
        attitudeFile.attitudeLegs.get(1).legNBAttitudeDataPoints.add(2, 947);
        attitudeFile.attitudeLegs.get(1).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).epoch = "summer";
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).quaternion.q1 = 73656;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).quaternion.q2 = 73656;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).quaternion.q3 = 93737;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).quaternion.q4 = 73656;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).angularVelocity.x = 744635;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).angularVelocity.y = 46374;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(0).angularVelocity.z = 5767685 ;
        attitudeFile.attitudeLegs.get(1).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).epoch = "oppure";
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).quaternion.q1 = 73656;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).quaternion.q2 = 53429;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).quaternion.q3 = 17365;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).quaternion.q4 = 73656;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).angularVelocity.x = 744635;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).angularVelocity.y = 46374;
        attitudeFile.attitudeLegs.get(1).attitudeFileRecords.get(1).angularVelocity.z = 5767685;

        attitudeFile.addAttitudeLeg(new AttitudeLeg());
        attitudeFile.attitudeLegs.get(2).legStartTime = "09:15";
        attitudeFile.attitudeLegs.get(2).legStopTime = "10:00";
        attitudeFile.attitudeLegs.get(2).legAttitudeType = EnumLegAttitudeType.DOWNLINK;
        attitudeFile.attitudeLegs.get(2).legNBAttitudeDataPoints.add(0,123);
        attitudeFile.attitudeLegs.get(2).legNBAttitudeDataPoints.add(1, 456);
        attitudeFile.attitudeLegs.get(2).legNBAttitudeDataPoints.add(2, 789);
        attitudeFile.attitudeLegs.get(2).addAttitudeFileRecords(new AttitudeFileRecords());
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).epoch = "winter";
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).quaternion.q1 = 73656;
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).quaternion.q2 = 73656;
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).quaternion.q3 = 93737;
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).quaternion.q4 = 73656;
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).angularVelocity.x = 744635;
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).angularVelocity.y = 46374;
        attitudeFile.attitudeLegs.get(2).attitudeFileRecords.get(0).angularVelocity.z = 5767685;

        return attitudeFile;
    }

    public static OrbitalEvents getOrbitalEvents()
    {
        OrbitalEvents orbitalEvents = new OrbitalEvents();

        orbitalEvents.signalHeaderType.signalID = "555";
        orbitalEvents.signalHeaderType.recipientID = "008";
        orbitalEvents.signalHeaderType.validityTimeWindow = "hello";
        orbitalEvents.signalHeaderType.missionID = "2876";
        orbitalEvents.signalHeaderType.satelliteID = EnumSatID.S01;
        orbitalEvents.signalHeaderType.originatorID = "94444";
        orbitalEvents.signalHeaderType.originatorRole = "hi";
        orbitalEvents.signalHeaderType.creationTime = "17:16";
        orbitalEvents.signalHeaderType.subjectType = "end";
        orbitalEvents.signalHeaderType.spare = "comida";
        orbitalEvents.signalHeaderType.signalAim = "bad";

        orbitalEvents.addOrbitalEvent(new OrbitalEvents.OrbitalEvent());
        orbitalEvents.orbitalEventsData.get(0).missionRefID = "wjgt";
        orbitalEvents.orbitalEventsData.get(0).spacecraftRefID = EnumSatID.S03;
        orbitalEvents.orbitalEventsData.get(0).orbitalEventType = EnumOrbitalEventTypes.APOGEE_CROSSING;
        orbitalEvents.orbitalEventsData.get(0).eventName = "lakdget";
        orbitalEvents.orbitalEventsData.get(0).eventID = "qqqq";
        orbitalEvents.orbitalEventsData.get(0).startEpoch = "17:32";
        orbitalEvents.orbitalEventsData.get(0).stopEpoch = "18:00";
        orbitalEvents.orbitalEventsData.get(0).remarks = "out";
        orbitalEvents.addOrbitalEvent(new OrbitalEvents.OrbitalEvent());
        orbitalEvents.orbitalEventsData.get(1).missionRefID = "hola";
        orbitalEvents.orbitalEventsData.get(1).spacecraftRefID = EnumSatID.S03;
        orbitalEvents.orbitalEventsData.get(1).orbitalEventType = EnumOrbitalEventTypes.DESCENDING_NODE_CROSSING;
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
        manoeuvrePlan.manPlanHeader.satelliteID = EnumSatID.S01;
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
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).targetReferenceMode = EnumTargetReferenceMode.CUSTOM;

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).addAttManParams(23.9);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).addAttManParams(32.8);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.antennaVers.x = 756445;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.antennaVers.y = 756445;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.antennaVers.z = 756445;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.stationPos.x = 243547;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.stationPos.y = 66343;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).downlinkParameter.stationPos.z = 37454;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).localOrbitalParameters.q_ORB2BRF.q1 = 27474;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).localOrbitalParameters.q_ORB2BRF.q2 = 27474;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).localOrbitalParameters.q_ORB2BRF.q3 = 86757;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).localOrbitalParameters.q_ORB2BRF.q4 = 27474;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.nbWayPoints = 964;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.addCustomWayPoint(new CustomWayPoint());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).wayPointID = 2534;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).epoch = "light";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).q_ECI2BRF.q1 =(12723);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).q_ECI2BRF.q2 =(95757);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).q_ECI2BRF.q3 =(12723);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).q_ECI2BRF.q4 =(3425);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_BRF.x =(436595);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_BRF.y =(436595);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_BRF.z =(436595);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_dot_BRF.x =(845343);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_dot_BRF.y =(845343);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(0).w_dot_BRF.z =(845343);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.addCustomWayPoint(new CustomWayPoint());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).wayPointID = 98754;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).epoch = "today";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).q_ECI2BRF.q1 =(2554);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).q_ECI2BRF.q2 =(5627);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).q_ECI2BRF.q3 =(9458);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).q_ECI2BRF.q4 =(2554);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_BRF.x =(435262);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_BRF.y =(435262);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_BRF.z =(435262);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_dot_BRF.x =(87675);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_dot_BRF.y =(87675);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(1).w_dot_BRF.z =(87675);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.addCustomWayPoint(new CustomWayPoint());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).wayPointID = 21133;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).epoch = "tomorrow";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).q_ECI2BRF.q1 =(83646);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).q_ECI2BRF.q2 =(83646);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).q_ECI2BRF.q3 =(83646);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).q_ECI2BRF.q4 =(83646);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_BRF.x =(2437859);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_BRF.y =(2437859);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_BRF.z =(2437859);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_dot_BRF.x =(9635343);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_dot_BRF.y =(9635343);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).customParameters.customWayPoint.get(2).w_dot_BRF.z =(9635343);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).manID = "no room";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).execStartTime = "16:07";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).execStopTime = "16:35";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).initialAttitude.q1 =(937467);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).initialAttitude.q2 =(937467);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).initialAttitude.q3 =(937467);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).initialAttitude.q4 =(937467);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).finalAttitude.q1 =(23746);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).finalAttitude.q2 =(625235);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).finalAttitude.q3 =(23746);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).finalAttitude.q4 =(975);
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).manType = EnumManType.ATTITUDE;

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.signalID = "awpo";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.recipientID = "btbb";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.validityTimeWindow = "cwcc";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.missionID = "dddw";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.satelliteID = EnumSatID.S01;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorID = "ffwf";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorRole = "gwgg";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.creationTime = "hhwh";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.subjectType = "jjwj";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.spare = "kkwk";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).signalHeaderType.signalAim = "wlll";

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.taskName = "mmwm";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.taskType = EnumTpfTaskType.COMMAND;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.parameterSetName = "ñwññ";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.parameterValueSetName = "owoo";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.destination = EnumTpfDestination.MAN_STACK;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.source = "q";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.nbRecords = 958;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.releaseTime = "rwrr";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.earliestReleaseTime = "ssws";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.latestReleaseTime = "ttwt";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.executionTime = "uuwu";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.subScheduleID = 22224;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfHeader.tpfRemarks = "vvwv";

        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramName = "twww";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueType = EnumTpfParamValueType.ENGINEERING;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValue = "xxxr";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueUnit = "ryyy";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramRemarks = "z2zr";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramName = "www34r";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueType = EnumTpfParamValueType.ENGINEERING;
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValue = "xxx67r";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueUnit = "y3r2";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueRadix = "u";
        manoeuvrePlan.manLeg.get(0).attitudeManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98r";

        manoeuvrePlan.manLeg.get(0).addOrbitalManoeuvre(new OrbitalManoeuvre());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addOrbMansParams(2.1);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addOrbMansParams(32.4);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addOrbMansParams(18.33);

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).manID = "sunny";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).execStartTime = "09:26";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).execStopTime = "11:30";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).initialAttitude.q1 =(63545);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).initialAttitude.q2 =(63545);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).initialAttitude.q3 =(63545);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).initialAttitude.q4 =(63545);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).finalAttitude.q1 =(17363);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).finalAttitude.q2 =(9534);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).finalAttitude.q3 =(17363);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).finalAttitude.q4 =(8243);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).manType = EnumManType.ORBITAL;

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.satelliteID = EnumSatID.S01;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.taskType = EnumTpfTaskType.SEQUENCE;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.destination = EnumTpfDestination.AUTO_STACK;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.source = "q";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueUnit = "y32y";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramName = "prue";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValue = "p";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValueUnit = "p";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramValueRadix = "p";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(0).tpfBody.tpfRecord.get(2).paramRemarks = "prue";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.satelliteID = EnumSatID.S01;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.taskType = EnumTpfTaskType.COMMAND;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.destination = EnumTpfDestination.MAN_STACK;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.source = "q";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueUnit = "y32y";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(0).tpf.get(1).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        manoeuvrePlan.manLeg.get(0).addOrbitalManoeuvre(new OrbitalManoeuvre());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addOrbMansParams(7.8);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addOrbMansParams(0.9);

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).manID = "cloudy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).execStartTime = "09:26";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).execStopTime = "11:30";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).initialAttitude.q1 =(25484);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).initialAttitude.q2 =(25484);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).initialAttitude.q3 =(25484);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).initialAttitude.q4 =(25484);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).finalAttitude.q1 =(125353);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).finalAttitude.q1 =(698);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).finalAttitude.q1 =(57464);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).finalAttitude.q1 =(125353);
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).manType = EnumManType.ORBITAL;

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.satelliteID = EnumSatID.S01;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.taskName = "mmm";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.taskType = EnumTpfTaskType.SEQUENCE;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.parameterSetName = "ñññ";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.parameterValueSetName = "ooo";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.destination = EnumTpfDestination.AUTO_STACK;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.source = "q";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.releaseTime = "rrr";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.earliestReleaseTime = "sss";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.latestReleaseTime = "ttt";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.executionTime = "uuu";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramName = "www";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueType = EnumTpfParamValueType.ENGINEERING;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueType = EnumTpfParamValueType.ENGINEERING;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValue = "xxx67";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueUnit = "y32y";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramValueRadix = "4";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(0).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).addTPF(new TPF());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.signalID = "aaa";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.recipientID = "bbb";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.validityTimeWindow = "ccc";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.missionID = "ddd";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.satelliteID = EnumSatID.S01;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.originatorID = "fff";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.originatorRole = "ggg";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.creationTime = "hhh";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.subjectType = "jjj";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.spare = "kkk";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).signalHeaderType.signalAim = "lll";

        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.taskName = "taskname";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.taskType = EnumTpfTaskType.COMMAND;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.parameterSetName = "setname";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.parameterValueSetName = "valueset";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.destination = EnumTpfDestination.AUTO_STACK;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.source = "s";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.nbRecords = 987;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.releaseTime = "releasetime";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.earliestReleaseTime = "earliestreleasetime";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.latestReleaseTime = "latestreleasetime";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.executionTime = "executiontime";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.subScheduleID = 22222;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfHeader.tpfRemarks = "vvv";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramName = "paramnam";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValue = "xxx";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueUnit = "yyy";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramValueRadix = "z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.addTPFRecords(new TPFRecords());
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramName = "www34";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueType = EnumTpfParamValueType.RAW;
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValue = "paramValue";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueUnit = "unit";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramValueRadix = "7";
        manoeuvrePlan.manLeg.get(0).orbitalManoeuvre.get(1).tpf.get(1).tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        return manoeuvrePlan;

    }

    public static TPF getTPF(){

        TPF tpf = new TPF();

        tpf.tpfHeader.taskName = "taskname";
        tpf.tpfHeader.taskType = EnumTpfTaskType.COMMAND;
        tpf.tpfHeader.parameterSetName = "setname0";
        tpf.tpfHeader.parameterValueSetName = "valueset";
        tpf.tpfHeader.destination = EnumTpfDestination.MAN_STACK;
        tpf.tpfHeader.source = "s";
        tpf.tpfHeader.nbRecords = 157;
        tpf.tpfHeader.releaseTime = "releasetime012345678?????9";
        tpf.tpfHeader.earliestReleaseTime = "earliestreleasetime9????8";
        tpf.tpfHeader.latestReleaseTime = "latestreleasetime012";
        tpf.tpfHeader.executionTime = "executiontime0123456";
        tpf.tpfHeader.subScheduleID = 21225;
        tpf.tpfHeader.tpfRemarks = "vvv000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
        tpf.tpfBody.addTPFRecords(new TPFRecords());
        tpf.tpfBody.tpfRecord.get(0).paramName = "paramnam";
        tpf.tpfBody.tpfRecord.get(0).paramValueType = EnumTpfParamValueType.RAW;
        tpf.tpfBody.tpfRecord.get(0).paramValue = "paramValue0123456789";
        tpf.tpfBody.tpfRecord.get(0).paramValueUnit = "unit";
        tpf.tpfBody.tpfRecord.get(0).paramValueRadix = "7";
        tpf.tpfBody.tpfRecord.get(0).paramRemarks = "z2z";
        tpf.tpfBody.addTPFRecords(new TPFRecords());
        tpf.tpfBody.tpfRecord.get(1).paramName = "www34poa";
        tpf.tpfBody.tpfRecord.get(1).paramValueType = EnumTpfParamValueType.ENGINEERING;
        tpf.tpfBody.tpfRecord.get(1).paramValue = "paramValueabc";
        tpf.tpfBody.tpfRecord.get(1).paramValueUnit = "y32y";
        tpf.tpfBody.tpfRecord.get(1).paramValueRadix = "z";
        tpf.tpfBody.tpfRecord.get(1).paramRemarks = "z2z98";

        return tpf;
    }

    public static ODSTP getODSTP(){

        ODSTP odstp = new ODSTP();

        odstp.fdsFileHeader.referenceFrame = "referenceframe";
        odstp.fdsFileHeader.principalPlane = "principalframe";
        odstp.fdsFileHeader.columnLabelsAndUnits = "columnlabels";
        odstp.fdsFileHeader.signalID = "signalID";
        odstp.fdsFileHeader.recipientID = "recipientID";
        odstp.fdsFileHeader.validityTimeWindow = "timewindow";
        odstp.fdsFileHeader.missionID = "missionID";
        odstp.fdsFileHeader.satelliteID = EnumSatID.S01;
        odstp.fdsFileHeader.originatorID = "originatorID";
        odstp.fdsFileHeader.originatorRole = "originatorRole";
        odstp.fdsFileHeader.creationTime = "creationtime";
        odstp.fdsFileHeader.subjectType = "subjecttype";
        odstp.fdsFileHeader.spare = "spare";
        odstp.fdsFileHeader.signalAim = "signalaim";

        odstp.addODSTPRecord(new ODSTPRecord());
        odstp.odstpRecord.get(0).delta_T_Cod_Pod = 237.6514;
        odstp.odstpRecord.get(0).sunDirection.x = 1252396.7833;
        odstp.odstpRecord.get(0).sunDirection.y = 12.873;
        odstp.odstpRecord.get(0).sunDirection.z = 85746.465109;
        odstp.odstpRecord.get(0).eclipseFlag = 2;
        odstp.odstpRecord.get(0).keplerianElements.semiMajorAxis = 0.856444;
        odstp.odstpRecord.get(0).keplerianElements.eccentricity = (985.2283);
        odstp.odstpRecord.get(0).keplerianElements.inclination = (234.856);
        odstp.odstpRecord.get(0).keplerianElements.raan = (00.03243);
        odstp.odstpRecord.get(0).keplerianElements.argOfPerigee = (1234.37);
        odstp.odstpRecord.get(0).keplerianElements.trueAnomaly = (0.85554);
        odstp.odstpRecord.get(0).orbitNumber = "orbitnumber";
        odstp.odstpRecord.get(0).mjdEpoch = 123456.7897;
        odstp.odstpRecord.get(0).position.x = 76596.8677;
        odstp.odstpRecord.get(0).position.y = 13.6098;
        odstp.odstpRecord.get(0).position.z = 43.238575641;
        odstp.odstpRecord.get(0).velocity.x = 65576454.763;
        odstp.odstpRecord.get(0).velocity.y = 6453.1;
        odstp.odstpRecord.get(0).velocity.z = 5238765;
        odstp.addODSTPRecord(new ODSTPRecord());
        odstp.odstpRecord.get(1).delta_T_Cod_Pod = 574649.8;
        odstp.odstpRecord.get(1).sunDirection.x = 4635535;
        odstp.odstpRecord.get(1).sunDirection.y = 635232;
        odstp.odstpRecord.get(1).sunDirection.z = 867565;
        odstp.odstpRecord.get(1).eclipseFlag = 1;
        odstp.odstpRecord.get(1).keplerianElements.semiMajorAxis = (646353.);
        odstp.odstpRecord.get(1).keplerianElements.eccentricity = (9345.);
        odstp.odstpRecord.get(1).keplerianElements.inclination = (43346.6);
        odstp.odstpRecord.get(1).keplerianElements.raan = (00.03243);
        odstp.odstpRecord.get(1).keplerianElements.argOfPerigee = (1234.3);
        odstp.odstpRecord.get(1).keplerianElements.trueAnomaly = (0.85556);
        odstp.odstpRecord.get(1).orbitNumber = "orbitnumber";
        odstp.odstpRecord.get(1).mjdEpoch = 56.353;
        odstp.odstpRecord.get(1).position.x = 765968674.98;
        odstp.odstpRecord.get(1).position.y = 13462734.978;
        odstp.odstpRecord.get(1).position.z = 43.23857564;
        odstp.odstpRecord.get(1).velocity.x = 65576454.763;
        odstp.odstpRecord.get(1).velocity.y = 6453.1;
        odstp.odstpRecord.get(1).velocity.z = 52387654.98;

        return odstp;

    }

    public static ODNOM getODNOM(){

        ODNOM odnom = new ODNOM();

        odnom.fdsFileHeader.referenceFrame = "referenceframe";
        odnom.fdsFileHeader.principalPlane = "principalframe";
        odnom.fdsFileHeader.columnLabelsAndUnits = "columnlabels";
        odnom.fdsFileHeader.signalID = "signalID";
        odnom.fdsFileHeader.recipientID = "recipientID";
        odnom.fdsFileHeader.validityTimeWindow = "timewindow";
        odnom.fdsFileHeader.missionID = "missionID";
        odnom.fdsFileHeader.satelliteID = EnumSatID.S01;
        odnom.fdsFileHeader.originatorID = "originatorID";
        odnom.fdsFileHeader.originatorRole = "originatorRole";
        odnom.fdsFileHeader.creationTime = "creationtime";
        odnom.fdsFileHeader.subjectType = "subjecttype";
        odnom.fdsFileHeader.spare = "spare";
        odnom.fdsFileHeader.signalAim = "signalaim";

        odnom.addODNOMRecord(new ODNOMRecord());
        odnom.odnomRecord.get(0).sunDirection.x =(1252396.78330000);
        odnom.odnomRecord.get(0).sunDirection.y =(12.873);
        odnom.odnomRecord.get(0).sunDirection.z =(857464651.0900);
        odnom.odnomRecord.get(0).eclipseFlag = 200;
        odnom.odnomRecord.get(0).keplerianElements.semiMajorAxis = (0.856444);
        odnom.odnomRecord.get(0).keplerianElements.eccentricity = (985.2283);
        odnom.odnomRecord.get(0).keplerianElements.inclination = (234.8506);
        odnom.odnomRecord.get(0).keplerianElements.raan = (00.03243);
        odnom.odnomRecord.get(0).keplerianElements.argOfPerigee = (1234.3);
        odnom.odnomRecord.get(0).keplerianElements.trueAnomaly = (0.855564);
        odnom.odnomRecord.get(0).orbitNumber = "orbitnumber";
        odnom.odnomRecord.get(0).mjdEpoch = 54.98;
        odnom.odnomRecord.get(0).position.x =(765968674.9800);
        odnom.odnomRecord.get(0).position.y =(13462734.97800);
        odnom.odnomRecord.get(0).position.z =(43.238575641000);
        odnom.odnomRecord.get(0).velocity.x =(65576454.763000);
        odnom.odnomRecord.get(0).velocity.y =(6453.1);
        odnom.odnomRecord.get(0).velocity.z =(52387654.983000);
        odnom.addODNOMRecord(new ODNOMRecord());
        odnom.odnomRecord.get(1).sunDirection.x =(4635535);
        odnom.odnomRecord.get(1).sunDirection.y =(635232);
        odnom.odnomRecord.get(1).sunDirection.z =(867565);
        odnom.odnomRecord.get(1).eclipseFlag = 100;
        odnom.odnomRecord.get(1).keplerianElements.semiMajorAxis = (6463535.55);
        odnom.odnomRecord.get(1).keplerianElements.eccentricity = (9345.);
        odnom.odnomRecord.get(1).keplerianElements.inclination = (43346.6);
        odnom.odnomRecord.get(1).keplerianElements.raan = (00.03243);
        odnom.odnomRecord.get(1).keplerianElements.argOfPerigee = (1234.3);
        odnom.odnomRecord.get(1).keplerianElements.trueAnomaly = (0.855564);
        odnom.odnomRecord.get(1).orbitNumber = "orbitnumber";
        odnom.odnomRecord.get(1).mjdEpoch = 56.353;
        odnom.odnomRecord.get(1).position.x =(765968674.9800);
        odnom.odnomRecord.get(1).position.y =(13462734.97800);
        odnom.odnomRecord.get(1).position.z =(43.238575641000);
        odnom.odnomRecord.get(1).velocity.x =(65576454.763000);
        odnom.odnomRecord.get(1).velocity.y =(6453.1);
        odnom.odnomRecord.get(1).velocity.z =(52387654.983000);

        return odnom;

    }

    public static ProcessedOrbits getProcessedOrbits(){

        ProcessedOrbits processedOrbits = new ProcessedOrbits();

        processedOrbits.fdsFileHeader.referenceFrame = "referenceframe";
        processedOrbits.fdsFileHeader.principalPlane = "principalframe";
        processedOrbits.fdsFileHeader.columnLabelsAndUnits = "columnlabels";
        processedOrbits.fdsFileHeader.signalID = "signalID";
        processedOrbits.fdsFileHeader.recipientID = "recipientID";
        processedOrbits.fdsFileHeader.validityTimeWindow = "timewindow";
        processedOrbits.fdsFileHeader.missionID = "missionID";
        processedOrbits.fdsFileHeader.satelliteID = EnumSatID.S01;
        processedOrbits.fdsFileHeader.originatorID = "originatorID";
        processedOrbits.fdsFileHeader.originatorRole = "originatorRole";
        processedOrbits.fdsFileHeader.creationTime = "creationtime";
        processedOrbits.fdsFileHeader.subjectType = "subjecttype";
        processedOrbits.fdsFileHeader.spare = "spare";
        processedOrbits.fdsFileHeader.signalAim = "signalaim";

        processedOrbits.addEphemeredisRecord(new ODNOMRecord());
        processedOrbits.ephemerisRecords.get(0).mjdEpoch = 54.985342854324;
        processedOrbits.ephemerisRecords.get(0).position.x =(765968674.9800);
        processedOrbits.ephemerisRecords.get(0).position.y =(13462734.97800);
        processedOrbits.ephemerisRecords.get(0).position.z =(43.238575641000);
        processedOrbits.ephemerisRecords.get(0).velocity.x =(65576454.763000);
        processedOrbits.ephemerisRecords.get(0).velocity.y =(6453.1);
        processedOrbits.ephemerisRecords.get(0).velocity.z =(52387654.983000);
        processedOrbits.addEphemeredisRecord(new ODNOMRecord());
        processedOrbits.ephemerisRecords.get(1).mjdEpoch = 56.353;
        processedOrbits.ephemerisRecords.get(1).position.x =(765968674.9800);
        processedOrbits.ephemerisRecords.get(1).position.y =(13462734.97800);
        processedOrbits.ephemerisRecords.get(1).position.z =(43.238575641000);
        processedOrbits.ephemerisRecords.get(1).velocity.x =(65576454.763000);
        processedOrbits.ephemerisRecords.get(1).velocity.y =(6453.1);
        processedOrbits.ephemerisRecords.get(1).velocity.z =(52387654.983000);
        processedOrbits.addEphemeredisRecord(new ODNOMRecord());
        processedOrbits.ephemerisRecords.get(2).mjdEpoch = 75646.97465;
        processedOrbits.ephemerisRecords.get(2).position.x =(765968674.9800);
        processedOrbits.ephemerisRecords.get(2).position.y =(734630.978);
        processedOrbits.ephemerisRecords.get(2).position.z =(43.238575641000);
        processedOrbits.ephemerisRecords.get(2).velocity.x =(2313354.9);
        processedOrbits.ephemerisRecords.get(2).velocity.y =(6453.1745364);
        processedOrbits.ephemerisRecords.get(2).velocity.z =(52387654.983000);
        processedOrbits.addEphemeredisRecord(new ODNOMRecord());
        processedOrbits.ephemerisRecords.get(3).mjdEpoch = 2397.4549787;
        processedOrbits.ephemerisRecords.get(3).position.x =(765968674.9800);
        processedOrbits.ephemerisRecords.get(3).position.y =(846353.9);
        processedOrbits.ephemerisRecords.get(3).position.z =(43.238575641000);
        processedOrbits.ephemerisRecords.get(3).velocity.x =(243783.9);
        processedOrbits.ephemerisRecords.get(3).velocity.y =(6453.125344);
        processedOrbits.ephemerisRecords.get(3).velocity.z =(52387654.983000);

        return processedOrbits;

    }

    public static FDSReport getFDSReport() {

        FDSReport fdsReport = new FDSReport();

        fdsReport.reportFileName = "file name";
        fdsReport.glbReportHeaderType.addkeyParamID("hola");
        fdsReport.glbReportHeaderType.addkeyParamID("adios");
        fdsReport.glbReportHeaderType.startTimestamp = "vacaciones";
        fdsReport.glbReportHeaderType.stopTimestamp = "finestra";
        fdsReport.glbReportHeaderType.missionID = "7464";
        fdsReport.glbReportHeaderType.satelliteID = EnumSatID.S02;
        fdsReport.glbReportHeaderType.originatorID = "coche";
        fdsReport.glbReportHeaderType.originatorRole = "shfyf";
        fdsReport.glbReportHeaderType.creationTime = "12:11";
        fdsReport.glbReportHeaderType.subjectType = "euro";
        fdsReport.glbReportHeaderType.spare = "tiempo";
        fdsReport.glbReportHeaderType.signalAim ="avión";

        fdsReport.addkeyParamBodyType(new KeyParamBodyType());
        fdsReport.keyParamBodyType.get(0).addkeyParamTimestamp("denuevo");
        fdsReport.keyParamBodyType.get(0).addkeyParamTimestamp("again");
        fdsReport.keyParamBodyType.get(0).addkeyParamTimestamp("nuovo");
        fdsReport.keyParamBodyType.get(0).addkeyParamValue(7465.);
        fdsReport.keyParamBodyType.get(0).addkeyParamValue(745.73);
        fdsReport.keyParamBodyType.get(0).addkeyParamEngineeringValue("no sé");
        fdsReport.keyParamBodyType.get(0).reportMessage = "silla";

        fdsReport.addkeyParamBodyType(new KeyParamBodyType());
        fdsReport.keyParamBodyType.get(1).addkeyParamTimestamp("final");
        fdsReport.keyParamBodyType.get(1).addkeyParamTimestamp("the end");
        fdsReport.keyParamBodyType.get(1).addkeyParamValue(947.5);
        fdsReport.keyParamBodyType.get(1).addkeyParamValue(00.7);
        fdsReport.keyParamBodyType.get(1).addkeyParamEngineeringValue("idea");
        fdsReport.keyParamBodyType.get(1).addkeyParamEngineeringValue("luz");
        fdsReport.keyParamBodyType.get(1).addkeyParamEngineeringValue("noche");
        fdsReport.keyParamBodyType.get(1).reportMessage = "sofá";

        return fdsReport;

    }

    public static FDSLog getFDSLog() {

        FDSLog fdsLog = new FDSLog();

        fdsLog.logName = "file";
        fdsLog.addLogEntryType(new LogEntryType());
        fdsLog.logEntryType.get(0).logTimestamp = "18:08";
        fdsLog.logEntryType.get(0).severityLevel = "high";
        fdsLog.logEntryType.get(0).processName = "processing";
        fdsLog.logEntryType.get(0).logMessage = "fine";
        fdsLog.logEntryType.get(0).eventID = "packed";
        fdsLog.addLogEntryType(new LogEntryType());
        fdsLog.logEntryType.get(1).logTimestamp = "18:00";
        fdsLog.logEntryType.get(1).severityLevel = "low";
        fdsLog.logEntryType.get(1).processName = "advance";
        fdsLog.logEntryType.get(1).logMessage = "bad";
        fdsLog.logEntryType.get(1).eventID = "empty";
        fdsLog.addLogEntryType(new LogEntryType());
        fdsLog.logEntryType.get(2).logTimestamp = "12:56";
        fdsLog.logEntryType.get(2).severityLevel = "medium";
        fdsLog.logEntryType.get(2).processName = "beginner";
        fdsLog.logEntryType.get(2).logMessage = "regular";
        fdsLog.logEntryType.get(2).eventID = "nobody";


        return fdsLog;
    }

    public static ProcessedAttitude getProcessedAttitude() {

        ProcessedAttitude processedAttitude = new ProcessedAttitude();

        processedAttitude.fdsFileHeader.referenceFrame = "hola";
        processedAttitude.fdsFileHeader.principalPlane = "adiós";
        processedAttitude.fdsFileHeader.columnLabelsAndUnits = "bye";
        processedAttitude.fdsFileHeader.signalID = "hi";
        processedAttitude.fdsFileHeader.recipientID = "see";
        processedAttitude.fdsFileHeader.validityTimeWindow = "soon";
        processedAttitude.fdsFileHeader.missionID = "royal";
        processedAttitude.fdsFileHeader.satelliteID = EnumSatID.S01;
        processedAttitude.fdsFileHeader.originatorID = "lunch";
        processedAttitude.fdsFileHeader.originatorRole = "dinner";
        processedAttitude.fdsFileHeader.creationTime = "liability";
        processedAttitude.fdsFileHeader.subjectType = "desayuno";
        processedAttitude.fdsFileHeader.spare = "meghan";
        processedAttitude.fdsFileHeader.signalAim = "finish";

        processedAttitude.addAttitudeRecords(new AttitudeRecords());
        processedAttitude.attitudeRecords.get(0).mjdEpoch = 6374.9;
        processedAttitude.attitudeRecords.get(0).quaternion.q1 = 6454.2;
        processedAttitude.attitudeRecords.get(0).quaternion.q2 = 1827.96;
        processedAttitude.attitudeRecords.get(0).quaternion.q3 = 6454.2;
        processedAttitude.attitudeRecords.get(0).quaternion.q4 = 3625.7;
        processedAttitude.attitudeRecords.get(0).angularVelocity.x = 243.6;
        processedAttitude.attitudeRecords.get(0).angularVelocity.y = 98.6;
        processedAttitude.attitudeRecords.get(0).angularVelocity.z = 55.2;
        processedAttitude.addAttitudeRecords(new AttitudeRecords());
        processedAttitude.attitudeRecords.get(1).mjdEpoch = 8374.;
        processedAttitude.attitudeRecords.get(1).quaternion.q1 = 242.5;
        processedAttitude.attitudeRecords.get(1).quaternion.q2 = 64542.8;
        processedAttitude.attitudeRecords.get(1).quaternion.q3 = 6454.2;
        processedAttitude.attitudeRecords.get(1).quaternion.q4 = 3625.7;
        processedAttitude.attitudeRecords.get(1).angularVelocity.x = 967.1;
        processedAttitude.attitudeRecords.get(1).angularVelocity.y = 98.6;
        processedAttitude.attitudeRecords.get(1).angularVelocity.z = 333.4;

        return processedAttitude;
    }


}
