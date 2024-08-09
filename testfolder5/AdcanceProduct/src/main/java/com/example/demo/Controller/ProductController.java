package testFile.testfolder5.AdcanceProduct.src.main.java.com.example.demo.Controller;


import java.net.http.HttpResponse.ResponseInfo;
import java.util.List;

import testFile.testfolder5.AdcanceProduct.src.main.java.com.example.demo.Entity.Product;
import testFile.testfolder5.AdcanceProduct.src.main.java.com.example.demo.Service.ProductService;
import testFile.testfolder5.AdcanceProduct.src.main.java.com.example.demo.Utility.ResponseStructure;

//@Controller
//@ResponseBody
@RestController
public class ProductController {
	@Autowired
	public ProductService ps;
	
//	@RequestMapping(value = "/product/addProduct", method = RequestMethod.POST)
	@PostMapping("/product/addProduct")
	public ResponseInfo<ResponseStructure<Product>> addProduct(@RequestBody Product product) {
		return ps.addProduct(product);
	}
	
	@GetMapping("/product/findProductById/{productId}")
	public ResponseEntity<ResponseStructure<Product>> findProductById(@PathVariable  int productId) {
		return ps.findProductById(productId);
	}
	
	@PutMapping("/product/updateProductById/{productId}")
	public ResponseEntity<ResponseStructure<Product>> updateProductByItId(@PathVariable int productId , @RequestBody Product product ) {
		return ps.updateByProductId(productId, product);
	}
	
	@DeleteMapping("/product/deleteProductById/{productId}")
	public ResponseEntity<ResponseStructure<Product>> deleteProductById(@PathVariable int productId) {
		return ps.deleteProductById(productId);
	}
	
	@GetMapping("/product/findAllProduct")
	public ResponseEntity<ResponseStructure<List<Product>>> findAllProducts(){
		return ps.findAllProduct();
		
	}
//	@RequestMapping(value = "/product/findProductByName/{productName}",method =  RequestMethod.GET)
	
	@GetMapping("/product/findProductByName/{productName}")
	public Product findProductByName(@PathVariable  String productName) {
		return ps.findByProductName(productName);
	}
	
 }
 