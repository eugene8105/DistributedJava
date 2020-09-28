package edu.wctc.wisconsin_fried_chicken;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("pageTitle", "Wisconsin Fried Chicken");
        return "index";
    }

    @RequestMapping("/employee-benefits")
    public String employeeBenefits(Model model) {
        model.addAttribute("pageTitle", "Employee Benefits");
        return "employee-benefits";
    }

    @RequestMapping("/secret-recipe")
    public String secretRecipe(Model model) {
        model.addAttribute("pageTitle", "Secret Recipe");
        return "secret-recipe";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("pageTitle", "Login page");
        return "login";
    }
}
