package com.anhagu.myselectshop.service;

import com.anhagu.myselectshop.dto.ProductRequestDto;
import com.anhagu.myselectshop.dto.ProductResponseDto;
import com.anhagu.myselectshop.entity.Product;
import com.anhagu.myselectshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
