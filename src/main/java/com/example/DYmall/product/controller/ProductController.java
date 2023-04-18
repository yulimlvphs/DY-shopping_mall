package com.example.DYmall.product.controller;

import com.example.DYmall.product.domain.Product;
import com.example.DYmall.product.dto.CreateProductRequest;
import com.example.DYmall.product.dto.ProductResponse;
import com.example.DYmall.product.dto.UpdateProductRequest;
import com.example.DYmall.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.URI;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/04/18
 */

@RestController // REST API를 처리하는 컨트롤러를 의미
@RequestMapping("/products") // API의 기본 URL을 '/products'로 지정
// 상품 관리를 위한 컨트롤러 클래스
public class ProductController {

    // Product 서비스를 의존성 주입(Dependency Injection) 받음
    private final ProductService productService;

    // 생성자를 통해 ProductService를 주입받음
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    // 상품을 생성
    // HTTP 요청 본문에서 JSON 데이터를 읽어와서 CreateProductRequest 객체로 변환
    // @Valid : CreateProductRequest 객체의 유효성 검사를 수행
    public ResponseEntity<?> createProduct(@RequestBody @Valid CreateProductRequest request) {
        // ProductService의 createProduct() 메소드를 호출하여 상품을 생성
        Product product = productService.createProduct(
                request.getName(),
                request.getDescription(),
                request.getPrice(),
                request.getStock(),
                request.getCategory(),
                request.getBrand()
        );
        // 생성된 상품의 URL을 Location 헤더에 추가하여 응답.
        URI location = URI.create("/products/" + product.getId());
        return ResponseEntity.created(location).build();
    }

    // 상품 조회
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable Long id) {
        // ProductService의 getProduct() 메소드를 호출하여 조회
        Product product = productService.getProduct(id);
        // 한 상품을 ProductResponse 객체로 변환하여 응답합니다.
        ProductResponse response = new ProductResponse(product);
        return ResponseEntity.ok().body(response);
    }

    // 상품 수정
    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody @Valid UpdateProductRequest request) {
       ////ProductService의 updateProduct() 메소드를 호출하여 상품을 수정.
        productService.updateProduct(
                id,
                request.getName(),
                request.getDescription(),
                request.getPrice(),
                request.getStock(),
                request.getCategory(),
                request.getBrand()
        );
        // 상품 수정이 성공하면 응답 본문이 없는 204 No Content 응답을 반환합니다.
        return ResponseEntity.noContent().build();
    }


    //  상품 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
      // ProductService의 deleteProduct() 메소드를 호출하여 상품을 삭제.
        productService.deleteProduct(id);
        //  상품 삭제가 성공하면 응답 본문이 없는 204 No Content 응답을 반환.
        return ResponseEntity.noContent().build();
    }
}
