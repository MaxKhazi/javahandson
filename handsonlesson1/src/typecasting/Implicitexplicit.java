package typecasting;

public class Implicitexplicit {

	public static void main(String[] args) {
		System.out.println("Examples for implicit type casting: ");
		System.out.println();
		byte b = 12;
		short s = b;
		System.out.println("Byte to short "+s );
		char c = 's';
		
		int i = c;
		System.out.println("Character to int " +i);
		long l = i;
		System.out.println("Integer to long "+l);
		float f = l;
		System.out.println("long to float  "+f);
		double d = f;
		System.out.println("float to double "+d);
		System.out.println();
		System.out.println("Examples for explicit type casting");
		System.out.println();
		float ef = (float)d;
		System.out.println("Double to float "+ef);
		long el = (long)ef;
		System.out.println("Float to long "+el);
		int ei = (int)el;
		System.out.println("Long to int "+ei);
		short es = (short)ei;
		System.out.println("Integer to short "+es);
		byte eb = (byte)es;
		System.out.println("Short to byte "+eb);
		
		char cc = (char)es;
		System.out.println("Short to char "+cc);
		
		

	}

}
