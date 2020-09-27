package edu.wctc.wisconsin_fried_chicken;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/employee-benefits")
    public String employeeBenefits() {
        return "employee-benefits";
    }

    @RequestMapping("/secret-recipe")
    public String secretRecipe() {
        return "secret-recipe";
    }
}
