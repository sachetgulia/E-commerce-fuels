package com.ecommerce.Service;

import com.ecommerce.Dto.Product;
import com.ecommerce.Entity.ProductEntity;
import com.ecommerce.Repository.ProductRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductImpl implements ProductInterface{

    @Autowired
    ProductRepoInterface productRepo;

    @Override
    public List<Product> getAllProducts(){
        Iterable<ProductEntity> productEntityList = productRepo.findAll();
        List<Product> productResponseList = new ArrayList<>();
        for(ProductEntity product : productEntityList){
//            productResponseList.add(new Product(productRepo.getId(),productRepo.getName()));
        }
        return productResponseList;
    }
}
