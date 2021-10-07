package plt.fds.filetranslator.controllers;


import org.springframework.web.bind.annotation.*;
import plt.fds.filetranslator.BulletinATranslator;
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

    @GetMapping(path = "/bulletin_a/data/input/{category}/{file_name}")
    public String BulletinATranslator(@PathVariable String category, @PathVariable String file_name) throws IOException {
        String input_file = "./data/input/" + category +"/"+ file_name;
        BulletinATranslator bat = new BulletinATranslator(input_file);
        return "Bulletin A Translator Executed ";
    }


}
