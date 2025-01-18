package com.example.warehouse.controller;

import com.example.warehouse.model.Inventory;
import com.example.warehouse.model.Product;
import com.example.warehouse.repository.InventoryRepository;
import com.example.warehouse.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inventory")
public class InventoryController {
    private final InventoryRepository inventoryRepository;
    private final ProductRepository productRepository;

    public InventoryController(InventoryRepository inventoryRepository,
                               ProductRepository productRepository) {
        this.inventoryRepository = inventoryRepository;
        this.productRepository = productRepository;
    }

    @GetMapping
    public String listInventory(Model model) {
        model.addAttribute("inventory", inventoryRepository.findAll());
        model.addAttribute("content", "inventory/list");
        return "inventory/list";
    }

    @GetMapping("/new")
    public String newInventoryEntry(Model model) {
        model.addAttribute("inventory", new Inventory());
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("content", "inventory/form");
        return "inventory/form";
    }

    @PostMapping
    public String saveInventoryEntry(@ModelAttribute Inventory inventory) {
        inventoryRepository.save(inventory);
        return "redirect:/inventory";
    }

    @GetMapping("/delete/{id}")
    public String deleteInventory(@PathVariable("id") Integer id) {
        Inventory inventory = inventoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid inventory id: " + id));
        inventoryRepository.delete(inventory);
        return "redirect:/inventory";
    }
}

