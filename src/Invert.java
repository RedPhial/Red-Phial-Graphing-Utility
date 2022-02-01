
public class Invert {
	private static String itm = null;
	private static String rsp = "";
public void Invert(String inpt) {
	itm = inpt;
}
public void changeEq(String nu) {
	itm = nu;
}
public static String getR(){
	return rsp;
}
public void convert() {
	rsp = "";
	int xo2 = itm.length();
	int xo1 = 0;
	
	while(xo1 < xo2) {
		String tst = itm.substring(xo1, xo1+1);
		if(tst.contains("w")) {
			rsp = rsp + "x";
		}
		else if(tst.contains("x")) {
			rsp = rsp + "w";
		}
		else {
			rsp = rsp + tst;
		}
		xo1++;
	}
	//System.out.println(rsp);
}
}
