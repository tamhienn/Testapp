package com.example.shopnuochoa.Entity;

// Import toàn bộ annotation của JPA
// Ví dụ: @Entity, @Table, @Id, @Column, @GeneratedValue...
import jakarta.persistence.*;


// @Entity:
// Đánh dấu Brand là một Entity của JPA.
// JPA sẽ quản lý object Brand và ánh xạ nó với Database.
@Entity

// @Table:
// Chỉ định Entity Brand tương ứng với bảng "brands" trong MySQL.
@Table(name = "brands")
public class Brand {

    // =========================================================
    // FIELD: id
    // =========================================================

    // @Id:
    // Đánh dấu id là PRIMARY KEY của bảng brands.
    @Id

    // @GeneratedValue:
    // Cho phép Database/JPA tự sinh giá trị id.
    //
    // IDENTITY:
    // Thường dùng với cơ chế AUTO_INCREMENT của MySQL.
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // private:
    // Không cho class bên ngoài truy cập trực tiếp vào id.
    // Đây là một phần của Encapsulation trong OOP.
    private Long id;


    // =========================================================
    // FIELD: name
    // =========================================================

    // @Column:
    // Cấu hình field name khi ánh xạ sang column trong Database.
    //
    // nullable = false:
    // name không được phép NULL trong Database.
    @Column(nullable = false)

    // Tên của thương hiệu.
    // Ví dụ: Dior, Chanel, Gucci...
    private String name;


    // =========================================================
    // CONSTRUCTOR 1: Constructor rỗng
    // =========================================================

    // JPA cần một constructor không có tham số
    // để có thể tạo object Brand khi lấy dữ liệu từ Database.
    //
    // Không được tùy tiện xóa constructor này.
    public Brand() {
    }


    // =========================================================
    // CONSTRUCTOR 2: Constructor có tham số
    // =========================================================

    // Constructor này dùng khi chúng ta tự tạo object Brand
    // trong Java.
    //
    // Ví dụ:
    // Brand dior = new Brand("Dior");
    public Brand(String name) {

        // this.name:
        //     field "name" của object hiện tại.
        //
        // name:
        //     parameter được truyền vào constructor.
        //
        // Ví dụ:
        // new Brand("Dior")
        //          ↓
        // name = "Dior"
        //
        // Sau dòng này:
        // object Brand có name = "Dior".
        this.name = name;
    }


    // =========================================================
    // GETTER: getId()
    // =========================================================

    // Getter dùng để LẤY giá trị id.
    //
    // Vì id là private nên class bên ngoài
    // không thể truy cập trực tiếp:
    //
    // brand.id       ❌
    //
    // Mà phải thông qua:
    //
    // brand.getId()  ✅
    public Long getId() {
        return id;
    }


    // =========================================================
    // GETTER: getName()
    // =========================================================

    // Getter dùng để LẤY tên Brand.
    //
    // Ví dụ:
    // String name = brand.getName();
    public String getName() {
        return name;
    }


    // =========================================================
    // SETTER: setName()
    // =========================================================

    // Setter dùng để THAY ĐỔI tên Brand.
    //
    // Ví dụ:
    // brand.setName("Chanel");
    public void setName(String name) {

        // Gán giá trị name mới vào field name
        // của object hiện tại.
        this.name = name;
    }
}