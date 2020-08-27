package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/forward-me")
    public String doForward() {
        return "forward:/fossils/facts";
    }

    @RequestMapping("/redirect-me")
    public String doRedirect() {
        return "redirect:http://www.wctc.edu";
//        return "redirect:/glaciers/trail";
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
