import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

//writes and reads RPG files
public class RPG {
	private static PrintWriter RPGc = null;
	private static BufferedReader RPGr = null;
	private static JFileChooser slekt= new JFileChooser();
	private static JFrame jf = new JFrame();
	private static ImageIcon rp = new ImageIcon(Red_Phial_Graphing_Utility.class.getResource("/RP.png"));
	private static int muvy = 0;
	private static int muvx = 0;
	private static boolean rectangle;
	private static boolean polar;
	private static boolean nms;
	private static double xscale = 1;
	private static double yscale = 1;
	private static Color bgr = null;
	private static Color ax = null;
	private static Color rec = null;
	private static Color pol = null;
	private static boolean iserrd = false;
	private static boolean cancelled = false;
	private static boolean exportable = true;
	static File path = null;
	static File name = null;
	static String overall = null;
	private static FileNameExtensionFilter f2 = new FileNameExtensionFilter("Red Phial Graph" ,"RPG");
	private static FileNameExtensionFilter f3 = new FileNameExtensionFilter("Comma Separated Values","csv");
	public static void export(DefaultListModel masterlist, DefaultListModel eq, DefaultListModel ignrlst, DefaultListModel slop) {
		jf.setIconImage(rp.getImage());
		slekt.removeChoosableFileFilter(f2);
		slekt.addChoosableFileFilter(f3);
		slekt.setAcceptAllFileFilterUsed(false);
		int decide = slekt.showSaveDialog(jf);
		if(decide == JFileChooser.APPROVE_OPTION) {
		path = slekt.getCurrentDirectory();
		name = slekt.getSelectedFile();
		overall = path + "/" + slekt.getName(name) + ".csv";
		try {
			RPGc = new PrintWriter(new FileWriter(overall));
			int size=masterlist.getSize();
			int cntr = 0;
			while(cntr<size) {
				if(Boolean.parseBoolean(ignrlst.get(cntr).toString()) == false) {
					if(Boolean.parseBoolean(slop.get(cntr).toString()) == false) {
						String bean = eq.get(cntr).toString();
						if(eq.get(cntr).toString().contains(",")) {
							bean = bean.substring(0,eq.get(cntr).toString().indexOf(":"));
						}
						
					RPGc.print(bean + " x," + bean + " y,");
					}
					else {
						RPGc.print(eq.get(cntr) + " x," + eq.get(cntr) + " y," + eq.get(cntr) + " dy/dx,");
					}
				}
				cntr++;
			}
			RPGc.println();
			cntr = 0;
			int max = 0;
			while(cntr<size) {
				if(Boolean.parseBoolean(ignrlst.get(cntr).toString()) == false) {
					if(((DefaultListModel) masterlist.get(cntr)).size() > max) {
						max = ((DefaultListModel) masterlist.get(cntr)).size();
						if(Boolean.parseBoolean(slop.get(cntr).toString())) {
						try {
							max = (int) (max/1.5);
						}
						catch(Exception err) {
							System.out.println("that trick didn't wurk.");
						}
					}
						//System.out.println(((DefaultListModel) masterlist.get(cntr)).size());
					}
				}
				cntr++;
			}
			cntr = 0;
			int cntr2 = 0;
			int addr = 0;
			while(cntr<max) {
				cntr2 = 0;
				while(cntr2<size) {
					if(Boolean.parseBoolean(ignrlst.get(cntr2).toString()) == false) {
						if(Boolean.parseBoolean(slop.get(cntr2).toString()) == false) {
							
						try {
							double x = Double.parseDouble(((DefaultListModel) masterlist.get(cntr2)).get(cntr).toString());
							double y = Double.parseDouble(((DefaultListModel) masterlist.get(cntr2)).get(cntr+1).toString());
							RPGc.print(x + "," + y + ",");
						}
						catch(Exception err) {
							RPGc.print("0,0,");
						}
						}
						else {
							try {
							addr = (int) (cntr*1.5);
							}
							catch(Exception err) {
								System.out.println("problem with slopefield exportation index");
							}
							try {
								double x = Double.parseDouble(((DefaultListModel) masterlist.get(cntr2)).get(addr).toString());
								double y = Double.parseDouble(((DefaultListModel) masterlist.get(cntr2)).get(addr+1).toString());
								double dydx = Double.parseDouble(((DefaultListModel) masterlist.get(cntr2)).get(addr+2).toString());
								RPGc.print(x + "," + y + "," + dydx + ",");
							}
							catch(Exception err) {
								RPGc.print("0,0,0,");
							}
						}
					}
					cntr2++;
				}
				RPGc.println();
				cntr=cntr+2;
			}
			RPGc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public static void write(int muvx, int muvy, double xscale, double yscale, DefaultListModel masterlist, DefaultListModel col, DefaultListModel isitpolar, DefaultListModel slop, DefaultListModel eq, Color bgr, Color ax, Color rec, Color pol, Boolean rectangle, Boolean polar, Boolean nms, DefaultListModel ignrlst, DefaultListModel mstr2) {
		jf.setIconImage(rp.getImage());
		slekt.removeChoosableFileFilter(f3);
		slekt.addChoosableFileFilter(f2);
		slekt.setAcceptAllFileFilterUsed(false);
		int decide = slekt.showSaveDialog(jf);
		if(decide == JFileChooser.APPROVE_OPTION) {
		path = slekt.getCurrentDirectory();
		name = slekt.getSelectedFile();
		overall = path + "/" + slekt.getName(name) + ".RPG";
		try {
			RPGc = new PrintWriter(new FileWriter(overall));
			RPGc.println(nms);
			RPGc.println(rectangle);
			RPGc.println(polar);
			RPGc.println(muvx);
			RPGc.println(muvy);
			RPGc.println(xscale);
			RPGc.println(yscale);
			RPGc.println(bgr.getRed());
			RPGc.println(bgr.getGreen());
			RPGc.println(bgr.getBlue());
			RPGc.println(ax.getRed());
			RPGc.println(ax.getGreen());
			RPGc.println(ax.getBlue());
            RPGc.println(rec.getRed());
            RPGc.println(rec.getGreen());
            RPGc.println(rec.getBlue());
            RPGc.println(pol.getRed());
            RPGc.println(pol.getGreen());
            RPGc.println(pol.getBlue());
            //lines one through four deal with color
            int igsz = ignrlst.getSize();
            int scn = 0;
            int fls = 0;
            while(scn < igsz) {
            	if(Boolean.parseBoolean(ignrlst.get(scn).toString())) {
            		fls++;
            	}
            	scn++;
            }
            int colorlistsize = col.getSize();
            RPGc.println(colorlistsize-fls);  //line five, color list size
            int color = 0;
            while(color < colorlistsize) {
            	if(Boolean.parseBoolean(ignrlst.get(color).toString()) == false) {
            	RPGc.println(((Color) col.get(color)).getRed());
            	RPGc.println(((Color) col.get(color)).getGreen());
            	RPGc.println(((Color) col.get(color)).getBlue());
            	}
            	color++;
            }
            int isitpolarsize = isitpolar.getSize();
            RPGc.println(isitpolarsize-fls);
            int isitpolarn = 0;
            while(isitpolarn < isitpolarsize) {
            	if(Boolean.parseBoolean(ignrlst.get(isitpolarn).toString()) == false) {
            	RPGc.println(isitpolar.get(isitpolarn));
            	}
            	isitpolarn++;
            }
            int slopsize = slop.getSize();
            RPGc.println(slopsize-fls);
            int slope = 0;
            while(slope < slopsize) {
            	if(Boolean.parseBoolean(ignrlst.get(slope).toString()) == false) {
            	RPGc.println(slop.get(slope)); 
            	}
            	slope++;
            }
            int eqsize = eq.getSize();
            RPGc.println(eqsize-fls);
            slope = 0;
            while(slope < eqsize) {
            	if(Boolean.parseBoolean(ignrlst.get(slope).toString()) == false) {
            	RPGc.println(eq.get(slope));
            	}
            	slope++;
            }
            int masterlistsize = masterlist.getSize();
            RPGc.println(masterlistsize-fls);
            int mstr = 0;
            int subsize;
            int subcount = 0;
            while(mstr < masterlistsize) {
            	if(Boolean.parseBoolean(ignrlst.get(mstr).toString()) == false) {
            	subsize = ((DefaultListModel) masterlist.get(mstr)).getSize();
            	RPGc.println(subsize);
            	subcount = 0;
            	while(subcount < subsize) {
            		RPGc.println(((DefaultListModel) masterlist.get(mstr)).get(subcount));
            		subcount++;
            	}
            	}
            	mstr++;
            }
            //export data
            mstr = 0;
            subcount = 0;
            while(mstr < masterlistsize) {
            	if(Boolean.parseBoolean(ignrlst.get(mstr).toString()) == false) {
            	subsize = ((DefaultListModel) mstr2.get(mstr)).getSize();
            	RPGc.println(subsize);
            	subcount = 0;
            	while(subcount < subsize) {
            		RPGc.println(((DefaultListModel) mstr2.get(mstr)).get(subcount));
            		subcount++;
            	}
            	}
            	mstr++;
            }
            //export data
            RPGc.close();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	public static void read(DefaultListModel masterlist, DefaultListModel col, DefaultListModel isitpolar, DefaultListModel slop, DefaultListModel eq, DefaultListModel mstr2) {
		iserrd = false;
		slekt.removeChoosableFileFilter(f3);
		slekt.addChoosableFileFilter(f2);
		slekt.setAcceptAllFileFilterUsed(false);
		int decide = slekt.showOpenDialog(jf);
		if(decide == JFileChooser.APPROVE_OPTION) {
			cancelled = false;
		path = slekt.getCurrentDirectory();
		name = slekt.getSelectedFile();
		overall = path + "/" + slekt.getName(name);
		File actual = new File(overall);
		actual.getParentFile().mkdirs();
		masterlist.clear();
		mstr2.clear();
		slop.clear();
		eq.clear();
		isitpolar.clear();
		col.clear();
		try {
			RPGr = new BufferedReader(new FileReader(actual));
			nms = Boolean.parseBoolean(RPGr.readLine());
			rectangle = Boolean.parseBoolean(RPGr.readLine());
			polar = Boolean.parseBoolean(RPGr.readLine());
			muvx = Integer.parseInt(RPGr.readLine().toString());
			muvy = Integer.parseInt(RPGr.readLine().toString());
			xscale = Double.parseDouble(RPGr.readLine().toString());
			yscale = Double.parseDouble(RPGr.readLine().toString());
			Color recovr = null;
			int red = 0;
			int green = 0;
			int blue = 0;
			try {
				red = Integer.parseInt(RPGr.readLine().toString());
				green = Integer.parseInt(RPGr.readLine().toString());
				blue = Integer.parseInt(RPGr.readLine().toString());
				recovr = new Color(red, green, blue);
				bgr = recovr;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				iserrd = true;
				bgr = Color.white;
			}
			try {
				red = Integer.parseInt(RPGr.readLine().toString());
				green = Integer.parseInt(RPGr.readLine().toString());
				blue = Integer.parseInt(RPGr.readLine().toString());
				recovr = new Color(red, green, blue);
				ax = recovr;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				iserrd = true;
				ax = Color.BLACK;
			}
			try {
				red = Integer.parseInt(RPGr.readLine().toString());
				green = Integer.parseInt(RPGr.readLine().toString());
				blue = Integer.parseInt(RPGr.readLine().toString());
				recovr = new Color(red, green, blue);
				rec = recovr;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				iserrd = true;
				rec = new Color(255, 125, 0);
			}
			try {
				red = Integer.parseInt(RPGr.readLine().toString());
				green = Integer.parseInt(RPGr.readLine().toString());
				blue = Integer.parseInt(RPGr.readLine().toString());
				recovr = new Color(red, green, blue);
				pol = recovr;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				iserrd = true;
				pol = new Color(150, 170, 255);
			}
			
			try {
				int colsize = Integer.parseInt(RPGr.readLine().toString());
				int iteration = 0;
				while(iteration < colsize) {
					red = Integer.parseInt(RPGr.readLine().toString());
					green = Integer.parseInt(RPGr.readLine().toString());
					blue = Integer.parseInt(RPGr.readLine().toString());
					recovr = new Color(red, green, blue);
					col.add(iteration, recovr);
					iteration++;
				}
				int isitpolarsize = Integer.parseInt(RPGr.readLine().toString());
				iteration = 0;
				while(iteration < isitpolarsize) {
					isitpolar.add(iteration, Boolean.parseBoolean(RPGr.readLine()));
					iteration++;
				}
				int slopsize = Integer.parseInt(RPGr.readLine().toString());
				iteration = 0;
				while(iteration < slopsize) {
					slop.add(iteration, Boolean.parseBoolean(RPGr.readLine()));
					iteration++;
				}
				int eqsize = Integer.parseInt(RPGr.readLine().toString());
				iteration = 0;
				while(iteration < eqsize) {
					eq.add(iteration, RPGr.readLine());
					iteration++;
				}
				int masterlistsize = Integer.parseInt(RPGr.readLine().toString());
				iteration = 0;
				int subiteration = 0;
				int subsize = 0;
				while(iteration < masterlistsize) {
					subiteration = 0;
					subsize = Integer.parseInt(RPGr.readLine().toString());
					masterlist.addElement(new DefaultListModel());
					while(subiteration < subsize) {
						((DefaultListModel) masterlist.get(iteration)).addElement(Integer.parseInt(RPGr.readLine().toString()));
						subiteration++;
					}
					iteration++;
				}
				
				//import data
				iteration = 0;
				subiteration = 0;
				subsize = 0;
				try {
				while(iteration < masterlistsize) {
					subiteration = 0;
					subsize = Integer.parseInt(RPGr.readLine().toString());
					mstr2.addElement(new DefaultListModel());
					while(subiteration < subsize) {
						((DefaultListModel) mstr2.get(iteration)).addElement(Double.parseDouble(RPGr.readLine().toString()));
						subiteration++;
					}
					iteration++;
				}
				exportable = true;
				}
				catch(Exception err) {
					while(iteration < masterlistsize) {
						mstr2.addElement(new DefaultListModel());
						iteration++;
					}
					//err.printStackTrace();
					exportable = false;
				}
				//import data
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				iserrd = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				iserrd = true;
			}
			RPGr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			iserrd = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			iserrd = true;
		}
		}
		else {
			cancelled = true;
		}
		
		
	}
	public static boolean isCancelled() {
		return cancelled;
	}
	public static Color getBgr() {
		return bgr;
	}
	public static Color getAx() {
		return ax;
	}
	public static Color getRec() {
		return rec;
	}
	public static Color getPol() {
		return pol;
	}
	public static int getMuvx() {
		return muvx;
	}
	public static int getMuvy() {
		return muvy;
	}
	public static double getXscale() {
		return xscale;
	}
	public static double getYscale() {
		return yscale;
	}
	public static boolean getnms() {
		return nms;
	}
	public static boolean getrectangle() {
		return rectangle;
	}
	public static boolean getpolar() {
		return polar;
	}
	public static boolean getErr() {
		return iserrd;
	}
	public static boolean getExportable() {
		return exportable;
	}

}
