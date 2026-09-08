package com.example.shopnuochoa.Service;

import com.example.shopnuochoa.Entity.Product;
import com.example.shopnuochoa.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    // Dependency được tiêm qua constructor, không tự new() ra Repository

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // ==============================
    // READ - Lấy tất cả sản phẩm
    // ==============================
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // ==============================
    // READ - Lấy 1 sản phẩm theo id
    // ==============================
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
        // Ở giai đoạn CRUD cơ bản này tạm trả null khi không tìm thấy.
        // Đây chính là chỗ sau này bạn sẽ nâng cấp lên exception
        // giống ProductNotFoundException, như đã làm với MovieNotFoundException.
    }

    // ==============================
    // CREATE - Thêm sản phẩm
    // ==============================
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // ==============================
    // UPDATE - Cập nhật sản phẩm
    // ==============================
    @Override
    public Product updateProduct(Long id, Product product) {

        Product existing = productRepository.findById(id).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setName(product.getName());
        existing.setBrand(product.getBrand());
        existing.setPrice(product.getPrice());
        existing.setQuantity(product.getQuantity());
        existing.setDescription(product.getDescription());

        return productRepository.save(existing);
    }

    // ==============================
    // DELETE - Xóa sản phẩm
    // ==============================
    @Override
    public Product deleteProduct(Long id) {

        Product product = productRepository.findById(id).orElse(null);

        if (product == null) {
            return null;
        }

        productRepository.delete(product);
        return product;
    }
}