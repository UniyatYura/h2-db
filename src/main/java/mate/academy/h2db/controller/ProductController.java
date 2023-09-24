package mate.academy.h2db.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.h2db.model.Product;
import mate.academy.h2db.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;

    @RequestMapping
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
