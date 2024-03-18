package com.mydata.web.service;

import java.util.List;

import com.mydata.web.dto.ProductDto;
import com.mydata.web.exception.ResourceNotFoundException;

public interface ProductService {
	
		public ProductDto createproductData(ProductDto productDto);
		public ProductDto getProductById(Long p_id) throws ResourceNotFoundException;
		public List<ProductDto> getAllProducts();
		public ProductDto updateProductData(Long p_id,ProductDto productDto) throws ResourceNotFoundException;
		public void deleteProductRecord(Long p_id)throws ResourceNotFoundException;
	}

