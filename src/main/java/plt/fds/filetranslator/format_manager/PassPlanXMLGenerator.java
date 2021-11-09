package plt.fds.filetranslator.format_manager;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import plt.fds.filetranslator.Utilities;
import plt.fds.filetranslator.data_models.PassPlan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class PassPlanXMLGenerator {

    public static void GeneratePassPlanXML(PassPlan passPlan) throws IOException {

        Document doc = new Document();
        doc.setRootElement(new Element("PASS_PLAN"));
        Element header = new Element("Signal_Header_Type");
        header.addContent(new Element("signalID").setText(passPlan.signalHeaderType.signalID));
        header.addContent(new Element("recipientID").setText(passPlan.signalHeaderType.recipientID));
        header.addContent(new Element("validitytimeWindow").setText(passPlan.signalHeaderType.validityTimeWindow));
        header.addContent(new Element("missionID").setText(passPlan.signalHeaderType.missionID));
        header.addContent(new Element("satelliteID").setText(passPlan.signalHeaderType.satelliteID.name()));
        header.addContent(new Element("originatorID").setText(passPlan.signalHeaderType.originatorID));
        header.addContent(new Element("originatorRole").setText(passPlan.signalHeaderType.originatorRole));
        header.addContent(new Element("creationTime").setText(passPlan.signalHeaderType.creationTime));
        header.addContent(new Element("subjectType").setText(passPlan.signalHeaderType.subjectType));
        header.addContent(new Element("spare").setText(passPlan.signalHeaderType.spare));
        header.addContent(new Element("signalAim").setText(passPlan.signalHeaderType.signalAim));

        Element visibilities = new Element("Visibilities");
        for(int i = 0; i < passPlan.visibilityType.size(); i++) {
            Element visibility = new Element("Visibility");
            visibility.addContent(new Element("contactID").setText(passPlan.visibilityType.get(i).contactID));
            visibility.addContent(new Element("missionrefID").setText(passPlan.visibilityType.get(i).missionrefID));
            visibility.addContent(new Element("spacecraftrefID").setText(passPlan.visibilityType.get(i).spacecraftrefID.name()));
            visibility.addContent(new Element("groundstationrefID").setText(passPlan.visibilityType.get(i).groundstationrefID.name()));
            visibility.addContent(new Element("startEpoch").setText(passPlan.visibilityType.get(i).startEpoch));
            visibility.addContent(new Element("stopEpoch").setText(passPlan.visibilityType.get(i).stopEpoch));
            visibility.addContent(new Element("visibilitymaskID").setText(passPlan.visibilityType.get(i).visibilitymaskID));
            visibility.addContent(new Element("looksideGeometry").setText(passPlan.visibilityType.get(i).looksideGeometry.name()));
            visibility.addContent(new Element("remarks").setText(passPlan.visibilityType.get(i).remarks));
            visibilities.addContent(visibility);
        }

        doc.getRootElement().addContent(header);
        doc.getRootElement().addContent(visibilities);


        XMLOutputter xmlOutputter = new XMLOutputter(Utilities.getCustomizedFormat());

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        FileOutputStream fos = new FileOutputStream(new File("./data/output/pass_plan_xml/pass_plan " + europeanDateFormatter.format(LocalDateTime.now()) + ".xml"));
        xmlOutputter.output(doc, fos);

        fos.close();

    }

}
