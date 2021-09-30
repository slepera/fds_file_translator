package plt.fds.filetranslator.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plt.fds.filetranslator.EOPTranslator;
import plt.fds.filetranslator.SolarFileTranslator;

@RestController
@RequestMapping("/translator")
public class FTController {

    @GetMapping("/eop")
    public String EOPTranslator() {
        System.out.println("eop rest");
        EOPTranslator eopTranslator = new EOPTranslator("./data/input/EOP/finals2000A.all.txt");
        return "EOP Translator Executed";
    }

    @GetMapping("/solar_flux")
    public String SolarFluxTranslator() {
        System.out.println("solar_flux rest");
        SolarFileTranslator sft = new SolarFileTranslator("./data/input/solar flux/AP,KPNOAA.txt");
        return "Solar Flux Translator Executed";
    }
}
