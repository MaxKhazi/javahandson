package accessmodifiers;

 class dc {
  void defaultmethod() {
  System.out.println("It is a default class");
}
 }
 public class defaultmod{
	 public static void main(String [] args) {
		 System.out.println("Default class and method accessed below");
		 dc d = new dc();
		 d.defaultmethod();
	 }
 }
