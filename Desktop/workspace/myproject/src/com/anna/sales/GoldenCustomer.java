package com.anna.sales;

public class GoldenCustomer extends SilverCustomer {
	float returnmoney = 0.05f ;
	@Override
	public int calculcate(int amount) {
		returnmoney = (int)(amount*returnmoney);
		int n = super.calculcate(amount);
		System.out.println(amount+"\t"+amount+"\t("+returnmoney+")");
				
		return amount;
	}

}
