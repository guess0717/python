package com.anna.member;
 
public class Memtest {
     
    float totalamount;
    float feedbackmoney;
    float point = 0.05f;
    float discount = 0.9f;
     
    public Memtest(float totalamount){
        this.totalamount = totalamount;
 
    }
     
    //�@��|��
 
    public float general(){
        float gen = totalamount;
        return gen;
         
    }
     
    //�ȯŷ|��
    public void silver(){
    	if ( totalamount >= 10000){
    		 totalamount = totalamount * discount ;
    		 System.out.println ( " �ȯź��U�馩 : " + totalamount);
    	}else{
    		 System.out.println ( " �ȯť��馩 : " + totalamount);
    	}
    }
     
    //�����|��
    public void golden(){
    	if ( totalamount >= 10000){
    		 totalamount = totalamount * discount ;
    		 //���U�^�X��
    		 feedbackmoney = totalamount * point ;
    		 System.out.println ( " ���ź��U�馩 : " + totalamount);
    		 System.out.println ( " ���ź��U�^�X�� : " + feedbackmoney);
    		 
    	}else{
    		 System.out.println ( " ���ť��馩 : " + totalamount);
    	}
    }
     
    public static void main(String[] args) {
    	
        Memtest mem1 = new Memtest(10000);
        System.out.println ( "�@��|�� : " + mem1.general());
         
        Memtest mem2 = new Memtest(10000);
        mem2.silver();
        
        Memtest mem3 = new Memtest(10000);
        mem3.golden();

    }
 
}