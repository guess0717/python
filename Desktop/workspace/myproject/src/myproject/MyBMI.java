package myproject;

public class MyBMI {
	float weight;
	float height;
	
	public MyBMI ( float weight , float height){
		this.weight = weight;
		this.height = height;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI anna = new BMI( 46, 1.56f);
		anna.bmi();

	}

}
