package com.anna.sales;

public class NormalCustomer extends Customer {

	@Override
	public int calculcate( int amount) {
		System.out.println( amount+"\t"+ amount );
		return amount;
	}

}
