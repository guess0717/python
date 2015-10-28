package com.anna.member;

public class Member {
	 int totalamount;
	 
	 public Member(int totalamount){
	        this.totalamount = totalamount;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General anna = new General(30000);
		System.out.println( " 一般會員: " + anna.general());
		
		Silver carol = new Silver(60000);
		carol.silver();
		
		Golden jack = new Golden(65000);
		jack.golden();
		

	}

}
