package sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver=new Driver();
		Bus bue=new Bus();
		Taxi taxi=new Taxi();
		
		driver.drive(bue);
		driver.drive(taxi);
	}

}
