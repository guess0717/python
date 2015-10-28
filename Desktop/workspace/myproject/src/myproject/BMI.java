package myproject;

public class BMI extends MyBMI {
	float bmi;

	public BMI(float weight, float height) {
		super(weight, height);
		// TODO Auto-generated constructor stub
	}
	
	public void bmi(){
		bmi = weight / ( height * height);
		System.out.println ("your bmi is : " + bmi);
		if ( bmi < 18.5f ){
			System.out.println ("太瘦了");
			}else if ( bmi >= 18.5f && bmi < 24){
				System.out.println ("正常");
		}else{
			System.out.println ("死大摳");
		}
	}

}
