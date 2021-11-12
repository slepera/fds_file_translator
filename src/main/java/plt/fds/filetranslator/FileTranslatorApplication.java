package plt.fds.filetranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import plt.fds.filetranslator.data_models.*;
import plt.fds.filetranslator.exceptions.OutOfRangeException;
import plt.fds.filetranslator.format_manager.*;
import plt.fds.filetranslator.stubs.DBSimulator;

import javax.xml.transform.TransformerException;
import java.io.IOException;

@SpringBootApplication
public class
FileTranslatorApplication {

	public static void main(String[] args) throws IOException, TransformerException, OutOfRangeException {
		SpringApplication.run(FileTranslatorApplication.class, args);

		//PassPlan passPlan = DBSimulator.getPassPlan();
		//PassPlanXMLGenerator.GeneratePassPlanXML(passPlan);

		//AttitudeFile attitudeFile = DBSimulator.getAttitudeFile();
		//AttitudeFileXMLGenerator.GenerateAttitudeFileXML(attitudeFile);

		//OrbitalEvents orbitalEvents = DBSimulator.getOrbitalEvents();
		//OrbitalEventsXMLGenerator.GenerateOrbitalEventsXML(orbitalEvents);

		//ManoeuvrePlan manoeuvrePlan = DBSimulator.getManoeuvrePlan();
		//ManoeuvrePlanXMLGenerator.GenerateManoeuvreFileXML(manoeuvrePlan);

		//TPF tpf = DBSimulator.getTPF();
		//TPFFileGenerator.CreateTPFTextFile(tpf);

		//ODSTP odstp = DBSimulator.getODSTP();
		//ODSTP_ODNOM_Processed_Orbits_FileGenerator.CreateODSTPFile(odstp);

		//ODNOM odnom = DBSimulator.getODNOM();
		//ODSTP_ODNOM_Processed_Orbits_FileGenerator.CreateODNOMFile(odnom);

		//ProcessedOrbits processedOrbits = DBSimulator.getProcessedOrbits();
		//ODSTP_ODNOM_Processed_Orbits_FileGenerator.CreateProcessedOrbitsFile(processedOrbits);

		//FDSReport fdsReport = DBSimulator.getFDSReport();
		//FDSReportGenerator.CreateFDSReportFile(fdsReport);

		//FDSLog fdsLog = DBSimulator.getFDSLog();
		//FDSLogGenerator.CreateFDSLogFile(fdsLog);

		ProcessedAttitude processedAttitude = DBSimulator.getProcessedAttitude();
		ProcessedAttitudeGenerator.CreateProcessedOrbitsFile(processedAttitude);

	}

}

