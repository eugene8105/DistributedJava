package rest;

import entity.WholeSaleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.WholeSaleOrderService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class WholeSaleOrderController {

    @Autowired
    private WholeSaleOrderService wholeSaleOrderService;

    @GetMapping("/api/orders")
                            //              :45679
    @CrossOrigin(origins = "http://localhost:.....")
    public List<WholeSaleOrder> getOrders() {
        List<WholeSaleOrder> list = new ArrayList<>();
        wholeSaleOrderService.getAllOrders().forEach(list::add);
        return list;
    }
}


