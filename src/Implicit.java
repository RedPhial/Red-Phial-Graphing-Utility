import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;


public class Implicit extends Thread{
private static EquationProcessingUnit EPU = new EquationProcessingUnit(null, 0, 0);
private static int ct = 0;
private static Newtonz_Method n = new Newtonz_Method(null, 0, 0); 
	void Implicit(double origin, int muvy, int muvx, double xscale, double yscale, double dxr, int ximes, DefaultListModel eq, JProgressBar jp) {
		//implicit grphing
		int progress = 0;
		double y = ((origin-(10))+muvy)*yscale;
		double initialx = ((origin-(10))+muvx)*xscale;
		int d = (int) Math.round(20/dxr);
		ct = 0;
		//**.out.println("num = "+ d);
		//**.out.println("init y = " + y);
		//**.out.println("init x = " + initialx);
		double dy = dxr*yscale;
		double dx = dxr * xscale;
		//**.out.println("dy = "+dy);
		//**.out.println("dx = " + dx);
		boolean last = false;
		boolean presnt = false;
		boolean pre = true;
		boolean nudiff = false;
		boolean olddiff = false;
		double diff = 0;
		double comp = 0;
		double com = 0;
		EPU.changeEq(eq.get(ximes-1).toString());
		//du.changeEq(eq.get(ximes-1).toString());
		while(ct < d) {
			n.changew(y);
			EPU.changew(y);
			//du.changew(y);
			//**.out.println("yguess = " + y);
			int nc = 0;
			pre = true;
			nudiff = false;
			olddiff = false;
			comp = 0;
			while(nc < 81) {
				//Quarintine
				EPU.changex(initialx);
				//du.changex(initialx);
				EPU.solve();
				//du.getDer();
				com = EPU.getAns();
				diff = com - comp;
				if((EPU.getAns() < 0)) {
					presnt = false;
				}
				else {
					presnt = true;
				}
				if(pre == false) {
				if(diff <= 0) {
					nudiff = false;
				}
				else {
					nudiff = true;
				}
					if((last != presnt)) {
						this.run();
					}
					else if(nudiff != olddiff) {
						this.run();
					}
				}
				else {
					pre = false;
				}
				comp = com;
				olddiff = nudiff;
				initialx = initialx + 0.25*xscale;
				nc++;
				last = presnt;
				progress++;
				jp.setValue(progress);
				//end Quarintine
			}
		}
	}
	public void run(double initialx, DefaultListModel masterlist, int ximes, double yscale, double xscale, int muvx, int muvy, double y, double dy) {
		int zt = 0;
		double testthis = initialx;
		//**.setOut(null);
			//**.out.println("xguess = " + initialx);
			n.changex(testthis);
			n.getZero();
			////**.out.println(n.getAns());
			boolean repeat = false;
			int rep = 0;
			while(rep < ((DefaultListModel) masterlist.get(ximes - 1)).getSize()) {
				if((Integer.parseInt(((DefaultListModel) masterlist.get(ximes - 1)).get(rep).toString()) == (int) Math.round(((n.getAns()/xscale)+10-muvx)*25)) && (Integer.parseInt(((DefaultListModel) masterlist.get(ximes - 1)).get(rep + 1).toString()) == (int) Math.round((10-(y*1/yscale-muvy))*25))) {
					repeat = true;
				}
				rep = rep +2;
			}
			if(n.isGood() && repeat == false) {
				int x1 = (int) Math.round(((n.getAns()/xscale)+10-muvx)*25);
				int y1 = (int) Math.round((10-(y*1/yscale-muvy))*25);
				((DefaultListModel) masterlist.get(ximes-1)).addElement(x1);
				((DefaultListModel) masterlist.get(ximes-1)).addElement(y1);
			}
		zt++;

		initialx = ((0-(10))+muvx)*xscale;
		y = y + dy;
		ct++;
	}
}
