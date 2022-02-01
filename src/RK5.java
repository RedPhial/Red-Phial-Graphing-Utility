
public class RK5 {
	private static String eq=null;
	private static double xt = 0;
	private static double yt = 0;
	private static double dx = 1;
	private static boolean isGood = true;
	private static double k1 = 0;
	private static double k2 = 0;
	private static double k3 = 0;
	private static double k4 = 0;
	private static double k5 = 0;
	private static double k6 = 0;
	private static double LambdaPt = 0;
	private static EquationProcessingUnit EPU = new EquationProcessingUnit(eq, xt, xt);
	public RK5(String eqw, double xi, double yi) {
		eq=eqw;
		xt=xi;
		yt=yi;
	}
	public void changeEq(String in) {
		eq=in;
	}
	public void changeICon(double x0, double y0) {
		xt=x0;
		yt=y0;
	}
	public void changeStep(double h) {
		dx=h;
	}
	public static boolean isGood(){
		return isGood;
	}
	public static double getLambda(){
		return LambdaPt;
	}
	public void RUNge() {
		isGood = true;
		EPU.changeEq(eq);
		EPU.changex(xt);
		EPU.changew(yt);
		EPU.solve();
		if(EPU.isGood()) {
			k1=EPU.getAns();
			//System.out.println(k1);
			EPU.changex(xt+0.25*dx);
			EPU.changew(yt+0.25*k1*dx);
			EPU.solve();
			if(EPU.isGood()) {
				k2=EPU.getAns();
				//System.out.println(k2);
				EPU.changex(xt+0.25*dx);
				EPU.changew(yt+0.125*k1*dx+0.125*k2*dx);
				EPU.solve();
				if(EPU.isGood()) {
					k3=EPU.getAns();
					//System.out.println(k3);
					EPU.changex(xt+0.5*dx);
					EPU.changew(yt-0.5*k2*dx+k3*dx);
					EPU.solve();
					if(EPU.isGood()) {
						k4=EPU.getAns();
						//System.out.println(k4);
						EPU.changex(xt+0.75*dx);
						EPU.changew(yt+0.1875*k1*dx+0.5625*k4*dx);
						EPU.solve();
						if(EPU.isGood()) {
							k5=EPU.getAns();
							//System.out.println(k5);
							EPU.changex(xt+dx);
							EPU.changew(yt-(3/7)*k1*dx+(2/7)*k2*dx+(12/7)*k3*dx-(12/7)*k4*dx+(8/7)*k5*dx);
							EPU.solve();
							if(EPU.isGood()) {
								k6=EPU.getAns();
								//System.out.println(k6);
								LambdaPt = yt+((1.0/90)*((7*k1)+(32*k3)+(12*k4)+(32*k5)+(7*k6))*dx);
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
				
				}
			else {
				isGood = false;
			}
			}
		else {
			isGood = false;
		}
			
		}
	
		
}


