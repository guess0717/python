package com.anna.member;

public class Golden extends Member {
	float feedbackmoney;
    float point = 0.05f;
    float discount = 0.9f;

	public Golden(int totalamount) {
		super(totalamount);
		// TODO Auto-generated constructor stub
	}
	
	public void golden(){
    	if ( totalamount >= 10000){
    		 totalamount = (int) (totalamount * discount) ;
    		 //���U�^�X��
    		 feedbackmoney = totalamount * point ;
    		 System.out.println ( " 黃金會員折扣 : " + totalamount);
    		 System.out.println ( " 回饋金 : " + feedbackmoney);
    		 
    	}else{
    		 System.out.println ( " 黃金會員未折扣 : " + totalamount);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
