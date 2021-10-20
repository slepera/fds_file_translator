package plt.fds.filetranslator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import plt.fds.filetranslator.data_models.AttitudeFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AttitudeFileXMLGenerator {

    public static void GenerateAttitudeFileXML(AttitudeFile attitudeFile) throws IOException {

        Document doc = new Document();
        doc.setRootElement(new Element("Attitude_File"));
        Element header = new Element("Attitude_File_Header");
        header.addContent(new Element("nbAttitudeLegs").setText(String.valueOf(attitudeFile.attitudeFileHeader.nbAttitudelegs)));
        header.addContent(new Element("referenceFrame").setText(attitudeFile.attitudeFileHeader.referenceFrame));
        header.addContent(new Element("principalPlane").setText(attitudeFile.attitudeFileHeader.principalPlane));
        header.addContent(new Element("columnLabelsAndUnits").setText(attitudeFile.attitudeFileHeader.columnLabelsAndUnits));
        header.addContent(new Element("signalID").setText(attitudeFile.attitudeFileHeader.signalID));
        header.addContent(new Element("recipientID").setText(attitudeFile.attitudeFileHeader.recipientID));
        header.addContent(new Element("validitytimeWindow").setText(attitudeFile.attitudeFileHeader.validityTimeWindow));
        header.addContent(new Element("missionID").setText(attitudeFile.attitudeFileHeader.missionID));
        header.addContent(new Element("satelliteID").setText(attitudeFile.attitudeFileHeader.satelliteID));
        header.addContent(new Element("originatorID").setText(attitudeFile.attitudeFileHeader.originatorID));
        header.addContent(new Element("originatorRole").setText(attitudeFile.attitudeFileHeader.originatorRole));
        header.addContent(new Element("creationTime").setText(attitudeFile.attitudeFileHeader.creationTime));
        header.addContent(new Element("subjectType").setText(attitudeFile.attitudeFileHeader.subjectType));
        header.addContent(new Element("spare").setText(attitudeFile.attitudeFileHeader.spare));
        header.addContent(new Element("signalAim").setText(attitudeFile.attitudeFileHeader.signalAim));

        Element attitudeFileXML = new Element("AttitudeLegs");
        for(int i = 0; i < attitudeFile.attitudeLegs.size(); i++) {
            Element attitudeLeg = new Element("attitudeLeg");
            attitudeLeg.addContent(new Element("legStartTime").setText(attitudeFile.attitudeLegs.get(i).legStartTime));
            attitudeLeg.addContent(new Element("legStopTime").setText(attitudeFile.attitudeLegs.get(i).legStopTime));
            attitudeLeg.addContent(new Element("legAttitudeType").setText(attitudeFile.attitudeLegs.get(i).legAttitudeType));
            Element legNBAttitudeDataPoints = new Element( "legNBAttitudeDataPoints");
            for (int j = 0; j < attitudeFile.attitudeLegs.get(i).legNBAttitudeDataPoints.size(); j++) {
                legNBAttitudeDataPoints.addContent(String.valueOf(attitudeFile.attitudeLegs.get(i).legNBAttitudeDataPoints.get(j) + ";"));
            }
            attitudeLeg.addContent(legNBAttitudeDataPoints);

            Element attitudeFileRecords =new Element("attitudeFileRecords");
            for (int k = 0; k < attitudeFile.attitudeLegs.get(i).attitudeFileRecords.size(); k++) {
                Element attitudeFileRecord = new Element("attitudeFileRecord");
                attitudeFileRecord.addContent(new Element ("epoch").setText(attitudeFile.attitudeLegs.get(i).attitudeFileRecords.get(k).epoch));
                attitudeFileRecord.addContent(new Element("quaternion").setText(attitudeFile.attitudeLegs.get(i).attitudeFileRecords.get(k).quaternion));
                attitudeFileRecord.addContent(new Element("angularVelocity").setText(attitudeFile.attitudeLegs.get(i).attitudeFileRecords.get(k).angularVelocity));
                attitudeFileRecords.addContent(attitudeFileRecord);
            }
            attitudeLeg.addContent(attitudeFileRecords);
            attitudeFileXML.addContent(attitudeLeg);
        }


        doc.getRootElement().addContent(header);
        doc.getRootElement().addContent(attitudeFileXML);


        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        FileOutputStream fos = new FileOutputStream(new File("./data/output/attitude_file_xml/attitude_file " + europeanDateFormatter.format(LocalDateTime.now()) + ".xml"));
        xmlOutputter.output(doc, fos);

        fos.close();

    }

}


