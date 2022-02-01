
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.awt.Shape;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.beans.PropertyChangeEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;

class RowHeaderRenderer extends JLabel implements ListCellRenderer {

	  RowHeaderRenderer(JTable table) {
	    JTableHeader header = table.getTableHeader();
	    setOpaque(true);
	    setBorder(UIManager.getBorder("TableHeader.cellBorder"));
	    setHorizontalAlignment(CENTER);
	    setForeground(header.getForeground());
	    setBackground(header.getBackground());
	    setFont(header.getFont());
	  }

	  public Component getListCellRendererComponent(JList list, Object value,
	      int index, boolean isSelected, boolean cellHasFocus) {
	    setText((value == null) ? "" : value.toString());
	    return this;
	  }
	}


public class Red_Phial_Graphing_Utility extends JPanel implements Runnable{
	private static JFrame jf1 = new JFrame("Red Phial Graphing Utility");
	private static JFrame mst = new JFrame("Red Phial Graphing Utility");
	private static JFrame jfpropertez = new JFrame("Red Phial Graphing Utility");
	private static JFrame sam = new JFrame("Red Phial Graphing Utility");
	public static boolean polar = false;
	public static boolean rectangle = true;
	public static int start = 0;
	public static JButton jbt1 = new JButton("Graph");
	public static JTextField jtf1 = new JTextField(15);
	public static int listnum = 0;
	public static double dx = .25;
	public static int origin = 0;
	public static boolean moarneeded = false;
	public static double interval = origin - 10;
	public static boolean alt = false;
	public static int togo = 0;
	public static DefaultListModel eq = new DefaultListModel();
	public static DefaultListModel col = new DefaultListModel();
	public static int colorchangeindex = 0;
	public static Color bgr = new Color(255, 255, 255);
	public static Color rec = new Color(255, 125, 0);
	public static Color ax = new Color(0, 0, 0);
	public static Color pol = new Color(150, 170, 255);
	public static double xscale = 1; //test
	public static double yscale = 1;
	public static ImageIcon rp = new ImageIcon(Red_Phial_Graphing_Utility.class.getResource("/RP.png"));
	public static DefaultListModel isitpolar = new DefaultListModel();
	public static int muvx = 0;
	public static int muvy = 0;
	public static int d = 0;
	public static double previnterval;
	public static int param1 = -10;
	public static int param2 = 10;
	public static DefaultListModel process = new DefaultListModel(); 
	public static JTable tab;
	public static int ros = 20;
	public static double interv = 1;
	public static double tablestart2 = 0;
	public static int polaradd = 1;
	public static double w = 0;
	public static DefaultListModel slop = new DefaultListModel();
	public static int cntr = 0;
	public static int cntr2 = 0;
	public static double dxr = 0.125;
	public static double dxp = 0.05;
	public static boolean nms = true;
	public static DecimalFormat df= new DecimalFormat("0.0E00");
	public static DecimalFormat df2 = new DecimalFormat("000.0");
	public static DecimalFormat df3 = new DecimalFormat("00.0");
	public static DecimalFormat df4 = new DecimalFormat("0.00");
	public static String dr = null;
	public static String dr2 = null;
	private static EquationProcessingUnit EPU = new EquationProcessingUnit("0", 0, 0);
	public static int ct = 0;
	private static JProgressBar jp = new JProgressBar();
	private static JProgressBar jpmain = new JProgressBar();
	private static JFrame jpjf = new JFrame("Red Phial Graphing Utility");
	private static JPanel jpjp = new JPanel();
	private static JPanel jpjp21 = new JPanel();
	private static int load = 0;
	private static int progress = 0;
	private static boolean saulvabul;
	public static boolean exportable = false;
	private static JTextField jtfstat;
	//private static int progressmain = 0;
	private static int ximes = 0;
	//private static double inc = 0;
	//private static String pr = ">";
	//private static int nuw = 0;
	//private static int previ = 0;
	//private static JPanel jpjp2 = new JPanel();
	private static JPanel jpjp3 = new JPanel();
	private static JPanel jpjp4 = new JPanel();
	private static JPanel jpjp5 = new JPanel();
	private static JLabel expander = new JLabel("<<<<<<<<<<<<<<<<<<<<<Progress>>>>>>>>>>>>>>>>>>>>>");
	public static DefaultListModel masterlist = new DefaultListModel();
	private static int comp1 = 0;
	private static int comp2 = 0;
	private static int selectionindex = 0;
	private static double lowest = 0;
	private static DefaultListModel zrz = new DefaultListModel();
	private static JFrame graph = new JFrame("Graph: SCA(" + xscale + ", " + yscale + "); CEN(" + muvx*xscale + ", " + muvy*yscale + ")");
	private static Derivative du = new Derivative(null, 0);
	private static boolean v155 = false;
	private static int revs = 0;
	private static int polarmultiplier = 3;
	private static Invert i2 = new Invert();
	private static DefaultListModel iglst = new DefaultListModel();
	private static boolean ready = true;
	private static int polar1mult = 1;
	private static int normalmult = 1;
	//private static int slopmult = 1;
	private static int lambdaprogress = 0;
	private static JTextField des = new JTextField(20);
	private static DefaultListModel prosd = new DefaultListModel();
	private static int currentindx = 0;
	//private static JFrame dframe = new JFrame("Red Phial Graphing Utility");
	//private static JPanel dpanel = new JPanel();
	private static Qphilter qph = new Qphilter();
	private static RK5 rk = new RK5(dr, dx, dx);
	private static JLabel des2 = new JLabel("Overall Progress");
	private static JMenuItem Echelon = new JMenuItem("Echelon Lab");
	private static JMenu Calcz = new JMenu("Calculation");
	private static JFrame systsze = new JFrame("Red Phial Graphing Utility");
	private static JPanel systpnl = new JPanel();
	private static JButton cncl = new JButton("Cancel");
	private static boolean stp = false;
	private static int stssz;
	private static JTable A;
	private static JTable B;
	private static JTextField xipt = new JTextField(5); 
	private static JTextField wipt = new JTextField(5);
	private static JTable O;
	private static JFrame nutf;
	private static DefaultListModel mstr2 = new DefaultListModel();
	
