package com.example.shopnuochoa.Repository;

import com.example.shopnuochoa.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Kế thừa JpaRepository -> có sẵn findAll(), findById(), save(), delete()
    // Chưa cần viết query riêng ở giai đoạn CRUD cơ bản này
}