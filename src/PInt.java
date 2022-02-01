import java.text.DecimalFormat;

public class PInt {
	private static String eq = null;
	private static double a = 0;
	private static double b = 0;
	private static double preans = 0;
	private static double ans = 0;
	private static boolean num = true;
	private static int iterations = 0;
	private static double dx = 0;
	private static double mult1 = 0;
	private static int mult2 = 1;
	private static double tst = 0;
	private static double tst2 = 0;
	private static int ct = 0;
	private static double ob = 0;
	private static boolean isgood = false;
	private static DecimalFormat df = new DecimalFormat("0.00000");
	private static EquationProcessingUnit epu = new EquationProcessingUnit(eq, 1, a);
	private static Invert i = new Invert();
	private static boolean alt = false;
	private static Derivative du = new Derivative(eq, a);
public PInt(String ekwasion, double strt, double end) {
	eq = "0.5*("+ekwasion+")^2";
	a = strt;
	b = end;
}
public void changeEq(String in) {
	if(in.contains("x")) {
	eq = "0.5*("+in+")^2";
	alt = false;
	}
	else {
		i.changeEq(in);
		i.convert();
		eq = i.getR();
		du.changeEq(eq);
		alt = true;
	}
}
public void changeLowerBound(double in) {
	a = in;
}
public void changeUpperBound(double inpt) {
	b = inpt;
}
public boolean isGood() {
	return isgood;
}
public double getAns() {
	return preans;
}
public double getRoundedAns() {
	return ans;
}
public void integrate() {
	isgood = true;
	preans = 0;
	epu.changeEq(eq);
	num = true;
	ob = a;
	iterations = (int) (Math.round(Math.abs(a-b))*10)+10;
	tst = iterations/2;
	tst2 = Math.round(iterations/2);
	if(tst != tst2) {
		iterations++;
	}
	dx = (b-a)/iterations;
	mult1 = dx/3;
	ct = 0;
	while(ct <= iterations) {
		du.changex(ob);
		epu.changex(ob);
		epu.solve();
		if(alt) {
		du.getDer();
		}
		if((ct == 0) || (iterations == ct)) {
			mult2 = 1;
		}
		else {
			if(num == true) {
				mult2 = 4;
				num = false;
			}
			else {
				mult2 = 2;
				num = true;
			}
		}
		//System.out.println("mult " + mult2);
		if(alt == false) {
		preans = preans + mult1*mult2*epu.getAns();
		}
		else {
			preans = preans + ob*epu.getAns()*mult1*mult2;
		}
		//System.out.println("ans = " + preans);
		ob = ob + Math.abs(b-a)/iterations;
		//System.out.println("itr = "+ iterations);
		ct++;
	}
	try{
		ans = Double.parseDouble(df.format(preans));
	}
	catch(Exception err) {
		isgood = false;
		err.printStackTrace();
	}
}
}
