package com.ecommerce.Controller;

import com.ecommerce.Dto.Product;
import com.ecommerce.Service.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProductInterface productService;
    @GetMapping(value = "/products", produces = "application/json")
    public List<Product> getAllStudent(){
        return productService.getAllProducts();
    }
}
