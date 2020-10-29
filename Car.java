
public class Car {

	    String color;
	    String transmission;
	    int make;
	    int tyres;
	    int doors;

	public Car(String color, String transmission, int make){
	this.color= color;
	this.transmission=transmission;
	this.make=make;
	int tyres = 4; 
	int doors = 4;

	}
	public void displayCharacteristics(){
	System.out.println(this.color+" "+this.transmission+" "+this.make);
	System.out.println("tyres"+tyres);
	System.out.println("doors"+doors);
	
	}

	public void accelarate(){
	System.out.println("Car is moving forward.");
	}


	public void brake(){
	 System.out.println("Car has stopped.");
	}
	}

