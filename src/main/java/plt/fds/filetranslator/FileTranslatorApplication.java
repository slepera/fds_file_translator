package plt.fds.filetranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class
FileTranslatorApplication {

	public static void main(String[] args) {
		SolarFileTranslator sft = new SolarFileTranslator("C:\\Users\\albac\\OneDrive\\Escritorio\\NEXT\\PLATINO FDS\\TASKS\\20.09.21\\Solar Flux\\INPUT\\AP,KPNOAA.txt");
		EOPTranslator eop = new EOPTranslator("C:\\Users\\albac\\OneDrive\\Escritorio\\NEXT\\PLATINO FDS\\TASKS\\20.09.21\\Solar Flux\\INPUT\\AP,KPNOAA.txt");
		SpringApplication.run(FileTranslatorApplication.class, args);
	}

}
