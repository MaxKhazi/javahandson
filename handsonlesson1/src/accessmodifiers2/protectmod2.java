package accessmodifiers2;
import accessmodifiers.*;

public class protectmod2 extends protectmod {

	public static void main(String[] args) {
		protectmod2 p2 = new protectmod2();
		p2.prot();
		//protected can be accessed outside only through child class.

	}

}
