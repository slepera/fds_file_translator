package plt.fds.filetranslator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import plt.fds.filetranslator.data_models.ManoeuvrePlan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManoeuvrePlanXMLGenerator {

    private static ManoeuvrePlan manoeuvrePlan;

    public static void GenerateManoeuvreFileXML(ManoeuvrePlan mp) throws IOException {
        manoeuvrePlan = mp;
        Document doc = new Document();
        doc.setRootElement(new Element("Manoeuvre_Plan"));
        Element header = new Element("Man_Plan_Header");
        header.addContent(new Element("nbManLeg").setText(String.valueOf(manoeuvrePlan.manPlanHeader.nbManLeg)));
        header.addContent(new Element("signalID").setText(manoeuvrePlan.manPlanHeader.signalID));
        header.addContent(new Element("recipientID").setText(manoeuvrePlan.manPlanHeader.recipientID));
        header.addContent(new Element("validityTimeWindow").setText(manoeuvrePlan.manPlanHeader.validityTimeWindow));
        header.addContent(new Element("missionID").setText(manoeuvrePlan.manPlanHeader.missionID));
        header.addContent(new Element("satelliteID").setText(manoeuvrePlan.manPlanHeader.satelliteID));
        header.addContent(new Element("originatorID").setText(manoeuvrePlan.manPlanHeader.originatorID));
        header.addContent(new Element("originatorRole").setText(manoeuvrePlan.manPlanHeader.originatorRole));
        header.addContent(new Element("subjectType").setText(manoeuvrePlan.manPlanHeader.subjectType));
        header.addContent(new Element("creationTime").setText(manoeuvrePlan.manPlanHeader.creationTime));
        header.addContent(new Element("spare").setText(manoeuvrePlan.manPlanHeader.spare));
        header.addContent(new Element("signalAim").setText(manoeuvrePlan.manPlanHeader.signalAim));

        Element manoeuvreFileXML = new Element("ManLegs");
        for (int i = 0; i < manoeuvrePlan.manLeg.size(); i++) {
            Element manLeg = new Element("manLeg");
            manLeg.addContent(new Element("legID").setText(manoeuvrePlan.manLeg.get(i).legID));
            manLeg.addContent(new Element("legManType").setText(manoeuvrePlan.manLeg.get(i).legManType));
            manLeg.addContent(new Element("legStartTime").setText(manoeuvrePlan.manLeg.get(i).legStartTime));
            manLeg.addContent(new Element("legStopTime").setText(manoeuvrePlan.manLeg.get(i).legStopTime));
            manLeg.addContent(new Element("blockingFlag").setText(manoeuvrePlan.manLeg.get(i).blockingFlag));
            manLeg.addContent(new Element("legNBMan").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).legNBMan)));
            manLeg.addContent(new Element("remarks").setText(manoeuvrePlan.manLeg.get(i).remarks));
            manoeuvreFileXML.addContent(manLeg);

            Element attitudeManoeuvres = new Element("Attitude_Manoeuvres");
            for (int j = 0; j < manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.size(); j++) {
                Element attitudeManoeuvre = new Element("attitude_Manoeuvre");
                CreateAttitudeManoeuvre(attitudeManoeuvre, i, j);
                attitudeManoeuvres.addContent(attitudeManoeuvre);
            }
            manoeuvreFileXML.addContent(attitudeManoeuvres);

            Element orbitalManoeuvres = new Element("Orbital_Manoeuvres");
            for (int j = 0; j < manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.size(); j++) {
                Element orbitalManoeuvre = new Element("Orbital_Manoeuvre");
                CreateOrbitalManoeuvre(orbitalManoeuvre, i, j);
                orbitalManoeuvres.addContent(orbitalManoeuvre);
            }
            manoeuvreFileXML.addContent(orbitalManoeuvres);
        }
        doc.getRootElement().addContent(header);
        doc.getRootElement().addContent(manoeuvreFileXML);
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());
        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        File file = new File("./data/output/manoeuvre_plan_xml/manoeuvre_plan " + europeanDateFormatter.format(LocalDateTime.now()) + ".xml");
        FileOutputStream fos = new FileOutputStream(file);
        xmlOutputter.output(doc, fos);
        fos.close();
    }


    private static void CreateAttitudeManoeuvre(Element attitudeManoeuvre, int i, int j)
    {
        attitudeManoeuvre.addContent(new Element("targetReferenceMode").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).targetReferenceMode));
        for (int k = 0; k < manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).attManParams.size(); k++) {
            attitudeManoeuvre.addContent(new Element("attManParams").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).attManParams.get(k))));
        }
        Element downlinkParameter = new Element("downlink_Parameter");
        downlinkParameter.addContent(new Element("antennaVers").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).downlinkParameter.antennaVers));
        downlinkParameter.addContent(new Element("stationPos").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).downlinkParameter.stationPos));
        attitudeManoeuvre.addContent(downlinkParameter);

        Element localOrbitalParameter = new Element("local_Orbital_Parameters");
        localOrbitalParameter.addContent(new Element("q_ORB2BRF").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).localOrbitalParameters.q_ORB2BRF));
        attitudeManoeuvre.addContent(localOrbitalParameter);

        Element customParameter = new Element("custom_Parameters");
        customParameter.addContent(new Element("nbWayPoints").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.nbWayPoints)));
        for (int q = 0; q < manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.customWayPoint.size(); q++) {
            Element customWayPoint = new Element("custom_WayPoint");
            customWayPoint.addContent(new Element("wayPointID").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.customWayPoint.get(q).wayPointID)));
            customWayPoint.addContent(new Element("epoch").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.customWayPoint.get(q).epoch));
            customWayPoint.addContent(new Element("q_ECI2BRF").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.customWayPoint.get(q).q_ECI2BRF));
            customWayPoint.addContent(new Element("w_BRF").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.customWayPoint.get(q).w_BRF));
            customWayPoint.addContent(new Element("w_dot_BRF").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).customParameters.customWayPoint.get(q).w_dot_BRF));
            customParameter.addContent(customWayPoint);
        }
        attitudeManoeuvre.addContent(customParameter);

        Element manoeuvre_attitude = new Element("Manoeuvre");
        manoeuvre_attitude.addContent(new Element("manID").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).manID));
        manoeuvre_attitude.addContent(new Element("execStartTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).execStartTime));
        manoeuvre_attitude.addContent(new Element("execStopTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).execStopTime));
        manoeuvre_attitude.addContent(new Element("intialAttitude").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).initialAttitude));
        manoeuvre_attitude.addContent(new Element("finalAttitude").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).finalAttitude));
        manoeuvre_attitude.addContent(new Element("manType").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).manType));
        attitudeManoeuvre.addContent(manoeuvre_attitude);

        for (int p = 0; p < manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.size(); p++) {
            Element TPF_attitude = new Element("Attitude_TPF");
            Element TPF_signalheader = new Element("TPF_Signal_Header");
            TPF_signalheader.addContent(new Element("signalID").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.signalID));
            TPF_signalheader.addContent(new Element("recipientID").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.recipientID));
            TPF_signalheader.addContent(new Element("validityTimeWindow").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.validityTimeWindow));
            TPF_signalheader.addContent(new Element("missionID").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.missionID));
            TPF_signalheader.addContent(new Element("satelliteID").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.satelliteID));
            TPF_signalheader.addContent(new Element("originatorID").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.originatorID));
            TPF_signalheader.addContent(new Element("originatorRole").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.originatorRole));
            TPF_signalheader.addContent(new Element("creationTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.creationTime));
            TPF_signalheader.addContent(new Element("subjectType").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.subjectType));
            TPF_signalheader.addContent(new Element("spare").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.spare));
            TPF_signalheader.addContent(new Element("signalAim").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).signalHeaderType.signalAim));
            TPF_attitude.addContent(TPF_signalheader);

            Element TPF_header = new Element("TPF_Header");
            TPF_header.addContent(new Element("taskName").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.taskName));
            TPF_header.addContent(new Element("taskType").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.taskType));
            TPF_header.addContent(new Element("parameterSetName").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.parameterSetName));
            TPF_header.addContent(new Element("parameterValueSetName").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.parameterValueSetName));
            TPF_header.addContent(new Element("destination").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.destination));
            TPF_header.addContent(new Element("source").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.source));
            TPF_header.addContent(new Element("nbRecords").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.nbRecords)));
            TPF_header.addContent(new Element("releaseTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.releaseTime));
            TPF_header.addContent(new Element("earliestReleaseTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.earliestReleaseTime));
            TPF_header.addContent(new Element("latestReleaseTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.latestReleaseTime));
            TPF_header.addContent(new Element("executionTime").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.executionTime));
            TPF_header.addContent(new Element("subScheduleID").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.subScheduleID)));
            TPF_header.addContent(new Element("tpfRemarks").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfHeader.tpfRemarks));
            TPF_attitude.addContent(TPF_header);

            Element TPF_body = new Element("TPF_Body");
            Element TPF_Records = new Element("TPF_Records");
            for (int g = 0; g < manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.size(); g++) {
                Element TPF_Record = new Element("TPF_Record");
                TPF_Record.addContent(new Element("paramName").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramName));
                TPF_Record.addContent(new Element("paramValueType").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValueType));
                TPF_Record.addContent(new Element("paramValue").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValue));
                TPF_Record.addContent(new Element("paramValueUnit").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValueUnit));
                TPF_Record.addContent(new Element("paramValueRadix").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValueRadix));
                TPF_Record.addContent(new Element("paramRemarks").setText(manoeuvrePlan.manLeg.get(i).attitudeManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramRemarks));
                TPF_Records.addContent(TPF_Record);
            }
            TPF_body.addContent(TPF_Records);
            TPF_attitude.addContent(TPF_body);

            attitudeManoeuvre.addContent(TPF_attitude);
        }
    }


    private static void CreateOrbitalManoeuvre(Element orbitalManoeuvre, int i, int j) {
        for (int q = 0; q < manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).orbMansParams.size(); q++) {
            orbitalManoeuvre.addContent(new Element("orbManParams").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).orbMansParams.get(q))));
        }
        Element manoeuvre_orbital = new Element("Manoeuvre");
        manoeuvre_orbital.addContent(new Element("manID").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).manID));
        manoeuvre_orbital.addContent(new Element("execStartTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).execStartTime));
        manoeuvre_orbital.addContent(new Element("execStopTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).execStopTime));
        manoeuvre_orbital.addContent(new Element("initialAttitude").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).initialAttitude));
        manoeuvre_orbital.addContent(new Element("finalAttitude").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).finalAttitude));
        manoeuvre_orbital.addContent(new Element("manType").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).manType));
        orbitalManoeuvre.addContent(manoeuvre_orbital);
        for (int p = 0; p < manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.size(); p++)
        {
            Element TPF_orbital = new Element("orbital_TPF");
            Element TPF_signalheader = new Element("TPF_Signal_Header");
            TPF_signalheader.addContent(new Element("signalID").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.signalID));
            TPF_signalheader.addContent(new Element("recipientID").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.recipientID));
            TPF_signalheader.addContent(new Element("validityTimeWindow").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.validityTimeWindow));
            TPF_signalheader.addContent(new Element("missionID").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.missionID));
            TPF_signalheader.addContent(new Element("satelliteID").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.satelliteID));
            TPF_signalheader.addContent(new Element("originatorID").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.originatorID));
            TPF_signalheader.addContent(new Element("originatorRole").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.originatorRole));
            TPF_signalheader.addContent(new Element("creationTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.creationTime));
            TPF_signalheader.addContent(new Element("subjectType").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.subjectType));
            TPF_signalheader.addContent(new Element("spare").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.spare));
            TPF_signalheader.addContent(new Element("signalAim").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).signalHeaderType.signalAim));
            TPF_orbital.addContent(TPF_signalheader);

            Element TPF_header = new Element("TPF_Header");
            TPF_header.addContent(new Element("taskName").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.taskName));
            TPF_header.addContent(new Element("taskType").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.taskType));
            TPF_header.addContent(new Element("parameterSetName").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.parameterSetName));
            TPF_header.addContent(new Element("parameterValueSetName").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.parameterValueSetName));
            TPF_header.addContent(new Element("destination").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.destination));
            TPF_header.addContent(new Element("source").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.source));
            TPF_header.addContent(new Element("nbRecords").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.nbRecords)));
            TPF_header.addContent(new Element("releaseTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.releaseTime));
            TPF_header.addContent(new Element("earliestReleaseTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.earliestReleaseTime));
            TPF_header.addContent(new Element("latestReleaseTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.latestReleaseTime));
            TPF_header.addContent(new Element("executionTime").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.executionTime));
            TPF_header.addContent(new Element("subScheduleID").setText(String.valueOf(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.subScheduleID)));
            TPF_header.addContent(new Element("tpfRemarks").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfHeader.tpfRemarks));
            TPF_orbital.addContent(TPF_header);

            Element TPF_body = new Element("TPF_Body");
            Element TPF_Records = new Element("TPF_Records");
            for (int g = 0; g < manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.size(); g++) {
                Element TPF_Record = new Element("TPF_Record");
                TPF_Record.addContent(new Element("paramName").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramName));
                TPF_Record.addContent(new Element("paramValueType").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValueType));
                TPF_Record.addContent(new Element("paramValue").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValue));
                TPF_Record.addContent(new Element("paramValueUnit").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValueUnit));
                TPF_Record.addContent(new Element("paramValueRadix").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramValueRadix));
                TPF_Record.addContent(new Element("paramRemarks").setText(manoeuvrePlan.manLeg.get(i).orbitalManoeuvre.get(j).tpf.get(p).tpfBody.tpfRecord.get(g).paramRemarks));
                TPF_Records.addContent(TPF_Record);
            }
            TPF_body.addContent(TPF_Records);
            TPF_orbital.addContent(TPF_body);
            orbitalManoeuvre.addContent(TPF_orbital);
        }

    }
}
