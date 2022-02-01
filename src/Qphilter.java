
public class Qphilter {
	private static String inpt = "y'=5*x-2:-10,5";
	private static double iconx = 0;
	private static double iconw = 0;
	private static String eq = null;
	private static boolean isGood = true;
	public Qphilter() {
		
	}
	public void setQ(String in) {
		inpt = in;
	}
	public double geticnx() {
		return iconx;
	}
	public double geticnw() {
		return iconw;
	}
	public boolean isGood() {
		return isGood;
	}
	public String getEq() {
		return eq;
	}
	public void Qprosc() {
		isGood = true;
		if(inpt.substring(0,3).contains("y'=")) {
		int occur1 = inpt.indexOf(":");
		if(occur1 > 0) {
		eq = inpt.substring(3, occur1);
		int occur2 = inpt.indexOf(",");
		if(occur2 > 0) {
		String ex = inpt.substring(occur1+1,occur2);
		String ey = inpt.substring(occur2+1);
		try {
			iconx = Double.parseDouble(ex);
		}
		catch(Exception err) {
			isGood = false;
		}
		try {
			iconw = Double.parseDouble(ey);
		}
		catch(Exception err) {
			isGood = false;
		}
		}
		else {
			isGood = false;
		}
		}
		else {
			isGood = false;
		}
		}
		else {
			isGood = false;
		}
		//System.out.println(isGood);
		//System.out.println(iconx);
		//System.out.println(iconw);
		//System.out.println(eq);
	}

}
