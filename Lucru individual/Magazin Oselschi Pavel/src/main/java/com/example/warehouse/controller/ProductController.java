package com.example.warehouse.controller;

import com.example.warehouse.model.Product;
import com.example.warehouse.model.Category;
import com.example.warehouse.model.Location;
import com.example.warehouse.repository.ProductRepository;
import com.example.warehouse.repository.CategoryRepository;
import com.example.warehouse.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final LocationRepository locationRepository;

    public ProductController(ProductRepository productRepository,
                             CategoryRepository categoryRepository,
                             LocationRepository locationRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.locationRepository = locationRepository;
    }

    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("content", "products/list");
        return "products/list";
    }

    @GetMapping("/new")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("locations", locationRepository.findAll());
        model.addAttribute("content", "products/form");
        return "products/form";
    }

    @PostMapping
    public String saveProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid product id: " + id));
        productRepository.delete(product);
        return "redirect:/products";
    }
}