package com.example.shopnuochoa.Controller;

import com.example.shopnuochoa.Entity.Category;
import com.example.shopnuochoa.Service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Controller xử lý REST API cho Category
@RestController

// API sẽ bắt đầu bằng /api/categories
@RequestMapping("/api/categories")
public class CategoryController {

    // Controller phụ thuộc vào CategoryService
    private final CategoryService categoryService;

    // Constructor Injection
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // =====================================================
    // GET /api/categories
    // Lấy tất cả Category
    // =====================================================
    @GetMapping
    public List<Category> getAllCategories() {

        return categoryService.getAllCategories();
    }

    // =====================================================
    // GET /api/categories/{id}
    // Lấy Category theo ID
    // Ví dụ: GET /api/categories/1
    // =====================================================
    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(
            @PathVariable Long id) {

        return categoryService.getCategoryById(id);
    }

    // =====================================================
    // POST /api/categories
    // Thêm Category
    // =====================================================
    @PostMapping
    public Category createCategory(
            @RequestBody Category category) {

        return categoryService.createCategory(category);
    }

    // =====================================================
    // DELETE /api/categories/{id}
    // Xóa Category
    // =====================================================
    @DeleteMapping("/{id}")
    public void deleteCategory(
            @PathVariable Long id) {

        categoryService.deleteCategory(id);
    }
}
