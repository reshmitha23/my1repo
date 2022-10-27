package com.medicine.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.domain.Cart;
import com.medicine.proxy.IUserService;

@RestController
public class UserController  {
	@Autowired
	private IUserService user_service;

	@PostMapping(value="/addToCart",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addToCart(Cart medicine) {
		user_service.addToCart(medicine);
		
	}

	@PostMapping(value="/updateCart",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void updateCart(Cart medicine) {
		user_service.updateCart(medicine);
		
	}

	@GetMapping(value="/getCart",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.OK)
	public List<Cart> getAllItems() {
		// TODO Auto-generated method stub
		return user_service.getAllItems();
	}

	@DeleteMapping(value="/delete{cId}",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public String deleteItemById(@PathVariable("cid")int cId) {
		// TODO Auto-generated method stub
		return null;
	}

}
