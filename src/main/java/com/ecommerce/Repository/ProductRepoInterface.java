package com.ecommerce.Repository;

import com.ecommerce.Entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepoInterface extends CrudRepository<ProductEntity,Integer> {

}
