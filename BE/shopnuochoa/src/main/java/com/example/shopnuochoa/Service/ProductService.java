package com.example.shopnuochoa.Service;

import com.example.shopnuochoa.Entity.Product;
import java.util.List;

// Interface là "hợp đồng" mà Controller sẽ phụ thuộc vào (DIP),
// thay vì phụ thuộc trực tiếp vào ProductServiceImpl
public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    Product deleteProduct(Long id);
}