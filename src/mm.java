import java.text.DecimalFormat;

public class mm {
	private static String eq;
	private static double at;
	private static double d1 = 0;
	private static double d2 = 0;
	private static double d3 = 0;
	private static int ct = 0;
	private static int failsafe = 100;
	private static double dr = 0;
	private static double d = 0.00001;
	private static boolean isgood = false;
	private static double y = 0;
	private static double backup = 0;
	private static double yp = 0;
	private static double xp = 0;
	private static DecimalFormat dm = new DecimalFormat("0.00000");
	private static Derivative du = new Derivative(eq, at);
	private static EquationProcessingUnit epu = new EquationProcessingUnit(eq, 1, 1);
	private static int nuct = 0;
public mm(String in1, double in2, int max){
	eq = in1;
	at = in2;
	backup = in2;
	
	failsafe = max;
}
public void changeEq(String in) {
	eq = in;
}
public void changeX(double inpt) {
	at = inpt;
	backup = inpt;
}
public double getCritPtsX() {
	return xp;
}
public double getCritPtsY() {
	return yp;
}
public boolean isGood() {
	return isgood;
}
public void calcCritPts() {
	isgood = false;
	int tr = 0;
	d = 0.00001;
	while((tr < 3) && (isgood == false)) {
		d = d*10;
		at = backup;
	ct = 0;
	isgood = true;
	du.changeEq(eq);
	y=0;
	du.changex(at);
	du.getDer();
	if(du.isErrd() == false) {
		d1 = du.getAns();
		//System.out.println("d1 = " + d1);
	}
	else {
		isgood = false;
	}
	du.changex(at + d);
	du.getDer();
	if(du.isErrd() == false) {
		d2 = du.getAns();
		//System.out.println("d2 = " + d2);
	}
	else {
		isgood = false;
	}
	dr = (d2-d1)/d;
	//System.out.println("dr = " + dr);
	d3 = at - d1/dr;
	//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	//System.out.println("at: " + at);
	//System.out.println("d3: " + d3);
	//System.out.println("-----------------------------------------------------");
	nuct = 0;
	while((ct < failsafe) && (nuct < 2)) {
		at = d3;
		du.changex(at);
		du.getDer();
		if(du.isErrd() == false) {
			d1 = du.getAns();
			//System.out.println("d1 = " + d1);
		}
		else {
			isgood = false;
		}
		du.changex(at + d);
		du.getDer();
		if(du.isErrd() == false) {
			d2 = du.getAns();
			//System.out.println("d2 = " + d2);
		}
		else {
			isgood = false;
		}
		dr = (d2-d1)/d;
		//System.out.println("dr = " + dr);
		d3 = at - d1/dr;
		if(Math.abs(d3 - at) <= d) {
			nuct++;
		}
		else {
			nuct = 0;
		}
		ct++;
	}
	if(ct >= failsafe) {
		isgood = false;
	}
	else {
		epu.changeEq(eq);
		epu.changex(d3);
		epu.solve();
		if(epu.isGood()) {
			y = epu.getAns();
		}
		else {
			isgood = false;
		}	
	}
	try { 
		xp = Double.parseDouble(dm.format(d3));
	}
	catch(Exception err) {
		isgood = false;
	}
	try { 
		yp = Double.parseDouble(dm.format(y));
	}
	catch(Exception err) {
		isgood = false;
	}
	tr++;
	}
	if(tr >= 3) {
		isgood = false;
	}
	
}
}
