package com.doma.eop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doma.eop.data.CartData;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * This controller contains all the API's related cart, it uses reactor framework for executing non-blocking requests.
 * 
 * @author pdoma
 *
 */
@RestController
@RequestMapping("/cart")
@Slf4j
public class CartController {
	
	public Mono<CartData> getCartData(){
		
		return null;
		
	}

}
