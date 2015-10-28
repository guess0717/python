package com.anna.member;

public class Silver extends Member {
	double discount = 0.9;

	public Silver(int totalamount) {
		super(totalamount);
		// TODO Auto-generated constructor stub
	}
	
	public void silver(){
    	if ( totalamount >= 10000){
    		 totalamount = (int) (totalamount * discount) ;
    		 System.out.println ( " 銀級會員折扣 : " + totalamount);
    	}else{
    		 System.out.println ( " 銀級會員未折扣 : " + totalamount);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
