//Shapes is the test class
//Shape is the custom class
import java.util.Scanner;
	class Shape {
		public Shape() {
			myRadius = 0;
			myHeight = 0;
			myAmount = 0;
		}
		public Shape(int radius, int height, int amount){
			myRadius = radius;
			myHeight = height;
			myAmount = amount;
		}
		public int getRadius(){
			return myRadius;
		}
		public int getHeight(){
			return myHeight;
		}
		public int getAmount(){
			return myAmount;
		}
		public void setRadius(int radius){
			myRadius = radius;
		}
		public void setHeight(int height){
			myHeight = height;
		}
		public void setAmount(int amount){
			myAmount = amount;
		} 
		public double volume(){
			return (PI * myRadius * myRadius * myHeight) / 3;
		}
		public double circumference(){
			return circumference = 2 * (PI * myRadius);
		}
		public double totalVolume(){
			return tvolume = myAmount * ((PI * myRadius * myRadius * myHeight) / 3);
		}
		public static void displayType(){
			System.out.println("I");
			System.out.println("LOVE");
			System.out.println("THIS");
			System.out.println("CLASS");
		}
		private int myAmount;
		private int myRadius;
		private int myHeight;
		public double PI = 3.14;
		public double volume;
		private double tvolume;
		private double circumference;
	}
	class Test2{
		public static int testNumber3 = 1212;
		public static double volume;
	}
	