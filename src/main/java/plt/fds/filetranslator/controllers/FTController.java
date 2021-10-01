package plt.fds.filetranslator.controllers;


import org.springframework.web.bind.annotation.*;
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
//        System.out.println("solar_flux rest");
//        SolarFileTranslator sft = new SolarFileTranslator("./data/input/solar flux/AP,KPNOAA.txt");
        return "Solar Flux Translator Executed";
    }

    @PostMapping("/ciao")
    public String ciaoPostTranslator() {
//        System.out.println("solar_flux rest");
//        SolarFileTranslator sft = new SolarFileTranslator("./data/input/solar flux/AP,KPNOAA.txt");
        return "Ciao post";
    }

    @GetMapping("/ciao")
    public String ciaoGetTranslator() {
//        System.out.println("solar_flux rest");
//        SolarFileTranslator sft = new SolarFileTranslator("./data/input/solar flux/AP,KPNOAA.txt");
        return "Ciao get";
    }

    @DeleteMapping("/ciao")
    public String ciaoDeleteTranslator() {
//        System.out.println("solar_flux rest");
//        SolarFileTranslator sft = new SolarFileTranslator("./data/input/solar flux/AP,KPNOAA.txt");
        return "Ciao delete";
    }
}
