package com.project.mcl.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class PostController {

    private Data data;

    @Autowired
    public PostController(){
        data = new Data();
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showSensingData(Model model) {
        model.addAttribute("data", data);
        return "show";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String receiveSensingData(Model model,
                                     @RequestParam(value = "time", required = false) String time,
                                     @RequestParam(value = "temperature", required = false) String temperature,
                                     @RequestParam(value = "pressure", required = false) String pressure,
                                     @RequestParam(value = "humidity", required = false) String humidity) {
        data.setTime(time);
        data.setHumidity(humidity);
        data.setTemperature(temperature);
        data.setPressure(pressure);
        model.addAttribute("data", data);
        return "show";
    }

}
