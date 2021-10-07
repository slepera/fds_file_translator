package plt.fds.filetranslator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class
FileTranslatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileTranslatorApplication.class, args);
		BulletinATranslator bat = new BulletinATranslator("./data/input/bulletin_a/bulletina-xxiv-048.txt");
	}

}