	//added for debugging purposes
	public static JFrame dframe = new JFrame("Red Phial LnSlv Debug Console");
	public static JPanel dpanel = new JPanel();
	public static JTextArea dtextarea = new JTextArea(25,50);
	public static JScrollPane dscrollpane = new JScrollPane(dtextarea);
	//end added for debugging purposes
	

	
	public void paintComponent(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255, 125, 0));
		g2d.setColor(bgr);
		g2d.fillRect(0, 0, 500, 500);
		
		
				//if(rectangle == true) {
					int dwd = 0;
					int axchk = 1;
					
					if(nms == true) {
						int ct = 0;
						int p1 = 41;
						int nwsvrng = -8;
						double apply = 0;
						double apply2 = 0;
						while (ct <= 8) {
							apply = (nwsvrng+muvx)*xscale;
							apply2 = (-nwsvrng+muvy)*yscale;
							if((Math.abs(apply) >= 1000) || (Math.abs(apply) <= 0.1)) {
								dr = df.format(apply).toLowerCase();
								
							}
							else if(Math.abs(apply) >= 100) {
								dr = df2.format(apply).toLowerCase();
								
							}
							else if (Math.abs(apply) >= 10) {
								dr = df3.format(apply).toLowerCase();
								
							}
							else {
								dr = df4.format(apply).toLowerCase();
								
							}
							if((Math.abs(apply2) >= 1000) || (Math.abs(apply2) <= 0.1)) {
								dr2 = df.format(apply2).toLowerCase();
							}
							else if(Math.abs(apply2) >= 100) {
								dr2 = df2.format(apply2).toLowerCase();
							}
							else if (Math.abs(apply2) >= 10) {
								dr2 = df3.format(apply2).toLowerCase();
							}
							else {
								dr2 = df4.format(apply2).toLowerCase();	
							}
							g2d.setColor(ax);
							g2d.drawString(dr, p1-1, 490);
							g2d.drawString(dr2, 454, p1+9);
							ct++;
							nwsvrng= nwsvrng+2;
							p1 = p1 + 50;
						}
					}
					
					while(dwd <= 500) {
						axchk = muvx + ((dwd/25)-10);
						if(axchk == 0) {
							g2d.setColor(ax);
							g2d.drawLine(dwd, 0, dwd, 500);
							dwd = dwd + 25;
						}
						else {
							if(rectangle == true) {
							g2d.setColor(rec);
							g2d.drawLine(dwd, 0, dwd, 500);
							}
							dwd = dwd + 25;
							
						}
					}
					dwd = 0;
					while(dwd <= 500) {
						axchk = -muvy + ((dwd/25)-10);
						if(axchk == 0) {
							g2d.setColor(ax);
							g2d.drawLine(0, dwd, 500, dwd);
							dwd = dwd + 25;
						}
						else {
							
							if(rectangle == true) {
								
							g2d.setColor(rec);
							g2d.drawLine(0, dwd, 500, dwd);
							
							}
							dwd = dwd + 25;
						}
					}
				//}
				
				if(polar == true) {
					if((muvx != 0) || (muvy != 0)) {
						polar = false;
					}
					else {
					g2d.setColor(ax);
					g2d.drawLine(250, 0, 250, 500);
					g2d.drawLine(0, 250, 500, 250);
					
					g2d.setColor(pol);
					g2d.drawLine(0, 0, 500, 500);
					g2d.drawLine(500, 0, 0, 500);
					g2d.drawOval(225, 225, 50, 50);
					g2d.drawOval(200, 200, 100, 100);
					g2d.drawOval(175, 175, 150, 150);
					g2d.drawOval(150, 150, 200, 200);
					g2d.drawOval(125, 125, 250, 250);
					g2d.drawOval(100, 100, 300, 300);
					g2d.drawOval(75, 75, 350, 350);
					g2d.drawOval(50, 50, 400, 400);
					g2d.drawOval(25, 25, 450, 450);
					g2d.drawOval(0, 0, 500, 500);
					g2d.drawLine(106, 500, 394, 0);
					g2d.drawLine(106, 0, 394, 500);
					g2d.drawLine(500, 106, 0, 394);
					g2d.drawLine(0, 106, 500, 394);
					g2d.drawLine(183, 500, 317, 0);
					g2d.drawLine(183, 0, 317, 500);
					g2d.drawLine(500, 183, 0, 317);
					g2d.drawLine(0, 183, 500, 317);
					}
				}
				
				int stat = 0;
				int substat = 0;
				while(stat < masterlist.getSize()) {
					boolean av = false;
					try {
						av = Boolean.parseBoolean(iglst.get(stat).toString());
					}
					catch(Exception err) {
						av = false;
					}
					if(av == false) {
					substat = 0;
					try {
					g2d.setColor((Color) col.get(stat));
					}
					catch(Exception err) {
						g2d.setColor(Color.RED);
					}
					
						if(Boolean.parseBoolean(slop.get(stat).toString())) {
							while(substat < ((DefaultListModel) masterlist.get(stat)).getSize()) {
							try {
							g2d.drawLine(Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+1).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+2).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+3).toString()));
							}
							catch(Exception err) {
								//**.out.println("substat = " + substat);
								substat = ((DefaultListModel) masterlist.get(stat)).getSize();
							}
							substat = substat + 4;
							//**.out.println("substat = " + substat);
							}
						}
						else {
							if(Boolean.parseBoolean(isitpolar.get(stat).toString())) {
								if((eq.get(stat).toString().contains("w") == false) || (eq.get(stat).toString().contains("x") == false)) {
								while(substat < ((DefaultListModel) masterlist.get(stat)).getSize()) {
									try{
										g2d.drawLine(Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+1).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+2).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+3).toString()));
									}
									catch(Exception err) {
										//**.out.println("substat = " + substat);
										substat = ((DefaultListModel) masterlist.get(stat)).getSize();
									}
									substat = substat +2;
								}
								}
								else {
									boolean allw = false;  //helps prevent unauthorized use of polar implicit beta
									//09/15/2017
									int iterationz = 0;
									DefaultListModel bacup = new DefaultListModel();
									while(iterationz < ((DefaultListModel) masterlist.get(stat)).getSize()) {
										bacup.addElement(((DefaultListModel) masterlist.get(stat)).get(iterationz));
										iterationz++;
									}
										try{
											boolean first2 = true;
											boolean later = true;
											int saveforlater1 = 0;
											int saveforlater2 = 0;
											while((bacup.getSize() > 2) && (allw)) {
												
												int subsubstat = 2;
												lowest = 1000;
												comp1 = (int) bacup.get(0);
												comp2 = (int) bacup.get(1);
												while(subsubstat+1 < bacup.getSize()) {
													if(Math.sqrt(Math.pow(Math.abs(comp1-Integer.parseInt(bacup.get(subsubstat).toString())), 2) + Math.pow(Math.abs(comp2-Integer.parseInt(bacup.get(subsubstat+1).toString())), 2)) < lowest) {
														lowest = Math.sqrt(Math.pow(Math.abs(comp1-Integer.parseInt(bacup.get(subsubstat).toString())), 2) + Math.pow(Math.abs(comp2-Integer.parseInt(bacup.get(subsubstat+1).toString())), 2));
														selectionindex = subsubstat;
													}
													
													subsubstat = subsubstat + 2;
												}
												if(lowest < 50) {
													g2d.drawLine(comp1, comp2, Integer.parseInt(bacup.get(selectionindex).toString()), Integer.parseInt(bacup.get(selectionindex+1).toString()));
												}
												if((first2 == false) && (later == true)) {
													bacup.addElement(saveforlater1);
													bacup.addElement(saveforlater2);
													later = false;
												}
												if(first2 == true) {
													saveforlater1 = Integer.parseInt((bacup.get(0).toString()));
													saveforlater2 = Integer.parseInt((bacup.get(1).toString()));
													first2 = false;
												}
													////**.out.println("Now connecting: " + comp1 + ", " + comp2 + ", " + Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(selectionindex).toString()) + ", " + Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(selectionindex+1).toString()));
													bacup.remove(0);
													bacup.remove(0);
													bacup.add(0, bacup.get(selectionindex-2));
													bacup.add(1, bacup.get(selectionindex));
													bacup.remove(selectionindex + 1);
													bacup.remove(selectionindex);
													comp1 = (int) bacup.get(0);
													comp2 = (int) bacup.get(1);
											}
										
										}
										catch(Exception err) {
											////**.out.println("err: substat = " + substat);
											//err.printStackTrace();
											iterationz = ((DefaultListModel) masterlist.get(stat)).getSize();
										}
								}
							}
							else {
								if((eq.get(stat).toString().contains("w") == false) || (eq.get(stat).toString().contains("x") == false) || (eq.get(stat).toString().contains("y"))) {
								while(substat < ((DefaultListModel) masterlist.get(stat)).getSize()) {
									try{
										lowest = Math.sqrt(Math.pow(Math.abs(Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat).toString())-Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+2).toString())), 2) + Math.pow(Math.abs(Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+1).toString())-Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+3).toString())), 2));
										if(eq.get(stat).toString().contains("y'=")) {
										if((lowest < 400)) {
										g2d.drawLine(Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+1).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+2).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+3).toString()));
										}
										}
										else {
											//int tx1 = Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat).toString());
											int ty1 = Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+1).toString());
											//int tx2 = Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+2).toString());
											int ty2 = Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+3).toString());
											
											if((Math.abs(ty1) < 90000000) && (Math.abs(ty2) < 90000000)) {
											g2d.drawLine(Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+1).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+2).toString()), Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(substat+3).toString()));
											}
										}
									}
									catch(Exception err) {
										//**.out.println("substat = " + substat);
										substat = ((DefaultListModel) masterlist.get(stat)).getSize();
									}
									substat = substat + 2;
								}
								}
								else {
									int iterationz = 0;
									DefaultListModel bacup = new DefaultListModel();
									while(iterationz < ((DefaultListModel) masterlist.get(stat)).getSize()) {
										bacup.addElement(((DefaultListModel) masterlist.get(stat)).get(iterationz));
										iterationz++;
									}
										try{
											boolean first2 = true;
											boolean later = true;
											int saveforlater1 = 0;
											int saveforlater2 = 0;
											while(bacup.getSize() > 2) {
												
												int subsubstat = 2;
												lowest = 1000;
												comp1 = (int) bacup.get(0);
												comp2 = (int) bacup.get(1);
												while(subsubstat+1 < bacup.getSize()) {
													if(Math.sqrt(Math.pow(Math.abs(comp1-Integer.parseInt(bacup.get(subsubstat).toString())), 2) + Math.pow(Math.abs(comp2-Integer.parseInt(bacup.get(subsubstat+1).toString())), 2)) < lowest) {
														lowest = Math.sqrt(Math.pow(Math.abs(comp1-Integer.parseInt(bacup.get(subsubstat).toString())), 2) + Math.pow(Math.abs(comp2-Integer.parseInt(bacup.get(subsubstat+1).toString())), 2));
														selectionindex = subsubstat;
													}
													
													subsubstat = subsubstat + 2;
												}
												if(lowest < 50) {
													g2d.drawLine(comp1, comp2, Integer.parseInt(bacup.get(selectionindex).toString()), Integer.parseInt(bacup.get(selectionindex+1).toString()));
												}
												if((first2 == false) && (later == true)) {
													bacup.addElement(saveforlater1);
													bacup.addElement(saveforlater2);
													later = false;
												}
												if(first2 == true) {
													saveforlater1 = Integer.parseInt((bacup.get(0).toString()));
													saveforlater2 = Integer.parseInt((bacup.get(1).toString()));
													first2 = false;
												}
													////**.out.println("Now connecting: " + comp1 + ", " + comp2 + ", " + Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(selectionindex).toString()) + ", " + Integer.parseInt(((DefaultListModel) masterlist.get(stat)).get(selectionindex+1).toString()));
													bacup.remove(0);
													bacup.remove(0);
													bacup.add(0, bacup.get(selectionindex-2));
													bacup.add(1, bacup.get(selectionindex));
													bacup.remove(selectionindex + 1);
													bacup.remove(selectionindex);
													comp1 = (int) bacup.get(0);
													comp2 = (int) bacup.get(1);
											}
										
										}
										catch(Exception err) {
											////**.out.println("err: substat = " + substat);
											//err.printStackTrace();
											iterationz = ((DefaultListModel) masterlist.get(stat)).getSize();
										}
									
									
								}
									
								}
							
						}
					//insert
					}
					stat++;
				}
				
	}
	
	public void calculate(){
					//EXCITING STUFF HAPPENS RIGHT HERE!
		//masterlist.clear();
		int lsize = eq.getSize();
		ximes = 0;
		progress = 0;
		DefaultListModel dqs = new DefaultListModel();
		DefaultListModel dqs2 = new DefaultListModel(); //new
		while((ximes < lsize) && (stp == false)) { //start ximes loop
			if(Boolean.parseBoolean(iglst.get(ximes).toString()) == false) {
				if(Integer.parseInt(prosd.get(ximes).toString()) != 1) {
					try {
						masterlist.remove(ximes);
						mstr2.remove(ximes); //new
					}
					catch(Exception err) {
						
					}
			masterlist.add(ximes, new DefaultListModel());
			mstr2.add(ximes, new DefaultListModel()); //new
			boolean first = true;
			int eqsv = 0;
			double prev = 0;
			double nxt = 0;
			EPU.changeEq(eq.get(ximes).toString());
			ximes++;
			des.setText("processing: " + eq.get(ximes-1).toString());
						//try {
							//g2d.setColor((Color) col.get(ximes-1));
						//}
						//catch (Exception err) {
							//Toolkit.getDefaultToolkit().beep();
							//g2d.setColor(new Color(0, 0, 155));
							
						//}
			if(eq.get(ximes-1).toString().contains("y'=")) {
				//differential equation processing
				jp.setMaximum((int) Math.ceil((20*normalmult)/dxr));
				progress = 0;
				jp.setValue(progress);
				double ubound = (muvx + 10)*xscale;
				double lbound = (muvx - 10)*xscale;
				qph.setQ(eq.get(ximes-1).toString());
				qph.Qprosc();
				String eq = qph.getEq();
				double strt = qph.geticnx();
				double strtw = qph.geticnw();
				int numz = (int) Math.ceil((ubound-strt)/(dxr*xscale));
				int numz2 = (int) Math.ceil((21/(dxr))-numz)-1;
				double nux = strt;
				double nuw = strtw;
				boolean erred = false;
				rk.changeStep(-dxr*xscale);
				int cnt = 0;
				rk.changeEq(eq);
				int ctr1 = 0;
				double a = ((origin-(10))+muvx)*xscale;
				while((cnt < numz2) && (stp == false)) {
					rk.changeICon(nux, nuw);
					rk.RUNge();
					if(rk.isGood()) {
						nuw = rk.getLambda();
						nux = nux - (dxr*xscale);
						if((nux <= ubound) && (nux >= lbound)) {
							//System.out.println(a + "|" + nuw);
							int x2 = (int) Math.round((a/xscale+10-muvx)*25);
							int y2 = (int) Math.round((10-(nuw*1/yscale-muvy))*25);
							//System.out.println(y2); //TODO
							dqs.add(ctr1, y2);
							dqs.add(ctr1+1, x2);
							if(a >= strt) {
							dqs2.add(ctr1,a); //new
							dqs2.add(ctr1+1, nuw); //new
							}
							else {
								dqs2.add(ctr1,nuw); //new
								dqs2.add(ctr1+1, a); //new
							}
							ctr1++;
							ctr1++;
							a = a + (dxr*xscale);
							progress++;
							jp.setValue(progress);
						}
					}
					else {
						cnt = numz2;
						erred = true;
						System.out.println("errd");
					}
					cnt++;
					
				}
				int ctr2 = dqs.getSize();
				int ctr3 = 0;
				int indx = ctr2-1;
				int x = 0;
				int y = 0;
				System.out.println();
				while(ctr3 < ctr2) {
					((DefaultListModel) masterlist.get(ximes-1)).add(ctr3, Integer.parseInt(dqs.get(ctr3+1).toString()));
					((DefaultListModel) masterlist.get(ximes-1)).add(ctr3+1, Integer.parseInt(dqs.get(indx-1).toString()));
					((DefaultListModel) mstr2.get(ximes-1)).add(ctr3, Double.parseDouble(dqs2.get(ctr3+1).toString())); //new
					((DefaultListModel) mstr2.get(ximes-1)).add(ctr3+1, Double.parseDouble(dqs2.get(indx-1).toString())); //new
					indx = indx-2;
					ctr3 = ctr3 + 2;
				}
				dqs.clear();
				dqs2.clear(); //new
				cnt = 0;
				rk.changeStep(dxr*xscale);
				nux=strt;
				nuw=strtw;
				while((cnt < numz) && (stp == false)) {
					rk.changeICon(nux, nuw);
					rk.RUNge();
					if(rk.isGood()) {
						nuw = rk.getLambda();
						nux = nux + (dxr*xscale);
						if((nux <= ubound) && (nux >= lbound)) {
							//System.out.println(a + "|" + nuw);
							int x2 = (int) Math.round((a/xscale+10-muvx)*25);
							int y2 = (int) Math.round((10-(nuw*1/yscale-muvy))*25);
							((DefaultListModel) masterlist.get(ximes-1)).add(ctr1, x2);
							((DefaultListModel) masterlist.get(ximes-1)).add(ctr1+1, y2);
							((DefaultListModel) mstr2.get(ximes-1)).add(ctr1, a); //new
							((DefaultListModel) mstr2.get(ximes-1)).add(ctr1+1, nuw); //new
							ctr1++;
							ctr1++;
							a = a + (dxr*xscale);
							progress++;
							jp.setValue(progress);
						}
					}
					else {
						cnt = numz;
						erred = true;
						//System.out.println("errd");
					}
					cnt++;
					
				}
				nux=strt;
				nuw=strtw;
				if((nux <= ubound) && (nux >= lbound)) {
					int cu = 0;
					while((cu<21) && (false)) {  //WHATS THIS??
						if(lbound+dxr*cu == nux) {
							((DefaultListModel) mstr2.get(ximes-1)).add(cu, nuw); //new
							((DefaultListModel) masterlist.get(ximes-1)).add(cu, nuw);
						}
						cu++;
					}
				}
				lambdaprogress++;
				jpmain.setValue(lambdaprogress);
				//end differential equation processing
				
			}
			else {
						if(Boolean.parseBoolean(slop.get(ximes-1).toString()) == true) {
							des.setText("processing: " + eq.get(ximes-1).toString());
							jp.setMaximum(361);
							jp.setValue(0);
							progress = 0;
							cntr = -9;
							cntr2 = -9;
							ct = 0;
							dx = xscale;
							EPU.changex((-9+muvx)*xscale);
							EPU.changew((-9+muvy)*yscale);
							d=361;
							int xc = 0;
							double a = (-9+muvx)*xscale;
							double b = (-9+muvy)*yscale;
							while((ct < d) && (stp == false)) {
								
								EPU.solve();
								int lx = (int) Math.round((10+(((a/xscale)-0.5*Math.cos(Math.atan(EPU.getAns()*(xscale/yscale))))-muvx))*25);
								int ux = (int) Math.round((10+(((a/xscale)+0.5*Math.cos(Math.atan(EPU.getAns()*(xscale/yscale))))-muvx))*25);
								int ly = (int) (Math.round((10-(((b/yscale)-0.5*Math.sin(Math.atan(EPU.getAns()*(xscale/yscale))))-muvy))*25));
								int uy = (int) (Math.round((10-(((b/yscale)+0.5*Math.sin(Math.atan(EPU.getAns()*(xscale/yscale))))-muvy))*25));
								//**.out.println("lx = "+ lx);
								//**.out.println("ly = "+ ly);
								//**.out.println("ux = "+ ux);
								//**.out.println("uy = "+ uy);
								((DefaultListModel) masterlist.get(ximes-1)).addElement(lx);
								((DefaultListModel) masterlist.get(ximes-1)).addElement(ly);
								((DefaultListModel) masterlist.get(ximes-1)).addElement(ux);
								((DefaultListModel) masterlist.get(ximes-1)).addElement(uy);
								((DefaultListModel) mstr2.get(ximes-1)).addElement(a); //new
								((DefaultListModel) mstr2.get(ximes-1)).addElement(b); //new
								((DefaultListModel) mstr2.get(ximes-1)).addElement(EPU.getAns()); //new
								progress++;
								jp.setValue(progress);
								a = a + xscale;
								EPU.changex(a);
								cntr++;
								if(cntr > 9) {
									cntr2++;
									cntr = -9;
									a = (-9+muvx)*xscale;
									EPU.changex(a);
									b = b+yscale;
									EPU.changew(b);
									cntr = -9;
								}
								
								ct++;
				                
								//add
								
							}
							lambdaprogress++;
							jpmain.setValue(lambdaprogress);
						}
						else {
						if(Boolean.parseBoolean(isitpolar.get(ximes-1).toString()) == false) {
							if(eq.get(ximes-1).toString().contains("w") == false) {
								jp.setMaximum((int) Math.ceil((20*normalmult)/dxr));
								jp.setValue(0);
								progress = 0;
								des.setText("processing: " + eq.get(ximes-1).toString());
						double a = ((origin-(10))+muvx)*xscale;
						dx = dxr*xscale;
						d = (int) Math.ceil((20*xscale)/dx);
						EPU.changew(1);
						//add stuff
						ct = 0;
						while((ct<d) && (stp == false)) {
							EPU.changex(a);
							EPU.solve();
							int x2 = (int) Math.round((a/xscale+10-muvx)*25);
							int y2 = (int) Math.round((10-(EPU.getAns()*1/yscale-muvy))*25);
							////**.out.println("y1 = " + y1);
							//**.out.println("y2 = " + y2);
							((DefaultListModel) masterlist.get(ximes-1)).addElement(x2);
							((DefaultListModel) masterlist.get(ximes-1)).addElement(y2);
							((DefaultListModel) mstr2.get(ximes-1)).addElement(a); //new
							((DefaultListModel) mstr2.get(ximes-1)).addElement(EPU.getAns()); //new
							a = a + dx;
							ct++;
							progress++;
							jp.setValue(progress);
						}
						lambdaprogress++;
						jpmain.setValue(lambdaprogress);
							}
							else if(eq.get(ximes-1).toString().contains("x") == false) {
								jp.setMaximum((int) Math.ceil((20*normalmult)/dxr));
								jp.setValue(0);
								progress = 0;
								des.setText("processing: " + eq.get(ximes-1).toString());
								i2.changeEq(eq.get(ximes-1).toString());
								i2.convert();
								EPU.changeEq(i2.getR());
								System.out.println(i2.getR());
								double a = ((origin-(10))+muvy)*yscale;
								dx = dxr*yscale;
								d = (int) Math.ceil((20*yscale)/dx);
								EPU.changew(1);
								//add stuff
								ct = 0;
								while((ct<d) && (stp == false)) {
									EPU.changex(a);
									EPU.solve();
									int y2 = (int) Math.round((-a/yscale+10+muvy)*25);
									int x2 = (int) Math.round((10+(EPU.getAns()*1/xscale-muvx))*25);
									////**.out.println("y1 = " + y1);
									//**.out.println("y2 = " + y2);
									((DefaultListModel) masterlist.get(ximes-1)).addElement(x2);
									((DefaultListModel) masterlist.get(ximes-1)).addElement(y2);
									((DefaultListModel) mstr2.get(ximes-1)).addElement(a); //new
									((DefaultListModel) mstr2.get(ximes-1)).addElement(EPU.getAns()); //new
									a = a + dx;
									ct++;
									progress++;
									jp.setValue(progress);
								}
								lambdaprogress++;
								jpmain.setValue(lambdaprogress);
									}
							else {
								//implicit grphing
								jp.setMaximum((int) Math.ceil((20*normalmult)/dxr));
								jp.setValue(0);
								progress = 0;
								des.setText("processing: " + eq.get(ximes-1).toString());
								double y = ((origin-(10))+muvy)*yscale;
								double initialx = ((origin-(10))+muvx)*xscale;
								d = (int) Math.round(20/dxr);
								ct = 0;
								//**.out.println("num = "+ d);
								Newtonz_Method n = new Newtonz_Method(eq.get(ximes-1).toString(), y, 25);
								n.setFstMd(true);
								//**.out.println("init y = " + y);
								//**.out.println("init x = " + initialx);
								double dy = dxr*yscale;
								dx = dxr * xscale;
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
								int initiationz = 0;
								int zerzfound = 0;
								int idutot1 = 0;
								int idutot2 = 0;
								while((ct < d) && (stp == false)) {
									n.changew(y);
									EPU.changew(y);
									int nc = 0;
									pre = true;
									nudiff = false;
									olddiff = false;
									comp = 0;
									while((nc < 81) && (stp == false)) {
										EPU.changex(initialx);
										EPU.solve();
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
												zrz.addElement(initialx);
												idutot1++;
											}
											else if((nudiff != olddiff) && (Math.abs(com) < 2)) {
												zrz.addElement(initialx);
												idutot2++;
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
									}
									int zt = 0;
									while (zt < zrz.getSize()) {
										//**.out.println("xguess = " + initialx);
										n.changex(Double.parseDouble(zrz.get(zt).toString()));
										n.getZero();
										initiationz++;
										////**.out.println(n.getAns());
										boolean repeat = false;
										int rep = 0;
										while(rep < ((DefaultListModel) masterlist.get(ximes - 1)).getSize()) {
											if((Integer.parseInt(((DefaultListModel) masterlist.get(ximes - 1)).get(rep).toString()) == (int) Math.round(((n.getAns()/xscale)+10-muvx)*25)) && (Integer.parseInt(((DefaultListModel) masterlist.get(ximes - 1)).get(rep + 1).toString()) == (int) Math.round((10-(y*1/yscale-muvy))*25))) {
												repeat = true;
											}
											rep = rep +2;
										}
										if(n.isGood()) {
											zerzfound++;
										}
										if(n.isGood() && repeat == false) {
											int x1 = (int) Math.round(((n.getAns()/xscale)+10-muvx)*25);
											int y1 = (int) Math.round((10-(y*1/yscale-muvy))*25);
											if((x1 <= 500) && (x1 >= 0) && (y1 <= 500) && (y1 >= 0)) {
											((DefaultListModel) masterlist.get(ximes-1)).addElement(x1);
											((DefaultListModel) masterlist.get(ximes-1)).addElement(y1);
											((DefaultListModel) mstr2.get(ximes-1)).addElement(n.getAns()); //new
											((DefaultListModel) mstr2.get(ximes-1)).addElement(y); //new
											}
										}
									zt++;
									}
									zrz.clear();
									initialx = ((origin-(10))+muvx)*xscale;
									y = y + dy;
									ct++;
									progress++;
									jp.setValue(progress);
								}
								//System.out.println(initiationz);
								//System.out.println(zerzfound);
								//System.out.println(idutot1);
								//System.out.println(idutot2);
								//**.out.println("last y = " + y);
								n.setFstMd(false);
								//end implicit grphing
								lambdaprogress++;
								jpmain.setValue(lambdaprogress);
							}
						}
						else {
							if(eq.get(ximes-1).toString().contains("w") == false) {
								jp.setMaximum((int) Math.ceil(polar1mult*(param2 - param1)/dxp));
								jp.setValue(0);
								progress = 0;
								des.setText("processing: " + eq.get(ximes-1).toString());
							previnterval = origin+param1;
							interval = origin + param1;
							dx = dxp;
							d = (int) Math.ceil((param2 - param1)/dx);
							EPU.changew(1);
							//add stuff
							ct=0;
							double a = param1;
							double b = param1;
							double c = 0;
							while((ct < d) && (stp == false)) {
								EPU.changex(a);
								EPU.solve();
								if(first == true) {
									c = EPU.getAns();
									first = false;
								}
								//int x1 = (int) Math.round((10-((Math.cos(b)*-c)*1/xscale)-muvx)*25);
								int x2 = (int) Math.round((10-((Math.cos(a)*-EPU.getAns())*1/xscale)-muvx)*25);
								//int y1 = (int) Math.round((10-((Math.sin(b)*c)*1/yscale)+muvy)*25);
								int y2 = (int) Math.round((10-((Math.sin(a)*EPU.getAns())*1/yscale)+muvy)*25);
								((DefaultListModel) masterlist.get(ximes-1)).addElement(x2);
								((DefaultListModel) masterlist.get(ximes-1)).addElement(y2);
								((DefaultListModel) mstr2.get(ximes-1)).addElement(Math.cos(a)*-EPU.getAns()); //new
								((DefaultListModel) mstr2.get(ximes-1)).addElement(Math.sin(a)*EPU.getAns()); //new
								progress++;
							jp.setValue(progress);
								ct++;
								if(first == false) {
									c = EPU.getAns();
								}
								b = a;
								a = a + dx;
							}
							lambdaprogress++;
							jpmain.setValue(lambdaprogress);
							}
							//swap x and w polar
							else if(eq.get(ximes-1).toString().contains("x") == false) {
								jp.setMaximum((int) (Math.ceil(param2-param1)*10000));
								jp.setValue(0);
								progress = 0;
								des.setText("processing: " + eq.get(ximes-1).toString());
								i2.changeEq(eq.get(ximes-1).toString());
								i2.convert();
								EPU.changeEq(i2.getR());
								previnterval = origin+param1;
								interval = origin + param1;
								dx = dxp;
								d = (int) Math.ceil((param2 - param1)/dx);
								EPU.changew(1);
								//add stuff
								ct=0;
								double a = param1;
								double b = param1;
								double c = 0;
								while((a < param2) && (ct < 505000) && (stp == false)) {
									EPU.changex(a);
									EPU.solve();
									if(first == true) {
										c = EPU.getAns();
										first = false;
									}
									if(EPU.isGood()) {
									//int x1 = (int) Math.round((10-((Math.cos(b)*-c)*1/xscale)-muvx)*25);
									int x2 = (int) Math.round((10-((Math.cos(EPU.getAns())*-a)*1/xscale)-muvx)*25);
									//int y1 = (int) Math.round((10-((Math.sin(b)*c)*1/yscale)+muvy)*25);
									int y2 = (int) Math.round((10-((Math.sin(EPU.getAns())*a)*1/yscale)+muvy)*25);
									((DefaultListModel) masterlist.get(ximes-1)).addElement(x2);
									((DefaultListModel) masterlist.get(ximes-1)).addElement(y2);
									((DefaultListModel) mstr2.get(ximes-1)).addElement(Math.cos(EPU.getAns())*-a); //new
									((DefaultListModel) mstr2.get(ximes-1)).addElement(Math.sin(EPU.getAns())*a); //new
									}
									ct++;
									if(first == false) {
										c = EPU.getAns();
									}
									du.changeEq(i2.getR());
									du.changex(a);
									du.getDer();
									double drd = dx;
									if((du.getAns() != 0) && (EPU.isGood()) && (du.isErrd() == false)) {
									drd = Math.abs(dx/du.getAns());
									if(drd > dx) {
										drd = dx;
									}
									}
									else {
										drd = dx;
									}
									b = a;
									a = a + drd;
									progress = (int) (progress + Math.round(drd*10000));
									jp.setValue(progress);
									//System.out.println(a);
								}
								lambdaprogress++;
								jpmain.setValue(lambdaprogress);
								if(ct >= 50500) {
									Toolkit.getDefaultToolkit().beep();
								}
								}
							//end swap x and w polar
							else {
								//09/15/2017
								//implicit grphing
								jp.setMaximum((int) Math.ceil(20/dxp));
								jp.setValue(0);
								progress = 0;
								des.setText("processing: " + eq.get(ximes-1).toString());
								double y = ((origin-(10))+muvy)*yscale;
								double initialx = ((origin-(10))+muvx)*xscale;
								double angle = 0;
								double r = 0;
								d = (int) Math.round(20/dxp);
								ct = 0;
								//**.out.println("num = "+ d);
								Newtonz_Method n = new Newtonz_Method(eq.get(ximes-1).toString(), y, 25);
								//**.out.println("init y = " + y);
								//**.out.println("init x = " + initialx);
								double dy = dxp*yscale;
								dx = dxp * xscale;
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
								int initiationz = 0;
								int zerzfound = 0;
								int idutot1 = 0;
								int idutot2 = 0;
								while(ct < d) {
									
									int nc = 0;
									pre = true;
									nudiff = false;
									olddiff = false;
									comp = 0;
									boolean contd = true;
									int revs1 = revs;
									boolean neg = false;
									while(nc < 81) {
										revs1 = revs;
										contd = true;
										neg = false;
										while((contd == true) && (revs1 < polarmultiplier)) {
											try {
										angle = Math.atan2(y, initialx) + 2*Math.PI*revs1;
											}
											catch(Exception err) {
												int np = 0;
												if(y < 0) {
													np = -1;
												}
												else {
													np = 1;
												}
												angle = np*Math.PI/2 + 2*Math.PI*revs1;
											}
										r = Math.sqrt(Math.pow(y, 2) + Math.pow(initialx, 2));
										n.changew(r);
										EPU.changew(r);
										EPU.changex(angle);
										EPU.solve();
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
											if((last != presnt) && (Math.abs(initialx) > 1)) {
												zrz.addElement(angle);
												zrz.addElement(r);
												idutot1++;
												contd = false;
											}
											else if((nudiff != olddiff) && (Math.abs(com) < 5)) {
												zrz.addElement(angle);
												zrz.addElement(r);
												idutot2++;
												contd = false;
											}
											
										}
										else {
											pre = false;
										}
										if(neg == true) {
											revs1 = -revs1;
											neg = false;
										}
										else {
											revs1 = Math.abs(revs1) + 1;
											neg = true;
										}
										}
										comp = com;
										olddiff = nudiff;
										initialx = initialx + 0.25*xscale;
										nc++;
										last = presnt;
									}
									int zt = 0;
									double subr = 0;
									while (zt < zrz.getSize()) {
										//**.out.println("xguess = " + initialx);
										n.changex(Double.parseDouble(zrz.get(zt).toString()));
										n.changew(Double.parseDouble(zrz.get(zt+1).toString()));
										subr = (Double.parseDouble(zrz.get(zt+1).toString()));
										n.getZero();
										initiationz++;
										//if((initialx < 0) && (y > 0)) {
										//	angle2 = Math.atan(y/initialx) + Math.PI;
										//}
										//else if((initialx > 0) && (y < 0)) {
										//	angle2 = Math.atan(y/initialx) + 2*Math.PI;
										//}
										//else if((initialx < 0) && (y < 0)) {
										///	angle2 = Math.atan(y/initialx) + Math.PI;
										//}
										//else {
										//	angle2 = Math.atan(y/initialx);
										//}
										////**.out.println(n.getAns());
										boolean repeat = false;
										int rep = 0;
										while(rep < ((DefaultListModel) masterlist.get(ximes - 1)).getSize()) {
											if((Integer.parseInt(((DefaultListModel) masterlist.get(ximes - 1)).get(rep).toString()) == (int) Math.round(((n.getAns()/xscale)+10-muvx)*25)) && (Integer.parseInt(((DefaultListModel) masterlist.get(ximes - 1)).get(rep + 1).toString()) == (int) Math.round((10-(y*1/yscale-muvy))*25))) {
												repeat = true;
											}
											rep = rep +2;
										}
										if(n.isGood()) {
											zerzfound++;
										}
										else {
											//System.out.println("//");
											//System.out.println(zrz.get(zt).toString());
											//System.out.println(zrz.get(zt+1).toString());
											//System.out.println("\\");
										}
										if(n.isGood() && repeat == false) {
											int x1 = (int) Math.round(((subr*Math.cos(n.getAns())/xscale)+10-muvx)*25);
											int y1 = (int) Math.round((10-(subr*Math.sin(n.getAns())*1/yscale-muvy))*25);
											if((x1 <= 500) && (x1 >= 0) && (y1 <= 500) && (y1 >= 0)) {
											((DefaultListModel) masterlist.get(ximes-1)).addElement(x1);
											((DefaultListModel) masterlist.get(ximes-1)).addElement(y1);
											((DefaultListModel) mstr2.get(ximes-1)).addElement(subr*Math.cos(n.getAns()));
											((DefaultListModel) mstr2.get(ximes-1)).addElement(subr*Math.sin(n.getAns()));
											}
										}
									zt = zt + 2;
									}
									zrz.clear();
									initialx = ((origin-(10))+muvx)*xscale;
									y = y + dy;
									ct++;
									progress++;
									jp.setValue(progress*10000);
								}
								//System.out.println(initiationz);
								//System.out.println(zerzfound);
								//System.out.println(idutot1);
								//System.out.println(idutot2);
								//**.out.println("last y = " + y);
								//end implicit grphing
							}
						}
						}
				}
					if(stp == false) {
						prosd.remove(ximes-1);
						prosd.add(ximes-1,1);
					}
			}
				else {
					ximes++;
					lambdaprogress++;
					jpmain.setValue(lambdaprogress);
				}
				
			}
			else {
				try {
					masterlist.remove(ximes);
					mstr2.remove(ximes); //new
				}
				catch(Exception err) {
					
				}
				masterlist.add(ximes, "");
				mstr2.add(ximes, ""); //new
				ximes++;
				prosd.remove(ximes-1);
				prosd.add(ximes-1, 1);
			}
					currentindx = ximes-1;	
				}
					alt = false;
	
					//ximes loop ends here
					if(eq.getSize() > 0) {
						graph.setIconImage(rp.getImage());
						graph.setTitle("Graph: SCA(" + xscale + ", " + yscale + "); CEN(" + muvx*xscale + ", " + muvy*yscale + ")");
							graph.setSize(508, 530);
						
						graph.add(new Red_Phial_Graphing_Utility());
						graph.setResizable(false);
						graph.setVisible(true);
						graph.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
					}
					try {
						jpjf.dispose();
						jf1.setEnabled(true);
						mst.setEnabled(true);
						jfpropertez.setEnabled(true);
						sam.setEnabled(true);
					}
					catch(Exception err) {
						
					}
					//**.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					//**.out.println(load);
					//**.out.println(progress);
					progress = 0;
}
	
	public void run() {
		(new Red_Phial_Graphing_Utility()).calculate();
	}
	
	
	public static void main(String[] args) {
		//Auto-generated method stub
		
		try{
			JPanel jp1 = new JPanel();
			jpmain.setBackground(new Color(255, 125, 0));
			JPanel jp2 = new JPanel();
			JPanel jp3 = new JPanel();
			jp3.setBackground(Color.RED);
			jp2.setBackground(Color.RED);
			jp1.setBackground(Color.RED);
			JButton remove = new JButton("Remove");
			JButton add = new JButton("Add");
			JButton propertez = new JButton("Properties");
			JButton mast = new JButton("Window");
			jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JMenuBar mb = new JMenuBar();
			JMenu m = new JMenu("Phial");
			JMenu a = new JMenu("Advanced");
			JMenuItem sav = new JMenuItem("Save RPG");
			JMenuItem savcsv = new JMenuItem("Export csv");
			JMenuItem ld = new JMenuItem("Load RPG");
			JMenuItem samplez = new JMenuItem("Set Sampling Size");
			samplez.setBackground(new Color(255, 125, 0));
			sav.setBackground(new Color(255, 125, 0));
			ld.setBackground(new Color(255, 125, 0));
			m.setBackground(new Color(255, 125, 0));
			jf1.setJMenuBar(mb);
			mb.setBackground(new Color(255, 125, 0));
			mb.add(m);
			mb.add(a);
			mb.add(Calcz);
			a.add(samplez);
			m.add(sav);
			m.add(ld);
			savcsv.setBackground(new Color(255,125,0));
			m.add(savcsv);
			Echelon.setBackground(new Color(255, 125, 0));
			Calcz.add(Echelon);
			JButton cont2 = new JButton("Continue");
			final JTextField szze = new JTextField(10);
			szze.setBackground(new Color(255, 125, 0));
			systpnl.setBackground(Color.RED);
			JLabel slze = new JLabel("System size: ");
			systsze.setIconImage(rp.getImage());
			systpnl.setLayout(new FlowLayout());
			systpnl.add(slze);
			systpnl.add(szze);
			systpnl.add(cont2);
			systsze.getContentPane().add(systpnl, BorderLayout.CENTER);
			systsze.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
			systsze.pack();
			systsze.setResizable(false);
			
			Echelon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					systsze.setVisible(true);
				}
				});
			
			final JFrame errordis = new JFrame("Red Phial Graphing Utility");
			errordis.setIconImage(rp.getImage());
			JPanel errorpanel = new JPanel();
			errorpanel.setBackground(Color.RED);
			final JTextArea errorsndbx = new JTextArea(10, 30);
			errorsndbx.setBackground(new Color(255, 125, 0));
			errorsndbx.setLineWrap(true);
			errorsndbx.setWrapStyleWord(true);
			errorsndbx.setEditable(false);
			JScrollPane errorsc = new JScrollPane(errorsndbx);
			errorpanel.setLayout(new FlowLayout());
			errorpanel.add(errorsc);
			errordis.getContentPane().add(errorpanel, BorderLayout.CENTER);
			errordis.pack();
			errordis.setResizable(false);
			errordis.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);	
			
			
			final JPanel cpnl = new JPanel();
			cpnl.setBackground(Color.red);
			JButton cntu = new JButton("Solve");
			cpnl.setLayout(new FlowLayout());
			cpnl.add(cntu);
			xipt.setBackground(new Color(255,125,0));
			xipt.setText("0");
			wipt.setBackground(new Color(255,125,0));
			wipt.setText("0");
			JLabel xlb = new JLabel("  x value ");
			JLabel wlb = new JLabel("  w value ");
			JLabel jl = new JLabel("  view window ");
			final JTextArea jta = new JTextArea(10,30);
			jta.setBackground(new Color(255,125,0));
			jta.setWrapStyleWord(false);
			jta.setLineWrap(true);
			jta.setEditable(false);
			JScrollPane jsp = new JScrollPane(jta);
			cpnl.add(xlb);
			cpnl.add(xipt);
			cpnl.add(wlb);
			cpnl.add(wipt);
			cpnl.add(jl);
			cpnl.add(jsp);		
			final JMenuBar buar = new JMenuBar();
			buar.setBackground(new Color(255, 125, 0));
			JMenu phile = new JMenu("Phial");
			buar.add(phile);
			JMenuItem shayv = new JMenuItem("Save RPLS");
			JMenuItem lode = new JMenuItem("Load RPLS");
			shayv.setBackground(new Color(255, 125, 0));
			lode.setBackground(new Color(255, 125, 0));
			phile.add(shayv);
			phile.add(lode);
			FileNameExtensionFilter philefilt = new FileNameExtensionFilter("Red Phial Linear System","RPLS");
			final JFileChooser slkt = new JFileChooser();
			slkt.addChoosableFileFilter(philefilt);
			final JFrame jf = new JFrame();
			jf.setIconImage(rp.getImage());
			slkt.setAcceptAllFileFilterUsed(false);
			
			shayv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//sayv
					try {
						int dcd = slkt.showSaveDialog(jf);
						if(dcd == JFileChooser.APPROVE_OPTION) {
							File path = slkt.getCurrentDirectory();
							File name = slkt.getSelectedFile();
							String overall = path + "/" + slkt.getName(name) + ".RPLS";
							PrintWriter rplc = new PrintWriter(new FileWriter(overall));
							rplc.println(stssz);
							try {
								rplc.println(Double.parseDouble(xipt.getText()));
								rplc.println(Double.parseDouble(wipt.getText()));
							}
							catch(Exception err) {
								rplc.println("0");
								rplc.println("0");
							}
							int rwpt = 0;
							int clpt = 0;
							while(rwpt < stssz) {
								clpt = 0;
								while(clpt < stssz) {
									if(A.getValueAt(rwpt, clpt) != null) {
									rplc.println(A.getValueAt(rwpt, clpt));
									}
									else {
										rplc.println();
									}
									clpt++;
								}
								//rplc.println();
								rwpt++;
							}
							rwpt = 0;
							while(rwpt < stssz) {
								if(B.getValueAt(rwpt, 0) != null) {
								rplc.println(B.getValueAt(rwpt, 0));
								}
								else {
									rplc.println();
								}
								rwpt++;
							}
							//rplc.println();
							rwpt = 0;
							try {
								while(rwpt < stssz) {
									if(O.getValueAt(rwpt, 0) != null) {
									rplc.println(O.getValueAt(rwpt, 0));
									}
									else {
										rplc.println();
									}
									rwpt++;
								}
								rplc.println(saulvabul);
							}
							catch(Exception err) {
								
							}
							
							rplc.close();
							jtfstat.setText("Phial Saved");
						}
					}
					catch(Exception err) {
						jtfstat.setText("Save unsuccessful");
						err.printStackTrace();
					}
				}
			});
			
			lode.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//lode
					try {
						saulvabul = true;
						int dcd = slkt.showOpenDialog(jf);
						if(dcd == JFileChooser.APPROVE_OPTION) {
							File path = slkt.getCurrentDirectory();
							File name = slkt.getSelectedFile();
							String overall = path + "/" + slkt.getName(name);
							File actual = new File(overall);
							actual.getParentFile().mkdirs();
							BufferedReader rpcl = new BufferedReader(new FileReader(actual));
							int size = Integer.parseInt(rpcl.readLine());
							stssz = size;
							xipt.setText(rpcl.readLine());
							wipt.setText(rpcl.readLine());
							A = new JTable(size, size);
							B = new JTable(size, 1);
							O = new JTable(size, 1);
							int strw = 0;
							int stcl = 0;
							String tst = null;
							
							//strt
							
							nutf.dispose();
							nutf = new JFrame("Red Phial Graphing Utility");
							nutf.setJMenuBar(buar);
							nutf.setIconImage(rp.getImage());
							nutf.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
							JPanel jpn = new JPanel();
							jpn.setBackground(Color.red);
							if((size <= 50) && (size > 1)) { //size constraints
							A = new JTable(size,size);
							A.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							A.setBackground(new Color(255, 125, 0));
							A.setSelectionBackground(Color.yellow);
							B = new JTable(size,1);
							O = new JTable(size,1) {
								public boolean isCellEditable(int row, int column) {
									return false;
								}
							};
							
							JScrollPane jA = new JScrollPane(A);
							JScrollPane jB = new JScrollPane(B);
							JScrollPane jO = new JScrollPane(O);
							O.setBackground(new Color(255,125,0));
							
							ListSelectionModel lsm = O.getSelectionModel();
							lsm.addListSelectionListener(new ListSelectionListener() {
								public void valueChanged(ListSelectionEvent s) {
									//add code for displaying here
									//System.out.println("executed");
									try {
									jta.setText(O.getValueAt(O.getSelectedRow(), 0).toString());
									}
									catch(Exception err) {
										
									}
								}
							});
							
							A.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
							B.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
							A.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
							B.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
							//O.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
							JTableHeader jh = A.getTableHeader();
							JTableHeader jh2 = B.getTableHeader();
							JTableHeader jh3 = O.getTableHeader();
							//jh.setBackground(Color.red);
							jh.setOpaque(true);
							jh2.setOpaque(true);
							jh3.setOpaque(true);
							DefaultListModel dm = new DefaultListModel();
							int cntr = 0;
							while (cntr < A.getRowCount()) {
								dm.addElement(cntr+1);
								cntr++;
							}
							JList rh = new JList(dm);
							JList rh2 = new JList(dm);
							JList rh3 = new JList(dm);
							rh.setFixedCellWidth(50);
							rh2.setFixedCellWidth(50);
							rh3.setFixedCellWidth(50);
							rh.setBackground(jh.getBackground());
							rh2.setBackground(jh2.getBackground());
							rh3.setBackground(jh3.getBackground());
							rh.setFixedCellHeight(A.getRowHeight());
							rh.setCellRenderer(new RowHeaderRenderer(A));
							rh2.setFixedCellHeight(B.getRowHeight());
							rh2.setCellRenderer(new RowHeaderRenderer(B));
							rh3.setFixedCellHeight(O.getRowHeight());
							rh3.setCellRenderer(new RowHeaderRenderer(O));
							
							
							jA.setRowHeaderView(rh);
							jB.setRowHeaderView(rh2);
							jO.setRowHeaderView(rh3);
							B.setBackground(new Color(255,125,0));
							B.setSelectionBackground(Color.yellow);
							jpn.add(jA);
							jpn.add(jB);
							jpn.add(jO);
							Dimension dm3 = new Dimension(500,400);
							Dimension dm4 = new Dimension(150, 400);
							Dimension dm5 = new Dimension(250, 400);
							
							jtfstat = new JTextField(30);
							JLabel jlstat = new JLabel("status");
							JPanel jpstat = new JPanel();
							jpstat.setBackground(Color.red);
							jtfstat.setBackground(new Color(255,125,0));
							jtfstat.setEditable(false);
							
							jpstat.setLayout(new FlowLayout());
							jpstat.add(jlstat);
							jpstat.add(jtfstat);
							
							jA.setPreferredSize(dm3);
							jB.setPreferredSize(dm4);
							jO.setPreferredSize(dm5);
							
							nutf.getContentPane().add(jpn, BorderLayout.CENTER);
							nutf.getContentPane().add(cpnl, BorderLayout.SOUTH);
							nutf.getContentPane().add(jpstat, BorderLayout.NORTH);
							nutf.pack();
							nutf.setResizable(false);
							nutf.setVisible(true);
							
							//ed
							
							while(strw < size) {
								stcl = 0;
								while(stcl < size) {
									tst = rpcl.readLine();
									A.setValueAt(tst, strw, stcl);
									stcl++;
								}
								strw++;
							}
							strw = 0;
							while(strw < size) {
								tst = rpcl.readLine();
									B.setValueAt(tst, strw, 0);
								strw++;
							}
							strw = 0;
							while(strw < size) {
								tst = rpcl.readLine();
								if((tst.contains("N")) || (tst.contains("i"))) {
									saulvabul = false;
								}
									O.setValueAt(tst, strw, 0);
								strw++;
							}
							try {
								if(Boolean.parseBoolean(rpcl.readLine()) == false) {
									saulvabul = false;
								}
							}
							catch(Exception err) {
								
							}
							rpcl.close();
							if(saulvabul == false) {
								O.setBackground(Color.cyan);
								jtfstat.setText("This file may contain an invalid solution");
							}
							else {
								O.setBackground(new Color(255, 125, 0));
								jtfstat.setText("File loaded");
							}
							
						}
						}
					}
					catch(Exception err) {
						jtfstat.setText("File could not be loaded");
					}
				}
			});
			
			cont2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						nutf.dispose();
					}
					catch(Exception err) {
						
					}
					try {
					nutf = new JFrame("Red Phial Graphing Utility");
					
					nutf.setJMenuBar(buar);
					nutf.setIconImage(rp.getImage());
					nutf.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
					JPanel jpn = new JPanel();
					jpn.setBackground(Color.red);
					stssz = Integer.parseInt(szze.getText().toString());
					if((stssz <= 50) && (stssz > 1)) { //size constraints
					A = new JTable(stssz,stssz);
					A.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					A.setBackground(new Color(255, 125, 0));
					A.setSelectionBackground(Color.yellow);
					B = new JTable(stssz,1);
					O = new JTable(stssz,1) {
						public boolean isCellEditable(int row, int column) {
							return false;
						}
					};
					
					JScrollPane jA = new JScrollPane(A);
					JScrollPane jB = new JScrollPane(B);
					JScrollPane jO = new JScrollPane(O);
					O.setBackground(new Color(255,125,0));
					
					ListSelectionModel lsm = O.getSelectionModel();
					lsm.addListSelectionListener(new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent s) {
							//add code for displaying here
							//System.out.println("executed");
							try {
							jta.setText(O.getValueAt(O.getSelectedRow(), 0).toString());
							}
							catch(Exception err) {
								
							}
						}
					});
					
					A.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
					B.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
					A.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//testing purposes only
					B.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//testing purposes only
					//O.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					JTableHeader jh = A.getTableHeader();
					JTableHeader jh2 = B.getTableHeader();
					JTableHeader jh3 = O.getTableHeader();
					//jh.setBackground(Color.red);
					jh.setOpaque(true);
					jh2.setOpaque(true);
					jh3.setOpaque(true);
					DefaultListModel dm = new DefaultListModel();
					int cntr = 0;
					while (cntr < A.getRowCount()) {
						dm.addElement(cntr+1);
						cntr++;
					}
					JList rh = new JList(dm);
					JList rh2 = new JList(dm);
					JList rh3 = new JList(dm);
					rh.setFixedCellWidth(50);
					rh2.setFixedCellWidth(50);
					rh3.setFixedCellWidth(50);
					rh.setBackground(jh.getBackground());
					rh2.setBackground(jh2.getBackground());
					rh3.setBackground(jh3.getBackground());
					rh.setFixedCellHeight(A.getRowHeight());
					rh.setCellRenderer(new RowHeaderRenderer(A));
					rh2.setFixedCellHeight(B.getRowHeight());
					rh2.setCellRenderer(new RowHeaderRenderer(B));
					rh3.setFixedCellHeight(O.getRowHeight());
					rh3.setCellRenderer(new RowHeaderRenderer(O));
					JPanel jpstat = new JPanel();
					jpstat.setBackground(Color.red);
					JLabel jlstat = new JLabel("Status");
					jtfstat = new JTextField(30);
					jtfstat.setBackground(new Color(255,125,0));
					jtfstat.setEditable(false);
					
					jpstat.setLayout(new FlowLayout());
					jpstat.add(jlstat);
					jpstat.add(jtfstat);
					
					
					jA.setRowHeaderView(rh);
					jB.setRowHeaderView(rh2);
					jO.setRowHeaderView(rh3);
					B.setBackground(new Color(255,125,0));
					B.setSelectionBackground(Color.yellow);
					jpn.add(jA);
					jpn.add(jB);
					jpn.add(jO);
					Dimension dm3 = new Dimension(500,400);
					Dimension dm4 = new Dimension(150, 400);
					Dimension dm5 = new Dimension(250, 400);
					
					jA.setPreferredSize(dm3);
					jB.setPreferredSize(dm4);
					jO.setPreferredSize(dm5);
					
					nutf.getContentPane().add(jpn, BorderLayout.CENTER);
					nutf.getContentPane().add(cpnl, BorderLayout.SOUTH);
					nutf.getContentPane().add(jpstat, BorderLayout.NORTH);
					nutf.pack();
					nutf.setResizable(false);
					nutf.setVisible(true);
					
					systsze.dispose();
					}
					else {
						errorsndbx.setText("That was unacceptable.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
					}
					catch(Exception err) {
						errorsndbx.setText("That was unacceptable.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
			});
			
			cntu.addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent e) {
					jtfstat.setText("Operation started");
					boolean contclr = true;
					int tst = 0;
					while(contclr) {
						try {
							O.setValueAt("", tst, 0);
						}
						catch(Exception err) {
							contclr = false;
						}
						tst++;
					}
					jta.setText("");
					LnSlv ls = new LnSlv();
					PARAMS prms = new PARAMS();
					int clz = 0;
					int ros = 0;
					double tstr = 0;
					double inpt[][] = new double[stssz+1][stssz];
					boolean submit = true;
					try {
					EPU.changex(Double.parseDouble(xipt.getText()));
					EPU.changew(Double.parseDouble(wipt.getText()));
					while(clz < stssz) {
						ros = 0;
						while(ros < stssz) {
							try {
							tstr = Double.parseDouble(A.getValueAt(ros, clz).toString());
							inpt[clz][ros] = tstr;
							}
							catch(Exception err) {
								try {
									EPU.changeEq(A.getValueAt(ros, clz).toString());
									EPU.solve();
									if(EPU.isGood()) {
									inpt[clz][ros] = EPU.getAns();
									}
									else {
										submit = false;
										jtfstat.setText("Operation could not be completed");
										//A.setValueAt("<!>" + A.getValueAt(ros, clz) + "</!>", ros, clz);
									}
								}
								catch(Exception err2) {
									submit = false;
									jtfstat.setText("Operation could not be completed");
									err2.printStackTrace();
								}
							}
							ros++;
						}
						try {
							tstr = Double.parseDouble(B.getValueAt(clz, 0).toString());
							inpt[stssz][clz] = tstr;
						}
						catch(Exception err) {
							try {
								EPU.changeEq(B.getValueAt(clz, 0).toString());
								EPU.solve();
								if(EPU.isGood()) {
								inpt[stssz][clz] = EPU.getAns();
								}
								else {
									submit = false;
									jtfstat.setText("Operation could not be completed");
								}
							}
							catch(Exception err2) {
								submit = false;
								jtfstat.setText("Operation could not be completed");
								err2.printStackTrace();
								//jta.setText("error");
							}
						}
						clz++;
					}
					if(submit) {
						//print
						//int pr1 = 0;
						//int pr2 = 0;
						//System.out.println("initializing");
						//while(pr1 < stssz) {
							//pr2 = 0;
							//while(pr2 <= stssz) {
								//System.out.print(" " + inpt[pr2][pr1]);
								//pr2++;
							//}
							//System.out.println();
							//pr1++;
						//}
						//end print
						saulvabul = true;
						//ls.setupdebugconsole(dframe, dpanel, dscrollpane, dtextarea); //for debuging linear system solver
						ls.solve(inpt, stssz, stssz, 0, dtextarea);
						if(ls.nulrw() == true) {
							//System.out.println("zero row");
							prms.numcnt(inpt, stssz, dtextarea);
							//prms.prnt();
							if(ls.saulvabul() == false) {
								saulvabul = false;
							}
							prms.pst(O, stssz, prms.saulv(), jtfstat);
						}
						else {
							//System.out.println("zero degsovphreedum");
						double anz[] = new double[stssz];
						anz = ls.getAns();
						int c = 0;
						while(c < stssz) { //TODO
							if((Double.toString(anz[c]).contains("N")) || (Double.toString(anz[c]).contains("i"))) {
								saulvabul = false;
							}
							O.setValueAt(anz[c], c, 0);
							c++;
						}
						if(ls.saulvabul() == false) {
							saulvabul = false;
						}
						if(saulvabul == false) {
							O.setBackground(Color.cyan);
							jtfstat.setText("INVALID SOLUTION DETECTED!");
						}
						else {
							O.setBackground(new Color(255, 125, 0));
							jtfstat.setText("Operation completed");
						}
						
						}
					}
					}
					catch(Exception err0) {
						errorsndbx.setText("Invalid inputs");
						jtfstat.setText("Invalid inputs detected");
						errordis.setVisible(true);
						err0.printStackTrace();
						Toolkit.getDefaultToolkit().beep();
					}
				}
			});
			
			cncl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					stp = true;
					cncl.setEnabled(false);
				}
			});
			sav.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(ready == true) {
					RPG.write(muvx, muvy, xscale, yscale, masterlist, col, isitpolar, slop, eq, bgr, ax, rec, pol, rectangle, polar, nms, iglst, mstr2);
					}
					else {
						errorsndbx.setText("The data stored in memory may not be up to date, select graph to update the arrays then select save RPG");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
			});
			
			savcsv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if((ready == true) && (exportable == true)) {
					RPG.export(mstr2, eq, iglst, slop);
					}
					else {
						errorsndbx.setText("The data stored in memory may not be up to date, select graph to update the arrays then select save RPG.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
			});
			
			ld.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RPG.read(masterlist, col, isitpolar, slop, eq, mstr2);
					exportable = RPG.getExportable();
					if(RPG.getErr() == false) {
						if(RPG.isCancelled() == false) {
							ready = true;
					bgr = RPG.getBgr();
					ax = RPG.getAx();
					rec = RPG.getRec();
					pol = RPG.getPol();
					muvx = RPG.getMuvx();
					muvy = RPG.getMuvy();
					xscale = RPG.getXscale();
					yscale = RPG.getYscale();
					nms = RPG.getnms();
					rectangle = RPG.getrectangle();
					polar = RPG.getpolar();
					int eqi = eq.getSize();
					iglst.clear();
					prosd.clear();
					int ict = 0;
					boolean sti = false;
					while(ict < eqi) {
						iglst.add(ict, sti);
						prosd.add(ict, 1);
						ict++;
					}
					graph.setIconImage(rp.getImage());
					graph.setTitle("Graph: SCA(" + xscale + ", " + yscale + "); CEN(" + muvx*xscale + ", " + muvy*yscale + ")");
						graph.setSize(508, 530);
					
					graph.add(new Red_Phial_Graphing_Utility());
					graph.setResizable(false);
					graph.setVisible(true);
					graph.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
						}
					}
					else {
						errorsndbx.setText("This RPG may be corrupted.  This phial cannot be loaded correctly.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
			});
			
			jtf1.setBackground(new Color(255, 124, 0));
			JLabel jlb1 = new JLabel(" add equation  ");
			final JTextField jtf2 = new JTextField(15);
			jtf2.setBackground(new Color(255, 124, 0));
			JLabel jlb2 = new JLabel(" Equation 2  ");
			JLabel jlb3 = new JLabel(" Equation 3  ");
			JTextField jtf3 = new JTextField(15);
			jtf3.setBackground(new Color(255, 124, 0));
			JTextField jtf4 = new JTextField(15);
			jtf4.setBackground(new Color(255, 124, 0));
			JLabel jbl4 = new JLabel(" Equation 4  ");
			JColorChooser colc = new JColorChooser();
			JPanel jppropertez = new JPanel();
			jppropertez.setBackground(Color.RED);
			JLabel linecol = new JLabel(" Line Color ");
			final JTextField coldis = new JTextField(10);
			coldis.setEditable(false);
			JButton changecolor = new JButton("Color");
			final JTextField parameter1 = new JTextField(5);
			final JTextField parameter2 = new JTextField(5);
			parameter1.setBackground(new Color(255, 125, 0));
			parameter2.setBackground(new Color(255, 125, 0));
			JLabel pa = new JLabel("Parameter range (polar only) ");
			
			
			jf1.setIconImage(rp.getImage());
			jfpropertez.setIconImage(rp.getImage());
			
			
			mst.setIconImage(rp.getImage());
			JPanel ms = new JPanel();
			JPanel mc = new JPanel();
			JPanel me = new JPanel();
			JPanel mw = new JPanel();
			final JCheckBox rect = new JCheckBox();
			rect.setText("Rectangular");
			final JCheckBox polr = new JCheckBox();
			polr.setText("Polar");
			JButton dun = new JButton("Done");
			JButton chax = new JButton("Change color");
			JButton chbgr = new JButton("Change color");
			JButton chrec = new JButton("Change color");
			JButton chpol = new JButton("Change color");
			final JTextField axd = new JTextField(5);
			final JTextField bgrd = new JTextField(5);
			final JTextField pold = new JTextField(5);
			final JTextField recd = new JTextField(5);
			axd.setEditable(false);
			bgrd.setEditable(false);
			pold.setEditable(false);
			recd.setEditable(false);
			JLabel axl = new JLabel(" Major Axis ");
			JLabel bgrl = new JLabel(" Background ");
			JLabel recl = new JLabel(" Rect. Grid ");
			JLabel poll = new JLabel("Polar Grid");
			JLabel xs = new JLabel(" x-scale: ");
			JLabel ys = new JLabel(" y-scale: ");
			final JTextField xsc = new JTextField(5);
			final JTextField ysc = new JTextField(5);
			xsc.setBackground(new Color(255, 125, 0));
			ysc.setBackground(new Color(255, 125, 0));
			axd.setBackground(new Color(255, 125, 0));
			bgrd.setBackground(new Color(255, 125, 0));
			pold.setBackground(new Color(255, 125, 0));
			recd.setBackground(new Color(255, 125, 0));
			rect.setBackground(new Color(255, 0, 0));
			polr.setBackground(new Color(255, 0, 0));
			final JTextField muvxd = new JTextField(5);
			final JTextField muvyd = new JTextField(5);
			muvxd.setBackground(new Color(255, 125, 0));
			muvyd.setBackground(new Color(255, 125, 0));
			JLabel muv = new JLabel("center");
			//JButton samplez = new JButton("Sampling");
			final JCheckBox num5 = new JCheckBox("nums");
			num5.setBackground(Color.RED);
 			me.setLayout(new GridLayout(3,1));
			me.add(rect);
			me.add(polr);
			me.add(num5);
			ms.setLayout(new FlowLayout());
			ms.add(pa);
			ms.add(parameter1);
			ms.add(parameter2);
			ms.add(dun);
			//ms.add(samplez);
			mc.setLayout(new GridLayout(4, 3));
			mc.add(axl);
			mc.add(axd);
			mc.add(chax);
			mc.add(bgrl);
			mc.add(bgrd);
			mc.add(chbgr);
			mc.add(recl);
			mc.add(recd);
			mc.add(chrec);
			mc.add(poll);
			mc.add(pold);
			mc.add(chpol);
			mw.setLayout(new FlowLayout());
			mw.add(xs);
			mw.add(xsc);
			mw.add(ys);
			mw.add(ysc);
			mw.add(muv);
			mw.add(muvxd);
			mw.add(muvyd);
			mw.setBackground(Color.RED);
			me.setBackground(Color.RED);
			mc.setBackground(Color.RED);
			ms.setBackground(Color.RED);
			mst.getContentPane().add(me, BorderLayout.EAST);
			mst.getContentPane().add(mc, BorderLayout.CENTER);
			mst.getContentPane().add(ms, BorderLayout.SOUTH);
			mst.getContentPane().add(mw, BorderLayout.NORTH);
			mst.pack();
			mst.setResizable(false);
			mst.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
			final JCheckBox popl = new JCheckBox();
			final JCheckBox sl = new JCheckBox();
			final JCheckBox ignore = new JCheckBox();
			ignore.setText("Ignore");
			ignore.setBackground(new Color(255, 125, 0));
			sl.setBackground(Color.RED);
			sl.setText("Slope field");
			popl.setText("Polar");
			popl.setBackground(Color.RED);
			JButton copy = new JButton("Edit Copy");
			JPanel calc = new JPanel();
			JLabel lwbd = new JLabel(" Lower Bound ");
			JLabel upbd = new JLabel(" Upper Bound ");
			JLabel ix = new JLabel(" Initial");
			final JTextField lb = new JTextField(10);
			final JTextField ub = new JTextField(10);
			final JTextField xi = new JTextField(10);
			calc.setBackground(Color.RED);
			lb.setBackground(new Color(255, 125, 0));
			ub.setBackground(new Color(255, 125, 0));
			xi.setBackground(new Color(255, 125, 0));
			JPanel calc2 = new JPanel();
			calc2.setBackground(Color.RED);
			final JButton zro = new JButton("Zero");
			final JButton slop2 = new JButton("Slope");
			final JButton minmax = new JButton("Crit Pts");
			final JButton di = new JButton("Area");
			final JButton valu = new JButton("Value");
			final JTextArea answz = new JTextArea(5, 20);
			answz.setEditable(false);
			answz.setBackground(new Color(255, 125, 0));
			JScrollPane js3 = new JScrollPane(answz);
			final Newtonz_Method nm = new Newtonz_Method(null, 0, 100);
			final mm c = new mm(null, 0, 100);
			final SimpRool sr = new SimpRool(null, 0, 0);
			final PExt d = new PExt(null, 0, 100);
			final PolarDer du2 = new PolarDer("", 0);
			final PZero nm2 = new PZero(null, 0, 100);
			final PInt sr2 = new PInt(null, 0, 0);
			
			
			valu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String e1 = coldis.getText();
						double guess = Double.parseDouble(xi.getText());
						EPU.changex(guess);
						if(e1.contains("w")) {
							i2.changeEq(e1);
							i2.convert();
							EPU.changeEq(i2.getR());
						}
						else {
							EPU.changeEq(e1);
						}
						EPU.solve();
						if(EPU.isGood()) {
							if(Boolean.parseBoolean(isitpolar.get(colorchangeindex).toString())) {
								if(eq.get(colorchangeindex).toString().contains("x")) {
									answz.append("r(A@ " + guess + ") = " + EPU.getAns() + "\n(" + EPU.getAns()*Math.cos(guess) + ", " + EPU.getAns()*Math.sin(guess) + ")\n");
								}
								else {
									answz.append("A(r@ " + guess + ") = " + EPU.getAns() + "\n(" + guess*Math.cos(EPU.getAns()) + ", " + guess*Math.sin(EPU.getAns()) + ")\n");
								}
								
							}
							else {
								if(eq.get(colorchangeindex).toString().contains("x")) {
									answz.append("f(x@ "+ guess + ") = " + EPU.getAns() + "\n");
								}
								else {
									answz.append("f(y@ "+ guess + ") = " + EPU.getAns() + "\n");
								}
							}
						}
						else {
							errorsndbx.setText("Could not calculate value.");
							errordis.setVisible(true);
							Toolkit.getDefaultToolkit().beep();
						}
					}
					catch(Exception err) {
						errorsndbx.setText("That is not an acceptable input.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
			});
			slop2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							boolean prr = Boolean.parseBoolean(isitpolar.get(colorchangeindex).toString());
							if(prr == false) {
						try {
							double guess = Double.parseDouble(xi.getText());
							String e1 = "";
							if(coldis.getText().contains("x")) {
								e1 = coldis.getText();
							}
							else {
								i2.changeEq(coldis.getText());
								i2.convert();
								e1 = i2.getR();
							}
							du.changeEq(e1);
							du.changex(guess);
							du.getDer();
							if(du.isErrd() == false) {
								if(eq.get(colorchangeindex).toString().contains("x")) {
								answz.append("dery(" + guess + ") = " + du.der() + "\n");
								}
								else {
									answz.append("derx(" + guess + ") = " + du.der() + "\n");
								}
							}
							else {
								errorsndbx.setText("Could not estimate derivative.");
								errordis.setVisible(true);
								Toolkit.getDefaultToolkit().beep();
							}
						}
						catch(Exception error) {
							errorsndbx.setText("That is not an acceptable input.");
							errordis.setVisible(true);
							Toolkit.getDefaultToolkit().beep();
						}
						}
							else{
								try {
									double guess = Double.parseDouble(xi.getText());
									String e1 = coldis.getText();
									String e2 = "";
									if(coldis.getText().contains("x")) {
										e2 = coldis.getText();
									}
									else {
										i2.changeEq(coldis.getText());
										i2.convert();
										e2 = i2.getR();
									}
									EPU.changeEq(e2);
									EPU.changex(guess);
									EPU.solve();
									du2.changeEq(e1);
									du2.changeX(guess);
									du2.pder();
									du.changeEq(e2);
									du.changex(guess);
									du.getDer();
									if(du2.isGood()) {
										if(eq.get(colorchangeindex).toString().contains("x")) {
										answz.append("der[y](" + EPU.getAns()*Math.cos(guess) +"," + EPU.getAns()*Math.sin(guess) + ") = " + du2.getAns() + "\n");
										answz.append("der[r](" + guess + ") = " + du.getAns() + "\n");
										}
										else {
											answz.append("der[y](" + df4.format(guess*Math.cos(EPU.getAns())) +", " + df4.format(guess*Math.sin(EPU.getAns())) + ") = " + du2.getAns() + "\n");
											answz.append("der[A](" + guess + ") = " + du.getAns() + "\n");
										}
									}
									else {
										errorsndbx.setText("Could not estimate derivative.");
										errordis.setVisible(true);
										Toolkit.getDefaultToolkit().beep();
									}
								}
								catch(Exception error) {
									errorsndbx.setText("That is not an acceptable input.");
									errordis.setVisible(true);
									Toolkit.getDefaultToolkit().beep();
								}
							}
					}
						catch(Exception err) {
							errorsndbx.setText("Could not determine polar or non-polar equation. Tell a programer!");
							errordis.setVisible(true);
							Toolkit.getDefaultToolkit().beep();
						}
					}
			});
			
			zro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						boolean prr = Boolean.parseBoolean(isitpolar.get(colorchangeindex).toString());
						if(prr == false) {
					try {
						double guess = Double.parseDouble(xi.getText());
						String e1 = "";
						if(eq.get(colorchangeindex).toString().contains("x")) {
						e1 = coldis.getText();
						}
						else {
							i2.changeEq(coldis.getText());
							i2.convert();
							e1 = i2.getR();
						}
						nm.changeEq(e1);
						nm.changex(guess);
						nm.getZero();
						if(nm.isGood() && nm.getInacc() == false) {
							if(eq.get(colorchangeindex).toString().contains("x")) {
							answz.append("Zero at x = " + nm.getAns() + "\n");
							}
							else {
								answz.append("Zero at y = " + nm.getAns() + "\n");
							}
						}
						else if(nm.isGood() && nm.getInacc()) {
							if(eq.get(colorchangeindex).toString().contains("x")) {
							answz.append("Zero at x = " + nm.getAns() + " <!> " + "\n");
							}
							else {
								answz.append("Zero at y = " + nm.getAns() + " <!> " + "\n");
							}
						}
						else {
							answz.append("Could not find zero using initial guess " + guess + "\n");
						}
					}
					catch(Exception error) {
						errorsndbx.setText("That is not an acceptable input.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
						}
						else {
							try {
								double guess = Double.parseDouble(xi.getText());
								String e1 = coldis.getText();
								nm2.changeEq(e1);
								nm2.changex(guess);
								nm2.getZero();
								if(nm2.isGood()) {
									answz.append("Zero at x = " + nm2.getAns() + "\n");
								}
								else {
									answz.append("Could not find zero using initial guess " + guess + "\n");
								}
							}
							catch(Exception error) {
								errorsndbx.setText("That is not an acceptable input.");
								errordis.setVisible(true);
								Toolkit.getDefaultToolkit().beep();
							}
						}
				}
					catch(Exception err) {
						errorsndbx.setText("Could not determine polar or non-polar equation. Tell a programer!");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
			}
		});
			
			minmax.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						boolean prr = Boolean.parseBoolean(isitpolar.get(colorchangeindex).toString());
					
					if(prr == false) {
					try {
						double guess = Double.parseDouble(xi.getText());
						boolean reverse = false;
						String e1 = coldis.getText();
						if(e1.contains("w")) {
							i2.changeEq(e1);
							i2.convert();
							e1 = i2.getR();
							reverse = true;
						}
						c.changeEq(e1);
						c.changeX(guess);
						c.calcCritPts();
						if(c.isGood()) {
							if(reverse == false) {
							answz.append("Crit pt detected @ (" + c.getCritPtsX() + ", " + c.getCritPtsY() + ")\n");
							}
							else {
								answz.append("Crit pt detected @ (" + c.getCritPtsY() + ", " + c.getCritPtsX() + ")\n");
							}
						}
						else {
							answz.append("Could not detect any crit pts\n");
						}
					}
					catch(Exception error) {
						errorsndbx.setText("That is not an acceptable input.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
					}
					else {
						try {
							double guess = Double.parseDouble(xi.getText());
							String e1 = coldis.getText();
							d.changeEq(e1);
							d.changeX(guess);
							d.calcCritPts();
							if(d.isGood()) {
										answz.append("Crit pt detected @ (" + d.getCritPtsX() + ", " + d.getCritPtsY() + ")\n");
							}
							else {
								answz.append("Could not detect any crit pts\n");
							}
						}
						catch(Exception error) {
							errorsndbx.setText("That is not an acceptable input.");
							errordis.setVisible(true);
							Toolkit.getDefaultToolkit().beep();
						}
					}
					}
					catch(Exception err) {
						errorsndbx.setText("Could not determine polar or non-polar equation. Tell a programer!");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
		});
			
			di.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						boolean prr = Boolean.parseBoolean(isitpolar.get(colorchangeindex).toString());
						if(prr == false) {
					try {
						double st = Double.parseDouble(lb.getText());
						double ed = Double.parseDouble(ub.getText());
						if(st > ed) {
							errorsndbx.setText("That is not an acceptable input.  Lower bound must be less than the upper bound.");
							errordis.setVisible(true);
							Toolkit.getDefaultToolkit().beep();
						}
						else {
						String e1 = coldis.getText();
						if(e1.contains("w")) {
							i2.changeEq(e1);
							i2.convert();
							e1 = i2.getR();
						}
						sr.changeEq(e1);
						sr.changeLowerBound(st);
						sr.changeUpperBound(ed);
						sr.integrate();
						if(sr.isGood()) {
							answz.append("int(" + st + ", " + ed + ") = " + sr.getRoundedAns() + "\n");
						}
						else {
							answz.append("Error\n");
						}
					}
					}
					catch(Exception err) {
						errorsndbx.setText("That is not an acceptable input.");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
						}
						else {
							try {
								double st = Double.parseDouble(lb.getText());
								double ed = Double.parseDouble(ub.getText());
								if(st > ed) {
									errorsndbx.setText("That is not an acceptable input.  Lower bound must be less than the upper bound.");
									errordis.setVisible(true);
									Toolkit.getDefaultToolkit().beep();
								}
								else {
								String e1 = coldis.getText();
								sr2.changeEq(e1);
								sr2.changeLowerBound(st);
								sr2.changeUpperBound(ed);
								sr2.integrate();
								if(sr2.isGood()) {
									answz.append("int(" + st + ", " + ed + ") = " + sr2.getRoundedAns() + "\n");
								}
								else {
									answz.append("Error\n");
								}
							}
							}
							catch(Exception err) {
								errorsndbx.setText("That is not an acceptable input.");
								errordis.setVisible(true);
								Toolkit.getDefaultToolkit().beep();
							}	
						}
				}
					catch(Exception err) {
						errorsndbx.setText("Could not determine polar or non-polar equation. Tell a programer!");
						errordis.setVisible(true);
						Toolkit.getDefaultToolkit().beep();
					}
				}
		});
			
			jppropertez.setLayout(new FlowLayout());
			jppropertez.add(linecol);
			jppropertez.add(coldis);
			jppropertez.add(changecolor);
			jppropertez.add(copy);
			jppropertez.add(popl);
			jppropertez.add(sl);
			jppropertez.add(ignore);
			jfpropertez.getContentPane().add(jppropertez, BorderLayout.NORTH);
			calc.setLayout(new FlowLayout());
			calc.add(lwbd);
			calc.add(lb);
			calc.add(upbd);
			calc.add(ub);
			calc.add(ix);
			calc.add(xi);
			jfpropertez.getContentPane().add(calc, BorderLayout.CENTER);
			calc2.setLayout(new FlowLayout());
			calc2.add(slop2);
			calc2.add(zro);
			calc2.add(minmax);
			calc2.add(di);
			calc2.add(valu);
			calc2.add(js3);
			jfpropertez.getContentPane().add(calc2, BorderLayout.SOUTH);
			jfpropertez.pack();
			jfpropertez.setResizable(false);
			jfpropertez.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
			
			
			final JList eqlst = new JList(eq);
			eqlst.setBackground(new Color(255, 125, 0));
			JScrollPane eqsc = new JScrollPane(eqlst);
			JButton tabul = new JButton("Table");
			Dimension dd = new Dimension(300,150);
			eqsc.setPreferredSize(dd);
			final JFrame tframe = new JFrame("Red Phial Graphing Utility");
			JPanel tpl1 = new JPanel();
			JButton cont = new JButton("Get table");
			tpl1.setBackground(Color.RED);
			JPanel tpl2 = new JPanel();
			tpl2.setBackground(Color.RED);
			JPanel tpl3 = new JPanel();
			tpl3.setBackground(Color.RED);
			final JTextField tstart = new JTextField(5);
			tstart.setBackground(new Color(255, 125, 0));
			final JTextField tdx = new JTextField(5);
			final JTextField titemz = new JTextField(5);
			titemz.setBackground(new Color(255, 125, 0));
			tdx.setBackground(new Color(255, 125, 0));
			JLabel tstrt = new JLabel("Table start: ");
			JLabel tdelta = new JLabel("Table dt: ");
			JLabel numroitmz = new JLabel("# of Items: ");
			JPanel tpl4 = new JPanel();
			tpl4.setBackground(Color.RED);
			tframe.setIconImage(rp.getImage());
			tpl1.setLayout(new FlowLayout());
			tpl2.setLayout(new FlowLayout());
			tpl3.setLayout(new FlowLayout());
			tpl4.setLayout(new FlowLayout());
			tpl1.add(tstrt);
			tpl1.add(tstart);
			tpl2.add(tdelta);
			tpl2.add(tdx);
			tpl3.add(numroitmz);
			tpl3.add(titemz);
			tpl4.add(cont);
			tframe.getContentPane().add(tpl1, BorderLayout.NORTH);
			tframe.getContentPane().add(tpl2, BorderLayout.CENTER);
			tframe.getContentPane().add(tpl3, BorderLayout.SOUTH);
			tframe.getContentPane().add(tpl4, BorderLayout.EAST);
			tframe.pack();
			tframe.setResizable(false);
			tframe.setDefaultCloseOperation(WHEN_IN_FOCUSED_WINDOW);
			
			
			jp1.setLayout(new FlowLayout());
			jp2.setLayout(new FlowLayout());
			jp3.setLayout(new GridLayout(2,1));
			jp1.add(jlb1);
			jp1.add(jtf2);
			jp2.add(eqsc);
			jp3.add(add);
			jp3.add(remove);
			jp3.add(propertez);
			jp3.add(mast);
			jp2.add(jbt1);
			jp2.add(tabul);
			jf1.getContentPane().add(jp1, BorderLayout.CENTER);
			jf1.getContentPane().add(jp2, BorderLayout.SOUTH);
			jf1.getContentPane().add(jp3, BorderLayout.EAST);
			jf1.pack();
			jf1.setResizable(false);
			jf1.setVisible(true);
			
			sam.setIconImage(rp.getImage());
			JPanel samp = new JPanel();
			samp.setBackground(Color.RED);
			JPanel samp2 = new JPanel();
			samp2.setBackground(Color.RED);
			final JSlider dxrc = new JSlider(JSlider.HORIZONTAL);
			JLabel jls1 = new JLabel("Number of samples to take per unit in rectangular mode");
			dxrc.setMaximum(25);
			dxrc.setMinimum(0);
			dxrc.setMajorTickSpacing(5);
			dxrc.setMinorTickSpacing(1);
			dxrc.setPaintTicks(true);
			dxrc.setBackground(Color.RED);
			dxrc.setPaintLabels(true);
			dxrc.setForeground(new Color(255, 125, 0));
			final JSlider dxpc = new JSlider(JSlider.HORIZONTAL);
			JLabel jls2 = new JLabel("Number of samples to take per unit in polar mode");
			dxpc.setMaximum(50);
			dxpc.setBackground(Color.RED);
			dxpc.setMinimum(0);
			dxpc.setPaintTicks(true);
			dxpc.setPaintLabels(true);
			dxpc.setForeground(new Color(255, 125, 0));
			dxpc.setMajorTickSpacing(10);
			dxpc.setMinorTickSpacing(1);
			JButton done = new JButton("Done");
			samp.setLayout(new GridLayout(4,1));
			samp.add(jls1);
			samp.add(dxrc);
			samp.add(jls2);
			samp.add(dxpc);
			samp2.setLayout(new FlowLayout());
			samp2.add(done);
			sam.getContentPane().add(samp, BorderLayout.CENTER);
			sam.getContentPane().add(samp2, BorderLayout.SOUTH);
			sam.pack();
			sam.setResizable(false);
			
			jpjp.setBackground(Color.RED);
			jpjf.setIconImage(rp.getImage());
			
			samplez.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dxrc.setValue((int) Math.round(1/dxr));
					dxpc.setValue((int) Math.round(1/dxp));
					sam.setVisible(true);
				}
			});
			
			num5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(num5.isSelected() == true) {
						nms = true;
					}
					else {
						nms = false;
					}
				}
			});
			
			done.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double prev = dxr;
					if(dxrc.getValue() > 0){
					double pdx = dxrc.getValue();
					dxr = 1/pdx;
					//**.out.println(dxr);
					}
					else{
						dxr = 0.125;
					}
					if(dxr != prev) {
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							try {
							if(Boolean.parseBoolean(isitpolar.get(n).toString()) == false) {
							prosd.remove(n);
							prosd.add(n, 0);
							}
							}
							catch(Exception err) {
								err.printStackTrace();
							}
							n++;
						}
					}
					prev = dxp;
					if(dxpc.getValue() > 0){
						double pdx2 = dxpc.getValue();
						dxp = 1/pdx2;
						//**.out.print(dxp);
					}
					else {
						dxp = 0.05;
					}
					if(dxp != prev) {
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							if(Boolean.parseBoolean(isitpolar.get(n).toString()) == true) {
							prosd.remove(n);
							prosd.add(n, 0);
							}
							n++;
						}
					}
					sam.dispose();
				}
			});
			
			copy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						jtf2.setText(coldis.getText().toString());
					}
					catch(Exception err) {
						errorsndbx.setText("An index error has occured.");
						errordis.setVisible(true);
					}
					jfpropertez.dispose();
				}
			});
			
			
			cont.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final JFrame tabframe = new JFrame("Red Phial Graphing Utility");
					polaradd = 1;
					tabframe.setIconImage(rp.getImage());
					final JPanel tabpan = new JPanel();
					tabpan.setBackground(Color.RED);
					try{
						tablestart2 = Double.parseDouble(tstart.getText());
					}
					catch(Exception err) {
						
					}
					try {
						interv = Double.parseDouble(tdx.getText());
					}
					catch(Exception err) {
						
					}
					try {
					ros = Integer.parseInt(titemz.getText());
					}
					catch(Exception err) {
						
					}
					int sze = 0;
					int trk = 0;
					boolean itr = false;
					while(trk < eq.getSize()) {
						itr = (eq.get(trk).toString().contains("x")) && (eq.get(trk).toString().contains("w")) && (eq.get(trk).toString().contains("y") == false);
						if(((Boolean.parseBoolean(iglst.get(trk).toString()))) || (itr == true) || (Boolean.parseBoolean(slop.get(trk).toString()))) {
							sze++;
						}
						trk++;
					}
					int colraw = eq.getSize() + 1 - sze;
					int setup = 0;
					while(setup < isitpolar.getSize()) {
						itr = (eq.get(setup).toString().contains("x")) && (eq.get(setup).toString().contains("w")) && (eq.get(setup).toString().contains("y") == false);
						if(Boolean.parseBoolean(iglst.get(setup).toString()) == false) {
						if((Boolean.parseBoolean(isitpolar.get(setup).toString())) && (itr == false) && (Boolean.parseBoolean(slop.get(setup).toString()) == false)) {
							colraw++;
						}
						}
						setup++;
					}
					JTable tab = new JTable(ros+1, colraw);
					if(colraw > 4) {
					tab.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					}
					else {
						tab.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					}
					tab.setEnabled(false);
					tab.setValueAt("Params", 0, 0);
					int write1 = 0;
					while(write1 < ros) {
						tab.setValueAt(tablestart2+(interv*write1), write1+1, 0);
						write1++;
					}
					int write2 = 0;
					int write25 = 0;
					int polaar = 1;
					int write3 = 0;
					while(write3 < eq.getSize()) {
						if((Boolean.parseBoolean(iglst.get(write3).toString()) == false)) {
						if(Boolean.parseBoolean(isitpolar.get(write3).toString())) {
							tab.setValueAt("x" + (write25+1), 0, write2 + polaar);
							tab.setValueAt("y"+ (write25+1), 0, write2+polaar+1);
							polaar++;
						}
						else{
							if((Boolean.parseBoolean(slop.get(write3).toString()) == false) && (eq.get(write3).toString().contains("x")) && (eq.get(write3).toString().contains("w") == false)) {
								tab.setValueAt("y" + (write25+1), 0, write2+polaar);
							}
							else if((Boolean.parseBoolean(slop.get(write3).toString()) == false) && (eq.get(write3).toString().contains("x") == false) && (eq.get(write3).toString().contains("w"))) {
							tab.setValueAt("x" + (write25+1), 0, write2+polaar);
							}
							else if((Boolean.parseBoolean(slop.get(write3).toString()) == false) && (eq.get(write3).toString().contains("y"))) {
								tab.setValueAt("y" + (write25+1), 0, write2+polaar);
							}
						}
						itr = (eq.get(write3).toString().contains("x")) && (eq.get(write3).toString().contains("w")) && (eq.get(write3).toString().contains("y") == false);
						if((Boolean.parseBoolean(slop.get(write3).toString()) == false) && (itr == false)) {
						write2++;
						}
						write25++;
						}
						write3++;
						
					}
					tab.setBackground(new Color(255, 125, 0));
					JScrollPane jstab = new JScrollPane(tab);
					tabframe.setResizable(false);
					//TODO add solver here for tabul
					int whereRwe = 0;
					EPU.changew(1);
					//EXCITING STUFF HAPPENS RIGHT HERE!
					int lsize = eq.getSize();
					int ximes = 0;
					int altximes = 0;
					while(ximes < lsize) { //start ximes loop
						if(Boolean.parseBoolean(iglst.get(ximes).toString()) == false) {
							//differential
							if(eq.get(ximes).toString().contains("y'=")) {
								if(Math.abs(interv) > 0.00001) {
								qph.setQ(eq.get(ximes).toString());
								boolean error = false;
								qph.Qprosc();
								double strt = qph.geticnx();
								double strtw = qph.geticnw();
								String ekw = qph.getEq();
								int numz = (int) Math.ceil(((tablestart2+ros*interv)-strt)/interv);
								int numz2 = (int) Math.ceil(ros-numz);
								//System.out.println(numz);
								int cnt = 0;
								double nux = strt;
								double nuw = strtw;
								boolean erred = false;
								int altidn = ros;
								rk.changeEq(ekw);
								//Wedge correction
								double integ = (tablestart2-strt)/interv;
								double integ2 = Math.round(integ);
								if(Math.abs(integ - integ2) > 0.0000001) {
									double ic = tablestart2-(integ2*interv);
									double itv = (ic - strt)/5;
									int ctrr = 0;
									while(ctrr < 6) {
										rk.changeICon(nux,nuw);
										rk.changeStep(itv);
										rk.RUNge();
										if(rk.isGood()) {
											nux = nux + itv;
											nuw = rk.getLambda();
										}
										else {
											errorsndbx.setText("an error has occured when adjusting the data.  Cells may be empty.");
											errordis.setVisible(true);
											Toolkit.getDefaultToolkit().beep();
										}
										ctrr++;
									}
									if(rk.isGood()) {
									strt = ic;
									strtw = rk.getLambda();
									numz = (int) Math.ceil(((tablestart2+ros*interv)-strt)/interv);
									numz2 = (int) Math.ceil(ros-numz);
									//System.out.println(strt);
									//System.out.println(strtw);
								}
								}
								nux = strt;
								nuw = strtw;
								//end Wedge correction
								while(cnt <= numz2) {
									rk.changeStep(-interv);
									rk.changeICon(nux, nuw);
									rk.RUNge();
									if(rk.isGood()) {
										nuw = rk.getLambda();
										nux = nux - interv;
										if(interv > 0) {
										if((nux <= ((interv*ros)+tablestart2)) && (nux >= tablestart2 - 0.000000001)) {
											try {
												int tst = (int) Math.round(((nux - tablestart2)/interv)+1);
												int tstx = tst;
												boolean tstr = false;
												while((tstx <= ros) && (tstr == false)) {
													if(Math.abs(Double.parseDouble(tab.getValueAt(tstx, 0).toString()) - nux) <= 0.00000001) {
														tab.setValueAt(nuw, tstx, altximes+polaradd);
														tstr = true;
													}
													//if(tstx == 1) {
													//System.out.println(tstx);
													//System.out.println(" ? " + tab.getValueAt(tstx, 0).toString());
													//System.out.println("nux = " + nux);
													//System.out.println(" | " + Math.abs(Double.parseDouble(tab.getValueAt(tstx, 0).toString()) - nux));
													//}
													tstx++;
												}
												}
												catch(Exception err) {
													System.out.println("parse int err");
													error = true;
												}
										}
									}
										else {
											if((nux >= ((interv*ros)+tablestart2)) && (nux <= tablestart2 - 0.000000001)) {
												try {
													int tst = (int) Math.round(((nux - tablestart2)/interv)+1);
													int tstx = tst;
													boolean tstr = false;
													while((tstx <= ros) && (tstr == false)) {
														if(Math.abs(Double.parseDouble(tab.getValueAt(tstx, 0).toString()) - nux) <= 0.00000001) {
															tab.setValueAt(nuw, tstx, altximes+polaradd);
															tstr = true;
														}
														
														tstx++;
													}
													}
													catch(Exception err) {
														System.out.println("parse int err");
														error = true;
													}
											}
										}
									}
									else {
										cnt = numz;
										erred = true;
										System.out.println("errd");
									}
									cnt++;
								}
								cnt = 0;
								rk.changeStep(interv);
								nux=strt;
								nuw=strtw;
								while(cnt < numz) {
									rk.changeICon(nux, nuw);
									rk.RUNge();
									if(rk.isGood()) {
										nuw = rk.getLambda();
										nux = nux + interv;
										if(interv > 0) {
										if((nux <= (interv*ros+tablestart2)) && (nux >= tablestart2 - 0.000000001)) {
											try {
												int tst = (int) Math.round(((nux - tablestart2)/interv)+1);
												int tstx = tst;
												boolean tstr = false;
												while((tstx <= ros) && (tstr == false)) {
													if(Math.abs(Double.parseDouble(tab.getValueAt(tstx, 0).toString()) - nux) <= 0.00000001) {
														tab.setValueAt(nuw, tstx, altximes+polaradd);
														tstr = true;
													}
													//if(tstx == 1) {
														//System.out.println(tstx);
														//System.out.println(" ? " + tab.getValueAt(tstx, 0).toString());
														//System.out.println("nux = " + nux);
														//System.out.println(" | " + Math.abs(Double.parseDouble(tab.getValueAt(tstx, 0).toString()) - nux));
														//}
													tstx++;
												}
												}
												catch(Exception err) {
													System.out.println("parse int err");
													err.printStackTrace();
													error = true;
												}
										}
									}
										else {
											if((nux >= ((interv*ros)+tablestart2)) && (nux <= tablestart2 - 0.000000001)) {
												try {
													int tst = (int) Math.round(((nux - tablestart2)/interv)+1);
													int tstx = tst;
													boolean tstr = false;
													while((tstx <= ros) && (tstr == false)) {
														if(Math.abs(Double.parseDouble(tab.getValueAt(tstx, 0).toString()) - nux) <= 0.00000001) {
															tab.setValueAt(nuw, tstx, altximes+polaradd);
															tstr = true;
														}
														tstx++;
													}
													}
													catch(Exception err) {
														System.out.println("parse int err");
														error = true;
													}
											}
										}
									}
									else {
										cnt = numz;
										erred = true;
										System.out.println("errd");
									}
									cnt++;
								}
								nux=strt;
								nuw=strtw;
								if(interv > 0) {
								if((nux <= (interv*ros+tablestart2)) && (nux >= tablestart2)) {
									int cu = 1;
									while(cu<ros+1) {
										if(Double.parseDouble(tab.getValueAt(cu, 0).toString()) == nux) {
											tab.setValueAt(nuw, cu, altximes+polaradd);
										}
										cu++;
									}
								}
							}
								else {
									if((nux >= (interv*ros+tablestart2)) && (nux <= tablestart2)) {
										int cu = 1;
										while(cu<ros+1) {
											if(Double.parseDouble(tab.getValueAt(cu, 0).toString()) == nux) {
												tab.setValueAt(nuw, cu, altximes+polaradd);
											}
											cu++;
										}
									}
								}
								if(error == true) {
									errorsndbx.setText("An error has occured while appending values to the tabul.  Some cells may be empty or contain inaccurate values, a different step size or table start value may yield more phavorable results.");
									errordis.setVisible(true);
									Toolkit.getDefaultToolkit().beep();
								}
							}
								else {
									errorsndbx.setText("Step sizes less than 0.00001 are not supported by this numerical differetial equation solver.");
									errordis.setVisible(true);
									Toolkit.getDefaultToolkit().beep();
								}
							}
							//end differential
							else {
						if((eq.get(ximes).toString().contains("w")) && (eq.get(ximes).toString().contains("x") == false) && (Boolean.parseBoolean(slop.get(ximes).toString()) == false)) {
							i2.changeEq(eq.get(ximes).toString());
							i2.convert();
							EPU.changeEq(i2.getR());
							ct = 0;
						}
						else if((Boolean.parseBoolean(slop.get(ximes).toString()) == false)){
					EPU.changeEq(eq.get(ximes).toString());
					ct = 0;
						}
						else {
							ct = ros;
						}
					EPU.changex(tablestart2);
					double a = tablestart2;
					while(ct<ros){
						if((eq.get(ximes).toString().contains("w") == false) || (eq.get(ximes).toString().contains("x") == false)) {
						EPU.solve();
						}
						if((Boolean.parseBoolean(isitpolar.get(ximes).toString()) == false)  && (Boolean.parseBoolean(slop.get(ximes).toString()) == false)) {//polar infanstructure
							if(eq.get(ximes).toString().contains("w") == false) {
							tab.setValueAt(EPU.getAns(), ct+1, altximes+polaradd);
							}
							else if((eq.get(ximes).toString().contains("w")) && (eq.get(ximes).toString().contains("x") == false)  && (Boolean.parseBoolean(slop.get(ximes).toString()) == false)) {
								tab.setValueAt(EPU.getAns(), ct+1, altximes+polaradd);
							}
							else {
								//tab.setValueAt("", ct+1, altximes+polaradd);
							}
							
							} //polar infanstructure
							if(Boolean.parseBoolean(isitpolar.get(ximes).toString()) == true) {
								if((eq.get(ximes).toString().contains("w") == false)  && (Boolean.parseBoolean(slop.get(ximes).toString()) == false)) {
								double x4 = Math.cos(a)*EPU.getAns();
								double y4 = Math.sin(a)*EPU.getAns();
								tab.setValueAt(x4, ct+1, altximes+polaradd);
								tab.setValueAt(y4, ct+1, altximes+polaradd+1);
								}
								else if((eq.get(ximes).toString().contains("w")) && (eq.get(ximes).toString().contains("x") == false)  && (Boolean.parseBoolean(slop.get(ximes).toString()) == false)) {
									double x4 = Math.cos(EPU.getAns())*a;
									double y4 = Math.sin(EPU.getAns())*a;
									tab.setValueAt(x4, ct+1, altximes+polaradd);
									tab.setValueAt(y4, ct+1, altximes+polaradd+1);
								}
								else {
									//tab.setValueAt("", ct+1, altximes+polaradd);
									//tab.setValueAt("", ct+1, altximes+polaradd+1);
								}
							}
							a = a + interv;
							EPU.changex(a);
						ct++;
					}
					if(Boolean.parseBoolean(isitpolar.get(ximes).toString()) == true) {
						polaradd++;
					}
							}
							itr = (eq.get(ximes).toString().contains("x")) && (eq.get(ximes).toString().contains("w")) && (eq.get(ximes).toString().contains("y") == false);
							if((Boolean.parseBoolean(slop.get(ximes).toString()) == false) && (itr == false)) {
					altximes++;
							}
						}
						ximes++;
					} //ximes loop ends here
					//TODO end solver tabul
					tabpan.setLayout(new FlowLayout());
					tabpan.add(jstab);
					tabframe.getContentPane().add(tabpan, BorderLayout.CENTER);
					tabframe.pack();
					tabframe.setVisible(true);
					tframe.dispose();
				}
			});
			
			tabul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						tstart.setText(Double.toString(tablestart2));
						titemz.setText(Integer.toString(ros));
						tdx.setText(Double.toString(interv));
					}
					catch(Exception err) {
						
					}
					
					tframe.setVisible(true);
				}
			});
			
			popl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						prosd.remove(colorchangeindex);
						prosd.add(colorchangeindex, 0);
						ready = false;
					boolean polr2 = false;
					if(popl.isSelected() == true) {
						isitpolar.remove(colorchangeindex);
						polr2 = true;
						isitpolar.add(colorchangeindex, polr2);
						if(true) {
						sl.setSelected(false);
						slop.remove(colorchangeindex);
						boolean slop3 = false;
						slop.add(colorchangeindex, slop3);
						}
					}
					if(popl.isSelected() == false) {
						isitpolar.remove(colorchangeindex);
						polr2 = false;
						isitpolar.add(colorchangeindex, polr2);
					}
					if((((eq.get(colorchangeindex).toString().contains("w"))) && (eq.get(colorchangeindex).toString().contains("x")))|| (Boolean.parseBoolean(slop.get(colorchangeindex).toString()) == true)) {
						slop2.setEnabled(false);
						minmax.setEnabled(false);
						di.setEnabled(false);
						zro.setEnabled(false);
						valu.setEnabled(false);
					}
					else {
						slop2.setEnabled(true);
						minmax.setEnabled(true);
						di.setEnabled(true);
						zro.setEnabled(true);
						valu.setEnabled(true);
					}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("could not change equation type to polar!  Tell a Programmer!");
						errordis.setVisible(true);
					}
				}
			});
			
			chax.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ax = JColorChooser.showDialog(jf1, "Selekt Kolor", Color.BLACK);
						axd.setBackground(ax);
						ready = false;
					}
					catch(Exception err) {
						
					}
				}
			});
			
			chbgr.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						bgr = JColorChooser.showDialog(jf1, "Selekt Kolor", Color.BLACK);
						bgrd.setBackground(bgr);
						ready = false;
					}
					catch(Exception err) {
						
					}
				}
			});
			
			chrec.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						rec = JColorChooser.showDialog(jf1, "Selekt Kolor", Color.BLACK);
						recd.setBackground(rec);
						ready = false;
					}
					catch(Exception err) {
						
					}
				}
			});
			
			chpol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						pol = JColorChooser.showDialog(jf1, "Selekt Kolor", Color.BLACK);
						pold.setBackground(pol);
						ready = false;
					}
					catch(Exception err) {
						
					}
				}
			});
			
			dun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if((rectangle != rect.isSelected()) || (polar != polr.isSelected())) {
					rectangle = rect.isSelected();
					polar = polr.isSelected();
					ready = false;
					}
					try {
						if(xscale != Double.parseDouble(xsc.getText())) {
						xscale = Double.parseDouble(xsc.getText());
						ready = false;
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							prosd.remove(n);
							prosd.add(n, 0);
							n++;
						}
						if(xscale <= 0.00001) {
							xscale = 1;
							Toolkit.getDefaultToolkit().beep();
							errorsndbx.setText("");
							errorsndbx.append("Unacceptable! Unacceptable! The Input value for the x scale is absolutely unacceptable! The x scale value has been reset to one to prevent errors.");
							errordis.setVisible(true);
						}
						}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Could not parse the entered value for x scale to an integer. Make sure an integer has been entered in the specified field.");
						errordis.setVisible(true);
						
					}
					try {
						if(yscale != Double.parseDouble(ysc.getText())) {
						yscale = Double.parseDouble(ysc.getText());
						ready = false;
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							prosd.remove(n);
							prosd.add(n, 0);
							n++;
						}
						if(yscale <= 0.00001) {
							yscale = 1;
							Toolkit.getDefaultToolkit().beep();
							errorsndbx.setText("");
							errorsndbx.append("Unacceptable! Unacceptable! The Input value for the y scale is absolutely unacceptable! The y scale value has been reset to one to prevent errors.");
							errordis.setVisible(true);
						}
						}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Could not parse the entered value for y scale to an integer. Make sure an integer has been entered in the specified field.");
						errordis.setVisible(true);
					}
					try {
						if(muvx != Integer.parseInt(muvxd.getText())) {
						muvx = Integer.parseInt(muvxd.getText());
						ready = false;
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							prosd.remove(n);
							prosd.add(n, 0);
							n++;
						}
						}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Could not parse the entered value for x center to an integer. Make sure an integer has been entered in the specified field.");
						errordis.setVisible(true);
					}
					try {
						if(muvy != Integer.parseInt(muvyd.getText())) {
						muvy = Integer.parseInt(muvyd.getText());
						ready = false;
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							prosd.remove(n);
							prosd.add(n, 0);
							n++;
						}
						}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Could not parse the entered value for y center to an integer. Make sure an integer has been entered in the specified field.");
						errordis.setVisible(true);
					}
					try {
						if(param1 != Integer.parseInt(parameter1.getText())) {
						param1 = Integer.parseInt(parameter1.getText());
						ready = false;
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							if(Boolean.parseBoolean(isitpolar.get(n).toString()) == true) {
							prosd.remove(n);
							prosd.add(n, 0);
							}
							n++;
						}
						}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Could not parse the entered value for minimum parameter to an integer. Make sure an integer has been entered in the specified field.");
						errordis.setVisible(true);
					}
					try {
						if(param2 != Integer.parseInt(parameter2.getText())) {
						param2 = Integer.parseInt(parameter2.getText());
						ready = false;
						int ps = prosd.getSize();
						int n = 0;
						while(n < ps){
							if(Boolean.parseBoolean(isitpolar.get(n).toString()) == true) {
							prosd.remove(n);
							prosd.add(n, 0);
							}
							n++;
						}
						}
						if(param1 > param2) {
							param2 = param1 + 1;
							Toolkit.getDefaultToolkit().beep();
							errorsndbx.setText("");
							errorsndbx.append("The maximum parameter MUST be greater than the minimum parameter!");
							errordis.setVisible(true);
							ready = false;
							int ps = prosd.getSize();
							int n = 0;
							while(n < ps){
								if(Boolean.parseBoolean(isitpolar.get(n).toString()) == true) {
								prosd.remove(n);
								prosd.add(n, 0);
								}
								n++;
							}
						}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Could not parse the entered value for maximum parameter to an integer. Make sure an integer has been entered in the specified field.");
						errordis.setVisible(true);
					}
					mst.dispose();
				}
			});
			
			mast.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(nms == true) {
						num5.setSelected(true);
					}
					else {
						num5.setSelected(false);
					}
					if(rectangle == true) {
						rect.setSelected(true);
					}
					else {
						rect.setSelected(false);
					}
					if(polar == true) {
						polr.setSelected(true);
					}
					else {
						polr.setSelected(false);
					}
					xsc.setText(Double.toString(xscale));
					ysc.setText(Double.toString(yscale));
					axd.setBackground(ax);
					bgrd.setBackground(bgr);
					pold.setBackground(pol);
					recd.setBackground(rec);
					muvxd.setText(Integer.toString(muvx));
					muvyd.setText(Integer.toString(muvy));
					parameter1.setText(Integer.toString(param1));
					parameter2.setText(Integer.toString(param2));
					
					mst.setVisible(true);
				}
			});
			
			changecolor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					Color userschoice = JColorChooser.showDialog(jf1, "Selekt Kolor", Color.DARK_GRAY);
					col.remove(colorchangeindex);
					col.add(colorchangeindex, userschoice);
					coldis.setBackground((Color) col.get(colorchangeindex));
					ready = false;
					}
					catch (Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("There was a problem when setting the new color. Make sure you actually selected a color. If the problem persists, tell a programmer.");
						errordis.setVisible(true);
					}
				}
			});
			
			add.addActionListener(new ActionListener() {
				@SuppressWarnings("unchecked")
				public void actionPerformed(ActionEvent e) {
					//Philter ahead
					boolean acceptable = false;
					boolean test0 = true;
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
					boolean test15 = true;
					String org = jtf2.getText();
					if(jtf2.getText().contains("y'=")) {
						qph.setQ(org);
						qph.Qprosc();
						if(qph.isGood() == false) {
							test0 = false;
						}
						else {
							jtf2.setText(qph.getEq());
						}
					}
					if(test0) {
					int scanindex = 0;
					int itemz = jtf2.getText().length();
					while(scanindex + 1 < itemz) {
						try {
							if((jtf2.getText(scanindex, 1).contains("*")) ||
									(jtf2.getText(scanindex, 1).contains("^")) ||
											(jtf2.getText(scanindex, 1).contains("-")) ||
											(jtf2.getText(scanindex, 1).contains("+")) ||
											(jtf2.getText(scanindex, 1).contains("/"))) {
								if((jtf2.getText(scanindex+1, 1).contains("0")) ||
										(jtf2.getText(scanindex+1, 1).contains("1")) ||
										(jtf2.getText(scanindex+1, 1).contains("2")) ||
										(jtf2.getText(scanindex+1, 1).contains("3")) ||
										(jtf2.getText(scanindex+1, 1).contains("4")) ||
										(jtf2.getText(scanindex+1, 1).contains("5")) ||
										(jtf2.getText(scanindex+1, 1).contains("6")) ||
										(jtf2.getText(scanindex+1, 1).contains("7")) ||
										(jtf2.getText(scanindex+1, 1).contains("8")) ||
										(jtf2.getText(scanindex+1, 1).contains("9")) ||
										(jtf2.getText(scanindex+1, 1).contains("x")) ||
										(jtf2.getText(scanindex+1, 1).contains("(")) ||
										(jtf2.getText(scanindex+1, 1).contains("s")) ||
										(jtf2.getText(scanindex+1, 1).contains("c")) ||
										(jtf2.getText(scanindex+1, 1).contains("t")) ||
										(jtf2.getText(scanindex+1, 1).contains("l")) ||
										(jtf2.getText(scanindex+1, 1).contains("e")) ||
										(jtf2.getText(scanindex+1, 1).contains("p")) ||
										(jtf2.getText(scanindex+1, 1).contains("S")) ||
										(jtf2.getText(scanindex+1, 1).contains("C")) ||
										(jtf2.getText(scanindex+1, 1).contains("T")) ||
										(jtf2.getText(scanindex+1, 1).contains("L")) ||
										(jtf2.getText(scanindex+1, 1).contains("a")) ||
										(jtf2.getText(scanindex+1, 1).contains("b")) ||
										(jtf2.getText(scanindex+1, 1).contains("d")) ||
										(jtf2.getText(scanindex+1, 1).contains("w")) ||
										(jtf2.getText(scanindex+1, 1).contains("v")) ||
										(jtf2.getText(scanindex+1, 1).contains("u")) ||
										(jtf2.getText(scanindex+1, 1).contains("~"))){
									
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
							if((jtf2.getText(scanindex+1, 1).contains("*")) ||
									(jtf2.getText(scanindex+1, 1).contains("^")) ||
											(jtf2.getText(scanindex+1, 1).contains("-")) ||
											(jtf2.getText(scanindex+1, 1).contains("+")) ||
											(jtf2.getText(scanindex+1, 1).contains("/"))) {
								if((jtf2.getText(scanindex, 1).contains("0")) ||
										(jtf2.getText(scanindex, 1).contains("1")) ||
										(jtf2.getText(scanindex, 1).contains("2")) ||
										(jtf2.getText(scanindex, 1).contains("3")) ||
										(jtf2.getText(scanindex, 1).contains("4")) ||
										(jtf2.getText(scanindex, 1).contains("5")) ||
										(jtf2.getText(scanindex, 1).contains("6")) ||
										(jtf2.getText(scanindex, 1).contains("7")) ||
										(jtf2.getText(scanindex, 1).contains("8")) ||
										(jtf2.getText(scanindex, 1).contains("9")) ||
										(jtf2.getText(scanindex, 1).contains("x")) ||
										(jtf2.getText(scanindex, 1).contains("e")) ||
										(jtf2.getText(scanindex, 1).contains("p")) ||
										(jtf2.getText(scanindex, 1).contains(")")) ||
										(jtf2.getText(scanindex, 1).contains("w"))) {
									
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
									(jtf2.getText(scanindex, 1).contains("(")) ||
									(jtf2.getText(scanindex, 1).contains(")")) ||
									(jtf2.getText(scanindex, 1).contains("x")) ||
									(jtf2.getText(scanindex, 1).contains("w")) ||
									(jtf2.getText(scanindex, 1).contains("e")) ||
									(jtf2.getText(scanindex, 1).contains("p")) ||
									(jtf2.getText(scanindex, 1).contains("0")) ||
									(jtf2.getText(scanindex, 1).contains("1")) ||
									(jtf2.getText(scanindex, 1).contains("2")) ||
									(jtf2.getText(scanindex, 1).contains("3")) ||
									(jtf2.getText(scanindex, 1).contains("4")) ||
									(jtf2.getText(scanindex, 1).contains("5")) ||
									(jtf2.getText(scanindex, 1).contains("6")) ||
									(jtf2.getText(scanindex, 1).contains("7")) ||
									(jtf2.getText(scanindex, 1).contains("8")) ||
									(jtf2.getText(scanindex, 1).contains("9")) ||
									(jtf2.getText(scanindex, 1).contains("s")) ||
									(jtf2.getText(scanindex, 1).contains("c")) ||
									(jtf2.getText(scanindex, 1).contains("t")) ||
									(jtf2.getText(scanindex, 1).contains("a")) ||
									(jtf2.getText(scanindex, 1).contains("b")) ||
									(jtf2.getText(scanindex, 1).contains("d")) ||
									(jtf2.getText(scanindex, 1).contains("S")) ||
									(jtf2.getText(scanindex, 1).contains("C")) ||
									(jtf2.getText(scanindex, 1).contains("T")) ||
									(jtf2.getText(scanindex, 1).contains("l")) ||
									(jtf2.getText(scanindex, 1).contains("L")) ||
									(jtf2.getText(scanindex, 1).contains("v")) ||
									(jtf2.getText(scanindex, 1).contains("u")) ||
									(jtf2.getText(scanindex, 1).contains("+")) ||
									(jtf2.getText(scanindex, 1).contains("-")) ||
									(jtf2.getText(scanindex, 1).contains("*")) ||
									(jtf2.getText(scanindex, 1).contains("/")) ||
									(jtf2.getText(scanindex, 1).contains("^")) ||
									(jtf2.getText(scanindex, 1).contains("~")) ||
									(jtf2.getText(scanindex, 1).contains("."))
									
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
							if(jtf2.getText(scanindex, 1).contains("(")) {
								openparz++;
							}
						} catch (BadLocationException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
							test4 = false;
						}
						try {
							if(jtf2.getText(scanindex, 1).contains(")")) {
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
							if((jtf2.getText(scanindex, 1).contains("s")) ||
									(jtf2.getText(scanindex, 1).contains("c")) ||
									(jtf2.getText(scanindex, 1).contains("t")) ||
									(jtf2.getText(scanindex, 1).contains("l")) ||
									(jtf2.getText(scanindex, 1).contains("S")) ||
									(jtf2.getText(scanindex, 1).contains("C")) ||
									(jtf2.getText(scanindex, 1).contains("T")) ||
									(jtf2.getText(scanindex, 1).contains("L")) ||
									(jtf2.getText(scanindex, 1).contains("a")) ||
									(jtf2.getText(scanindex, 1).contains("b")) ||
									(jtf2.getText(scanindex, 1).contains("d")) ||
									(jtf2.getText(scanindex, 1).contains("v")) ||
									(jtf2.getText(scanindex, 1).contains("u"))) {
								if(jtf2.getText(scanindex+1, 1).contains("(")) {
									
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
						if((jtf2.getText(itemz-1, 1).contains("*")) ||
								(jtf2.getText(itemz-1, 1).contains("^")) ||
								(jtf2.getText(itemz-1, 1).contains("/")) ||
								(jtf2.getText(itemz-1, 1).contains("+")) ||
								(jtf2.getText(itemz-1, 1).contains("-")) ||
								(jtf2.getText(itemz-1, 1).contains("(")) ||
								(jtf2.getText(itemz-1, 1).contains("s")) ||
								(jtf2.getText(itemz-1, 1).contains("c")) ||
								(jtf2.getText(itemz-1, 1).contains("t")) ||
								(jtf2.getText(itemz-1, 1).contains("l")) ||
								(jtf2.getText(scanindex, 1).contains("S")) ||
								(jtf2.getText(scanindex, 1).contains("C")) ||
								(jtf2.getText(scanindex, 1).contains("T")) ||
								(jtf2.getText(scanindex, 1).contains("L")) ||
								(jtf2.getText(scanindex, 1).contains("a")) ||
								(jtf2.getText(scanindex, 1).contains("b")) ||
								(jtf2.getText(scanindex, 1).contains("d")) ||
								(jtf2.getText(scanindex, 1).contains("v")) ||
								(jtf2.getText(scanindex, 1).contains("u"))) {
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
							if((jtf2.getText(scanindex, 1).contains("x")) ||
									(jtf2.getText(scanindex, 1).contains("e")) ||
									(jtf2.getText(scanindex, 1).contains("p")) ||
									(jtf2.getText(scanindex, 1).contains("w"))) {
								if((jtf2.getText(scanindex+1, 1).contains("^")) ||
										(jtf2.getText(scanindex+1, 1).contains("*")) ||
										(jtf2.getText(scanindex+1, 1).contains("/")) ||
										(jtf2.getText(scanindex+1, 1).contains("+")) ||
										(jtf2.getText(scanindex+1, 1).contains("-")) ||
										(jtf2.getText(scanindex+1, 1).contains(")"))) {
									
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
							if((jtf2.getText(scanindex+1, 1).contains("x")) ||
									(jtf2.getText(scanindex+1, 1).contains("e")) ||
									(jtf2.getText(scanindex+1, 1).contains("p")) ||
									(jtf2.getText(scanindex+1, 1).contains("w"))) {
								if((jtf2.getText(scanindex, 1).contains("0")) ||
										(jtf2.getText(scanindex, 1).contains("1")) ||
										(jtf2.getText(scanindex, 1).contains("2")) ||
										(jtf2.getText(scanindex, 1).contains("3")) ||
										(jtf2.getText(scanindex, 1).contains("4")) ||
										(jtf2.getText(scanindex, 1).contains("5")) ||
										(jtf2.getText(scanindex, 1).contains("6")) ||
										(jtf2.getText(scanindex, 1).contains("7")) ||
										(jtf2.getText(scanindex, 1).contains("8")) ||
										(jtf2.getText(scanindex, 1).contains("9")) ||
										(jtf2.getText(scanindex, 1).contains("x")) ||
										(jtf2.getText(scanindex, 1).contains("e")) ||
										(jtf2.getText(scanindex, 1).contains("p")) ||
										(jtf2.getText(scanindex, 1).contains(".")) ||
										(jtf2.getText(scanindex, 1).contains("w"))) {
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
						if((jtf2.getText(0, 1).contains("^")) ||
								(jtf2.getText(0, 1).contains("*")) ||
								(jtf2.getText(0, 1).contains("/")) ||
								(jtf2.getText(0, 1).contains("+")) ||
								(jtf2.getText(0, 1).contains("-")) ||
								(jtf2.getText(0, 1).contains(")"))) {
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
							if(jtf2.getText(scanindex, 1).contains("x") ||
									jtf2.getText(scanindex, 1).contains("e") ||
									jtf2.getText(scanindex, 1).contains("p") ||
									jtf2.getText(scanindex, 1).contains("w")) {
								if(jtf2.getText().length() == 1) {
									//test10 = false;
								}
								else if(jtf2.getText(scanindex + 1, 1).contains("^") ||
										jtf2.getText(scanindex + 1, 1).contains("*") ||
										jtf2.getText(scanindex + 1, 1).contains("/") ||
										jtf2.getText(scanindex + 1, 1).contains("+") ||
										jtf2.getText(scanindex + 1, 1).contains(")") ||
										jtf2.getText(scanindex + 1, 1).contains("-")) {
									
								}
								else if(jtf2.getText(scanindex - 1, 1).contains("^") ||
										jtf2.getText(scanindex - 1, 1).contains("*") ||
										jtf2.getText(scanindex - 1, 1).contains("/") ||
										jtf2.getText(scanindex - 1, 1).contains("+") ||
										jtf2.getText(scanindex - 1, 1).contains("~") ||
										jtf2.getText(scanindex - 1, 1).contains("(") ||
										jtf2.getText(scanindex - 1, 1).contains("-")) {
									
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
					//scanindex = 0;
					//int opar = 0;
					//while(scanindex < itemz) {
						//try {
							//if(jtf2.getText(scanindex, 1).contains("(")) {
								//opar++;
							//}
							//if(jtf2.getText(scanindex, 1).contains(")")) {
								//opar--;
							//}
							//if(opar > 7) {
								//test11 = false;
							//}
						//} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							//e1.printStackTrace();
							//test11 = false;
						//}
						//scanindex++;
					//}
					//test
					scanindex = 0;
					while(scanindex+1 < itemz) {
						try {
							if((jtf2.getText(scanindex, 1).contains("0")) ||
											(jtf2.getText(scanindex, 1).contains("1")) ||
											(jtf2.getText(scanindex, 1).contains("2")) ||
											(jtf2.getText(scanindex, 1).contains("3")) ||
											(jtf2.getText(scanindex, 1).contains("4")) ||
											(jtf2.getText(scanindex, 1).contains("5")) ||
											(jtf2.getText(scanindex, 1).contains("6")) ||
											(jtf2.getText(scanindex, 1).contains("7")) ||
											(jtf2.getText(scanindex, 1).contains("8")) ||
											(jtf2.getText(scanindex, 1).contains("9")) ||
											(jtf2.getText(scanindex, 1).contains("x")) ||
											(jtf2.getText(scanindex, 1).contains("e")) ||
											(jtf2.getText(scanindex, 1).contains("p")) ||
											(jtf2.getText(scanindex, 1).contains(".")) ||
											(jtf2.getText(scanindex, 1).contains("w")) ||
											(jtf2.getText(scanindex, 1).contains(")"))) {
								if((jtf2.getText(scanindex+1, 1).contains("S")) ||
								(jtf2.getText(scanindex+1, 1).contains("C")) ||
								(jtf2.getText(scanindex+1, 1).contains("T")) ||
								(jtf2.getText(scanindex+1, 1).contains("L")) ||
								(jtf2.getText(scanindex+1, 1).contains("a")) ||
								(jtf2.getText(scanindex+1, 1).contains("b")) ||
								(jtf2.getText(scanindex+1, 1).contains("d")) ||
								(jtf2.getText(scanindex+1, 1).contains("v")) ||
								(jtf2.getText(scanindex+1, 1).contains("u")) ||
								(jtf2.getText(scanindex+1, 1).contains("s")) ||
								(jtf2.getText(scanindex+1, 1).contains("c")) ||
								(jtf2.getText(scanindex+1, 1).contains("t"))) {
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
							if((jtf2.getText(scanindex, 1).contains("(")) && jtf2.getText(scanindex+1, 1).contains(")")) {
								test13 = false;
							}
						}
						catch(Exception err) {
							test13 = false;
						}
						scanindex++;
					}
					if(jtf2.getText().contains("w") && jtf2.getText().contains("u") && jtf2.getText().contains("x")) {
						test14 = false;
					}
					
					scanindex = 0;
					while(scanindex < itemz) {
						
						try {
							if(jtf2.getText(scanindex, 1).contains("~")) {
								if(scanindex > 0) {
									if(jtf2.getText(scanindex - 1, 1).contains("0") ||
									jtf2.getText(scanindex - 1, 1).contains("1") ||
									jtf2.getText(scanindex - 1, 1).contains("2") ||
									jtf2.getText(scanindex - 1, 1).contains("3") ||
									jtf2.getText(scanindex - 1, 1).contains("4") ||
									jtf2.getText(scanindex - 1, 1).contains("5") ||
									jtf2.getText(scanindex - 1, 1).contains("6") ||
									jtf2.getText(scanindex - 1, 1).contains("7") ||
									jtf2.getText(scanindex - 1, 1).contains("8") ||
									jtf2.getText(scanindex - 1, 1).contains("9") ||
									jtf2.getText(scanindex - 1, 1).contains(".") ||
									jtf2.getText(scanindex - 1, 1).contains("x") ||
									jtf2.getText(scanindex - 1, 1).contains("w") ||
									jtf2.getText(scanindex - 1, 1).contains("p") ||
									jtf2.getText(scanindex - 1, 1).contains("e")) {
										test15 = false;
									}
									
								}
								if(scanindex + 1 < itemz) {
									if(jtf2.getText(scanindex + 1, 1).contains("+") ||
									jtf2.getText(scanindex + 1, 1).contains("-") || 
									jtf2.getText(scanindex + 1, 1).contains("*") ||
									jtf2.getText(scanindex + 1, 1).contains("/") ||
									jtf2.getText(scanindex + 1, 1).contains("^") ||
									jtf2.getText(scanindex + 1, 1).contains(".")) {
									test15 = false;
									}
								}
								else {
									test15 = false;
								}
								if(jtf2.getText().length() <= 1) {
									test15 = false;
								}
								
							}
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							test15 = false;
						}
						
						scanindex++;
					}
					
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
							(test0 == true) &&
							(test14 == true) &&
							(test15 == true)){
						acceptable = true;
					}
					
					} // added
					//end philter
					if(acceptable == true) {
						ready = false;
					boolean polar2 = false;
					boolean slop2 = false;
					boolean ignore = false;
					Color userschoice = null;
					try {
					userschoice = JColorChooser.showDialog(jf1, "Selekt Kolor", Color.DARK_GRAY);
					if(userschoice == null) {
						
					}
					else {
					col.addElement(userschoice);
					isitpolar.addElement(polar2);
					slop.addElement(slop2);
					iglst.addElement(ignore);
					prosd.addElement(0);
					jtf2.setText(org);
					if(jtf2.getText().length() > 0){
					eq.addElement(jtf2.getText());
					jtf2.setText("");
					}
					else {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Enter an equation in the text field then click add to add it to the graphing schedule.");
												errordis.setVisible(true);
					}
					}
					
					}
					catch (Exception err) {
						Color temp = new Color(0, 0, 155);
						col.addElement(temp);
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("There was a problem when setting the new color. Make sure you actually selected a color. If the problem persists, tell a programmer.");
						errordis.setVisible(true);
					}
					
				}
					else {
						jtf2.setText(org);
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Unacceptable! Unacceptable! Your entry was absolutely unacceptable! Your entry will not be admitted to the graphing schedule until you fix it.");
						if(test0 == false) {
							errorsndbx.append(" That is not the proper way to define a differential equation in Red Phial Graphing Utility.");
						}
						if(test1 == false) {
							errorsndbx.append(" A number or an open parenthesis must follow an operator.");
						}
						if(test2 == false) {
							errorsndbx.append(" A number must precede an operator.");
						}
						if(test3 == false) {
							errorsndbx.append(" Unacceptable characters were detected.");
						}
						if(test4 == false) {
							errorsndbx.append(" Use the same number of open parenthesis and closed parenthesis.");
						}
						if(test5 == false) {
							errorsndbx.append(" An open parenthesis must follow a s c t v or l operation.");
						}
						if(test6 == false) {
							errorsndbx.append(" an operator or an open parenthesis may not be the last character in an equation.");
						}
						if((test7 == false) || (test8 == false)) {
							errorsndbx.append(" Numbers cannot be put next to x, e, w, or p; separate them with operators or a closed parenthesis.");
						}
						if(test9 == false) {
							errorsndbx.append(" Operators may not be the first character in an equation.");
						}
						if(test10 == false) {
							errorsndbx.append(" A constant was used incorrectly.  An operator is required.");
						}
						if(test11 == false) {
							errorsndbx.append(" Your entry has exceeded the number of nested parenthesis supported by this program.");
						}
						if(test12 == false) {
							errorsndbx.append(" Use the multiplication symbol before operations.");
						}
						if(test13 == false){
							errorsndbx.append(" Parenthesis abuse detected.");
						}
						if(test14 == false){
							errorsndbx.append(" Unit step functions are not supported for implicit equations.");
						}
						if(test15 == false) {
							errorsndbx.append(" ~ used in unacceptible way.");
						}

						errordis.setVisible(true);
					}
				
					}
			});
			
			ignore.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					if(ignore.isSelected()) {
						iglst.remove(colorchangeindex);
						boolean ig = true;
						iglst.add(colorchangeindex, ig);
						String nu = "<!> " + eq.get(colorchangeindex).toString();
						eq.remove(colorchangeindex);
						eq.add(colorchangeindex, nu);
						prosd.remove(colorchangeindex);
						prosd.add(colorchangeindex, 0);
					}
					else {
						iglst.remove(colorchangeindex);
						boolean ig = false;
						iglst.add(colorchangeindex, ig);
						String nu = eq.get(colorchangeindex).toString().substring(4, eq.get(colorchangeindex).toString().length());
						eq.remove(colorchangeindex);
						eq.add(colorchangeindex, nu);
						prosd.remove(colorchangeindex);
						prosd.add(colorchangeindex, 0);
					}
					ready = false;
					}
					catch(Exception err) {
						errorsndbx.setText("An indexing error has occured. Make sure you actually selected an equation.  If this error persists, tell a programmer!");
						Toolkit.getDefaultToolkit().beep();
						errordis.setVisible(true);
					}
				}
			});
			
			sl.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						prosd.remove(colorchangeindex);
						prosd.add(colorchangeindex, 0);
						ready = false;
					if(sl.isSelected()) {
						slop.remove(colorchangeindex);
						boolean slop3 = true;
						slop.add(colorchangeindex, slop3);
						if(true) {
						isitpolar.remove(colorchangeindex);
						boolean polr2 = false;
						isitpolar.add(colorchangeindex, polr2);
						popl.setSelected(false);
						}
					}
					else {
						slop.remove(colorchangeindex);
						boolean slop3 = false;
						slop.add(colorchangeindex, slop3);
					}
					if((Boolean.parseBoolean(slop.get(colorchangeindex).toString()) == true)) {
						slop2.setEnabled(false);
						minmax.setEnabled(false);
						di.setEnabled(false);
						zro.setEnabled(false);
						valu.setEnabled(false);
					}
					else if((eq.get(colorchangeindex).toString().contains("w") == false) || (eq.get(colorchangeindex).toString().contains("x") == false)) {
						slop2.setEnabled(true);
						minmax.setEnabled(true);
						di.setEnabled(true);
						zro.setEnabled(true);
						valu.setEnabled(true);
					}
					}
					catch(Exception err) {
						errorsndbx.setText("An indexing error has occured. Make sure you actually selected an equation.  If this error persists, tell a programmer!");
						Toolkit.getDefaultToolkit().beep();
						errordis.setVisible(true);
					}
				}
			});
			propertez.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					answz.setText("");
					try {
						colorchangeindex = eqlst.getSelectedIndex();
						if(Boolean.parseBoolean(iglst.get(colorchangeindex).toString())) {
							coldis.setText(eq.get(colorchangeindex).toString().substring(4, eq.get(colorchangeindex).toString().length()));
						}
						else {
						coldis.setText(eq.get(colorchangeindex).toString());
						}
						if(((((eq.get(colorchangeindex).toString().contains("w")) && (eq.get(colorchangeindex).toString().contains("x")))) || (Boolean.parseBoolean(slop.get(colorchangeindex).toString()) == true)) && (eq.get(colorchangeindex).toString().contains("y") == false)) {
							slop2.setEnabled(false);
							minmax.setEnabled(false);
							di.setEnabled(false);
							zro.setEnabled(false);
							valu.setEnabled(false);
							sl.setEnabled(true);
							popl.setEnabled(true);
						}
						else if(eq.get(colorchangeindex).toString().contains("y")) {
							slop2.setEnabled(false);
							minmax.setEnabled(false);
							di.setEnabled(false);
							zro.setEnabled(false);
							valu.setEnabled(false);
							sl.setEnabled(false);
							popl.setEnabled(false);
						}
						else {
							slop2.setEnabled(true);
							minmax.setEnabled(true);
							di.setEnabled(true);
							zro.setEnabled(true);
							valu.setEnabled(true);
							sl.setEnabled(true);
							popl.setEnabled(true);
						}
						if(v155 == false) {
							if((eq.get(colorchangeindex).toString().contains("w")) && (eq.get(colorchangeindex).toString().contains("x"))) {
								popl.setEnabled(false);
							}
							else {
								if(eq.get(colorchangeindex).toString().contains("y'=") == false) {
								popl.setEnabled(true);	
								}
							}
						}
					coldis.setBackground((Color) col.get(colorchangeindex));
					jfpropertez.setVisible(true);
					popl.setSelected((boolean) isitpolar.get(colorchangeindex));
					sl.setSelected((boolean) slop.get(colorchangeindex));
					ignore.setSelected((boolean) iglst.get(colorchangeindex));
					}
					catch(Exception err) {
						coldis.setBackground(new Color(255, 125, 0));
						coldis.setText("ERROR!");
						errorsndbx.setText("Select an equation to view its properties.");
						Toolkit.getDefaultToolkit().beep();
						err.printStackTrace();
						errordis.setVisible(true);
					}
					
				}
			});
			remove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ready = false;
						jfpropertez.dispose();
						int numstorage = eqlst.getSelectedIndex();
					eq.remove(eqlst.getSelectedIndex());
					col.remove(numstorage);
					isitpolar.remove(numstorage);
					slop.remove(numstorage);
					iglst.remove(numstorage);
					prosd.remove(numstorage);
					try {
						masterlist.remove(numstorage);
						mstr2.remove(numstorage);
					}
					catch(Exception err) {
						
					}
					}
					catch(Exception err) {
						Toolkit.getDefaultToolkit().beep();
						errorsndbx.setText("");
						errorsndbx.append("Make sure you selected an equation on the graphing schedule to remove. If you did select an equation and are seeing this message, tell a programmer.");
						errordis.setVisible(true);
					}
				}
			});
			des.setBackground(new Color(255,125,0));
			des.setEditable(false);
			jpjp.setLayout(new GridLayout(5, 1));
			jpjp21.add(des);
			jpjp.add(jp);
			jpjp.add(des2);
			jpjp.add(jpmain);
			jpjp.add(expander);
			jpjp4.add(cncl);
			jpjp21.setLayout(new FlowLayout());
			jpjp21.setBackground(Color.RED);
			jpjp3.setBackground(Color.RED);
			jpjp4.setBackground(Color.RED);
			jpjp5.setBackground(Color.RED);
			jpjp3.setLayout(new FlowLayout());
			jpjf.getContentPane().add(jpjp, BorderLayout.CENTER);
			jpjf.getContentPane().add(jpjp21, BorderLayout.SOUTH);
			jpjf.getContentPane().add(jpjp3, BorderLayout.NORTH);
			jpjf.getContentPane().add(jpjp4, BorderLayout.EAST);
			jpjf.getContentPane().add(jpjp5, BorderLayout.WEST);
			jpjf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			jpjf.pack();
			jpjf.setAlwaysOnTop(true);
			jpjf.setResizable(false);
			
			
			
			jbt1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					stp = false;
					cncl.setEnabled(true);
					if(exportable==false) {
						int igsz = prosd.getSize();
						prosd.clear();
						int cnt = 0;
						while(cnt < igsz) {
							prosd.addElement(0);
							cnt++;
						}
					}
					exportable = true;
					if(eq.getSize() > 0) {
					int s = eq.getSize();
					int bz = 0;
					load = eq.getSize();
					while(bz < s) {
						if(Boolean.parseBoolean(iglst.get(bz).toString())) {
						load--;
						}
						bz++;
					}
					
					//inc = 38/load;
					lambdaprogress = 0;
					jpmain.setMaximum(load);
					jpmain.setMinimum(0);
					jp.setMinimum(0);
					jp.setStringPainted(true);
					jpmain.setStringPainted(true);
					jp.setValue(0);
					jpmain.setValue(0);
					jp.setBackground(new Color(255, 125, 0));
					jpjf.setVisible(true);
					jf1.setEnabled(false);
					mst.setEnabled(false);
					jfpropertez.setEnabled(false);
					sam.setEnabled(false);
					ready = true;
					Red_Phial_Graphing_Utility th = new Red_Phial_Graphing_Utility();
					new Thread(th).start();
					
					}
					
				}
			});
		}
		catch(Exception err) {
			//**.out.println("error");
			err.printStackTrace();
			
		}
	}
	
}



