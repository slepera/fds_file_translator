package plt.fds.filetranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class
FileTranslatorApplication {

	public static void main(String[] args) {
		/* add here translator class initialization */
		SolarFileTranslator sft = new SolarFileTranslator("./data/input/AP,KPNOAA.txt");
	//	EOPTranslator eopTranslator = new EOPTranslator("./data/input/AP,KPNOAA.txt");
		SpringApplication.run(FileTranslatorApplication.class, args);
	}

}
