package com.example.DYmall.product.dto;

import com.example.DYmall.product.domain.Product;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @version 1.1
 * @Author seodong-geun
 * @since 2023/05/09
 */
@Getter
@Setter
public class ProductFormDto {

    private static ModelMapper modelMapper = new ModelMapper();
    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String name;

    @NotNull(message = "상품의 가격은 필수 입력 값입니다.")
    private Integer price;

    @NotBlank(message = "상품 설명은 필수 입력 값입니다.")
    private String description;

    @NotNull(message = "상품 재고는 필수 입력 값입니다.")
    private Integer stock;

    public Product createProduct(){
        return modelMapper.map(this, Product.class);
    }

    public static ProductFormDto of(Product product){
        return modelMapper.map(product, ProductFormDto.class);
    }
}
