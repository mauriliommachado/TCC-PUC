package br.com.mauriliomachado.dropshipping.service;

import br.com.mauriliomachado.dropshipping.model.Product;
import br.com.mauriliomachado.dropshipping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }
}
