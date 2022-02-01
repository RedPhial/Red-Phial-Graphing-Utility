import java.text.DecimalFormat;

public class PZero {
	private static double xn = 0;
	private static double xv = 0;
	private static double ans = 0;
	private static String eq = "";
	private static int failsafe = 100;
	private static EquationProcessingUnit epu = new EquationProcessingUnit(null, 1, 1);
	private static Derivative dy = new Derivative(null, 0);
	private static double ac = 0.000000001;
	private static boolean isgood = false;
	private static DecimalFormat df = new DecimalFormat("0.000000");
	private static double backup = 0;
	private static int ct = 0;
	private static int ct2 = 0;
	private static double w = 1;
	private static boolean revs = false;
	private static Invert i = new Invert();
	public PZero(String in1, double in2, int max) {
		xv = in2;
		eq = in1;
		backup = in2;
		failsafe = max;
		epu.changeEq(eq);
		dy.changeEq(eq);
	}
	public double getAns(){
		return ans;
	}
	public boolean isGood() {
		return isgood;
	}
	public void changeEq(String in) {
		if((in.contains("w")) && (in.contains("x") == false)) {
			i.changeEq(in);
			i.convert();
			eq = i.getR();
			epu.changeEq(eq);
			dy.changeEq(eq);
			revs = true;
		}
		else {
			eq = in;
			epu.changeEq(eq);
			dy.changeEq(eq);
			revs = false;
		}
	}
	public void changex(double in) {
		xv = in;
		backup = in;
		epu.changex(xv);
		dy.changex(xv);
		
	}
	public void changew(double in3) {
		w = in3;
		epu.changew(w);
		dy.changew(w);
	}
	public void getZero() {
		isgood = false;
		ct = 0;
		ac = 0.000000001;
		xn = 0;
		while((isgood == false) && (ct < 3)) {
			xv = backup;
			ac = 10*ac;
		isgood = true;
		epu.changex(xv);
		epu.solve();
		dy.changex(xv);
		dy.getDer();
		if((epu.isGood()) && (dy.isErrd() == false)) {
			if(revs == false) {
				xn = xv - Math.sin(xv)*epu.getAns()/(dy.der()*Math.sin(xv)+epu.getAns()*Math.cos(xv));
			}
			else {
				xn = xv - Math.sin(epu.getAns())*xv/(Math.sin(epu.getAns())+xv*Math.cos(epu.getAns())*dy.der());
			}
		ct2 = 0;
		while((Math.abs(xn-xv)>ac) && (ct2 < failsafe)) {
			xv = xn;
			epu.changex(xv);
			epu.solve();
			dy.changex(xv);
			dy.getDer();
			if((epu.isGood()) && (dy.isErrd() == false)) {
				if(revs == false) {
					xn = xv - Math.sin(xv)*epu.getAns()/(dy.der()*Math.sin(xv)+epu.getAns()*Math.cos(xv));
				}
				else {
					xn = xv - Math.sin(epu.getAns())*xv/(Math.sin(epu.getAns())+xv*Math.cos(epu.getAns())*dy.der());
				}
			ct2++;
			}
			else {
				ct2 = failsafe;
				isgood = false;
			}
		}
		if(ct2 >= failsafe) {
			isgood = false;
		}
		System.out.println(backup);
		epu.changex(xn);
		epu.solve();
		System.out.println("xn = " + xn);
		double preans = epu.getAns()*(Math.cos(xn));
		if(revs) {
			preans = xn*Math.cos(epu.getAns());
		}
		try {
		ans = Double.parseDouble(df.format(preans));
		}
		catch(Exception err) {
			isgood = false;
		}
		}
		else {
			isgood = false;
		}
	ct++;
	System.out.println("Attempt #: " + ct);
	}
	}
}
