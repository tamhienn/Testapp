package com.example.shopnuochoa.Entity;

import jakarta.persistence.*;


// =========================================================
// ENTITY
// =========================================================

// Đánh dấu Category là một Entity của JPA.
// JPA sẽ quản lý object Category và ánh xạ nó với Database.
@Entity

// Entity Category sẽ tương ứng với bảng "categories".
@Table(name = "categories")
public class Category {

    // =========================================================
    // FIELD: id
    // =========================================================

    // Primary Key của bảng categories.
    @Id

    // Database tự động tăng id:
    // 1, 2, 3, 4,...
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // =========================================================
    // FIELD: name
    // =========================================================

    // Cấu hình column "name".
    // nullable = false → không cho phép name bị NULL.
    @Column(nullable = false)
    private String name;


    // =========================================================
    // CONSTRUCTOR RỖNG
    // =========================================================

    // JPA cần constructor không tham số
    // để có thể tạo object Category từ dữ liệu Database.
    public Category() {
    }


    // =========================================================
    // CONSTRUCTOR CÓ THAM SỐ
    // =========================================================

    // Dùng khi chúng ta tự tạo một Category object.
    //
    // Ví dụ:
    // Category menPerfume = new Category("Men's Perfume");
    public Category(String name) {

        // this.name = field "name" của object hiện tại.
        // name = parameter truyền vào constructor.
        this.name = name;
    }


    // =========================================================
    // GETTER: id
    // =========================================================

    // Dùng để lấy id của Category.
    public Long getId() {
        return id;
    }


    // =========================================================
    // GETTER: name
    // =========================================================

    // Dùng để lấy tên Category.
    public String getName() {
        return name;
    }


    // =========================================================
    // SETTER: name
    // =========================================================

    // Dùng để thay đổi tên Category.
    public void setName(String name) {

        // Gán name mới cho object hiện tại.
        this.name = name;
    }
}