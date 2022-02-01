import java.text.DecimalFormat;

public class PolarDer {
	private String eq = null;
	private double ev = 0;
	private Derivative d = new Derivative(null, 1);
	private double ans = 0;
	private double preans = 0;
	private static Invert i = new Invert();
	private static boolean isgood = false;
	private EquationProcessingUnit epu = new EquationProcessingUnit(eq, 1, 0);
	private DecimalFormat df = new DecimalFormat("0.0000");
	public PolarDer(String in, double at) {
		eq = in;
		ev = at;
		if(eq.indexOf("w") != -1) {
			i.changeEq(in);
			i.convert();
			d.changeEq(i.getR());
			epu.changeEq(i.getR());
		}
		else {
		d.changeEq(eq);
		epu.changeEq(eq);
		}
		d.changex(ev);
		epu.changex(ev);
	}
	public void changeEq(String in2) {
		eq = in2;
		if(eq.indexOf("w") != -1) {
			i.changeEq(eq);
			i.convert();
			d.changeEq(i.getR());
			epu.changeEq(i.getR());
		}
		else {
		d.changeEq(eq);
		epu.changeEq(eq);
		}

	}
	
	public void changeX(double in3) {
		ev = in3;
		d.changex(ev);
		epu.changex(ev);
	}
	public void pder() {
		isgood = false;
		epu.solve();
		d.getDer();
		if(eq.contains("x")) {
		preans = ((epu.getAns()*Math.cos(ev))+(d.getAns()*Math.sin(ev)))/((-epu.getAns()*Math.sin(ev))+(d.getAns()*Math.cos(ev)));
		}
		else if (eq.contains("w")) {
			preans = ((ev*d.getAns()*Math.cos(epu.getAns()))+(Math.sin(epu.getAns())))/((-ev*d.getAns()*Math.sin(epu.getAns()))+(Math.cos(epu.getAns())));
		}
		//double a = epu.getAns()*Math.cos(ev)+d.getAns()*Math.sin(ev);
		//System.out.println(a);
		//double b = -epu.getAns()*Math.sin(ev)+d.getAns()*Math.cos(ev);
		//System.out.println(b);
		if(epu.isGood() && d.isErrd() == false) {
			isgood = true;
		}
		try {
		ans = Double.parseDouble(df.format(preans));
		}
		catch(Exception err) {
			isgood = false;
		}
	}
	public double getEAns() {
		return preans;
	}
	public double getAns() {
		return ans;
	}
	public boolean isGood() {
		return isgood;
	}

}
