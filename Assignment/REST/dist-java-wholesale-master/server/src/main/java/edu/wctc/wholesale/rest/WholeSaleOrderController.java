package edu.wctc.wholesale.rest;

import edu.wctc.wholesale.dto.Wsop;
import edu.wctc.wholesale.entity.WholeSaleOrder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.wctc.wholesale.service.WholeSaleOrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class WholeSaleOrderController {

    @Autowired
    private WholeSaleOrderService wholeSaleOrderService;

//    @Autowired
//    private ModelMapper modelMapper;

    private Wsop convertToDto(WholeSaleOrder order) {
//        Wsop wsop = modelMapper.map(order, Wsop.class);
        Wsop wsop = new Wsop();
        wsop.setCustomerName(order.getCustomer().getName());
        wsop.setDate(order.getPurchaseDate());
        wsop.setPoNumber(order.getPurchaseOrderNumber());
        wsop.setProductName(order.getProduct().getName());
        wsop.setTerms(order.getTerms());
        wsop.setShipped(order.getShippedDate());
        return wsop;
    }

    private List<Wsop> convertToDto(List<WholeSaleOrder> order) {
        return order.stream().map(x -> convertToDto(x)).collect(Collectors.toList());
    }

//    private WholeSaleOrder convertToEntity(Wsop wsop) {
//        WholeSaleOrder wholeSaleOrder = modelMapper.map(wsop, WholeSaleOrder.class);
//        return wholeSaleOrder;
//    }
//
//    private List<WholeSaleOrder> convertToEntity(List<Wsop> wsop) {
//        return wsop.stream().map(x -> convertToEntity(x)).collect(Collectors.toList());
//    }

    @GetMapping("/orders")
    @CrossOrigin(origins = "http://localhost:63342")
    public List<Wsop> getOrders() {
        List<WholeSaleOrder> list = new ArrayList<>();
        wholeSaleOrderService.getAllOrders().forEach(list::add);
        return convertToDto(list);
    }

//    public List<WholeSaleOrder> getOrders() {
//        List<WholeSaleOrder> list = new ArrayList<>();
//        wholeSaleOrderService.getAllOrders().forEach(list::add);
//        return list;
//    }
}


