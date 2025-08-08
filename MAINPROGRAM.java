class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayinfo() {
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
	}
}
class Car extends Vehicle{
	String fueltype;
	Car(String brand,String model,String fueltype){
		super(brand,model);
		this.fueltype=fueltype;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Fuel Type:"+fueltype);
	}
}
class Electriccar extends Car{
	double batterycapacity;
	Electriccar(String brand,String model,String fueltype,double batterycapacity){
		super(brand,model,fueltype);
		this.batterycapacity=batterycapacity;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Battery Capacity:"+batterycapacity);
	}
	
}

public class MAINPROGRAM { 
	public static void main(String[]args) {
	 Electriccar car1 =new Electriccar("tesla","rvxc","electric",90.00);
	 car1.displayinfo();
		
	}
}
