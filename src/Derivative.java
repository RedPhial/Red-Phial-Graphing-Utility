import java.text.DecimalFormat;

public class Derivative {
	private static double dx = 0.00000000001;
	private static double at;
	private static String eq;
	private static boolean e = false;
	public static double der;
	public static double predur = 0;
	private static DecimalFormat df = new DecimalFormat("0.00000");
	private static EquationProcessingUnit epu = new EquationProcessingUnit("2",1,1);
	private static double y = 1;
	//private static Invert i = new Invert();
public Derivative(String in1, double in2) {
	at = in2;
	eq = in1;
	
}
public static void changex(double in) {
	at = in;
}
public static void changeEq(String in) {
	eq = in;
}
public static void changew(double inpt) {
	y = inpt;
	epu.changew(y);
}
public static void getDer() {
	der = 0;
	e = true;
	dx = 0.00000000001;
	int tr = 0;
	//if(eq.contains("w") && (eq.contains("x") == false)) {
		//i.changeEq(eq);
		//i.convert();
		//epu.changeEq(i.getR());
	//}
	//else {
	epu.changeEq(eq);
	//}
	while((tr < 3) && (e == true)) {
		e = false;
		dx = dx * 10;
	
	epu.changex(at);
	epu.solve();
	if(epu.isGood() == false) {
		e = true;
	}
	double f1 = epu.getAns();
	double f2 = 0;
	epu.changex(at+dx);
	epu.solve();
	if(epu.isGood() == false) {
		e = true;
	}
	f2 = epu.getAns();
	predur = (f2-f1)/dx;
	try{
	der = Double.parseDouble(df.format(predur));
	}
	catch(Exception err) {
		e = true;
	}
	tr++;
	//**.out.println(tr);
	}
	if(tr >= 3) {
		e = true;
	}
	}
public static boolean isErrd() {
	return e;
}
public static double der() {
	
	return der;
	
}
public static double getAns() {
	return predur;
}
}
