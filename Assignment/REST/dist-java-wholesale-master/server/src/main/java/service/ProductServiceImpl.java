package service;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(list::add);
        return null;
    }
}
