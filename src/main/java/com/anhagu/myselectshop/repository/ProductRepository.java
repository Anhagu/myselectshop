package com.anhagu.myselectshop.repository;

import com.anhagu.myselectshop.entity.Product;
import com.anhagu.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUser(User user);
}
