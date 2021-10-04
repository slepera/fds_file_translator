package plt.fds.filetranslator.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import plt.fds.filetranslator.EOPTranslator;
import plt.fds.filetranslator.SolarFileTranslator;

import java.io.IOException;

@RestController
@RequestMapping(path = "/translator")
public class FTController {

    @GetMapping(path = "/eop/data/input/{category}/{file_name}")
    public String EOPTranslator(@PathVariable String category, @PathVariable String file_name) throws IOException {
        String input_file = "./data/input/"+ category +"/"+ file_name ;
        EOPTranslator eop = new EOPTranslator(input_file);
       return "EOP Translator Executed " + eop.output_file_eop;
    }

    @GetMapping(path = "/solar_flux/data/input/{category}/{file_name}")
    public String SolarFluxTranslator(@PathVariable String category, @PathVariable String file_name) throws IOException {
        String input_file = "./data/input/" + category +"/"+ file_name;
        SolarFileTranslator sft = new SolarFileTranslator(input_file);
        return "Solar Flux Translator Executed " + sft.output_file_solar_flux;
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
