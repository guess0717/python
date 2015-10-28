package com.anna.sales;

public abstract class Customer {
	// protected 為其他 package 下的 class 也可以使用該屬性
	protected String name;
	protected int id;
	protected float discount = 0;
	protected int discountLimit  = 10000;
	
	// abstract 繼承後且一定要使用的方法
	public abstract int calculcate (int amount);

}
