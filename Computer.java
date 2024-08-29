package project2;

public class Computer
{
	class processor
	{
		private String brand;
		private int speed;
		
		public processor(String brand,int speed)
		{
			this.brand=brand;
			this.speed=speed;
		}
		public void displayDetails() {
			System.out.println(brand);
			System.out.println(speed);
			
		}
	}

	public static void main(String args[])
	{
		Computer obj = new Computer();
		Computer.processor obj2 = obj.new processor("channel",8);
		obj2.displayDetails();
	}
}

