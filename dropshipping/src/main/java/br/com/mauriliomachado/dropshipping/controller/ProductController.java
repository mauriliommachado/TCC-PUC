package br.com.mauriliomachado.dropshipping.controller;

import br.com.mauriliomachado.dropshipping.model.Product;
import br.com.mauriliomachado.dropshipping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/products")
    public ResponseEntity register(@Valid @RequestBody Product product) throws URISyntaxException {
        product = this.productService.save(product);
        return ResponseEntity.created(new URI(product.getId().toString())).body(null);
    }

    @GetMapping("/products")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(this.productService.findAll());
    }
}
