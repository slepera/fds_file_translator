package plt.fds.filetranslator;

import org.jdom2.Document;
import org.jdom2.Element;

import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import plt.fds.filetranslator.data_models.PassPlan;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class PassPlanXMLGenerator {

    public static void GeneratePassPlanXML(PassPlan passPlan) throws IOException {
        System.out.println("Start writing the XML file containing the PassPlan");

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document doc = new Document();
        doc.setRootElement(new Element("PASS_PLAN"));
        Element header = new Element("Signal_Header_Type");
        header.addContent(new Element("signalID").setText(passPlan.signalHeaderType.signalID));
        header.addContent(new Element("recipientID").setText(passPlan.signalHeaderType.recipientID));
        header.addContent(new Element("validitytimeWindow").setText(passPlan.signalHeaderType.validitytimeWindow));

        Element visibility = new Element("VISIBILITY");
        visibility.addContent(new Element("contactID").setText(passPlan.visibilityTypes[0].contactID));
        visibility.addContent(new Element("missionrefID").setText(passPlan.visibilityTypes[0].missionrefID));
        visibility.addContent(new Element("spacecraftrefID").setText(passPlan.visibilityTypes[0].spacecraftrefID));

        doc.getRootElement().addContent(header);
        doc.getRootElement().addContent(visibility);

        XMLOutputter xmlOutputter = new XMLOutputter();

        xmlOutputter.setFormat(Format.getPrettyFormat());

        FileOutputStream fo = new FileOutputStream(new File("./file.xml"));

        xmlOutputter.output(doc, fo);

        fo.close();


        for(int i = 0; i < passPlan.visibilityTypes.length; i++)
        {
            System.out.println(passPlan.visibilityTypes[i].startEpoch);
            System.out.println(passPlan.visibilityTypes[i].stopEpoch);
        }


    }

}
