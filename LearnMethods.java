package week2day2;

public class LearnMethods {
	public static void main(String arg[])
	{
	
		LearnMethods obj=new LearnMethods();
		obj.printCarName();
		obj.getCarRegNumber();
		System.out.println(obj.getCarRegNumber());
		obj.getCarVarient();
		System.out.println("Manual");
	int multiply=obj.multiplyTwoNumbers(25, 10);
		System.out.println(multiply);
		
	}
	public void printCarName() {
		System.out.println("audi");

}
public int getCarRegNumber() {
	int CarRegNumber=1234;
	return CarRegNumber;
}
	
public String getCarVarient() {
	
	return "manual";
}
public int multiplyTwoNumbers(int a, int b) {
	return a*b;
}
}