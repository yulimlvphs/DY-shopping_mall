package com.example.DYmall.product.controller;

import com.example.DYmall.product.dto.ProductFormDto;
import com.example.DYmall.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * @version 1.0
 * @Author seodong-geun
 * @since 2023/05/09
 */
@Controller // 컨트롤러로 사용되는 클래스를 의미
@RequiredArgsConstructor // final 필드의 생성자를 자동으로 생성
public class ProductController {

        private final ProductService productService;


        // (GET) 상품 등록 페이지 반환
        @GetMapping(value = "/admin/product/new")
        public String ProductForm(Model model){
            // ProductFormDto 객체를 생성해서 모델에 추가
            model.addAttribute("ProductFormDto", new ProductFormDto());

            return "/Product"; // Product 페이지 반환
        }

        // (POST) 상품 등록 페이지 반환
        // form 데이터를 받아서 처리하는 메소드를 작성
        @PostMapping(value = "/admin/product/new")
        public String newProduct(@Valid ProductFormDto productFormDto, Model model) {
            try {
                productService.saveProduct(productFormDto); // 상품 등록 서비스 메소드 호출
            } catch (Exception e) {
                model.addAttribute("errorMessage", "상품 등록 중 에러가 발생하였습니다."); // 에러 메시지를 모델에 추가
                return "/error"; // error 페이지 반환
            }
            return "redirect:/admin/product/new"; // 임시방편으로 리다이렉트 (추후 다른 페이지
        }
}