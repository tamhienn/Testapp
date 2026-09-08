
package com.example.shopnuochoa.Service;

import com.example.shopnuochoa.Entity.Category;
import com.example.shopnuochoa.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Service: đánh dấu đây là lớp xử lý nghiệp vụ
// để Spring quản lý và có thể Inject vào Controller
@Service
public class CategoryService {

    // Service sử dụng CategoryRepository
    // để làm việc với Database
    private final CategoryRepository categoryRepository;

    // Constructor Injection
    // Spring sẽ tự truyền CategoryRepository vào đây
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Lấy tất cả Category
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Tìm Category theo ID
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Thêm Category
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Xóa Category theo ID
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
