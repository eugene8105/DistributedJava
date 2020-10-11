package edu.wctc.wholesale.repo;

import edu.wctc.wholesale.entity.WholeSaleOrder;
import org.springframework.data.repository.CrudRepository;

public interface WholeSaleOrderRepository extends CrudRepository<WholeSaleOrder, Integer> {

}
