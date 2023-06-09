package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ravi.entity.Product;
import com.ravi.repo.ProductRepository;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductRepository repo;
	@GetMapping("/delete")
	public String delete(@RequestParam("pid")Integer pid,Model model) {
		repo.deleteById(pid);
		model.addAttribute("msg", "Prodect Deleted");
		model.addAttribute("products", repo.findAll());
		
		return "data";
	}
	
	
	@GetMapping("/products")
	public String getAllProduct(Model model) {
	
		List<Product> findAll = repo.findAll();
		model.addAttribute("products", findAll);
		return "data";
	}
	
	@PostMapping("/product")
	public String saveProduct(@ModelAttribute("product")Product p ,Model model) {
		p=repo.save(p);
			if(p.getPid()!= null) {
				model.addAttribute("msg", "Product save");
			}
				return "index";
	}
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product", new Product());
			return "index";
	}

}
