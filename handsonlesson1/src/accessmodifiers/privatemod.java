package accessmodifiers;

public class privatemod {

	public static void main(String[] args) {
		pclass p = new pclass();
		System.out.println(p.i);
		/*p.pmethod(); This method can't be accessed because it is a private method, since private methods
		 can not be accessed outside class*/
		

	}

}
 class pclass{
	 int i =10;
	private void pmethod() {
		System.out.println("Private modifier is only accessible with the class ");
	}
}
