package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.dto.ProductRequestDto;
import com.test.SpringBootApi.dto.ProductReturnDto;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Product save(ProductRequestDto productRequestDto);
    public ProductReturnDto findById(Long id);
    public List<ProductReturnDto> findAll();
    public ProductReturnDto update(Long id, ProductRequestDto productRequestDto);
    public void delete(Long id);
    public List<ProductReturnDto> searchProduct(String productName);
}
