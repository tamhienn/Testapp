package com.example.shopnuochoa.Controller;

import com.example.shopnuochoa.Entity.Brand;
import com.example.shopnuochoa.Service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// @RestController:
// Đánh dấu đây là Controller dùng để xây dựng REST API.
// Dữ liệu trả về sẽ được gửi trực tiếp về client, thường dưới dạng JSON.
@RestController

// Tất cả API trong class này sẽ bắt đầu bằng /api/brands
@RequestMapping("/api/brands")
public class BrandController {

    // Controller không làm việc trực tiếp với Database.
    // Controller gọi Service để xử lý.
    private final BrandService brandService;

    // Constructor Injection
    // Spring tự động truyền BrandService vào đây.
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    // =====================================================
    // GET /api/brands
    // Lấy tất cả Brand
    // =====================================================
    @GetMapping
    public List<Brand> getAllBrands() {

        // Controller nhận request
        // rồi chuyển công việc cho Service
        return brandService.getAllBrands();
    }

    // =====================================================
    // GET /api/brands/{id}
    // Lấy Brand theo ID
    // Ví dụ: GET /api/brands/1
    // =====================================================
    @GetMapping("/{id}")
    public Optional<Brand> getBrandById(
            @PathVariable Long id) {

        // @PathVariable lấy số 1 từ URL /api/brands/1
        return brandService.getBrandById(id);
    }

    // =====================================================
    // POST /api/brands
    // Thêm Brand
    // =====================================================
    @PostMapping
    public Brand createBrand(
            @RequestBody Brand brand) {

        // @RequestBody lấy dữ liệu JSON
        // từ request và chuyển thành object Brand.
        return brandService.createBrand(brand);
    }

    // =====================================================
    // DELETE /api/brands/{id}
    // Xóa Brand
    // Ví dụ: DELETE /api/brands/1
    // =====================================================
    @DeleteMapping("/{id}")
    public void deleteBrand(
            @PathVariable Long id) {

        // Lấy ID từ URL rồi truyền xuống Service
        brandService.deleteBrand(id);
    }
}
