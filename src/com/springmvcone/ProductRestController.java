package com.springmvcone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	private List<Product> products=new ArrayList<>();
	
	public ProductRestController() {
		products.add(new Product("1","pen",100));
		products.add(new Product("2","pencil",120));
	}

	//@RequestMapping(path = "/products",method = RequestMethod.GET)
	@GetMapping("/products")
	public List<Product> getProducts(){
		return products;
	}
	
	@PostMapping("/products")
	public void add(@RequestBody Product p) {
		products.add(p);
	}
	
	@DeleteMapping("/products/{code}")
	public void delete(@PathVariable("code")String code) {
		int index = 0;
		for(Product p:products) {
			if(p.getCode().equals(code)) {
				index=products.indexOf(p);
			}
		}
		products.remove(index);
	}
	
	@PutMapping("/products/{code}")
	public void update(@PathVariable("code") String code,@RequestBody Product pd) {
		for(Product p:products) {
			if(p.getCode().equals(code)) {
				p.setName(pd.getName());
				p.setPrice(pd.getPrice());
			}
		}
	}
}
