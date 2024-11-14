package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	@GetMapping("/Products")
	 public List<Product> getProducts()
    {
   	 return ps.getProducts();
    }
	@GetMapping("/Products/{prodId}")
	public Product  getElementById(@PathVariable int prodId)
	{
		return ps.getElementById(prodId);
	}
	@PostMapping("/Products")
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		ps.addProduct(prod);
	}
	@PutMapping("/Products")
	public void UpdateProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		ps.UpdateProduct(prod);
	}
	@DeleteMapping("/Products/{prodId}")
   public void DeleteProduct(@PathVariable int prodId)
   {
		ps.DeleteProduct(prodId);
   }
}
