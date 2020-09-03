package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/glaciers")
public class GlacierController {
    @RequestMapping("/facts")
    public String showGlacierFacts(Model model) {
        model.addAttribute("pageTitle", "Glacier Facts");
        return "pages/glacier-facts";
    }

    @RequestMapping("/trail")
    public String showTrailFacts(Model model) {
        model.addAttribute("addTitle", "Ice Age Trail");
        return "pages/ice-age-trail";
    }
}
