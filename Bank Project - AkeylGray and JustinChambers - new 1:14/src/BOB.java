//you can connect java files using the "extends" command in the public class.
//make back button
import java.lang.Math;
public class BOB{

	public static void main(String[] args) {
		
		//Formula for branch number
		int maxBranchNumber = 100000000;
		int minBranchNumber = 0;
		int range = maxBranchNumber - minBranchNumber + 1;
		int branchNumber = (int)(Math.random() * range) + minBranchNumber;
		
		System.out.println("JoeStromboli");
		System.out.println("Welcome to the Bank of OB! Our Branch Number is " + branchNumber + "!");
		System.out.println(TheBank.getAccounts());
		System.out.println(TheBank.ATM());
		System.out.println(TheBank2.Customer());
		System.out.println(TheBank.getPeepeePooPoo());
		System.out.println(TheBank.getMomGat());
		System.out.println(TheBank2.pepop());
		System.out.println(System.currentTimeMillis());
	}
	static class TheBank extends Test{
		public static double ATM() {
			return Test.testNumber4;
		}
		public static int getAccounts(){
			return Test.testNumber2;
	}
		public static int getPeepeePooPoo() {
			return Test.testNumber;
		}
		public static String getMomGat() {
			return Test.hi;
		}
	}
	static class TheBank2 extends Test2{
		public static int Customer(){
			return Test2.testNumber3;
		}
		public static double pepop() {
			return Test2.volume;
		}
	}
}


