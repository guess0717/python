package com.anna.member;
 
public class Memtest {
     
    float totalamount;
    float feedbackmoney;
    float point = 0.05f;
    float discount = 0.9f;
     
    public Memtest(float totalamount){
        this.totalamount = totalamount;
 
    }
     
    //一般會員
 
    public float general(){
        float gen = totalamount;
        return gen;
         
    }
     
    //銀級會員
    public void silver(){
    	if ( totalamount >= 10000){
    		 totalamount = totalamount * discount ;
    		 System.out.println ( " 銀級滿萬折扣 : " + totalamount);
    	}else{
    		 System.out.println ( " 銀級未折扣 : " + totalamount);
    	}
    }
     
    //黃金會員
    public void golden(){
    	if ( totalamount >= 10000){
    		 totalamount = totalamount * discount ;
    		 //滿萬回饋金
    		 feedbackmoney = totalamount * point ;
    		 System.out.println ( " 金級滿萬折扣 : " + totalamount);
    		 System.out.println ( " 金級滿萬回饋金 : " + feedbackmoney);
    		 
    	}else{
    		 System.out.println ( " 金級未折扣 : " + totalamount);
    	}
    }
     
    public static void main(String[] args) {
    	
        Memtest mem1 = new Memtest(10000);
        System.out.println ( "一般會員 : " + mem1.general());
         
        Memtest mem2 = new Memtest(10000);
        mem2.silver();
        
        Memtest mem3 = new Memtest(10000);
        mem3.golden();

    }
 
}