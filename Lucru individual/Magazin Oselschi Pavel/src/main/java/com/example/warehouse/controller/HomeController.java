package com.example.warehouse.controller;

import com.example.warehouse.repository.ProductRepository;
import com.example.warehouse.repository.CategoryRepository;
import com.example.warehouse.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final LocationRepository locationRepository;

    public HomeController(ProductRepository productRepository,
                          CategoryRepository categoryRepository,
                          LocationRepository locationRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.locationRepository = locationRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        int totalProducts = (int) productRepository.count();
        int totalCategories = (int) categoryRepository.count();
        int totalLocations = (int) locationRepository.count();

        model.addAttribute("content", "index");
        model.addAttribute("totalProducts", totalProducts);
        model.addAttribute("totalCategories", totalCategories);
        model.addAttribute("totalLocations", totalLocations);

        return "index";
    }
}
