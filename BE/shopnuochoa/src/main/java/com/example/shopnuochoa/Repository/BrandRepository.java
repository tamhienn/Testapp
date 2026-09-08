package com.example.shopnuochoa.Repository;

import com.example.shopnuochoa.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository này chịu trách nhiệm làm việc với bảng brands trong Database
public interface BrandRepository extends JpaRepository<Brand, Long> {

    // Không cần tự viết:
    // save()
    // findAll()
    // findById()
    // deleteById()
    // existsById()
    //
    // Vì JpaRepository đã cung cấp sẵn các phương thức CRUD này.
}