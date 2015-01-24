package listing6;

public class DoubleFloatTest
{

	public static void main(String[] args)
	{
		Float f1 = new Float(Float.NaN);
		System.out.println("f1: " + f1.floatValue());
		
		Float f2 = new Float(Float.NaN);
		System.out.println("f2: " + f2.floatValue());
		
		System.out.println("f1 equals f2: " + f1.equals(f2));
		System.out.println("Float.NaN equals Float.NaN: " + (Float.NaN == Float.NaN));

		System.out.println();
		
		Double d1 = new Double(+0.0);
		System.out.println(d1.doubleValue());
		Double d2 = new Double(-0.0);
		System.out.println(d2.doubleValue());
		System.out.println(d1.equals(d2));
		System.out.println("+0.0 equals -0.0: " + (+0.0 == -0.0));
	}

}
