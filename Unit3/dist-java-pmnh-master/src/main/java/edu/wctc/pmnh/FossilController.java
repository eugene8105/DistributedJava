package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fossils")
public class FossilController {

    @RequestMapping("facts")
    public String showFossilFacts(Model model) {
        model.addAttribute("pageTitle", "Wisco Fossils");
        return "pages/fossil-facts";
    }

    @RequestMapping("trilobites")
    public String showTriloFacts(Model model) {
        model.addAttribute("pageTitle", "Trilobites");
        return "pages/trilobites";
    }

}
