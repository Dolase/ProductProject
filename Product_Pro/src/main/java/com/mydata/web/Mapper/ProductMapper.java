package com.mydata.web.Mapper;

import com.mydata.web.dto.ProductDto;
import com.mydata.web.entity.Product;


public class ProductMapper {
	
	public static ProductDto mapToProductDto(Product p) {
		return new ProductDto(p.getProduct_Id(),p.getProduct_Name(),p.getProduct_Brand(),p.getMade_in(),p.getPrice());
		
		
	}
	
	public static Product mapToProduct(ProductDto pDto ) {
		return new Product(pDto.getProduct_Id(),pDto.getProduct_Name(),pDto.getProduct_Brand(),pDto.getMade_in(),pDto.getPrice());
		
		
	}

}
