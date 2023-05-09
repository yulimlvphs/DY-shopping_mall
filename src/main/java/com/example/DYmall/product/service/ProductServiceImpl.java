package com.example.DYmall.product.service;

import com.example.DYmall.product.domain.Product;

import com.example.DYmall.product.dto.ProductFormDto;
import com.example.DYmall.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * ProductService 인터페이스의 구현체인 ProductServiceImpl 클래스
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/05/03
 */

@Service // Service 클래스 명시
@Log4j2 // 로깅을 위한 lombok 어노테이션
@Transactional
@RequiredArgsConstructor // @Autowired 어노테이션이 없는 final 필드에 대해서 생성자를 생성
public class ProductServiceImpl implements ProductService {


    private  final ProductRepository productRepository;

    public Long saveProduct(ProductFormDto productFormDto) {

        //상품 등록
        Product product = productFormDto.createProduct();
        productRepository.save(product);

        return product.getId();
    }
}
