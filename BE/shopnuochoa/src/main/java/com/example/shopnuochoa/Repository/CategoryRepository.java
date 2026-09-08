package com.example.shopnuochoa.Repository;

import com.example.shopnuochoa.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository chịu trách nhiệm thao tác dữ liệu Category trong Database
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // JpaRepository đã có sẵn các hàm CRUD:
    // save()        -> thêm / cập nhật
    // findAll()     -> lấy tất cả
    // findById()    -> tìm theo ID
    // deleteById()  -> xóa theo ID
}