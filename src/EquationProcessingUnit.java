import java.awt.Component;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class EquationProcessingUnit{
public static JTextField jtf1;
public static boolean moarneeded;
public static DefaultListModel num;
public static int listnum;
public static int d;
private static JTextField jtfinvisi;
private static DefaultListModel numcalc;
public static double interval;
private static DefaultListModel listolists;
private static DefaultListModel nulst;
public static int togo;
public static double w;
public static int whereRwe;
public static double ans = 0;
public static String errz = null;
public static boolean acceptable = false;
	public EquationProcessingUnit(String in1, double wstart, double xstart) {
		int whereRwe = 0;
		jtf1=new JTextField();
		jtf1.setText(in1);
		w = wstart;
		interval = xstart;
		num = new DefaultListModel();
		numcalc = new DefaultListModel();
		
	}
	public static void changeEq(String in1) {
		jtf1.setText(in1);
	}
	public DefaultListModel slph(DefaultListModel listolists) {
		int i0 = 0;
		boolean first = true;
		int eqsv = 0;
		double prev = 0;
		double nxt = 0;
		int did = 0;
		while(i0 < listolists.getSize()) {
			boolean sine = false;
			boolean cosine = false;
			boolean tangent = false;
			boolean sineh = false;
			boolean cosh = false;
			boolean tanh = false;
			boolean nlog = false;
			boolean arcsin = false;
			boolean arccos = false;
			boolean arctan = false;
			boolean logten = false;
			boolean absv = false;
			boolean step = false;
			boolean negativefunction = false;
			if(listolists.get(i0).toString().contains("(")) {
				if(listolists.get(i0).toString().substring(0, 1).contains("s")) {
					sine = true;
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("c")) {
					cosine = true;
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("t")) {
					tangent = true;
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("l")) {
					nlog = true;
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("S")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					sineh = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("C")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					cosh = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("T")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					tanh = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("a")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					arcsin = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("b")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					arccos = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("d")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					arctan = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("L")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					logten = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("v")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					absv = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("u")) {
					jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
					step = true;
				}
				else if(listolists.get(i0).toString().substring(0, 1).contains("~")) {
					//negative
					
					negativefunction = true;
					
					if(listolists.get(i0).toString().substring(1, 2).contains("s")) {
						sine = true;
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("c")) {
						cosine = true;
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("t")) {
						tangent = true;
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("l")) {
						nlog = true;
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("S")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						sineh = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("C")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						cosh = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("T")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						tanh = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("a")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						arcsin = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("b")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						arccos = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("d")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						arctan = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("L")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						logten = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("v")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						absv = true;
					}
					else if(listolists.get(i0).toString().substring(1, 2).contains("u")) {
						jtfinvisi.setText(listolists.get(i0).toString().substring(3, listolists.get(i0).toString().length()-1));
						step = true;
					}
					else {
						jtfinvisi.setText(listolists.get(i0).toString().substring(2, listolists.get(i0).toString().length()-1));
						}
					//end negative
				}
				else {
				jtfinvisi.setText(listolists.get(i0).toString().substring(1, listolists.get(i0).toString().length()-1));
				}
				//**.out.println(jtfinvisi.getText());
				nulst = new DefaultListModel();
				//listolists.add(1, new DefaultListModel());
				whereRwe = 0;
				while(whereRwe < jtfinvisi.getText().length()) {
					try {
						if(jtfinvisi.getText(whereRwe, 1).contains("~")) {
							whereRwe++;
						}
						if((jtfinvisi.getText(whereRwe, 1).contains("1")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("2")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("3")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("4")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("5")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("6")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("7")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("8")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("9")) ||
								(jtfinvisi.getText(whereRwe, 1).contains(".")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("x")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("0")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("e")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("p")) ||
								(jtfinvisi.getText(whereRwe, 1).contains("w"))
								)
								{
							Boolean stillanumer = true;
							int l = 0;
							int where = whereRwe;
							boolean negative = false;
							if(whereRwe > 0) {
								if(jtfinvisi.getText(whereRwe-1, 1).contains("~")) {
									negative = true;
								}
							}
							while((stillanumer == true)) {
								
								if((jtfinvisi.getText(where, 1).contains("1")) ||
										(jtfinvisi.getText(where, 1).contains("2")) ||
										(jtfinvisi.getText(where, 1).contains("3")) ||
										(jtfinvisi.getText(where, 1).contains("4")) ||
										(jtfinvisi.getText(where, 1).contains("5")) ||
										(jtfinvisi.getText(where, 1).contains("6")) ||
										(jtfinvisi.getText(where, 1).contains("7")) ||
										(jtfinvisi.getText(where, 1).contains("8")) ||
										(jtfinvisi.getText(where, 1).contains("9")) ||
										(jtfinvisi.getText(where, 1).contains(".")) ||
										(jtfinvisi.getText(where, 1).contains("0")) ||
										(jtfinvisi.getText(where, 1).contains("x")) ||
										(jtfinvisi.getText(where, 1).contains("e")) ||
										(jtfinvisi.getText(where, 1).contains("p")) ||
										(jtfinvisi.getText(where, 1).contains("w"))
										)
										{
									l++;
									where++;
									//**.out.println("num l = " + l);
										}
								else {
									stillanumer = false;
									//**.out.println("Not a number anymore");
									String nu = "";
									if(negative) {
										nu = jtfinvisi.getText(whereRwe - 1, l+1);
									}
									else {
									nu = jtfinvisi.getText(whereRwe, l);
									}
									whereRwe = whereRwe + l;
									//**.out.println("whereRwe = "+whereRwe);
									nulst.addElement(nu);
									
									listnum++;
								}
							}
						}
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						if((jtfinvisi.getText(whereRwe, 1).contains("+") == true) ||
								(jtfinvisi.getText(whereRwe, 1).contains("-") == true) ||
								(jtfinvisi.getText(whereRwe, 1).contains("*") == true) ||
								(jtfinvisi.getText(whereRwe, 1).contains("/") == true) ||
								(jtfinvisi.getText(whereRwe, 1).contains("^") == true)){
							String symbl = jtfinvisi.getText(whereRwe, 1);
							whereRwe++;
							//**.out.println("whereRwe = "+whereRwe);
							nulst.addElement(symbl);
							
							listnum++;
						}
					} catch (BadLocationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
					try {
					int parz = 0;
						int wh = whereRwe;
						boolean negate = false;
						if((jtfinvisi.getText(wh, 1).contains("(") == true) ||
								(jtfinvisi.getText(wh, 1).contains("s") == true) ||
								(jtfinvisi.getText(wh, 1).contains("c") == true) ||
								(jtfinvisi.getText(wh, 1).contains("t") == true) ||
								(jtfinvisi.getText(wh, 1).contains("l") == true) ||
								(jtfinvisi.getText(wh, 1).contains("S") == true) ||
								(jtfinvisi.getText(wh, 1).contains("C") == true) ||
								(jtfinvisi.getText(wh, 1).contains("T") == true) ||
								(jtfinvisi.getText(wh, 1).contains("a") == true) ||
								(jtfinvisi.getText(wh, 1).contains("b") == true) ||
								(jtfinvisi.getText(wh, 1).contains("d") == true) ||
								(jtfinvisi.getText(wh, 1).contains("L") == true) ||
								(jtfinvisi.getText(wh, 1).contains("v") == true) ||
								(jtfinvisi.getText(wh, 1).contains("u") == true)
						){
							if(jtfinvisi.getText(wh, 1).contains("(")) {
								parz = 1;
							}
							
							if(whereRwe > 0) {
								if(jtfinvisi.getText(whereRwe - 1, 1).contains("~")) {
									negate = true;
								}
							}
							//**.out.println("entered par loop");
							
							boolean cont = true;
							int l2 = whereRwe + 1;
							int l = 1;
							while(cont == true) {
								if(jtfinvisi.getText(l2, 1).contains("(")){
									parz++;
								}
								if(jtfinvisi.getText(l2, 1).contains(")")) {
									parz--;
									if(parz == 0) {
									cont = false;
									}
									else {
										l++;
										l2++;
										wh++;
									}
								}
								else {
									l++;
									l2++;
									wh++;
								}
							}
							String par = "";
							if(negate) {
								par = jtfinvisi.getText(whereRwe - 1, l+2);
							}
							else {
							par = jtfinvisi.getText(whereRwe, l+1);
							}
							whereRwe = whereRwe + l + 1;
							nulst.addElement(par);
							//System.out.println(nulst.get(listnum)); //TODO remove after test
							listnum++;
							
						}
					}
					catch(Exception err6) {
						//**.out.println("could not enter par loop");
						whereRwe = jtfinvisi.getText().length();
					}
					
					//**.out.println("end of loop(" + whereRwe + ").");
					//**.out.println("jtfinvisisize: " + jtfinvisi.getText().length());
					//**.out.println("-------------------");
					
					
					
				}
				//test for parenthesis
				boolean parzdetected = false;
				int scnnr = 0;
				while(scnnr < nulst.getSize()) {
					if(nulst.get(scnnr).toString().contains("(")) {
						parzdetected = true;
					}
					scnnr++;
				}
				//**.out.println(parzdetected);
				if(parzdetected == true) {
				//TODO add rep
					
				nulst = this.slph(nulst);
				
				//end rep
				}
				//**.out.println("interval = " + interval);
				//add solve loop----------------------------------------------------------------
				int sc = 0;
				numcalc.clear();
				int scv = nulst.getSize();
				while(sc<scv) {
					numcalc.add(sc, nulst.get(sc));
					sc++;
				}
				togo = nulst.getSize();
				eqsv = 0;
				while(eqsv < togo) { //pre-process the #'s
					String negate = "";
					if(numcalc.get(eqsv).toString().contains("~")) {
						negate = "~";
					}
					String y = "";
					
					if(numcalc.get(eqsv).toString().contains("x")) {
						 y = negate + Double.toString(interval);
					}
					else if(numcalc.get(eqsv).toString().contains("w")){
						y = negate + Double.toString(w);
					}
					else if(numcalc.get(eqsv).toString().contains("e")) {
						 y = negate + Double.toString(Math.E);
					}
					else if(numcalc.get(eqsv).toString().contains("p")) {
						 y = negate + Double.toString(Math.PI);
					}
					else {
							y = numcalc.get(eqsv).toString();
					}
					
					
					numcalc.remove(eqsv);
					//eqsv = eqsv-1;
					numcalc.add(eqsv, y);
					togo = numcalc.getSize();
					
					eqsv++;
				}
				//end pre-process
				
				eqsv = 0;
				togo = numcalc.getSize();
			while (eqsv < togo) {
				int mI = 1;
				if(numcalc.get(eqsv).toString().contains("^")) {
					double y = 0;
					double x = 0;
					//new
					mI = 1;
					if(numcalc.get(eqsv-1).toString().contains("~")) {
						y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
						mI = -1;
					}
					else if(numcalc.get(eqsv-1).toString().contains("0--")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
						mI = -1;
					}
					else if(numcalc.get(eqsv-1).toString().contains("0-")) {
						y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
						mI = -1;
					}
					else {
						 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
					}
					if (numcalc.get(eqsv+1).toString().contains("~")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0--")) {
						x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0-")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
					}
					else {
						 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
					}
					
					//end new
					double newnum = mI*Math.pow(y, x); //check
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					eqsv = eqsv-1;
					numcalc.add(eqsv, newnum);
					togo = numcalc.getSize();
					//**.out.println("^ loop");
				}
				eqsv++;
			}
			eqsv = 0;
			togo = numcalc.getSize();
			while (eqsv < togo) {
				
				if((numcalc.get(eqsv).toString().contains("*")))
						{
					double y = 0;
					double x = 0;
					//new
					
					if(numcalc.get(eqsv-1).toString().contains("~")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
					}
					else if(numcalc.get(eqsv-1).toString().contains("0--")) {
						y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
					}
					else if(numcalc.get(eqsv-1).toString().contains("0-")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
					}
					else {
						 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
					}
					if (numcalc.get(eqsv+1).toString().contains("~")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0--")) {
						x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0-")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
					}
					else {
						 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
					}
					
					//End new
					double newnum = y * x;
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					eqsv = eqsv - 1;
					numcalc.add(eqsv, newnum);
					togo = numcalc.getSize();
					//**.out.println("* loop");
				}
				eqsv++;
			}
			
			eqsv = 0;
			togo = numcalc.getSize();
			while (eqsv < togo) {
				if((numcalc.get(eqsv).toString().contains("/")))
						{
					double y = 0;
					double x = 0;
					//new
					
					if(numcalc.get(eqsv-1).toString().contains("~")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
					}
					else if(numcalc.get(eqsv-1).toString().contains("0--")) {
						y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
					}
					else if(numcalc.get(eqsv-1).toString().contains("0-")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
					}
					else {
						 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
					}
					if (numcalc.get(eqsv+1).toString().contains("~")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0--")) {
						x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0-")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
					}
					else {
						 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
					}
					
					//End new
					double newnum = y / x;
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					eqsv = eqsv - 1;
					numcalc.add(eqsv, newnum);
					togo = numcalc.getSize();
					//**.out.println("/ loop");
				}
				eqsv++;
			}
			
			eqsv = 1;
			togo = numcalc.getSize();
			while (eqsv < togo) {  //loop join complete
				if((numcalc.get(eqsv).toString().contains("+")))
						{
					double y = 0;
					double x = 0;
					//new
					
					if(numcalc.get(eqsv-1).toString().contains("~")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
					}
					else if(numcalc.get(eqsv-1).toString().contains("0--")) {
						y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
					}
					else if(numcalc.get(eqsv-1).toString().contains("0-")) {
						y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
					}
					else {
						 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
					}
					if (numcalc.get(eqsv+1).toString().contains("~")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0--")) {
						x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
					}
					else if(numcalc.get(eqsv+1).toString().contains("0-")) {
						x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
					}
					else {
						 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
					}
					
					//end new
					double newnum = y + x;
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					numcalc.remove(eqsv-1);
					eqsv = eqsv - 1;
					numcalc.add(eqsv, newnum);
					togo = numcalc.getSize();
					//**.out.println("+ loop");
				}
				else if((numcalc.get(eqsv).toString().contains("-")) && (numcalc.get(eqsv).toString().length() == 1))
				{
			double y = 0;
			double x = 0;
			//new
			
			if(numcalc.get(eqsv-1).toString().contains("~")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0--")) {
				y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0-")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
			}
			else {
				 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
			}
			if (numcalc.get(eqsv+1).toString().contains("~")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0--")) {
				x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0-")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
			}
			else {
				 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
			}
			
			//End new
			double newnum = y - x;
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			eqsv = eqsv - 1;
			numcalc.add(eqsv, newnum);
			togo = numcalc.getSize();
			//**.out.println("- loop");
		}
				eqsv++;
			}
			
			eqsv = 1; //changed this to one
			togo = numcalc.getSize();
			int ni = numcalc.getSize();
			if(ni == 1) {
				//**.out.println("success");
				double an = 0;
				String ans = "";
				if(numcalc.get(0).toString().contains("~")) {
					an = -Double.parseDouble(numcalc.get(0).toString().substring(1));
				}
				else if(numcalc.get(0).toString().contains("0--")) {
					an = Double.parseDouble(numcalc.get(0).toString().substring(3));
				}
				else if(numcalc.get(0).toString().contains("0-")) {
					an = -Double.parseDouble(numcalc.get(0).toString().substring(2));
				}
				else {
					an = Double.parseDouble(numcalc.get(0).toString());
				}
				String negatur = "";
				
				if(negativefunction) {
					negatur = "0-";
				}
				if(sine == true) {
					an = Math.sin(an);
					
				}
				if(cosine == true) {
					an = Math.cos(an);
					
				}
				if(tangent == true){
					an = Math.tan(an);
					
				}
				if(nlog == true){
					an = Math.log(an);
					
				}
				if(sineh == true) {
					an = Math.sinh(an);
					
				}
				if(cosh == true) {
					an = Math.cosh(an);
					
				}
				if(tanh == true) {
					an = Math.tanh(an);
					
				}
				if(arcsin == true) {
					an = Math.asin(an);
					
				}
				if(arccos == true) {
					an = Math.acos(an);
					
				}
				if(arctan == true) {
					an = Math.atan(an);
					
				}
				if(logten == true) {
					an = Math.log10(an);
					
				}
				if(absv == true) {
					an = Math.abs(an);
					
				}
				if(step == true) {
					if(an > interval) {
						an = 0;
					}
					else {
						an = 1;
					}
					
				}
				
				
				ans = negatur + Double.toString(an);
					
				//**.out.println(an);
				nulst.clear();
				listolists.remove(i0);
				listolists.add(i0, ans);
				
				
			}
				//end solve---------------------------------------------------------------------
			}
				i0++;
				//System.out.println("i0 = " + i0 + "; listlength = " + ((DefaultListModel) listolists.get(0)).getSize());
			}
		return listolists;
	}
	public static void changew(double in2) {
		w = in2;
	}
	public static void changex(double in3) {
		interval = in3;
	}
	static double getAns() {
		return ans;
	}
	static boolean isGood() {
		return acceptable;
	}
	static String getErrorCon() {
		return errz;
	}
	
		public void solve() {
	
			//philter, VERY IMPORTANT! TAMPERING MAY RESULT IN SYSTEM FAILURE!
			acceptable = false;
			boolean test1 = true;
			boolean test2 = true;
			boolean test3 = true;
			boolean test4 = true;
			boolean test5 = true;
			boolean test6 = true;
			boolean test7 = true;
			boolean test8 = true;
			boolean test9 = true;
			boolean test10 = true;
			boolean test11 = true;
			boolean test12 = true;
			boolean test13 = true;
			boolean test14 = true;
			int scanindex = 0;
			int itemz = jtf1.getText().length();
			while(scanindex + 1 < itemz) {
				try {
					if((jtf1.getText(scanindex, 1).contains("*")) ||
							(jtf1.getText(scanindex, 1).contains("^")) ||
									(jtf1.getText(scanindex, 1).contains("-")) ||
									(jtf1.getText(scanindex, 1).contains("+")) ||
									(jtf1.getText(scanindex, 1).contains("/"))) {
						if((jtf1.getText(scanindex+1, 1).contains("0")) ||
								(jtf1.getText(scanindex+1, 1).contains("1")) ||
								(jtf1.getText(scanindex+1, 1).contains("2")) ||
								(jtf1.getText(scanindex+1, 1).contains("3")) ||
								(jtf1.getText(scanindex+1, 1).contains("4")) ||
								(jtf1.getText(scanindex+1, 1).contains("5")) ||
								(jtf1.getText(scanindex+1, 1).contains("6")) ||
								(jtf1.getText(scanindex+1, 1).contains("7")) ||
								(jtf1.getText(scanindex+1, 1).contains("8")) ||
								(jtf1.getText(scanindex+1, 1).contains("9")) ||
								(jtf1.getText(scanindex+1, 1).contains("x")) ||
								(jtf1.getText(scanindex+1, 1).contains("(")) ||
								(jtf1.getText(scanindex+1, 1).contains("s")) ||
								(jtf1.getText(scanindex+1, 1).contains("c")) ||
								(jtf1.getText(scanindex+1, 1).contains("t")) ||
								(jtf1.getText(scanindex+1, 1).contains("l")) ||
								(jtf1.getText(scanindex+1, 1).contains("e")) ||
								(jtf1.getText(scanindex+1, 1).contains("p")) ||
								(jtf1.getText(scanindex+1, 1).contains("S")) ||
								(jtf1.getText(scanindex+1, 1).contains("C")) ||
								(jtf1.getText(scanindex+1, 1).contains("T")) ||
								(jtf1.getText(scanindex+1, 1).contains("L")) ||
								(jtf1.getText(scanindex+1, 1).contains("a")) ||
								(jtf1.getText(scanindex+1, 1).contains("b")) ||
								(jtf1.getText(scanindex+1, 1).contains("d")) ||
								(jtf1.getText(scanindex+1, 1).contains("w")) ||
								(jtf1.getText(scanindex+1, 1).contains("v")) ||
								(jtf1.getText(scanindex+1, 1).contains("u")) ||
								(jtf1.getText(scanindex+1, 1).contains("~"))) {
							
						}
						else {
							test1 = false;
						}
					}
					else {
						
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test1 = false;
				}
				scanindex++;
			}
			
			scanindex = 0;
			while(scanindex + 1 < itemz) {
				try {
					if((jtf1.getText(scanindex+1, 1).contains("*")) ||
							(jtf1.getText(scanindex+1, 1).contains("^")) ||
									(jtf1.getText(scanindex+1, 1).contains("-")) ||
									(jtf1.getText(scanindex+1, 1).contains("+")) ||
									(jtf1.getText(scanindex+1, 1).contains("/"))) {
						if((jtf1.getText(scanindex, 1).contains("0")) ||
								(jtf1.getText(scanindex, 1).contains("1")) ||
								(jtf1.getText(scanindex, 1).contains("2")) ||
								(jtf1.getText(scanindex, 1).contains("3")) ||
								(jtf1.getText(scanindex, 1).contains("4")) ||
								(jtf1.getText(scanindex, 1).contains("5")) ||
								(jtf1.getText(scanindex, 1).contains("6")) ||
								(jtf1.getText(scanindex, 1).contains("7")) ||
								(jtf1.getText(scanindex, 1).contains("8")) ||
								(jtf1.getText(scanindex, 1).contains("9")) ||
								(jtf1.getText(scanindex, 1).contains("x")) ||
								(jtf1.getText(scanindex, 1).contains("e")) ||
								(jtf1.getText(scanindex, 1).contains("p")) ||
								(jtf1.getText(scanindex, 1).contains(")")) ||
								(jtf1.getText(scanindex, 1).contains("w"))) {
							
						}
						else {
							test2 = false;
						}
					}
					else {
						
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test2 = false;
				}
				scanindex++;
			}
			scanindex = 0;
			while(scanindex<itemz) {
				try {
					if(
							(jtf1.getText(scanindex, 1).contains("(")) ||
							(jtf1.getText(scanindex, 1).contains(")")) ||
							(jtf1.getText(scanindex, 1).contains("x")) ||
							(jtf1.getText(scanindex, 1).contains("w")) ||
							(jtf1.getText(scanindex, 1).contains("e")) ||
							(jtf1.getText(scanindex, 1).contains("p")) ||
							(jtf1.getText(scanindex, 1).contains("0")) ||
							(jtf1.getText(scanindex, 1).contains("1")) ||
							(jtf1.getText(scanindex, 1).contains("2")) ||
							(jtf1.getText(scanindex, 1).contains("3")) ||
							(jtf1.getText(scanindex, 1).contains("4")) ||
							(jtf1.getText(scanindex, 1).contains("5")) ||
							(jtf1.getText(scanindex, 1).contains("6")) ||
							(jtf1.getText(scanindex, 1).contains("7")) ||
							(jtf1.getText(scanindex, 1).contains("8")) ||
							(jtf1.getText(scanindex, 1).contains("9")) ||
							(jtf1.getText(scanindex, 1).contains("s")) ||
							(jtf1.getText(scanindex, 1).contains("c")) ||
							(jtf1.getText(scanindex, 1).contains("t")) ||
							(jtf1.getText(scanindex, 1).contains("a")) ||
							(jtf1.getText(scanindex, 1).contains("b")) ||
							(jtf1.getText(scanindex, 1).contains("d")) ||
							(jtf1.getText(scanindex, 1).contains("S")) ||
							(jtf1.getText(scanindex, 1).contains("C")) ||
							(jtf1.getText(scanindex, 1).contains("T")) ||
							(jtf1.getText(scanindex, 1).contains("l")) ||
							(jtf1.getText(scanindex, 1).contains("L")) ||
							(jtf1.getText(scanindex, 1).contains("v")) ||
							(jtf1.getText(scanindex, 1).contains("u")) ||
							(jtf1.getText(scanindex, 1).contains("+")) ||
							(jtf1.getText(scanindex, 1).contains("-")) ||
							(jtf1.getText(scanindex, 1).contains("*")) ||
							(jtf1.getText(scanindex, 1).contains("/")) ||
							(jtf1.getText(scanindex, 1).contains("^")) ||
							(jtf1.getText(scanindex, 1).contains("~")) ||
							(jtf1.getText(scanindex, 1).contains("."))
							
							) {
						
					}
					else {
						test3 = false;
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test3 = false;
				}
				scanindex++;
			}
			scanindex = 0;
			int openparz = 0;
			int clozedparz = 0;
			while(scanindex<itemz) {
				try {
					if(jtf1.getText(scanindex, 1).contains("(")) {
						openparz++;
					}
				} catch (BadLocationException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					test4 = false;
				}
				try {
					if(jtf1.getText(scanindex, 1).contains(")")) {
						clozedparz++;
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test4 = false;
				}
				if(openparz < clozedparz) {
					test4 = false;
				}
				scanindex++;
			}
			if(openparz != clozedparz) {
				test4 = false;
			}
			scanindex = 0;
			while(scanindex+1 < itemz) {
				try {
					if((jtf1.getText(scanindex, 1).contains("s")) ||
							(jtf1.getText(scanindex, 1).contains("c")) ||
							(jtf1.getText(scanindex, 1).contains("t")) ||
							(jtf1.getText(scanindex, 1).contains("l")) ||
							(jtf1.getText(scanindex, 1).contains("S")) ||
							(jtf1.getText(scanindex, 1).contains("C")) ||
							(jtf1.getText(scanindex, 1).contains("T")) ||
							(jtf1.getText(scanindex, 1).contains("L")) ||
							(jtf1.getText(scanindex, 1).contains("a")) ||
							(jtf1.getText(scanindex, 1).contains("b")) ||
							(jtf1.getText(scanindex, 1).contains("d")) ||
							(jtf1.getText(scanindex, 1).contains("v")) ||
							(jtf1.getText(scanindex, 1).contains("u"))) {
						if(jtf1.getText(scanindex+1, 1).contains("(")) {
							
						}
						else {
							test5 = false;
						}
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test5 = false;
				}
				scanindex++;
			}
			try {
				if((jtf1.getText(itemz-1, 1).contains("*")) ||
						(jtf1.getText(itemz-1, 1).contains("^")) ||
						(jtf1.getText(itemz-1, 1).contains("/")) ||
						(jtf1.getText(itemz-1, 1).contains("+")) ||
						(jtf1.getText(itemz-1, 1).contains("-")) ||
						(jtf1.getText(itemz-1, 1).contains("(")) ||
						(jtf1.getText(itemz-1, 1).contains("s")) ||
						(jtf1.getText(itemz-1, 1).contains("c")) ||
						(jtf1.getText(itemz-1, 1).contains("t")) ||
						(jtf1.getText(itemz-1, 1).contains("l")) ||
						(jtf1.getText(scanindex, 1).contains("S")) ||
						(jtf1.getText(scanindex, 1).contains("C")) ||
						(jtf1.getText(scanindex, 1).contains("T")) ||
						(jtf1.getText(scanindex, 1).contains("L")) ||
						(jtf1.getText(scanindex, 1).contains("a")) ||
						(jtf1.getText(scanindex, 1).contains("b")) ||
						(jtf1.getText(scanindex, 1).contains("d")) ||
						(jtf1.getText(scanindex, 1).contains("v")) ||
						(jtf1.getText(scanindex, 1).contains("u"))) {
					test6 = false;
				}
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				test6 = false;
			}
			scanindex = 0;
			while(scanindex+1 < itemz) {
				try {
					if((jtf1.getText(scanindex, 1).contains("x")) ||
							(jtf1.getText(scanindex, 1).contains("e")) ||
							(jtf1.getText(scanindex, 1).contains("p")) ||
							(jtf1.getText(scanindex, 1).contains("w"))) {
						if((jtf1.getText(scanindex+1, 1).contains("^")) ||
								(jtf1.getText(scanindex+1, 1).contains("*")) ||
								(jtf1.getText(scanindex+1, 1).contains("/")) ||
								(jtf1.getText(scanindex+1, 1).contains("+")) ||
								(jtf1.getText(scanindex+1, 1).contains("-")) ||
								(jtf1.getText(scanindex+1, 1).contains(")"))) {
							
						}
						else {
							test7 = false;
						}
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test7 = false;
				}
				scanindex++;
			}
			scanindex = 0;
			while(scanindex+1 < itemz) {
				try {
					if((jtf1.getText(scanindex+1, 1).contains("x")) ||
							(jtf1.getText(scanindex+1, 1).contains("e")) ||
							(jtf1.getText(scanindex+1, 1).contains("p")) ||
							(jtf1.getText(scanindex+1, 1).contains("w"))) {
						if((jtf1.getText(scanindex, 1).contains("0")) ||
								(jtf1.getText(scanindex, 1).contains("1")) ||
								(jtf1.getText(scanindex, 1).contains("2")) ||
								(jtf1.getText(scanindex, 1).contains("3")) ||
								(jtf1.getText(scanindex, 1).contains("4")) ||
								(jtf1.getText(scanindex, 1).contains("5")) ||
								(jtf1.getText(scanindex, 1).contains("6")) ||
								(jtf1.getText(scanindex, 1).contains("7")) ||
								(jtf1.getText(scanindex, 1).contains("8")) ||
								(jtf1.getText(scanindex, 1).contains("9")) ||
								(jtf1.getText(scanindex, 1).contains("x")) ||
								(jtf1.getText(scanindex, 1).contains("e")) ||
								(jtf1.getText(scanindex, 1).contains("p")) ||
								(jtf1.getText(scanindex, 1).contains(".")) ||
								(jtf1.getText(scanindex, 1).contains("w"))) {
							test8 = false;
						}
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test8 = false;
				}
				scanindex++;
			}
			try {
				if((jtf1.getText(0, 1).contains("^")) ||
						(jtf1.getText(0, 1).contains("*")) ||
						(jtf1.getText(0, 1).contains("/")) ||
						(jtf1.getText(0, 1).contains("+")) ||
						(jtf1.getText(0, 1).contains("-")) ||
						(jtf1.getText(0, 1).contains(")"))) {
					test9 = false;
				}
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				test9 = false;
			}
			scanindex = 0;
			
			while(scanindex < itemz){
				try {
					if(jtf1.getText(scanindex, 1).contains("x") ||
							jtf1.getText(scanindex, 1).contains("e") ||
							jtf1.getText(scanindex, 1).contains("p") ||
							jtf1.getText(scanindex, 1).contains("w")) {
						if(jtf1.getText().length() == 1) {
							//test10 = false;
						}
						else if(jtf1.getText(scanindex + 1, 1).contains("^") ||
								jtf1.getText(scanindex + 1, 1).contains("*") ||
								jtf1.getText(scanindex + 1, 1).contains("/") ||
								jtf1.getText(scanindex + 1, 1).contains("+") ||
								jtf1.getText(scanindex + 1, 1).contains(")") ||
								jtf1.getText(scanindex + 1, 1).contains("-")) {
							
						}
						else if(jtf1.getText(scanindex - 1, 1).contains("^") ||
								jtf1.getText(scanindex - 1, 1).contains("*") ||
								jtf1.getText(scanindex - 1, 1).contains("/") ||
								jtf1.getText(scanindex - 1, 1).contains("+") ||
								jtf1.getText(scanindex - 1, 1).contains("~") ||
								jtf1.getText(scanindex - 1, 1).contains("(") ||
								jtf1.getText(scanindex - 1, 1).contains("-")) {
							
						}
						else {
							test10 = false;
						}
						
						
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test10 = false;
				}
				scanindex++;
			}
		
			//test
			scanindex = 0;
			while(scanindex+1 < itemz) {
				try {
					if((jtf1.getText(scanindex, 1).contains("0")) ||
									(jtf1.getText(scanindex, 1).contains("1")) ||
									(jtf1.getText(scanindex, 1).contains("2")) ||
									(jtf1.getText(scanindex, 1).contains("3")) ||
									(jtf1.getText(scanindex, 1).contains("4")) ||
									(jtf1.getText(scanindex, 1).contains("5")) ||
									(jtf1.getText(scanindex, 1).contains("6")) ||
									(jtf1.getText(scanindex, 1).contains("7")) ||
									(jtf1.getText(scanindex, 1).contains("8")) ||
									(jtf1.getText(scanindex, 1).contains("9")) ||
									(jtf1.getText(scanindex, 1).contains("x")) ||
									(jtf1.getText(scanindex, 1).contains("e")) ||
									(jtf1.getText(scanindex, 1).contains("p")) ||
									(jtf1.getText(scanindex, 1).contains(".")) ||
									(jtf1.getText(scanindex, 1).contains("w")) ||
									(jtf1.getText(scanindex, 1).contains(")"))) {
						if((jtf1.getText(scanindex+1, 1).contains("S")) ||
						(jtf1.getText(scanindex+1, 1).contains("C")) ||
						(jtf1.getText(scanindex+1, 1).contains("T")) ||
						(jtf1.getText(scanindex+1, 1).contains("L")) ||
						(jtf1.getText(scanindex+1, 1).contains("a")) ||
						(jtf1.getText(scanindex+1, 1).contains("b")) ||
						(jtf1.getText(scanindex+1, 1).contains("d")) ||
						(jtf1.getText(scanindex+1, 1).contains("v")) ||
						(jtf1.getText(scanindex+1, 1).contains("u")) ||
						(jtf1.getText(scanindex+1, 1).contains("s")) ||
						(jtf1.getText(scanindex+1, 1).contains("c")) ||
						(jtf1.getText(scanindex+1, 1).contains("t"))) {
							test12 = false;
						}
						
					}
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					test12 = false;
				}
				
				scanindex++;
			}
			scanindex = 0;
			while(scanindex+1 < itemz) {
				try{
					if((jtf1.getText(scanindex, 1).contains("(")) && jtf1.getText(scanindex+1, 1).contains(")")) {
						test13 = false;
					}
				}
				catch(Exception err) {
					test13 = false;
				}
				scanindex++;
			}
			
			scanindex = 0;
			while(scanindex < itemz) {
				
				try {
					if(jtf1.getText(scanindex, 1).contains("~")) {
						if(scanindex > 0) {
							if(jtf1.getText(scanindex - 1, 1).contains("0") ||
							jtf1.getText(scanindex - 1, 1).contains("1") ||
							jtf1.getText(scanindex - 1, 1).contains("2") ||
							jtf1.getText(scanindex - 1, 1).contains("3") ||
							jtf1.getText(scanindex - 1, 1).contains("4") ||
							jtf1.getText(scanindex - 1, 1).contains("5") ||
							jtf1.getText(scanindex - 1, 1).contains("6") ||
							jtf1.getText(scanindex - 1, 1).contains("7") ||
							jtf1.getText(scanindex - 1, 1).contains("8") ||
							jtf1.getText(scanindex - 1, 1).contains("9") ||
							jtf1.getText(scanindex - 1, 1).contains(".") ||
							jtf1.getText(scanindex - 1, 1).contains("x") ||
							jtf1.getText(scanindex - 1, 1).contains("w") ||
							jtf1.getText(scanindex - 1, 1).contains("p") ||
							jtf1.getText(scanindex - 1, 1).contains("e")) {
								test14 = false;
							}
							
						}
						if(scanindex + 1 < itemz) {
							if(jtf1.getText(scanindex + 1, 1).contains("+") ||
							jtf1.getText(scanindex + 1, 1).contains("-") || 
							jtf1.getText(scanindex + 1, 1).contains("*") ||
							jtf1.getText(scanindex + 1, 1).contains("/") ||
							jtf1.getText(scanindex + 1, 1).contains("^") ||
							jtf1.getText(scanindex + 1, 1).contains(".")) {
							test14 = false;
							}
						}
						else {
							test14 = false;
						}
						if(jtf1.getText().length() == 1) {
							test14 = false;
						}
						
					}
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				scanindex++;
			}
			//end philter
			if((test1 == true) &&
					(test2 == true) &&
					(test3 == true) &&
					(test4 == true) &&
					(test5 == true) &&
					(test6 == true) &&
					(test7 == true) &&
					(test8 == true) &&
					(test9 == true) &&
					(test10 == true) &&
					(test11 == true) &&
					(test12 == true) &&
					(test13 == true) &&
					(test14 == true)){
				acceptable = true;
				errz = null;
			}
			//explanations
			String a1 = "";
			String a2 = "";
			String a3 = "";
			String a4 = "";
			String a5 = "";
			String a6 = "";
			String a7 = "";
			String a9 = "";
			String a10 = "";
			String a11 = "";
			String a12 = "";
			String a13 = "";
			String a14 = "";
			
			if(test1 == false) {
				a1 = "A number or an open parenthesis must follow an operator. ";
			}
			if(test2 == false) {
				a2 = "A number must precede an operator. ";
			}
			if(test3 == false) {
				a3 = "Unacceptable characters were detected. ";
			}
			if(test4 == false) {
				a4 = "Use the same number of open parenthesis and closed parenthesis. ";
			}
			if(test5 == false) {
				a5 = "An open parenthesis must follow a s c t v u or l operation. ";
			}
			if(test6 == false) {
				a6 = "An operator or an open parenthesis may not be the last character in an equation. ";
			}
			if((test7 == false)||(test8 == false)) {
				a7 = "Numbers cannot be put next to x, e, w, or p; separate them with operators or a closed parenthesis. ";
			}
			if(test9 == false) {
				a9 = "Operators may not be the first character in an equation. ";
			}
			if(test10 == false) {
				a10 = "x, e, w, or p was used incorrectly.  An operator is required when multiplying.";
			}
			if(test11 == false) {
				a11 = "Your entry has exceeded the number of nested parenthesis supported by this program. ";
			}
			if(test12 == false) {
				a12 = "Use the multiplication symbol before operations. ";
			}
			if(test13 == false) {
				a13 = "Parenthesis abuse detected. ";
			}
			if(test14 == false) {
				a14 = "Bad use of ~ modifier.  See instruction manuel for details. ";
			}
			errz = a1+a2+a3+a4+a5+a6+a7+a9+a10+a11+a12+a13+a14;
			//end philter
			if(acceptable == true) {
			try{
		num.clear();
			}
			catch(Exception err) {
				
			}
		listnum = 0;
		moarneeded = false;
		whereRwe = 0;
		
		while(whereRwe < jtf1.getText().length()) {
			try {
				if(jtf1.getText(whereRwe, 1).contains("~")) {
					whereRwe++;
				}
				if((jtf1.getText(whereRwe, 1).contains("1")) ||
						(jtf1.getText(whereRwe, 1).contains("2")) ||
						(jtf1.getText(whereRwe, 1).contains("3")) ||
						(jtf1.getText(whereRwe, 1).contains("4")) ||
						(jtf1.getText(whereRwe, 1).contains("5")) ||
						(jtf1.getText(whereRwe, 1).contains("6")) ||
						(jtf1.getText(whereRwe, 1).contains("7")) ||
						(jtf1.getText(whereRwe, 1).contains("8")) ||
						(jtf1.getText(whereRwe, 1).contains("9")) ||
						(jtf1.getText(whereRwe, 1).contains(".")) ||
						(jtf1.getText(whereRwe, 1).contains("x")) ||
						(jtf1.getText(whereRwe, 1).contains("0")) ||
						(jtf1.getText(whereRwe, 1).contains("e")) ||
						(jtf1.getText(whereRwe, 1).contains("p")) ||
						(jtf1.getText(whereRwe, 1).contains("w")))
						
						{
					Boolean stillanumer = true;
					int l = 0;
					int where = whereRwe;
					boolean negative = false;
					if(whereRwe > 0) {
						if(jtf1.getText(whereRwe - 1, 1).contains("~")) {
							negative = true;
						}
					}
					while((stillanumer == true)) {
						
						if((jtf1.getText(where, 1).contains("1")) ||
								(jtf1.getText(where, 1).contains("2")) ||
								(jtf1.getText(where, 1).contains("3")) ||
								(jtf1.getText(where, 1).contains("4")) ||
								(jtf1.getText(where, 1).contains("5")) ||
								(jtf1.getText(where, 1).contains("6")) ||
								(jtf1.getText(where, 1).contains("7")) ||
								(jtf1.getText(where, 1).contains("8")) ||
								(jtf1.getText(where, 1).contains("9")) ||
								(jtf1.getText(where, 1).contains(".")) ||
								(jtf1.getText(where, 1).contains("0")) ||
								(jtf1.getText(where, 1).contains("x")) ||
								(jtf1.getText(where, 1).contains("e")) ||
								(jtf1.getText(where, 1).contains("p")) ||
								(jtf1.getText(where, 1).contains("w")))
								{
							l++;
							where++;
							////**.out.println("num l = " + l);
								}
						else {
							stillanumer = false;
							//**.out.println("Not a numeber anymore");
							String nu = "";
							if(negative) {
								nu = jtf1.getText(whereRwe-1, l+1);
							}
							else {
							nu = jtf1.getText(whereRwe, l);
							}
							whereRwe = whereRwe + l;
							////**.out.println("whereRwe = "+whereRwe);
							num.addElement(nu);
							////**.out.println(num.get(listnum));
							listnum++;
						}
						////**.out.println("went through number sort loop");
					}
					//**.out.println("went through number sort loop");
				}
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if((jtf1.getText(whereRwe, 1).contains("+") == true) ||
						(jtf1.getText(whereRwe, 1).contains("-") == true) ||
						(jtf1.getText(whereRwe, 1).contains("*") == true) ||
						(jtf1.getText(whereRwe, 1).contains("/") == true) ||
						(jtf1.getText(whereRwe, 1).contains("^") == true)){
					String symbl = jtf1.getText(whereRwe, 1);
					whereRwe++;
					num.addElement(symbl);
					listnum++;
					//**.out.println("went through operator sort loop");
				}
			} catch (BadLocationException e) {
				e.printStackTrace();
				
			}
			try {
				int wh = whereRwe;
				int parz = 0;
				if((jtf1.getText(wh, 1).contains("(") == true) ||
						(jtf1.getText(wh, 1).contains("s") == true) ||
						(jtf1.getText(wh, 1).contains("c") == true) ||
						(jtf1.getText(wh, 1).contains("t") == true) ||
						(jtf1.getText(wh, 1).contains("l") == true) ||
						(jtf1.getText(wh, 1).contains("S") == true) ||
						(jtf1.getText(wh, 1).contains("C") == true) ||
						(jtf1.getText(wh, 1).contains("T") == true) ||
						(jtf1.getText(wh, 1).contains("a") == true) ||
						(jtf1.getText(wh, 1).contains("b") == true) ||
						(jtf1.getText(wh, 1).contains("d") == true) ||
						(jtf1.getText(wh, 1).contains("L") == true) ||
						(jtf1.getText(wh, 1).contains("v") == true) ||
						(jtf1.getText(wh, 1).contains("u") == true)
				){
					if(jtf1.getText(wh, 1).contains("(")) {
						parz = 1;
					}
					boolean negative = false;
					if(whereRwe > 0) {
						if(jtf1.getText(whereRwe - 1, 1).contains("~")) {
							negative = true;
						}
					}
					
					//**.out.println("entered par loop");
					
					boolean cont = true;
					int l2 = whereRwe + 1;
					int l = 1;
					while(cont == true) {
						if(jtf1.getText(l2, 1).contains("(")) {
							parz++;
						}
						if(jtf1.getText(l2, 1).contains(")")) {
							parz--;
							if(parz <= 0) {
								cont = false;
							}
							else {
								l++;
								l2++;
								wh++;
							}
						}
						else {
							l++;
							l2++;
							wh++;
						}
					}
					String par = "";
					if(negative) {
						par = jtf1.getText(whereRwe - 1, l+2);
					}
					else {
						par = jtf1.getText(whereRwe, l+1);
					}
					whereRwe = whereRwe + l + 1;
					num.addElement(par);
					//System.out.println(num.get(listnum)); //TODO remove after testing
					listnum++;
					
				}
			}
			catch(Exception err6) {
				//**.out.println("could not enter par loop");
				moarneeded = true; //remove later
				whereRwe = jtf1.getText().length();
			}
			
			
			
		
			
			
			//**.out.println("end of loop whereRwe = " + whereRwe);
		}
		int print = 0;
		while(print < num.getSize()) {
			//**.out.println(num.get(print));
			print++;
		}
		//**.out.println("escaped loop #1");
		int ev = 0;
		int eg = num.getSize();
		while(ev < eg) {
			try {
			if(num.get(ev).toString().contains("(")) {
				moarneeded = true;
				//**.out.println("( check loop " + moarneeded);
			}}
			catch(Exception err4) {
				err4.printStackTrace();
			}
			ev++;
		}
		//**.out.println("escaped loop #2");
		
		
		
		
		//WARNING: Complicated stuff below!!!!!!!!!!!!!!!!!!!!!
		listolists = new DefaultListModel();
		listolists.clear();
		int copy = 0;
		while(copy < num.getSize()) {
			listolists.add(copy, num.get(copy));
			copy++;
		}
		if(moarneeded == true) {
			//add while loop for solving the equation multipletimes
			jtfinvisi = new JTextField(5);
			//copy this to nest
				nulst = this.slph(listolists);
		}
			//end copy this
			
		int sc = 0;
		numcalc.clear();
		int scv = listolists.getSize();
		while(sc<scv) {
			numcalc.add(sc, listolists.get(sc));
			sc++;
		}
		togo = numcalc.getSize();
		//}
		int eqsv = 0;
		//pre-process here
		
		while(eqsv < togo) { //pre-process the #'s
			String negate = "";
			if(numcalc.get(eqsv).toString().contains("~")) {
				negate = "~";
			}
			String y = "";
			
			if(numcalc.get(eqsv).toString().contains("x")) {
				 y = negate + Double.toString(interval);
			}
			else if(numcalc.get(eqsv).toString().contains("w")){
				y = negate + Double.toString(w);
			}
			else if(numcalc.get(eqsv).toString().contains("e")) {
				 y = negate + Double.toString(Math.E);
			}
			else if(numcalc.get(eqsv).toString().contains("p")) {
				 y = negate + Double.toString(Math.PI);
			}
			else {
					y = numcalc.get(eqsv).toString();
			}
			
			numcalc.remove(eqsv);
			//eqsv = eqsv-1;
			numcalc.add(eqsv, y);
			togo = numcalc.getSize();
			
			eqsv++;
		}
		
		//end pre-process
		
		eqsv = 0;
		int mI = 1;
	while (eqsv < togo) {
		if(numcalc.get(eqsv).toString().contains("^")) {
			double y = 0;
			double x = 0;
			mI = 1;
			if(numcalc.get(eqsv-1).toString().contains("~")) {
				y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
				mI = -1;
			}
			else if(numcalc.get(eqsv-1).toString().contains("0--")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
				mI = -1;
			}
			else if(numcalc.get(eqsv-1).toString().contains("0-")) {
				y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
				mI = -1;
			}
			else {
				 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
			}
			if (numcalc.get(eqsv+1).toString().contains("~")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0--")) {
				x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0-")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
			}
			else {
				 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
			}
			
			double newnum = mI*Math.pow(y, x); //check this
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			eqsv = eqsv-1;
			numcalc.add(eqsv, newnum);
			togo = numcalc.getSize();
			//**.out.println("^ loop");
		}
		eqsv++;
	}
	eqsv = 0;
	togo = numcalc.getSize();
	while (eqsv < togo) {
		if((numcalc.get(eqsv).toString().contains("*")))
				{
			double y = 0;
			double x = 0;
			
			if(numcalc.get(eqsv-1).toString().contains("~")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0--")) {
				y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0-")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
			}
			else {
				 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
			}
			if (numcalc.get(eqsv+1).toString().contains("~")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0--")) {
				x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0-")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
			}
			else {
				 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
			}
			
			double newnum = y * x;
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			eqsv = eqsv - 1;
			numcalc.add(eqsv, newnum);
			togo = numcalc.getSize();
			//**.out.println("* loop");
		}
		eqsv++;
	}
	
	eqsv = 0;
	togo = numcalc.getSize();
	while (eqsv < togo) {
		if((numcalc.get(eqsv).toString().contains("/")))
				{
			double y = 0;
			double x = 0;
			
			if(numcalc.get(eqsv-1).toString().contains("~")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0--")) {
				y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0-")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
			}
			else {
				 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
			}
			if (numcalc.get(eqsv+1).toString().contains("~")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0--")) {
				x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0-")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
			}
			else {
				 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
			}
			
			double newnum = y / x;
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			eqsv = eqsv - 1;
			numcalc.add(eqsv, newnum);
			togo = numcalc.getSize();
			//**.out.println("/ loop");
		}
		eqsv++;
	}
	
	eqsv = 0;
	togo = numcalc.getSize();
	while (eqsv < togo) { //loop join complete
		if((numcalc.get(eqsv).toString().contains("+")))
				{
			double y = 0;
			double x = 0;
			
			if(numcalc.get(eqsv-1).toString().contains("~")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0--")) {
				y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
			}
			else if(numcalc.get(eqsv-1).toString().contains("0-")) {
				y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
			}
			else {
				 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
			}
			if (numcalc.get(eqsv+1).toString().contains("~")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0--")) {
				x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
			}
			else if(numcalc.get(eqsv+1).toString().contains("0-")) {
				x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
			}
			else {
				 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
			}
			
			double newnum = y + x;
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			numcalc.remove(eqsv-1);
			eqsv = eqsv - 1;
			numcalc.add(eqsv, newnum);
			togo = numcalc.getSize();
			//**.out.println("+ loop");
		}
		else if((numcalc.get(eqsv).toString().contains("-")) && (numcalc.get(eqsv).toString().length() == 1))
		{ //**.out.println(numcalc.get(eqsv).toString());
	double y = 0;
	double x = 0;
	
	if(numcalc.get(eqsv-1).toString().contains("~")) {
		y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(1));
	}
	else if(numcalc.get(eqsv-1).toString().contains("0--")) {
		y = Double.parseDouble(numcalc.get(eqsv-1).toString().substring(3));
	}
	else if(numcalc.get(eqsv-1).toString().contains("0-")) {
		y = -Double.parseDouble(numcalc.get(eqsv-1).toString().substring(2));
	}
	else {
		 y = Double.parseDouble(numcalc.get(eqsv-1).toString());
	}
	if (numcalc.get(eqsv+1).toString().contains("~")) {
		x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(1));
	}
	else if(numcalc.get(eqsv+1).toString().contains("0--")) {
		x = Double.parseDouble(numcalc.get(eqsv+1).toString().substring(3));
	}
	else if(numcalc.get(eqsv+1).toString().contains("0-")) {
		x = -Double.parseDouble(numcalc.get(eqsv+1).toString().substring(2));
	}
	else {
		 x = Double.parseDouble(numcalc.get(eqsv+1).toString());
	}
	
	double newnum = y - x;
	numcalc.remove(eqsv-1);
	numcalc.remove(eqsv-1);
	numcalc.remove(eqsv-1);
	eqsv = eqsv - 1;
	numcalc.add(eqsv, newnum);
	togo = numcalc.getSize();
	//**.out.println("- loop");
}
		
		eqsv++;
	}
	if(numcalc.get(0).toString().contains("~")) {
		ans = -Double.parseDouble(numcalc.get(0).toString().substring(1));
	}
	else if(numcalc.get(0).toString().contains("0--")) {
		ans = Double.parseDouble(numcalc.get(0).toString().substring(3));
	}
	else if(numcalc.get(0).toString().contains("0-")) {
		ans = -Double.parseDouble(numcalc.get(0).toString().substring(2));
	}
	else {
		ans = Double.parseDouble(numcalc.get(0).toString());
	}
	
	//**.out.println("ans = " + ans);
	
	
	
		}
			
		}
		}
		
	

