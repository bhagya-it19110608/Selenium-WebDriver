public class FirstJavaProgram {

	static int varSec = 98765;
	
	public static void firstMethod() {
		int number = 12345;
		
		boolean flag = true;
		char character = 'A';
		String city = "newyork";
		long phonenumber = 987654321L;
		double decimalvalue = 234.43D;
		
		System.out.println(number);
		System.out.println(city);
		System.out.println(varSec);
		System.out.println(flag);
		System.out.println(character);
		System.out.println(phonenumber);
		System.out.println(decimalvalue);
	}
	
	
	public static void main(String[] args) {
		FirstJavaProgram.firstMethod();
		System.out.println(varSec);
				

	}

}
