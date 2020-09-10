package edu.wctc.zodiakdemo;

import edu.wctc.zodiakdemo.entity.Birthday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoroscopeController {
    @Autowired
    private MonthService monthService;

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("pageTitle", "Mystic Oracle Homepage");
        return "index";
    }

    public String showForm(Model model) {
        model.addAttribute("pageTitle","Enter Your Birthday");

        // add a blank birthday object to model
        Birthday bday = new Birthday();
        model.addAttribute("birthday",bday);
        // add a list of months to model
        model.addAttribute("monthList", monthService.getMonth());

        return "birthday-form";
    }

    public String processForm(Model model) {
        model.addAttribute("padeTitle", "Know Your Fate");

        // get populated Birthday object out of model

        // ude Birthday data to generate a Horoscope object

        // add Horoscope object to model


        return "horoscope";
    }
}
