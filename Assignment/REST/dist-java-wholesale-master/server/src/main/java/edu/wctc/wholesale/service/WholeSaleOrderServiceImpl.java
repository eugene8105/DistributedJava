package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholeSaleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import edu.wctc.wholesale.repo.WholeSaleOrderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
//@ComponentScan({"edu.wctc.wholesale"})
public class WholeSaleOrderServiceImpl implements WholeSaleOrderService {

    @Autowired
    private WholeSaleOrderRepository wholeSaleOrderRepository;

    @Override
    public List<WholeSaleOrder> getAllOrders() {
        List<WholeSaleOrder> list = new ArrayList<>();
        wholeSaleOrderRepository.findAll().forEach(list::add);
        return list;
    }
}
