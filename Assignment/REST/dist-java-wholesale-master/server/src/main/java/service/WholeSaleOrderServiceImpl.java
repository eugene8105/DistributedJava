package service;

import entity.WholeSaleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.WholeSaleOrderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
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
