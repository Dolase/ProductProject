package com.mydata.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydata.web.dto.ProductDto;
import com.mydata.web.exception.ResourceNotFoundException;
import com.mydata.web.service.ProductService;


@RestController
@RequestMapping("api/products")
public class ProductController {

	ProductService ps;
	

	public ProductController(ProductService ps) {
		super();
		this.ps = ps;
	}

	@PostMapping
	public ResponseEntity<ProductDto> createProductRecord(@RequestBody ProductDto pDto){
		
		ProductDto pDto2=ps.createproductData(pDto);
		
		return new ResponseEntity<>(pDto2,HttpStatus.CREATED);
		
	}
	
	@GetMapping("{p_id}")
	public ResponseEntity<ProductDto> getproductRecordById(@PathVariable Long p_id) throws ResourceNotFoundException{
		
		ProductDto bdto=ps.getProductById(p_id);
		return ResponseEntity.ok(bdto);
		
	}
	
	@PutMapping("{p_id}")
	public ResponseEntity<ProductDto> updateproductRecord(@PathVariable Long p_id,@RequestBody ProductDto productDto) throws ResourceNotFoundException{
		
		ProductDto bd=ps.updateProductData(p_id, productDto);
		return ResponseEntity.ok(bd);
		
	}

	@DeleteMapping("{p_id}")
	public ResponseEntity<String> deleteproductRecordById(@PathVariable Long p_id) throws ResourceNotFoundException{
		
		ps.deleteProductRecord(p_id);
		return ResponseEntity.ok("Product Record Deleted Successfully");
		
	}
	
}
