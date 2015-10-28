package traning;

public class Car {
	ParkingLotDB pdb = new ParkingLotDB();
	String entertime,leavetime ;
	String  in,out,carid;

	public void addCar(String carid){
		entertime =  CarTime.times();
		pdb.carInDB(carid, entertime);
		System.out.println("welcome");
	}
	
	public void removeCar(String carid){
		leavetime =  CarTime.times();;
		pdb.carOutDB(carid, leavetime);
		System.out.println("bye bye");
	}

	public static void main ( String[] arags){
		Car car = new Car();
		car.addCar("1134QX");
		car.removeCar("1134QX");
	}
	
	
}
