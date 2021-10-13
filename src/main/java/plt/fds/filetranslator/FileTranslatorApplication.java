package plt.fds.filetranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import plt.fds.filetranslator.data_models.AttitudeFile;
import plt.fds.filetranslator.data_models.PassPlan;
import plt.fds.filetranslator.stubs.DBSimulator;

import java.io.IOException;

@SpringBootApplication
public class
FileTranslatorApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FileTranslatorApplication.class, args);

		//PassPlan passPlan = DBSimulator.getPassPlan();
		//PassPlanXMLGenerator.GeneratePassPlanXML(passPlan);

		AttitudeFile attitudeFile = DBSimulator.getAttitudeFile();
		AttitudeFileXMLGenerator.GenerateAttitudeFileXML(attitudeFile);

	}

}

