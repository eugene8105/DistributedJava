package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/cart")
    public String getCart() {

        return "orders/cart";
    }

    @RequestMapping("product/detail")
    public String getProductDetail() {

        return "catalog/product-detail";
    }

    @PostMapping("/place-order")
    public String doRedirect() {
        return "redirect:/";
    }

    @RequestMapping("/search")
    public String doSearch() {
        return "redirect:http://google.com";
    }

}
