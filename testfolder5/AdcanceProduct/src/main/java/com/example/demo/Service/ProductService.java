package com.example.demo.Service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.Entity.Product;
import com.example.demo.Utility.ResponseStructure;

public interface ProductService {

	public ResponseEntity<ResponseStructure<Product>> addProduct(Product product);
	
	public ResponseEntity<ResponseStructure<Product>> findProductById(int productId);

	public ResponseEntity<ResponseStructure<Product>> updateByProductId(int productId , Product updatedProduct);
	
	public ResponseEntity<ResponseStructure<Product>> deleteProductById(int productId);
	
	public ResponseEntity<ResponseStructure<List<Product>>> findAllProduct();
	
	public  Product findByProductName(String productName);
}