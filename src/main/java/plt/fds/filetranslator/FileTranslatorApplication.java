package plt.fds.filetranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import plt.fds.filetranslator.data_models.PassPlan;
import plt.fds.filetranslator.stubs.DBSimulator;

import java.io.IOException;

@SpringBootApplication
public class
FileTranslatorApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FileTranslatorApplication.class, args);
		//BulletinATranslator bat = new BulletinATranslator("./data/input/bulletin_a/bulletina-xxiv-048.txt");

		PassPlan passPlan = DBSimulator.getPassPlan();
		PassPlanXMLGenerator.GeneratePassPlanXML(passPlan);


	}

}

