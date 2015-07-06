package com.javaenthusiasm.tutorial.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaenthusiasm.tutorial.model.Product;
import com.javaenthusiasm.tutorial.model.Store;

@Controller
public class ProductController {
	
	@RequestMapping(value="products", method = RequestMethod.GET)
	public String getProductsList(final Model model){
		
		Store store = getStoreContent();
		
		model.addAttribute("store", store);
		
		return "store";
	}
	
	@RequestMapping(value = "products", params={"addProduct"})
	public String addProduct(@ModelAttribute Store store, final Model model){
		
		store.getProducts().add(new Product());
		
		model.addAttribute("store", store);
		
		return "store";
	}
	
	@RequestMapping(value= "products", params={"deleteProduct"})
	public String deleteProduct(@ModelAttribute Store store, final Model model, final HttpServletRequest request){
		
		final Integer productId = Integer.valueOf(request.getParameter("deleteProduct"));
		store.getProducts().remove(productId.intValue());
		
		model.addAttribute("store", store);
		
		return "store";
	}
	
	public Store getStoreContent(){
		
		Store store = new Store();
		store.initialize();
		
		return store;
	}

}
