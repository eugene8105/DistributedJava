package edu.wctc.tess;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StepsController {

    @RequestMapping("step1")
    public String showStep1(Model model) {
        model.addAttribute("pageTitle", "Step 1");
        return "pages/step_1";
    }

    @RequestMapping("step2")
    public String showStep2(Model model) {
        model.addAttribute("pageTitle", "Step 2");
        return "pages/step_2";
    }

    @RequestMapping("step3")
    public String showStep3(Model model) {
        model.addAttribute("pageTitle", "Step 3");
        return "pages/step_3";
    }

    @RequestMapping("ready")
    public String showGrilled(Model model) {
        model.addAttribute("pageTitle", "Final step");
        return "pages/grilled";
    }
}
