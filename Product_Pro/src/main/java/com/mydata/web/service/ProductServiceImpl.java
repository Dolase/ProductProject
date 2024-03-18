package com.mydata.web.service;

import java.util.List;
import java.util.stream.Collectors;

import com.mydata.web.Mapper.ProductMapper;
import com.mydata.web.dto.ProductDto;
import com.mydata.web.entity.Product;
import com.mydata.web.exception.ResourceNotFoundException;
import com.mydata.web.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{

	ProductRepository pr;
	
	public ProductServiceImpl(ProductRepository pr) {
		super();
		this.pr = pr;
	}

	@Override
	public ProductDto createproductData(ProductDto productDto) {
		
		
			 Product product=ProductMapper.mapToProduct(productDto);
			 Product saveProduct=pr.save(product);
			 ProductDto pdto=ProductMapper.mapToProductDto(saveProduct);
			 return pdto;
	}

	@Override
	public ProductDto getProductById(Long p_id) throws ResourceNotFoundException {
		
		
		Product p=pr.findById(p_id)
				.orElseThrow(()-> new ResourceNotFoundException("Product Data is not exist with given Id"+p_id));
		return ProductMapper.mapToProductDto(p);
	}

	@Override
	public List<ProductDto> getAllProducts() {
	
		List<Product> product=pr.findAll();
		return product.stream()
				.map((products) -> ProductMapper.mapToProductDto(products))
				.collect(Collectors.toList());
	}

	@Override
	public ProductDto updateProductData(Long p_id, ProductDto productDto) throws ResourceNotFoundException {
		
		Product p=pr.findById(p_id)
				.orElseThrow(() -> new ResourceNotFoundException("Product Data is not exist with given Id"+p_id));
		p.setProduct_Id(productDto.getProduct_Id());
		p.setProduct_Name(productDto.getProduct_Name());
		p.setProduct_Brand(productDto.getProduct_Brand());
		p.setMade_in(productDto.getMade_in());
		p.setPrice(productDto.getPrice());
		
		Product pro=pr.save(p);
		return ProductMapper.mapToProductDto(pro);
	}

	@Override
	public void deleteProductRecord(Long p_id) throws ResourceNotFoundException {
		

		Product product=pr.findById(p_id)
				.orElseThrow(() -> new ResourceNotFoundException("Product Data is not exist with given Id"+p_id));
		pr.deleteById(p_id);
				
	}

}
