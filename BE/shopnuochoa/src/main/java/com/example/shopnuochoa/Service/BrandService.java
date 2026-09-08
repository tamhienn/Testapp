package com.example.shopnuochoa.Service;

import com.example.shopnuochoa.Entity.Brand;
import com.example.shopnuochoa.Repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Service: đánh dấu đây là lớp xử lý nghiệp vụ
// để Spring quản lý và có thể Inject vào Controller
@Service
public class BrandService {

    // Service sử dụng BrandRepository để làm việc với Database
    private final BrandRepository brandRepository;

    // Constructor Injection
    // Spring sẽ tự truyền BrandRepository vào đây
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    // Lấy tất cả Brand
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    // Tìm Brand theo ID
    public Optional<Brand> getBrandById(Long id) {
        return brandRepository.findById(id);
    }

    // Thêm Brand
    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    // Xóa Brand theo ID
    public void deleteBrand(Long id) {
        brandRepository.deleteById(id);
    }
}

