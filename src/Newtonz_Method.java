import java.text.DecimalFormat;

import javax.swing.DefaultListModel;

public class Newtonz_Method {
	private static double xn = 0;
	private static double xv = 0;
	private static double ans = 0;
	private static String eq = "";
	private static int failsafe = 100;
	private static EquationProcessingUnit epu = new EquationProcessingUnit(null, 1, 1);
	private static Derivative dy = new Derivative(null, 0);
	private static double ac = 0.00000001;
	private static boolean isgood = false;
	private static DecimalFormat df = new DecimalFormat("0.000000");
	private static double backup = 0;
	private static int ct = 0;
	private static int ct2 = 0;
	private static double y = 1;
	private static double dr = 1;
	private static boolean zfactor = false;
	private static DefaultListModel debuglst = new DefaultListModel();
	private static boolean inacc = false;
	private static mm augment = new mm(eq, ac, ct);
	private static boolean fstmd = false;
	private static boolean zfactor2 = false;
public Newtonz_Method(String in1, double in2, int max) {
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
public boolean getInacc() {
	return inacc;
}
public boolean isGood() {
	return isgood;
}
public void changeEq(String in) {
	eq = in;
	epu.changeEq(eq);
	dy.changeEq(eq);
}
public void setFstMd(boolean t) {
	fstmd = t;
}
public void changex(double in) {
	xv = in;
	backup = in;
	epu.changex(xv);
	dy.changex(xv);
	
}
public void changew(double inpt) {
	y = inpt;
	epu.changew(y);
	dy.changew(y);
}
public void getZero() {
	zfactor = false;
	zfactor2 = false;
	inacc = false;
	isgood = false;
	ct = 0;
	ac = 0.00000001;
	xn = 0;
	while((isgood == false) && (ct < 1)) {
		xv = backup;
	isgood = true;
	epu.changex(xv);
	epu.solve();
	dy.changex(xv);
	dy.getDer();
	if(dy.der() == 0) {
		dr = 1;
	}
	else {
		dr = dy.der();
	}
	if((epu.isGood()) && (dy.isErrd() == false)) {
	xn = xv - epu.getAns()/dr;
	debuglst.addElement(xv + " - " + epu.getAns() + " / " + dr + " = " + xn);
	ct2 = 0;
	while((Math.abs(xn-xv)>ac) && (ct2 < failsafe) && (zfactor2 == false)) {
		xv = xn;
		epu.changex(xv);
		epu.solve();
		dy.changex(xv);
		dy.getDer();
		if(dy.der() == 0) {
			dr = 1;
			zfactor2 = true;
			if(fstmd == false) {
			augment.changeEq(eq);
			augment.changeX(xv);
			augment.calcCritPts();
			//System.out.println(augment.isGood());
			//System.out.println(augment.getCritPtsY());
			if((augment.isGood()) && (augment.getCritPtsY() <= ac*1000)) {
				ans=augment.getCritPtsX();
				xn=augment.getCritPtsX();
			}
			else {
				isgood=false;
			}
		}
			else {
				zfactor = true;
			}
		}
		else {
			dr = dy.der();
		}
		if((epu.isGood()) && (dy.isErrd() == false)) {
		xn = xv - epu.getAns()/dr;
		debuglst.addElement(xv + " - " + epu.getAns() + " / " + dr + " = " + xn);
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
	//System.out.println("xn = " + xn);
	//**.out.println(backup);
	try {
	ans = Double.parseDouble(df.format(xn));
	}
	catch(Exception err) {
		isgood = false;
	}
	}
	else {
		isgood = false;
	}
ct++;
//**.out.println("Attempt #: " + ct);
}
	if(zfactor == true) {
		double p1 = xn * 100000;
		double p2 = Math.round(p1);
		double p3 = p2/100000;
		epu.changex(p3);
		epu.solve();
		if(epu.getAns() == 0) {
			xn = p3;
			ans = p3;
		}
		else {
			p1 = xn * 10000;
			p2 = Math.round(p1);
			p3 = p2/10000;
			epu.changex(p3);
			epu.solve();
			if(epu.getAns() == 0) {
				xn = p3;
				ans = p3;
			}
			else {
				p1 = xn * 1000;
				p2 = Math.round(p1);
				p3 = p2/1000;
				epu.changex(p3);
				epu.solve();
				if(epu.getAns() == 0) {
					xn = p3;
					ans = p3;
				}
				else {
					p1 = xn * 100;
					p2 = Math.round(p1);
					p3 = p2/100;
					epu.changex(p3);
					epu.solve();
					if(epu.getAns() == 0) {
						xn = p3;
						ans = p3;
					}
					else {
						p1 = xn * 10;
						p2 = Math.round(p1);
						p3 = p2/10;
						epu.changex(p3);
						epu.solve();
						if(Math.abs(epu.getAns()) < 0.01) {
							xn = p3;
							ans = p3;
						}
						else {
							inacc = true;
							isgood = false;
						}
					}
				}
			}
		}
	}
	//**.out.println("zfactor applied");
	int c = 0;
	//System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	while(c < debuglst.getSize()) {
		//System.out.println(debuglst.get(c).toString());
		c++;
	}
	debuglst.clear();
}
}
