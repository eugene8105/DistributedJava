package edu.wctc.wholesale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.wctc.wholesale.service.WholeSaleOrderService;

@Controller
public class HomeController {

    @Autowired
    private WholeSaleOrderService wholeSaleOrderService;

    @RequestMapping("/")
    public String showAllOrders(Model model) {
        model.addAttribute("orderList",wholeSaleOrderService.getAllOrders());
        return "index";
    }

}
