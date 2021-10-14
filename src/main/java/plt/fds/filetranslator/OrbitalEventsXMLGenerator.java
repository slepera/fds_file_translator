package plt.fds.filetranslator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import plt.fds.filetranslator.data_models.OrbitalEvents;
import plt.fds.filetranslator.data_models.PassPlan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrbitalEventsXMLGenerator {

    public static void GenerateOrbitalEventsXML(OrbitalEvents orbitalEvents) throws IOException {

        Document doc = new Document();
        doc.setRootElement(new Element("Orbital_Events_File"));
        Element header = new Element("Signal_Header_Type");
        header.addContent(new Element("signalID").setText(orbitalEvents.signalHeaderType.signalID));
        header.addContent(new Element("recipientID").setText(orbitalEvents.signalHeaderType.recipientID));
        header.addContent(new Element("validitytimeWindow").setText(orbitalEvents.signalHeaderType.validityTimeWindow));
        header.addContent(new Element("missionID").setText(orbitalEvents.signalHeaderType.missionID));
        header.addContent(new Element("satelliteID").setText(orbitalEvents.signalHeaderType.satelliteID));
        header.addContent(new Element("originatorID").setText(orbitalEvents.signalHeaderType.originatorID));
        header.addContent(new Element("originatorRole").setText(orbitalEvents.signalHeaderType.originatorRole));
        header.addContent(new Element("creationTime").setText(orbitalEvents.signalHeaderType.creationTime));
        header.addContent(new Element("subjectType").setText(orbitalEvents.signalHeaderType.subjectType));
        header.addContent(new Element("spare").setText(orbitalEvents.signalHeaderType.spare));
        header.addContent(new Element("signalAim").setText(orbitalEvents.signalHeaderType.signalAim));

        Element information = new Element("Orbital_Events");
        for(int i = 0; i < orbitalEvents.orbitalEventsData.length; i++) {
            Element orbital = new Element("Orbital_Event");
            orbital.addContent(new Element("missionrefID").setText(orbitalEvents.orbitalEventsData[i].missionRefID));
            orbital.addContent(new Element("spacecraftrefID").setText(orbitalEvents.orbitalEventsData[i].spacecraftRefID));
            orbital.addContent(new Element("orbitaleventType").setText(orbitalEvents.orbitalEventsData[i].orbitalEventType));
            orbital.addContent(new Element("eventName").setText(orbitalEvents.orbitalEventsData[i].eventName));
            orbital.addContent(new Element("eventID").setText(orbitalEvents.orbitalEventsData[i].eventID));
            orbital.addContent(new Element("startEpoch").setText(orbitalEvents.orbitalEventsData[i].startEpoch));
            orbital.addContent(new Element("stopEpoch").setText(orbitalEvents.orbitalEventsData[i].stopEpoch));
            orbital.addContent(new Element("remarks").setText(orbitalEvents.orbitalEventsData[i].remarks));
            information.addContent(orbital);
        }

        doc.getRootElement().addContent(header);
        doc.getRootElement().addContent(information);


        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());

        String europeanDatePattern = "dd.MM.yyyy  HH-mm-ss";
        DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
        FileOutputStream fos = new FileOutputStream(new File("./data/output/orbital_events_xml/orbital_events " + europeanDateFormatter.format(LocalDateTime.now()) + ".xml"));
        xmlOutputter.output(doc, fos);

        fos.close();

    }


}
