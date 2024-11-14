package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Product;

@Service
public class ProductService {
//	List<Product> products=new ArrayList<>(
//	products.add(1,"Redmi",10000),
//	products.add(2,"iphone",65000),
//	products.add(3,"one plus",45000));
List<Product> products=new ArrayList<>(Arrays.asList(
		new Product(1,"Redmi",10000),
		new Product(2,"iphone",65000),
		new Product(3,"one plus",45000)));
     public List<Product> getProducts()
     {
    	 return products;
     }
     public Product getElementById(int prodId)
     {
    	 return products.stream().filter(p -> p.getProdId()== prodId)
    			 .findFirst().get();
     }
	public void addProduct(Product prod) {
		products.add(prod);
	}
	public void UpdateProduct(Product prod) {
		int index=0;
		for(int i=0;i<=products.size()-1;i++)
		{
			if(products.get(i).getProdId()==prod.getProdId())
			{
				index=i;
				products.set(index,prod);
			}
		}
	}
	public void DeleteProduct(int prodId) {
		int index=0;
		for(int i=0;i<=products.size()-1;i++)
			if(products.get(i).getProdId()==prodId)
				index=i;
		
				products.remove(index);
	}
}
    