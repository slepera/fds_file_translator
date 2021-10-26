package plt.fds.filetranslator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import plt.fds.filetranslator.data_models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ManoeuvrePlanXMLGenerator {



    public static void GenerateManoeuvreFileXML(ManoeuvrePlan mp) throws IOException {

        Document doc = new Document();
        doc.setRootElement(new Element("Manoeuvre_Plan"));
        Element header = new Element("Man_Plan_Header");
        header.addContent(new Element("nbManLeg").setText(String.valueOf(mp.manPlanHeader.nbManLeg)));
        header.addContent(new Element("signalID").setText(mp.manPlanHeader.signalID));
        header.addContent(new Element("recipientID").setText(mp.manPlanHeader.recipientID));
        header.addContent(new Element("validityTimeWindow").setText(mp.manPlanHeader.validityTimeWindow));
        header.addContent(new Element("missionID").setText(mp.manPlanHeader.missionID));
        header.addContent(new Element("satelliteID").setText(mp.manPlanHeader.satelliteID));
        header.addContent(new Element("originatorID").setText(mp.manPlanHeader.originatorID));
        header.addContent(new Element("originatorRole").setText(mp.manPlanHeader.originatorRole));
        header.addContent(new Element("subjectType").setText(mp.manPlanHeader.subjectType));
        header.addContent(new Element("creationTime").setText(mp.manPlanHeader.creationTime));
        header.addContent(new Element("spare").setText(mp.manPlanHeader.spare));
        header.addContent(new Element("signalAim").setText(mp.manPlanHeader.signalAim));

        Element manoeuvreFileXML = new Element("ManLegs");
        for (int i = 0; i < mp.manLeg.size(); i++) {
            Element manLeg = new Element("ManLeg");
            manLeg.addContent(new Element("legID").setText(mp.manLeg.get(i).legID));
            manLeg.addContent(new Element("legManType").setText(mp.manLeg.get(i).legManType));
            manLeg.addContent(new Element("legStartTime").setText(mp.manLeg.get(i).legStartTime));
            manLeg.addContent(new Element("legStopTime").setText(mp.manLeg.get(i).legStopTime));
            manLeg.addContent(new Element("blockingFlag").setText(mp.manLeg.get(i).blockingFlag));
            manLeg.addContent(new Element("legNBMan").setText(String.valueOf(mp.manLeg.get(i).legNBMan)));
            manLeg.addContent(new Element("remarks").setText(mp.manLeg.get(i).remarks));
            manoeuvreFileXML.addContent(manLeg);

            Element attitudeManoeuvres = new Element("Attitude_Manoeuvres");
            for (int j = 0; j < mp.manLeg.get(i).attitudeManoeuvre.size(); j++) {
                Element attitudeManoeuvre = CreateAttitudeManoeuvre(mp.manLeg.get(i).attitudeManoeuvre.get(j));
                attitudeManoeuvres.addContent(attitudeManoeuvre);
            }
            manoeuvreFileXML.addContent(attitudeManoeuvres);

            Element orbitalManoeuvres = new Element("Orbital_Manoeuvres");
            for (int j = 0; j < mp.manLeg.get(i).orbitalManoeuvre.size(); j++) {
                Element orbitalManoeuvre = CreateOrbitalManoeuvre(mp.manLeg.get(i).orbitalManoeuvre.get(j));
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


    private static Element CreateAttitudeManoeuvre(AttitudeManoeuvre aManoeuvre)
    {
        Element attitudeManoeuvre = new Element("Attitude_Manoeuvre");
        attitudeManoeuvre.addContent(new Element("targetReferenceMode").setText(aManoeuvre.targetReferenceMode));
        for (int k = 0; k <aManoeuvre.attManParams.size(); k++) {
            attitudeManoeuvre.addContent(new Element("attManParams").setText(String.valueOf(aManoeuvre.attManParams.get(k))));
        }
        Element downlinkParameter = new Element("downlink_Parameter");
        downlinkParameter.addContent(new Element("antennaVers").setText(aManoeuvre.downlinkParameter.antennaVers));
        downlinkParameter.addContent(new Element("stationPos").setText(aManoeuvre.downlinkParameter.stationPos));
        attitudeManoeuvre.addContent(downlinkParameter);

        Element localOrbitalParameter = new Element("local_Orbital_Parameters");
        localOrbitalParameter.addContent(new Element("q_ORB2BRF").setText(aManoeuvre.localOrbitalParameters.q_ORB2BRF));
        attitudeManoeuvre.addContent(localOrbitalParameter);

        Element customParameter = new Element("custom_Parameters");
        customParameter.addContent(new Element("nbWayPoints").setText(String.valueOf(aManoeuvre.customParameters.nbWayPoints)));
        for (int q = 0; q < aManoeuvre.customParameters.customWayPoint.size(); q++) {
            Element customWayPoint = new Element("custom_WayPoint");
            customWayPoint.addContent(new Element("wayPointID").setText(String.valueOf(aManoeuvre.customParameters.customWayPoint.get(q).wayPointID)));
            customWayPoint.addContent(new Element("epoch").setText(aManoeuvre.customParameters.customWayPoint.get(q).epoch));
            customWayPoint.addContent(new Element("q_ECI2BRF").setText(aManoeuvre.customParameters.customWayPoint.get(q).q_ECI2BRF));
            customWayPoint.addContent(new Element("w_BRF").setText(aManoeuvre.customParameters.customWayPoint.get(q).w_BRF));
            customWayPoint.addContent(new Element("w_dot_BRF").setText(aManoeuvre.customParameters.customWayPoint.get(q).w_dot_BRF));
            customParameter.addContent(customWayPoint);
        }
        attitudeManoeuvre.addContent(customParameter);

        Element manoeuvre_attitude = new Element("Manoeuvre");
        manoeuvre_attitude.addContent(new Element("manID").setText(aManoeuvre.manID));
        manoeuvre_attitude.addContent(new Element("execStartTime").setText(aManoeuvre.execStartTime));
        manoeuvre_attitude.addContent(new Element("execStopTime").setText(aManoeuvre.execStopTime));
        manoeuvre_attitude.addContent(new Element("intialAttitude").setText(aManoeuvre.initialAttitude));
        manoeuvre_attitude.addContent(new Element("finalAttitude").setText(aManoeuvre.finalAttitude));
        manoeuvre_attitude.addContent(new Element("manType").setText(aManoeuvre.manType));
        attitudeManoeuvre.addContent(manoeuvre_attitude);

        for (int p = 0; p < aManoeuvre.tpf.size(); p++) {
            Element tpf = TPFFileGenerator.CreateTPFText(aManoeuvre.tpf.get(p));
            attitudeManoeuvre.addContent(tpf);
        }
        return attitudeManoeuvre;
    }


    private static Element CreateOrbitalManoeuvre(OrbitalManoeuvre oManoeuvre) {
        Element orbitalManoeuvre = new Element("Orbital_Manoeuvre");
        for (int q = 0; q < oManoeuvre.orbMansParams.size(); q++) {
            orbitalManoeuvre.addContent(new Element("orbManParams").setText(String.valueOf(oManoeuvre.orbMansParams.get(q))));
        }
        Element manoeuvre_orbital = new Element("Manoeuvre");
        manoeuvre_orbital.addContent(new Element("manID").setText(oManoeuvre.manID));
        manoeuvre_orbital.addContent(new Element("execStartTime").setText(oManoeuvre.execStartTime));
        manoeuvre_orbital.addContent(new Element("execStopTime").setText(oManoeuvre.execStopTime));
        manoeuvre_orbital.addContent(new Element("initialAttitude").setText(oManoeuvre.initialAttitude));
        manoeuvre_orbital.addContent(new Element("finalAttitude").setText(oManoeuvre.finalAttitude));
        manoeuvre_orbital.addContent(new Element("manType").setText(oManoeuvre.manType));
        orbitalManoeuvre.addContent(manoeuvre_orbital);
        for (int p = 0; p < oManoeuvre.tpf.size(); p++)
        {
            Element tpf = TPFFileGenerator.CreateTPFText(oManoeuvre.tpf.get(p));
            orbitalManoeuvre.addContent(tpf);
        }
        return orbitalManoeuvre;
    }





    private static Element CreateTPFXML(TPF tpf) {
        Element TPF = new Element("TPF");
        Element TPF_signalheader = new Element("TPF_Signal_Header");
        TPF_signalheader.addContent(new Element("signalID").setText(tpf.signalHeaderType.signalID));
        TPF_signalheader.addContent(new Element("recipientID").setText(tpf.signalHeaderType.recipientID));
        TPF_signalheader.addContent(new Element("validityTimeWindow").setText(tpf.signalHeaderType.validityTimeWindow));
        TPF_signalheader.addContent(new Element("missionID").setText(tpf.signalHeaderType.missionID));
        TPF_signalheader.addContent(new Element("satelliteID").setText(tpf.signalHeaderType.satelliteID));
        TPF_signalheader.addContent(new Element("originatorID").setText(tpf.signalHeaderType.originatorID));
        TPF_signalheader.addContent(new Element("originatorRole").setText(tpf.signalHeaderType.originatorRole));
        TPF_signalheader.addContent(new Element("creationTime").setText(tpf.signalHeaderType.creationTime));
        TPF_signalheader.addContent(new Element("subjectType").setText(tpf.signalHeaderType.subjectType));
        TPF_signalheader.addContent(new Element("spare").setText(tpf.signalHeaderType.spare));
        TPF_signalheader.addContent(new Element("signalAim").setText(tpf.signalHeaderType.signalAim));
        TPF.addContent(TPF_signalheader);

        Element TPF_header = new Element("TPF_Header");
        TPF_header.addContent(new Element("taskName").setText(tpf.tpfHeader.taskName));
        TPF_header.addContent(new Element("taskType").setText(tpf.tpfHeader.taskType));
        TPF_header.addContent(new Element("parameterSetName").setText(tpf.tpfHeader.parameterSetName));
        TPF_header.addContent(new Element("parameterValueSetName").setText(tpf.tpfHeader.parameterValueSetName));
        TPF_header.addContent(new Element("destination").setText(tpf.tpfHeader.destination));
        TPF_header.addContent(new Element("source").setText(tpf.tpfHeader.source));
        TPF_header.addContent(new Element("nbRecords").setText(String.valueOf(tpf.tpfHeader.nbRecords)));
        TPF_header.addContent(new Element("releaseTime").setText(tpf.tpfHeader.releaseTime));
        TPF_header.addContent(new Element("earliestReleaseTime").setText(tpf.tpfHeader.earliestReleaseTime));
        TPF_header.addContent(new Element("latestReleaseTime").setText(tpf.tpfHeader.latestReleaseTime));
        TPF_header.addContent(new Element("executionTime").setText(tpf.tpfHeader.executionTime));
        TPF_header.addContent(new Element("subScheduleID").setText(String.valueOf(tpf.tpfHeader.subScheduleID)));
        TPF_header.addContent(new Element("tpfRemarks").setText(tpf.tpfHeader.tpfRemarks));
        TPF.addContent(TPF_header);

        Element TPF_body = new Element("TPF_Body");
        Element TPF_Records = new Element("TPF_Records");
        for (int g = 0; g <tpf.tpfBody.tpfRecord.size(); g++) {
            Element TPF_Record = new Element("TPF_Record");
            TPF_Record.addContent(new Element("paramName").setText(tpf.tpfBody.tpfRecord.get(g).paramName));
            TPF_Record.addContent(new Element("paramValueType").setText(tpf.tpfBody.tpfRecord.get(g).paramValueType));
            TPF_Record.addContent(new Element("paramValue").setText(tpf.tpfBody.tpfRecord.get(g).paramValue));
            TPF_Record.addContent(new Element("paramValueUnit").setText(tpf.tpfBody.tpfRecord.get(g).paramValueUnit));
            TPF_Record.addContent(new Element("paramValueRadix").setText(tpf.tpfBody.tpfRecord.get(g).paramValueRadix));
            TPF_Record.addContent(new Element("paramRemarks").setText(tpf.tpfBody.tpfRecord.get(g).paramRemarks));
            TPF_Records.addContent(TPF_Record);
        }
        TPF_body.addContent(TPF_Records);
        TPF.addContent(TPF_body);
        return TPF;

    }
/*
    private static void CreateTPFTextFile(TPF tpf) throws IOException {
        Element element = TPFFileGenerator.CreateTPFText(tpf);
        FileOutputStream fileOutputStream = new FileOutputStream("TPF_file");
        fileOutputStream.write(element.getText().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
/*
    private static Element CreateTPFText(TPF tpf) {
        Element TPF = new Element("TPF");
        String h1, h2, h3, h4, h5;

        h1 = tpf.tpfHeader.taskName + " " + tpf.tpfHeader.taskType + " "
                + tpf.tpfHeader.parameterSetName +" " + tpf.tpfHeader.parameterValueSetName;

        h2 = "           " + tpf.tpfHeader.destination + " " + tpf.tpfHeader.source + " "
                + tpf.tpfHeader.nbRecords;

        h3 = tpf.tpfHeader.releaseTime + " " + tpf.tpfHeader.earliestReleaseTime + " "
                + tpf.tpfHeader.latestReleaseTime;

        h4 = tpf.tpfHeader.executionTime + " " + tpf.tpfHeader.subScheduleID;

        h5 = tpf.tpfHeader.tpfRemarks;

        String tpf_Header = h1 + "\n" + h2 + "\n" + h3 + "\n" + h4 + "\n" + h5 + "\n";
        TPF.setText(tpf_Header);

        String tpf_Body;
        for (int g = 0; g <tpf.tpfBody.tpfRecord.size(); g++) {
            String paramName = tpf.tpfBody.tpfRecord.get(g).paramName + " ";
            String paramValueType = tpf.tpfBody.tpfRecord.get(g).paramValueType + " ";
            String paramValue = tpf.tpfBody.tpfRecord.get(g).paramValue + " ";
            String paramValueUnit = tpf.tpfBody.tpfRecord.get(g).paramValueUnit + " ";
            String paramValueRadix = tpf.tpfBody.tpfRecord.get(g).paramValueRadix + " ";
            String paramRemarks = tpf.tpfBody.tpfRecord.get(g).paramRemarks + "\n";

            tpf_Body = paramName + paramValueType + paramValue + paramValueUnit + paramValueRadix + paramRemarks;
            TPF.addContent(tpf_Body);
        }

        return TPF;
    }

 */


}
