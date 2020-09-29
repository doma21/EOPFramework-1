package com.doma.eop.data;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CartData {
	
	private BigDecimal totalPrice;
	private BigDecimal shippingPrice;
	

}
