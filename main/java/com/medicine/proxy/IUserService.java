package com.medicine.proxy;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.medicine.domain.Cart;

@FeignClient("user_service")
public interface IUserService {
	@PostMapping(value="/addToCart",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addToCart(Cart medicine);
	
	@PostMapping(value="/updateCart",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void updateCart(Cart medicine);
	
	
	@GetMapping(value="/getCart",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.OK)
	public List<Cart> getAllItems();
	
	@DeleteMapping(value="/delete{cId}",produces= {MediaType.APPLICATION_JSON})
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public String deleteItemById(@PathVariable("cId") int cId);
}
