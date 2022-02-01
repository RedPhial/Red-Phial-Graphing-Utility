import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PARAMS {
	private double eqt[][];
	private double numz[];
	private boolean dunthis[];
	private String eqwt[];
	private int degOphreedum;
	private boolean unsaulv;
	private boolean inval;
	private LnSlv ls;
	public void Pcalc(double a[][], int ros) {
		
	}
	public String[] numcnt(double a[][], int sze, JTextArea dtextarea) {
		inval = false;
		eqt = new double[sze][sze];
		numz = new double[sze];
		dunthis = new boolean[sze];
		int scnidx = 0;
		while(scnidx < sze) {
			dunthis[scnidx] = false;
			scnidx++;
		}
		int cttr1 = 0;
		int cttr2 = 0;
		int icnt = 0;
		degOphreedum = 0;
		String varz[] = new String[sze];
		DefaultListModel lngt = new DefaultListModel();
		//DefaultListModel paramz = new DefaultListModel();
		//String spr = null;
		//rowz
		while(cttr1 < sze) {
			cttr2 = 0;
			icnt = 0;
			//spr = "";
			//cols
			while(cttr2 < sze) {
				if(a[cttr2][cttr1] != 0) {
					icnt++;
				}
				cttr2++;
			}
			//mstr.addElement(spr);
			lngt.addElement(icnt);
			//System.out.println("----------------");
			//System.out.println(icnt);
			cttr1++;
			if(icnt == 0) {
				degOphreedum++;
				//added 5-26-2020
				if(a[sze][cttr1-1] != 0) {
					inval = true;
				}
				//end add this 5-26-2020
			}
		}
		//System.out.println("degsOphreedum = " + degOphreedum);
		//wher thingz get inturesting
		double nuclc[][] = new double[sze+1][sze-degOphreedum];
		int dcnt = 0;
		int dcnt2 = 0;
		int doughm = 0;
		while(dcnt < sze) {
			if(Integer.parseInt(lngt.get(dcnt).toString()) > 0) {
				doughm = 0;
				while(doughm <= sze) {
					nuclc[doughm][dcnt2] = a[doughm][dcnt];
					doughm++;
				}
				dcnt2++;
			}
			dcnt++;
		}
		ls = new LnSlv();
		//System.out.println("matrix numslv");
		boolean isgood = true;
		int mn = 0;
		boolean isgood2 = true;
		int sub = 0;
		
		//while(isgood) {
			//System.out.println();
			//isgood2 = true;
			//sub = 0;
			//while(isgood2) {
				//try {
					//System.out.print(" " + nuclc[sub][mn] + " ");
				//}
				//catch(Exception err) {
					//isgood2 = false;
				//}
				//sub++;
			//}
			//mn++;
			//try {
				//double tst = nuclc[0][mn];
			//}
			//catch(Exception err) {
				//isgood = false;
			//}
		//}
		
		//System.out.println();
		//System.out.println("end matrix nuv");
		//System.out.println("sze = " + sze);
		//System.out.println("degOphreedum = " + degOphreedum);
		ls.solve(nuclc, sze-degOphreedum, sze-degOphreedum, degOphreedum, dtextarea);
		eqwt = new String[sze - degOphreedum];
		if(ls.errd() == false) {
			int ctr = 0;
			int ctr2 = 0;
			int numr = -1;
			while(ctr < sze - degOphreedum) {
				//eqwt[ctr] = "t[" + ctr + "]=";
				eqwt[ctr] = "";
				ctr2 = 0;
				//numr = -1;
				while(ctr2 < sze) {
					if((ctr2 > ctr) && (ctr2 >= sze - degOphreedum)){
					eqwt[ctr] = eqwt[ctr] + "+" + numr*nuclc[ctr2][ctr]/nuclc[ctr][ctr] + "*t[" + ctr2 + "]";
					}
					ctr2++;
					//if(ctr2 == sze - 1) {
						//numr = 1;
					//}
				}
				eqwt[ctr] = eqwt[ctr] + "+" + nuclc[sze][ctr]/nuclc[ctr][ctr];
				ctr++;
			}
		}
		return eqwt;
	}
	public boolean saulv() {
		return ls.saulvbl;
	}
public void prnt() {
	int prtidx = 0;
	boolean cont = true;
	while(cont) {
		try {
		System.out.println(eqwt[prtidx]);
		}
		catch(Exception err) {
			cont = false;
		}
		prtidx++;
	}
}
public void pst(JTable O, int varz, boolean saulvabul, JTextField jtfstat) {
	int prtidx = 0;
	unsaulv = false;
	if(inval) {
		unsaulv = true;
	}
	while(prtidx < varz) {
		try {
			if((eqwt[prtidx].toString().contains("N")) || (eqwt[prtidx].toString().contains("i"))) {
				unsaulv = true;
			}
		}
		catch(Exception err) {
			
		}
		try {
		O.setValueAt(eqwt[prtidx], prtidx, 0);
		}
		catch(Exception err) {
			O.setValueAt("t[" + prtidx + "]", prtidx, 0);
		}
		prtidx++;
	}
	if(saulvabul == false) {
		unsaulv = true;
	}
	if(unsaulv) {
		O.setBackground(Color.cyan);
		jtfstat.setText("INVALID SOLUTION DETECTED!");
	}
	else {
		O.setBackground(new Color(255, 125, 0));
		jtfstat.setText("Operation complete");
	}
}
public int getDegs() {
	return degOphreedum;
}
public boolean getUnsaulvbul() {
	return unsaulv;
}
}
