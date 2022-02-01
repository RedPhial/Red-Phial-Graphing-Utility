import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LnSlv {
	public double ans[];
	public boolean errd = false;
	public boolean nul = false;
	public boolean saulvbl = true;
	public static ImageIcon rp = new ImageIcon(Red_Phial_Graphing_Utility.class.getResource("/RP.png"));
	
	
public void setupdebugconsole(JFrame dframe, JPanel dpanel, JScrollPane dscrollpane, JTextArea dtextarea) {
	
	dpanel.setLayout(new GridLayout(1,1));
	dpanel.add(dscrollpane);
	dframe.getContentPane().add(dpanel, BorderLayout.CENTER);
	dframe.pack();
	dframe.setResizable(false);
	dpanel.setBackground(Color.RED);
	dtextarea.setBackground(new Color(255, 125, 0));
	dframe.setIconImage(rp.getImage());
	
	if(dframe.isVisible() == false) {
		dframe.setVisible(true);
		dtextarea.setText("debug console setup\n");
	}
	
		}
public void solve(double a[][], int rows, int cols, int degsOphreedum, JTextArea dtextarea) {
	
	errd = false;
	ans = new double[rows];
	int p1 = 0;
	int p2 = 0;
	double n = 0;
	boolean ndrop = true;
	//if(this.nulrwscn(a, cols, degsOphreedum)) {
		//nul = true;
		//System.out.println("nullrwdtktd");
	//}
	this.multscnnr(cols, degsOphreedum, a);
	if(nul == false) {
		
	this.rgnz(cols, rows, a, degsOphreedum, false, dtextarea);  //added better way to initially rearrange the rows for solving
			
	while(p2 < cols-1) {
		p1 = 0;
		
		this.rgnz(cols, rows, a, degsOphreedum, false, dtextarea); //new check later
		
	while((p1 < rows-1-p2) && (nul == false)) {
		ndrop = true;
		//System.out.println(p1 + " " + p2);
		
		
		
		try {
			if(a[p2][p1+1+p2] != 0) {
		n=-a[p2][p2]/a[p2][p1+1+p2];
		//System.out.println("n= " + n);
			}
			else {
				ndrop = false;
			}
		}
		catch(Exception err) {
			errd = true;
			err.printStackTrace();
		}
		if((ndrop) && (n != 0)) {
		this.rop(p2, p1+1+p2, cols, n, a, 1, degsOphreedum);
		a[p2][p1+1+p2] = 0; //added
		this.nulrwscn(a, rows, degsOphreedum);
		}
		//print
		//System.out.println();
		//int pr1 = 0;
		//int pr2 = 0;
		//while(pr1 < rows) {
			//pr2 = 0;
			//while(pr2 <= cols + degsOphreedum) {
				//System.out.print(" " + a[pr2][pr1]);
				//pr2++;
			//}
			//System.out.println();
			//pr1++;
		//}
		//System.out.println();
		//print
		p1++;
	}
	p2++;
	}
	//print
	//System.out.println("half-time");
		//int pr1 = 0;
		//int pr2 = 0;
		//while(pr1 < rows) {
			//pr2 = 0;
			//while(pr2 <= cols + degsOphreedum) {
				//System.out.print(" " + a[pr2][pr1]);
				//pr2++;
			//}
			//System.out.println();
			//pr1++;
		//}
		//end print
		//System.out.println("end half-time");
	
	
	
	p2 = cols-1;
	while((p2 > 0) && (nul == false)) {
		p1=0;
		
		this.rgnz(cols, rows, a, degsOphreedum, false, dtextarea); //new check later
		
		while((p1 < rows-1) && (nul == false)) {
			ndrop = true;
			//System.out.println(p1 + " " + p2);
			
			
			
			try {
				if((a[p2][p1] != 0) && (p2 != p1)) {
			n=-a[p2][p2]/a[p2][p1];
				}
				else {
					ndrop = false;
				}
			}
			catch(Exception err) {
				errd = true;
				err.printStackTrace();
			}
			//System.out.println("n= " + n);
			if((ndrop) && (n != 0)) {
			this.rop(p2, p1, cols, n, a, 1, degsOphreedum);
			a[p2][p1] = 0; //added
			this.nulrwscn(a, cols, degsOphreedum);
			
			//print
			//System.out.println();
			//pr1 = 0;
			//pr2 = 0;
			//while(pr1 < rows) {
				//pr2 = 0;
				//while(pr2 <= cols + degsOphreedum) {
					//System.out.print(" " + a[pr2][pr1]);
					//pr2++;
				//}
				//System.out.println();
				//pr1++;
			//}
			//end print
			}
			p1++;
		}
		p2--;
	}
	//print
	//int pr1 = 0;
	//int pr2 = 0;
	//while(pr1 < rows) {
		//pr2 = 0;
		//while(pr2 <= cols + degsOphreedum) {
			//System.out.print(" " + a[pr2][pr1]);
			//pr2++;
		//}
		//System.out.println();
		//pr1++;
	//}
	//end print
	if(this.nulrwscn(a, cols, degsOphreedum)) {
		nul = true;
		//System.out.println("nullrwdtktd");
	}
	p2=0;
	//System.out.println();
	while(p2 < rows) {
		try {
		n=a[cols][p2]/a[p2][p2];
		}
		catch(Exception err) {
			n = -0;
			errd = true;
		}
		//System.out.println(n);
		ans[p2] = n;
		p2++;
	}
  }
	this.EchelonTest(rows, a);
}

public double[] getAns() {
	return ans;
}

public void rop(int ra, int rc, int cols, double mult, double a[][], double mult2, int degOphreedum) {
	int attmp = 0;
	try {
	while(attmp <= cols+degOphreedum) {
		a[attmp][rc]=mult2*a[attmp][ra]+mult*a[attmp][rc];
		attmp++;
	}
	}
	catch(Exception err) {
		errd = true;
		err.printStackTrace();
	}
	
}


public void rgnz(int cols, int ros, double a[][], int degsOphreedum, boolean debug, JTextArea dtextarea) {
	
	boolean ndsrgnztn = false;
	double newa[][] = new double[cols + degsOphreedum + 1][ros];
	int cntr = 0;
	int index = 0;
	int subindex = 0;
	boolean plcd = false;
	double param1 = 0;
	double param2 = 0;
	
	//test to determine if rgnztn is needed
	int tstndx = 0;
	while((tstndx < ros) && (ndsrgnztn == false)) {
		if(a[tstndx][tstndx] == 0) {
			ndsrgnztn = true;
		}
		tstndx++;
	}
	//end rgnztn test
	
	if(ndsrgnztn) {
		
		
		cntr = 0;
		while(cntr < ros) {
			subindex = 0;
			while(subindex < cols + degsOphreedum + 1) {
				newa[subindex][cntr] = a[subindex][cntr];
				subindex++;
			}
			cntr++;
		}
		cntr = 0;
		
		while(cntr < ros) {
			index = 0;
			if(newa[cntr][cntr] == 0) {
				plcd = false;
				while((index < ros) && (plcd == false)) {
					if(index != cntr) {
						if((newa[cntr][index] != 0) && (newa[index][cntr] != 0)) {
							subindex = 0;
							plcd = true;
							while(subindex < cols + degsOphreedum +1) {
								param1 = newa[subindex][index];
								param2 = newa[subindex][cntr];
								newa[subindex][cntr] = param1;
								newa[subindex][index] = param2;
								subindex++;
							}
						}
					}
					index++;
				}
			}
			cntr++;
		}
	
		int printc = 0;
		int printr = 0;
		String rw = "";
	
		//print result for testing
				if(debug) {
			
					printc = 0;
					printr = 0;
					dtextarea.append("New A matrix contents\n");
					while(printr < ros) {
						printc = 0;
						rw = "";
						while(printc < cols + degsOphreedum + 1) {
							rw = rw + "  " + newa[printc][printr];
							printc++;
						}
						dtextarea.append(rw + "\n");
						printr++;
					}
					dtextarea.append("\n");
					
					printc = 0;
					printr = 0;
					dtextarea.append("Original A matrix contents\n");
					while(printr < ros) {
						printc = 0;
						rw = "";
						while(printc < cols + degsOphreedum + 1) {
							rw = rw + "  " + a[printc][printr];
							printc++;
						}
						dtextarea.append(rw + "\n");
						printr++;
					}
					dtextarea.append("\n");
					
				}
				//end print
		
		//copy to matrix a
		int copyr = 0;
		int copyc = 0;
		while(copyr < ros) {
			copyc = 0;
			while(copyc < cols + degsOphreedum + 1) {
				a[copyc][copyr] = newa[copyc][copyr];
				copyc++;
			}
			copyr++;
		}
			
		//end copy to matrix a
	
		
	}
}

public void zrscn(int cols, int ros, double a[][], int degsOphreedum) {
	int scnnr = 0;
	int scnnr2 = 0;
	int slkt = 0;
	int rplc = 0;
	while(scnnr < ros) {
		//System.out.println("scnnr = " + scnnr);
		if(a[scnnr][scnnr] == 0) {
			rplc = scnnr;
			scnnr2 = 0;
			while(scnnr2 < ros) {
				if((a[scnnr][scnnr2] != 0)) {
					slkt = scnnr2;
				}
				
				scnnr2++;
			}
			this.rve(rplc, slkt, a, cols, degsOphreedum);
		}
		scnnr++;
	}
}
public boolean nulrwscn(double a[][], int sze, int degs) {
	//System.out.println(sze);
	//System.out.println(degs);
	int snr = 0;
	int snr2 = 0;
	double addr = 0;
	while((snr < sze) && (nul == false)) {
		snr2 = 0;
		addr = 0;
		while((snr2 < sze + degs) && (nul == false)) {
				addr = addr + Math.abs(a[snr2][snr]);
			snr2++;
		}
		if(addr == 0) {
			nul = true;
			
		}
		snr++;
	}
	return nul;
}

public void rve(int ra, int rb, double a[][], int cols, int degs) {
	double b[] = new double[cols+degs+1];
	int cntr = 0;
	while(cntr <= cols + degs) {
		//System.out.println();
		//System.out.println("cntr = " + cntr);
		//System.out.println("rb = " + rb);
		b[cntr] = a[cntr][rb];
		cntr++;
	}
	cntr = 0;
	while(cntr <= cols + degs) {
		a[cntr][rb] = a[cntr][ra];
		a[cntr][ra] = b[cntr];
		cntr++;
	}
	//int pr1 = 0;
	//int pr2 = 0;
	//System.out.println("ro swp");
	//while(pr1 < cols) {
		//pr2 = 0;
		//while(pr2 <= cols + degs) {
			//System.out.print(" " + a[pr2][pr1]);
			//pr2++;
		//}
		//System.out.println();
		//pr1++;
	//}
	//System.out.println("ed ro swp");
			
}
public void multscnnr(int sze, int degs, double a[][]) {
	double mult = 0;
	int ra = 0;
	int rb = 1;
	int ca = 0;
	boolean contmult = true;
	boolean multcngd = true;
	if(degs == 0) {
		while(ra < sze) {
			rb = ra + 1;
			while(rb < sze) {
				contmult = true;
				multcngd = false;
				ca = 0;
				while((contmult) && (ca <= sze)) {
					if((a[ca][ra] != 0) && (a[ca][rb] != 0)) {
						if(multcngd) {
							if(mult != a[ca][ra]/a[ca][rb]) {
								contmult = false;
							}
						}
						mult = a[ca][ra]/a[ca][rb];
						multcngd = true;
					}
					else if((a[ca][ra] == 0) && (a[ca][rb] == 0)) {
						
					}
					else {
						contmult = false;
					}
					ca++;
				}
				if((multcngd) && (contmult)) {
					ca = 0;
					while(ca <= sze) {
						a[ca][rb] = 0;
						ca++;
					}
				}
				rb++;
			}
			ra++;
		}
	}
}
public void EchelonTest(int size, double a[][]) {
	saulvbl = true;
	int row = 0;
	int con = 0;
	while(row < size) {
		con = 0;
		while(con < size) {
			if(con != row) {
				if(a[con][row] != 0) {
					saulvbl = false;
				}
			}
			con++;
		}
		
		row++;
	}
}
public boolean isNull(int size, int degs, int idx) {
	boolean isnull = false;
	
	return isnull;
}
public boolean errd() {
	return errd;
}
public boolean nulrw() {
	return nul;
}
public boolean saulvabul() {
	return saulvbl;
}
}
