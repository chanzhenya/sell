package com.czy.sell.repository;

import com.czy.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
