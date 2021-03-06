package proyectoRuleta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTablero extends JPanel {

	private ArrayList<Integer> apuesta1X1 = new ArrayList();
	private ArrayList<Integer> apuesta2X1 = new ArrayList();
	private ArrayList<Integer> apuesta05X1 = new ArrayList();
	private ArrayList<Integer> apuesta5X1 = new ArrayList();
	private ArrayList<Integer> apuesta8X1 = new ArrayList();
	private ArrayList<Integer> apuesta11X1 = new ArrayList();
	private ArrayList<Integer> apuesta17X1 = new ArrayList();
	private ArrayList<Integer> apuesta35X1 = new ArrayList();

	/**Bonotiza del tablero */
	private JButton casilla1_18 = new JButton("1-18");
	private JButton casilla_par = new JButton("PAR");
	private JButton casilla_black = new JButton();
	private JButton casilla_red = new JButton();
	private JButton casilla_impar = new JButton("IMPAR");
	private JButton casilla19_36 = new JButton("19-34");

	private JButton primera12na = new JButton("1ra DOCENA");
	private JButton docena1y2 = new JButton();
	private JButton segunda12na = new JButton("2da DOCENA");
	private JButton docena2y3 = new JButton();
	private JButton tercera12na = new JButton("3ra DOCENA");

	private JButton casilla0 = new JButton("0");
	private JButton casilla0y1 = new JButton(new ImageIcon("src/imagenes/linea_horizontal.png"));
	private JButton casilla0_1_2 = new JButton();
	private JButton casilla0y2 = new JButton();
	private JButton casilla0_2_3 = new JButton();
	private JButton casilla0y3 = new JButton();

	private JButton fila1 = new JButton("");
	private JButton casilla1 = new JButton("1");
	private JButton casilla1y2 = new JButton();
	private JButton casilla2 = new JButton("2");
	private JButton casilla2y3 = new JButton();
	private JButton casilla3 = new JButton("3");

	private JButton seisena1 = new JButton();
	private JButton casilla1y4 = new JButton();
	private JButton casilla1_2_4_5 = new JButton();
	private JButton casilla2y5 = new JButton();
	private JButton casilla2_3_5_6 = new JButton();
	private JButton casilla3y6 = new JButton();

	private JButton fila2 = new JButton();
	private JButton casilla4 = new JButton("4");
	private JButton casilla4y5 = new JButton();
	private JButton casilla5 = new JButton("5");
	private JButton casilla5y6 = new JButton();
	private JButton casilla6 = new JButton("6");

	private JButton seisena2 = new JButton();
	private JButton casilla4y7 = new JButton();
	private JButton casilla4_5_7_8 = new JButton();
	private JButton casilla5y8 = new JButton();
	private JButton casilla5_6_8_9 = new JButton();
	private JButton casilla6y9 = new JButton();

	private JButton fila3 = new JButton();
	private JButton casilla7 = new JButton("7");
	private JButton casilla7y8 = new JButton();
	private JButton casilla8 = new JButton("8");
	private JButton casilla8y9 = new JButton();
	private JButton casilla9 = new JButton("9");

	private JButton seisena3 = new JButton();
	private JButton casilla7y10 = new JButton();
	private JButton casilla7_8_10_11 = new JButton();
	private JButton casilla8y11 = new JButton();
	private JButton casilla8_9_11_12 = new JButton();
	private JButton casilla9y12 = new JButton();

	private JButton fila4 = new JButton();
	private JButton casilla10 = new JButton("10");
	private JButton casilla10y11 = new JButton();
	private JButton casilla11 = new JButton("11");
	private JButton casilla11y12 = new JButton();
	private JButton casilla12 = new JButton("12");

	private JButton seisena4 = new JButton();
	private JButton casilla10y13 = new JButton();
	private JButton casilla10_11_13_14 = new JButton();
	private JButton casilla11y14 = new JButton();
	private JButton casilla11_12_14_15 = new JButton();
	private JButton casilla12y15 = new JButton();
	///////////////////////////////////////////////////
	private JButton fila5 = new JButton();
	private JButton casilla13 = new JButton("13");
	private JButton casilla13y14 = new JButton();
	private JButton casilla14 = new JButton("14");
	private JButton casilla14y15 = new JButton();
	private JButton casilla15 = new JButton("15");

	private JButton seisena5 = new JButton();
	private JButton casilla13y16 = new JButton();
	private JButton casilla13_14_16_17 = new JButton();
	private JButton casilla14y17 = new JButton();
	private JButton casilla14_15_17_18 = new JButton();
	private JButton casilla15y18 = new JButton();


	private JButton fila6 = new JButton();
	private JButton casilla16 = new JButton("16");
	private JButton casilla16y17 = new JButton();
	private JButton casilla17 = new JButton("17");
	private JButton casilla17y18 = new JButton();
	private JButton casilla18 = new JButton("18");

	private JButton seisena6 = new JButton();
	private JButton casilla16y19 = new JButton();
	private JButton casilla16_17_19_20 = new JButton();
	private JButton casilla17y20 = new JButton();
	private JButton casilla17_18_20_21 = new JButton();
	private JButton casilla18y21 = new JButton();

	private JButton fila7 = new JButton();
	private JButton casilla19 = new JButton("19");
	private JButton casilla19y20 = new JButton();
	private JButton casilla20 = new JButton("20");
	private JButton casilla20y21 = new JButton();
	private JButton casilla21 = new JButton("21");

	private JButton seisena7 = new JButton();
	private JButton casilla19y22 = new JButton();
	private JButton casilla19_20_22_23 = new JButton();
	private JButton casilla20y23 = new JButton();
	private JButton casilla20_21_23_24 = new JButton();
	private JButton casilla21y24 = new JButton();

	private JButton fila8 = new JButton();
	private JButton casilla22 = new JButton("22");
	private JButton casilla22y23 = new JButton();
	private JButton casilla23 = new JButton("23");
	private JButton casilla23y24 = new JButton();
	private JButton casilla24 = new JButton("24");

	private JButton seisena8 = new JButton();
	private JButton casilla22y25 = new JButton();
	private JButton casilla22_23_25_26 = new JButton();
	private JButton casilla23y26 = new JButton();
	private JButton casilla23_24_26_27 = new JButton();
	private JButton casilla24y27 = new JButton();

	private JButton fila9 = new JButton();
	private JButton casilla25 = new JButton("25");
	private JButton casilla25y26 = new JButton();
	private JButton casilla26 = new JButton("26");
	private JButton casilla26y27 = new JButton();
	private JButton casilla27 = new JButton("27");

	private JButton seisena9 = new JButton();
	private JButton casilla25y28 = new JButton();
	private JButton casilla25_26_28_29 = new JButton();
	private JButton casilla26y29 = new JButton();
	private JButton casilla26_27_29_30 = new JButton();
	private JButton casilla27y30 = new JButton();

	private JButton fila10 = new JButton();
	private JButton casilla28 = new JButton("28");
	private JButton casilla28y29 = new JButton();
	private JButton casilla29 = new JButton("29");
	private JButton casilla29y30 = new JButton();
	private JButton casilla30 = new JButton("30");

	private JButton seisena10 = new JButton();
	private JButton casilla28y31 = new JButton();
	private JButton casilla28_29_31_32 = new JButton();
	private JButton casilla29y32 = new JButton();
	private JButton casilla29_30_32_33 = new JButton();
	private JButton casilla30y33 = new JButton();

	private JButton fila11 = new JButton();
	private JButton casilla31 = new JButton("31");
	private JButton casilla31y32 = new JButton();
	private JButton casilla32 = new JButton("32");
	private JButton casilla32y33 = new JButton();
	private JButton casilla33 = new JButton("33");

	private JButton seisena11 = new JButton();
	private JButton casilla31y34 = new JButton();
	private JButton casilla31_32_34_35 = new JButton();
	private JButton casilla32y35 = new JButton();
	private JButton casilla32_33_35_36 = new JButton();
	private JButton casilla33y36 = new JButton();

	private JButton fila12 = new JButton();
	private JButton casilla34 = new JButton("34");
	private JButton casilla34y35 = new JButton();
	private JButton casilla35 = new JButton("35");
	private JButton casilla35y36 = new JButton();
	private JButton casilla36 = new JButton("36");

	private JButton columna1 = new JButton("2 a 1");
	private JButton columna1y2 = new JButton();
	private JButton columna2 = new JButton("2 a 1");
	private JButton columna2y3 = new JButton();
	private JButton columna3 = new JButton("2 a 1");

	private JPanel contenedor = new JPanel(new BorderLayout());
	private JPanel contenedorNotones = new JPanel();
	private int total = 500;
	private JLabel labelTotal = new JLabel("Total:"+total);


	public PanelTablero() {
		//this.setBackground(Color.GREEN.darker().darker().darker());
		MouseEvents eventoMouse = new MouseEvents();
		this.setLayout(null);
		contenedor.setLayout(null);
		contenedor.setBounds(0, 0, 643, 832);
		contenedorNotones.setLayout(null);
		contenedorNotones.setBounds(0, 0, 644, 832);
		contenedorNotones.setBackground(Color.GREEN.darker().darker().darker());
		contenedorNotones.setVisible(true);

		Font font = new Font(Font.SERIF, Font.BOLD, 18);
		labelTotal.setFont(font);
		labelTotal.setForeground(Color.WHITE);
		labelTotal.setBounds(475, 20, 150, 50);
		contenedorNotones.add(labelTotal);

		casilla0.setBounds(230, 20, 240, 45);
		casilla0.setBackground(Color.GREEN.darker());
		casilla0.setForeground(Color.YELLOW);
		casilla0.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0.setName("casilla0");
		casilla0.addMouseListener(eventoMouse);

		casilla1_18.setBounds(10, 70, 100, 80);
		casilla1_18.setBackground(Color.GREEN.darker());
		casilla1_18.setForeground(Color.YELLOW);
		casilla1_18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1_18.setName("casilla1_18");
		casilla1_18.addMouseListener(eventoMouse);
		casilla_par.setBounds(10, 150, 100, 80);
		casilla_par.setBackground(Color.GREEN.darker());
		casilla_par.setForeground(Color.YELLOW);
		casilla_par.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_par.setName("casilla_par");
		casilla_par.addMouseListener(eventoMouse);
		casilla_black.setBounds(10, 230, 100, 80);
		casilla_black.setBackground(Color.black);
		casilla_black.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_black.setName("casilla_black");
		casilla_black.addMouseListener(eventoMouse);
		casilla_red.setBounds(10, 310, 100, 80);
		casilla_red.setBackground(Color.red);
		casilla_red.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_red.setName("casilla_red");
		casilla_red.addMouseListener(eventoMouse);
		casilla_impar.setBounds(10, 390, 100, 80);
		casilla_impar.setBackground(Color.GREEN.darker());
		casilla_impar.setForeground(Color.YELLOW);
		casilla_impar.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_impar.setName("casilla_impar");
		casilla_impar.addMouseListener(eventoMouse);
		casilla19_36.setBounds(10, 470, 100, 80);
		casilla19_36.setBackground(Color.GREEN.darker());
		casilla19_36.setForeground(Color.YELLOW);
		casilla19_36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19_36.setName("casilla19_36");
		casilla19_36.addMouseListener(eventoMouse);

		primera12na.setBounds(110, 70, 115, 155);
		primera12na.setBackground(Color.GREEN.darker());
		primera12na.setForeground(Color.YELLOW);
		primera12na.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		primera12na.setName("primera12na");
		primera12na.addMouseListener(eventoMouse);
		docena1y2.setBounds(110, 225, 115, 10);
		docena1y2.setBackground(Color.YELLOW);
		docena1y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		docena1y2.setName("docena1y2");
		docena1y2.addMouseListener(eventoMouse);
		segunda12na.setBounds(110, 235, 115, 150);
		segunda12na.setBackground(Color.GREEN.darker());
		segunda12na.setForeground(Color.YELLOW);
		segunda12na.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		segunda12na.setName("segunda12na");
		segunda12na.addMouseListener(eventoMouse);
		docena2y3.setBounds(110, 385, 115, 10);
		docena2y3.setBackground(Color.YELLOW);
		docena2y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		docena2y3.setName("docena2y3");
		docena2y3.addMouseListener(eventoMouse);
		tercera12na.setBounds(110, 395, 115, 155);
		tercera12na.setBackground(Color.GREEN.darker());
		tercera12na.setForeground(Color.YELLOW);
		tercera12na.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		tercera12na.setName("tercera12na");
		tercera12na.addMouseListener(eventoMouse);

		casilla0y1.setBounds(225, 65, 80, 10);
		casilla0y1.setBackground(Color.YELLOW);
		casilla0y1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0y1.setName("casilla0y1");
		casilla0y1.addMouseListener(eventoMouse);
		casilla0_1_2.setBounds(305, 65, 10, 10);
		casilla0_1_2.setBackground(Color.YELLOW);
		casilla0_1_2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0_1_2.setName("casilla0_1_2");
		casilla0_1_2.addMouseListener(eventoMouse);
		casilla0y2.setBounds(315, 65, 70, 10);
		casilla0y2.setBackground(Color.YELLOW);
		casilla0y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0y2.setName("casilla0y2");
		casilla0y2.addMouseListener(eventoMouse);
		casilla0_2_3.setBounds(385, 65, 10, 10);
		casilla0_2_3.setBackground(Color.YELLOW);
		casilla0_2_3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0_2_3.setName("casilla0_2_3");
		casilla0_2_3.addMouseListener(eventoMouse);
		casilla0y3.setBounds(395, 65, 75, 10);
		casilla0y3.setBackground(Color.YELLOW);
		casilla0y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0y3.setName("casilla0y3");
		casilla0y3.addMouseListener(eventoMouse);

		fila1.setBounds(225, 75, 10, 30);
		fila1.setBackground(Color.YELLOW);
		fila1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila1.setName("fila1");
		fila1.addMouseListener(eventoMouse);
		casilla1.setBounds(235, 75, 70, 30);
		casilla1.setBackground(Color.GREEN.darker());
		casilla1.setForeground(Color.RED);
		casilla1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1.setName("casilla1");
		casilla1.addMouseListener(eventoMouse);
		casilla1y2.setBounds(305, 75, 10, 30);
		casilla1y2.setBackground(Color.YELLOW);
		casilla1y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1y2.setName("casilla1y2");
		casilla1y2.addMouseListener(eventoMouse);
		casilla2.setBounds(315, 75, 70, 30);
		casilla2.setBackground(Color.GREEN.darker());
		casilla2.setForeground(Color.BLACK);
		casilla2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2.setName("casilla2");
		casilla2.addMouseListener(eventoMouse);
		casilla2y3.setBounds(385, 75, 10, 30);
		casilla2y3.setBackground(Color.YELLOW);
		casilla2y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2y3.setName("casilla2y3");
		casilla2y3.addMouseListener(eventoMouse);
		casilla3.setBounds(395, 75, 75, 30);
		casilla3.setBackground(Color.GREEN.darker());
		casilla3.setForeground(Color.RED);
		casilla3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla3.setName("casilla3");
		casilla3.addMouseListener(eventoMouse);

		seisena1.setBounds(225, 105, 10, 10);
		seisena1.setBackground(Color.YELLOW);
		seisena1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena1.setName("seisena1");
		seisena1.addMouseListener(eventoMouse);
		casilla1y4.setBounds(235, 105, 70, 10);
		casilla1y4.setBackground(Color.YELLOW);
		casilla1y4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1y4.setName("casilla1y4");
		casilla1y4.addMouseListener(eventoMouse);
		casilla1_2_4_5.setBounds(305, 105, 10, 10);
		casilla1_2_4_5.setBackground(Color.YELLOW);
		casilla1_2_4_5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1_2_4_5.setName("casilla1_2_4_5");
		casilla1_2_4_5.addMouseListener(eventoMouse);
		casilla2y5.setBounds(315, 105, 70, 10);
		casilla2y5.setBackground(Color.YELLOW);
		casilla2y5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2y5.setName("casilla2y5");
		casilla2y5.addMouseListener(eventoMouse);
		casilla2_3_5_6.setBounds(385, 105, 10, 10);
		casilla2_3_5_6.setBackground(Color.YELLOW);
		casilla2_3_5_6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2_3_5_6.setName("casilla2_3_5_6");
		casilla2_3_5_6.addMouseListener(eventoMouse);
		casilla3y6.setBounds(395, 105, 75, 10);
		casilla3y6.setBackground(Color.YELLOW);
		casilla3y6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla3y6.setName("casilla3y6");
		casilla3y6.addMouseListener(eventoMouse);

		fila2.setBounds(225, 115, 10, 30);
		fila2.setBackground(Color.YELLOW);
		fila2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila2.setName("fila2");
		fila2.addMouseListener(eventoMouse);
		casilla4.setBounds(235, 115, 70, 30);
		casilla4.setBackground(Color.GREEN.darker());
		casilla4.setForeground(Color.BLACK);
		casilla4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4.setName("casilla4");
		casilla4.addMouseListener(eventoMouse);
		casilla4y5.setBounds(305, 115, 10, 30);
		casilla4y5.setBackground(Color.YELLOW);
		casilla4y5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4y5.setName("casilla4y5");
		casilla4y5.addMouseListener(eventoMouse);
		casilla5.setBounds(315, 115, 70, 30);
		casilla5.setBackground(Color.GREEN.darker());
		casilla5.setForeground(Color.RED);
		casilla5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5.setName("casilla5");
		casilla5.addMouseListener(eventoMouse);
		casilla5y6.setBounds(385, 115, 10, 30);
		casilla5y6.setBackground(Color.YELLOW);
		casilla5y6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5y6.setName("casilla5y6");
		casilla5y6.addMouseListener(eventoMouse);
		casilla6.setBounds(395, 115, 75, 30);
		casilla6.setBackground(Color.GREEN.darker());
		casilla6.setForeground(Color.BLACK);
		casilla6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla6.setName("casilla6");
		casilla6.addMouseListener(eventoMouse);

		seisena2.setBounds(225, 145, 10, 10);
		seisena2.setBackground(Color.YELLOW);
		seisena2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena2.setName("seisena2");
		seisena2.addMouseListener(eventoMouse);
		casilla4y7.setBounds(235, 145, 70, 10);
		casilla4y7.setBackground(Color.YELLOW);
		casilla4y7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4y7.setName("casilla4y7");
		casilla4y7.addMouseListener(eventoMouse);
		casilla4_5_7_8.setBounds(305, 145, 10, 10);
		casilla4_5_7_8.setBackground(Color.YELLOW);
		casilla4_5_7_8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4_5_7_8.setName("casilla4_5_7_8");
		casilla4_5_7_8.addMouseListener(eventoMouse);
		casilla5y8.setBounds(315, 145, 70, 10);
		casilla5y8.setBackground(Color.YELLOW);
		casilla5y8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5y8.setName("casilla5y8");
		casilla5y8.addMouseListener(eventoMouse);
		casilla5_6_8_9.setBounds(385, 145, 10, 10);
		casilla5_6_8_9.setBackground(Color.YELLOW);
		casilla5_6_8_9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5_6_8_9.setName("casilla5_6_8_9");
		casilla5_6_8_9.addMouseListener(eventoMouse);
		casilla6y9.setBounds(395, 145, 75, 10);
		casilla6y9.setBackground(Color.YELLOW);
		casilla6y9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla6y9.setName("casilla6y9");
		casilla6y9.addMouseListener(eventoMouse);

		fila3.setBounds(225, 155, 10, 30);
		fila3.setBackground(Color.YELLOW);
		fila3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila3.setName("fila3");
		fila3.addMouseListener(eventoMouse);
		casilla7.setBounds(235, 155, 70, 30);
		casilla7.setBackground(Color.GREEN.darker());
		casilla7.setForeground(Color.RED);
		casilla7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7.setName("casilla7");
		casilla7.addMouseListener(eventoMouse);
		casilla7y8.setBounds(305, 155, 10, 30);
		casilla7y8.setBackground(Color.YELLOW);
		casilla7y8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7y8.setName("casilla7y8");
		casilla7y8.addMouseListener(eventoMouse);
		casilla8.setBounds(315, 155, 70, 30);
		casilla8.setBackground(Color.GREEN.darker());
		casilla8.setForeground(Color.BLACK);
		casilla8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8.setName("casilla8");
		casilla8.addMouseListener(eventoMouse);
		casilla8y9.setBounds(385, 155, 10, 30);
		casilla8y9.setBackground(Color.YELLOW);
		casilla8y9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8y9.setName("casilla8y9");
		casilla8y9.addMouseListener(eventoMouse);
		casilla9.setBounds(395, 155, 75, 30);
		casilla9.setBackground(Color.GREEN.darker());
		casilla9.setForeground(Color.RED);
		casilla9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla9.setName("casilla9");
		casilla9.addMouseListener(eventoMouse);

		seisena3.setBounds(225, 185, 10, 10);
		seisena3.setBackground(Color.YELLOW);
		seisena3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena3.setName("seisena3");
		seisena3.addMouseListener(eventoMouse);
		casilla7y10.setBounds(235, 185, 70, 10);
		casilla7y10.setBackground(Color.YELLOW);
		casilla7y10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7y10.setName("casilla7y10");
		casilla7y10.addMouseListener(eventoMouse);
		casilla7_8_10_11.setBounds(305, 185, 10, 10);
		casilla7_8_10_11.setBackground(Color.YELLOW);
		casilla7_8_10_11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7_8_10_11.setName("casilla7_8_10_11");
		casilla7_8_10_11.addMouseListener(eventoMouse);
		casilla8y11.setBounds(315, 185, 70, 10);
		casilla8y11.setBackground(Color.YELLOW);
		casilla8y11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8y11.setName("casilla8y11");
		casilla8y11.addMouseListener(eventoMouse);
		casilla8_9_11_12.setBounds(385, 185, 10, 10);
		casilla8_9_11_12.setBackground(Color.YELLOW);
		casilla8_9_11_12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8_9_11_12.setName("casilla8_9_11_12");
		casilla8_9_11_12.addMouseListener(eventoMouse);
		casilla9y12.setBounds(395, 185, 75, 10);
		casilla9y12.setBackground(Color.YELLOW);
		casilla9y12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla9y12.setName("casilla9y12");
		casilla9y12.addMouseListener(eventoMouse);

		fila4.setBounds(225, 195, 10, 30);
		fila4.setBackground(Color.YELLOW);
		fila4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila4.setName("fila4");
		fila4.addMouseListener(eventoMouse);
		casilla10.setBounds(235, 195, 70, 30);
		casilla10.setBackground(Color.GREEN.darker());
		casilla10.setForeground(Color.BLACK);
		casilla10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10.setName("casilla10");
		casilla10.addMouseListener(eventoMouse);
		casilla10y11.setBounds(305, 195, 10, 30);
		casilla10y11.setBackground(Color.YELLOW);
		casilla10y11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10y11.setName("casilla10y11");
		casilla10y11.addMouseListener(eventoMouse);
		casilla11.setBounds(315, 195, 70, 30);
		casilla11.setBackground(Color.GREEN.darker());
		casilla11.setForeground(Color.BLACK);
		casilla11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11.setName("casilla11");
		casilla11.addMouseListener(eventoMouse);
		casilla11y12.setBounds(385, 195, 10, 30);
		casilla11y12.setBackground(Color.YELLOW);
		casilla11y12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11y12.setName("casilla11y12");
		casilla11y12.addMouseListener(eventoMouse);
		casilla12.setBounds(395, 195, 75, 30);
		casilla12.setBackground(Color.GREEN.darker());
		casilla12.setForeground(Color.RED);
		casilla12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla12.setName("casilla12");
		casilla12.addMouseListener(eventoMouse);

		seisena4.setBounds(225, 225, 10, 10);
		seisena4.setBackground(Color.YELLOW);
		seisena4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena4.setName("seisena4");
		seisena4.addMouseListener(eventoMouse);
		casilla10y13.setBounds(235, 225, 70, 10);
		casilla10y13.setBackground(Color.YELLOW);
		casilla10y13.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10y13.setName("casilla10y13");
		casilla10y13.addMouseListener(eventoMouse);
		casilla10_11_13_14.setBounds(305, 225, 10, 10);
		casilla10_11_13_14.setBackground(Color.YELLOW);
		casilla10_11_13_14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10_11_13_14.setName("casilla10_11_13_14");
		casilla10_11_13_14.addMouseListener(eventoMouse);
		casilla11y14.setBounds(315, 225, 70, 10);
		casilla11y14.setBackground(Color.YELLOW);
		casilla11y14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11y14.setName("casilla11y14");
		casilla11y14.addMouseListener(eventoMouse);
		casilla11_12_14_15.setBounds(385, 225, 10, 10);
		casilla11_12_14_15.setBackground(Color.YELLOW);
		casilla11_12_14_15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11_12_14_15.setName("casilla11_12_14_15");
		casilla11_12_14_15.addMouseListener(eventoMouse);
		casilla12y15.setBounds(395, 225, 75, 10);
		casilla12y15.setBackground(Color.YELLOW);
		casilla12y15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla12y15.setName("casilla12y15");
		casilla12y15.addMouseListener(eventoMouse);
		////////////////////////////////////////////////
		fila5.setBounds(225, 235, 10, 30);
		fila5.setBackground(Color.YELLOW);
		fila5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila5.setName("fila5");
		fila5.addMouseListener(eventoMouse);
		casilla13.setBounds(235, 235, 70, 30);
		casilla13.setBackground(Color.GREEN.darker());
		casilla13.setForeground(Color.BLACK);
		casilla13.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13.setName("casilla13");
		casilla13.addMouseListener(eventoMouse);
		casilla13y14.setBounds(305, 235, 10, 30);
		casilla13y14.setBackground(Color.YELLOW);
		casilla13y14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13y14.setName("casilla13y14");
		casilla13y14.addMouseListener(eventoMouse);
		casilla14.setBounds(315, 235, 70, 30);
		casilla14.setBackground(Color.GREEN.darker());
		casilla14.setForeground(Color.RED);
		casilla14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14.setName("casilla14");
		casilla14.addMouseListener(eventoMouse);
		casilla14y15.setBounds(385, 235, 10, 30);
		casilla14y15.setBackground(Color.YELLOW);
		casilla14y15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14y15.setName("casilla14y15");
		casilla14y15.addMouseListener(eventoMouse);
		casilla15.setBounds(395, 235, 75, 30);
		casilla15.setBackground(Color.GREEN.darker());
		casilla15.setForeground(Color.BLACK);
		casilla15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla15.setName("casilla15");
		casilla15.addMouseListener(eventoMouse);

		seisena5.setBounds(225, 265, 10, 10);
		seisena5.setBackground(Color.YELLOW);
		seisena5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena5.setName("seisena5");
		seisena5.addMouseListener(eventoMouse);
		casilla13y16.setBounds(235, 265, 70, 10);
		casilla13y16.setBackground(Color.YELLOW);
		casilla13y16.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13y16.setName("casilla13y16");
		casilla13y16.addMouseListener(eventoMouse);
		casilla13_14_16_17.setBounds(305, 265, 10, 10);
		casilla13_14_16_17.setBackground(Color.YELLOW);
		casilla13_14_16_17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13_14_16_17.setName("casilla13_14_16_17");
		casilla13_14_16_17.addMouseListener(eventoMouse);
		casilla14y17.setBounds(315, 265, 70, 10);
		casilla14y17.setBackground(Color.YELLOW);
		casilla14y17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14y17.setName("casilla14y17");
		casilla14y17.addMouseListener(eventoMouse);
		casilla14_15_17_18.setBounds(385, 265, 10, 10);
		casilla14_15_17_18.setBackground(Color.YELLOW);
		casilla14_15_17_18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14_15_17_18.setName("casilla14_15_17_18");
		casilla14_15_17_18.addMouseListener(eventoMouse);
		casilla15y18.setBounds(395, 265, 75, 10);
		casilla15y18.setBackground(Color.YELLOW);
		casilla15y18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla15y18.setName("casilla15y18");
		casilla15y18.addMouseListener(eventoMouse);

		fila6.setBounds(225, 275, 10, 30);
		fila6.setBackground(Color.YELLOW);
		fila6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila6.setName("fila6");
		fila6.addMouseListener(eventoMouse);
		casilla16.setBounds(235, 275, 70, 30);
		casilla16.setBackground(Color.GREEN.darker());
		casilla16.setForeground(Color.RED);
		casilla16.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16.setName("casilla16");
		casilla16.addMouseListener(eventoMouse);
		casilla16y17.setBounds(305, 275, 10, 30);
		casilla16y17.setBackground(Color.YELLOW);
		casilla16y17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16y17.setName("casilla16y17");
		casilla16y17.addMouseListener(eventoMouse);
		casilla17.setBounds(315, 275, 70, 30);
		casilla17.setBackground(Color.GREEN.darker());
		casilla17.setForeground(Color.BLACK);
		casilla17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17.setName("casilla17");
		casilla17.addMouseListener(eventoMouse);
		casilla17y18.setBounds(385, 275, 10, 30);
		casilla17y18.setBackground(Color.YELLOW);
		casilla17y18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17y18.setName("casilla17y18");
		casilla17y18.addMouseListener(eventoMouse);
		casilla18.setBounds(395, 275, 75, 30);
		casilla18.setBackground(Color.GREEN.darker());
		casilla18.setForeground(Color.RED);
		casilla18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla18.setName("casilla18");
		casilla18.addMouseListener(eventoMouse);

		seisena6.setBounds(225, 305, 10, 10);
		seisena6.setBackground(Color.YELLOW);
		seisena6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena6.setName("seisena6");
		seisena6.addMouseListener(eventoMouse);
		casilla16y19.setBounds(235, 305, 70, 10);
		casilla16y19.setBackground(Color.YELLOW);
		casilla16y19.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16y19.setName("casilla16y19");
		casilla16y19.addMouseListener(eventoMouse);
		casilla16_17_19_20.setBounds(305, 305, 10, 10);
		casilla16_17_19_20.setBackground(Color.YELLOW);
		casilla16_17_19_20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16_17_19_20.setName("casilla16_17_19_20");
		casilla16_17_19_20.addMouseListener(eventoMouse);
		casilla17y20.setBounds(315, 305, 70, 10);
		casilla17y20.setBackground(Color.YELLOW);
		casilla17y20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17y20.setName("casilla17y20");
		casilla17y20.addMouseListener(eventoMouse);
		casilla17_18_20_21.setBounds(385, 305, 10, 10);
		casilla17_18_20_21.setBackground(Color.YELLOW);
		casilla17_18_20_21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17_18_20_21.setName("casilla17_18_20_21");
		casilla17_18_20_21.addMouseListener(eventoMouse);
		casilla18y21.setBounds(395, 305, 75, 10);
		casilla18y21.setBackground(Color.YELLOW);
		casilla18y21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla18y21.setName("casilla18y21");
		casilla18y21.addMouseListener(eventoMouse);

		fila7.setBounds(225, 315, 10, 30);
		fila7.setBackground(Color.YELLOW);
		fila7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila7.setName("fila7");
		fila7.addMouseListener(eventoMouse);
		casilla19.setBounds(235, 315, 70, 30);
		casilla19.setBackground(Color.GREEN.darker());
		casilla19.setForeground(Color.RED);
		casilla19.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19.setName("casilla19");
		casilla19.addMouseListener(eventoMouse);
		casilla19y20.setBounds(305, 315, 10, 30);
		casilla19y20.setBackground(Color.YELLOW);
		casilla19y20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19y20.setName("casilla19y20");
		casilla19y20.addMouseListener(eventoMouse);
		casilla20.setBounds(315, 315, 70, 30);
		casilla20.setBackground(Color.GREEN.darker());
		casilla20.setForeground(Color.BLACK);
		casilla20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20.setName("casilla20");
		casilla20.addMouseListener(eventoMouse);
		casilla20y21.setBounds(385, 315, 10, 30);
		casilla20y21.setBackground(Color.YELLOW);
		casilla20y21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20y21.setName("casilla20y21");
		casilla20y21.addMouseListener(eventoMouse);
		casilla21.setBounds(395, 315, 75, 30);
		casilla21.setBackground(Color.GREEN.darker());
		casilla21.setForeground(Color.RED);
		casilla21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla21.setName("casilla21");
		casilla21.addMouseListener(eventoMouse);

		seisena7.setBounds(225, 345, 10, 10);
		seisena7.setBackground(Color.YELLOW);
		seisena7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena7.setName("seisena7");
		seisena7.addMouseListener(eventoMouse);
		casilla19y22.setBounds(235, 345, 70, 10);
		casilla19y22.setBackground(Color.YELLOW);
		casilla19y22.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19y22.setName("casilla19y22");
		casilla19y22.addMouseListener(eventoMouse);
		casilla19_20_22_23.setBounds(305, 345, 10, 10);
		casilla19_20_22_23.setBackground(Color.YELLOW);
		casilla19_20_22_23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19_20_22_23.setName("casilla19_20_22_23");
		casilla19_20_22_23.addMouseListener(eventoMouse);
		casilla20y23.setBounds(315, 345, 70, 10);
		casilla20y23.setBackground(Color.YELLOW);
		casilla20y23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20y23.setName("casilla20y23");
		casilla20y23.addMouseListener(eventoMouse);
		casilla20_21_23_24.setBounds(385, 345, 10, 10);
		casilla20_21_23_24.setBackground(Color.YELLOW);
		casilla20_21_23_24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20_21_23_24.setName("casilla20_21_23_24");
		casilla20_21_23_24.addMouseListener(eventoMouse);
		casilla21y24.setBounds(395, 345, 75, 10);
		casilla21y24.setBackground(Color.YELLOW);
		casilla21y24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla21y24.setName("casilla21y24");
		casilla21y24.addMouseListener(eventoMouse);

		fila8.setBounds(225, 355, 10, 30);
		fila8.setBackground(Color.YELLOW);
		fila8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila8.setName("fila8");
		fila8.addMouseListener(eventoMouse);
		casilla22.setBounds(235, 355, 70, 30);
		casilla22.setBackground(Color.GREEN.darker());
		casilla22.setForeground(Color.BLACK);
		casilla22.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22.setName("casilla22");
		casilla22.addMouseListener(eventoMouse);
		casilla22y23.setBounds(305, 355, 10, 30);
		casilla22y23.setBackground(Color.YELLOW);
		casilla22y23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22y23.setName("casilla22y23");
		casilla22y23.addMouseListener(eventoMouse);
		casilla23.setBounds(315, 355, 70, 30);
		casilla23.setBackground(Color.GREEN.darker());
		casilla23.setForeground(Color.RED);
		casilla23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23.setName("casilla23");
		casilla23.addMouseListener(eventoMouse);
		casilla23y24.setBounds(385, 355, 10, 30);
		casilla23y24.setBackground(Color.YELLOW);
		casilla23y24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23y24.setName("casilla23y24");
		casilla23y24.addMouseListener(eventoMouse);
		casilla24.setBounds(395, 355, 75, 30);
		casilla24.setBackground(Color.GREEN.darker());
		casilla24.setForeground(Color.BLACK);
		casilla24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla24.setName("casilla24");
		casilla24.addMouseListener(eventoMouse);

		seisena8.setBounds(225, 385, 10, 10);
		seisena8.setBackground(Color.YELLOW);
		seisena8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena8.setName("seisena8");
		seisena8.addMouseListener(eventoMouse);
		casilla22y25.setBounds(235, 385, 70, 10);
		casilla22y25.setBackground(Color.YELLOW);
		casilla22y25.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22y25.setName("casilla22y25");
		casilla22y25.addMouseListener(eventoMouse);
		casilla22_23_25_26.setBounds(305, 385, 10, 10);
		casilla22_23_25_26.setBackground(Color.YELLOW);
		casilla22_23_25_26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22_23_25_26.setName("casilla22_23_25_26");
		casilla22_23_25_26.addMouseListener(eventoMouse);
		casilla23y26.setBounds(315, 385, 70, 10);
		casilla23y26.setBackground(Color.YELLOW);
		casilla23y26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23y26.setName("casilla23y26");
		casilla23y26.addMouseListener(eventoMouse);
		casilla23_24_26_27.setBounds(385, 385, 10, 10);
		casilla23_24_26_27.setBackground(Color.YELLOW);
		casilla23_24_26_27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23_24_26_27.setName("casilla23_24_26_27");
		casilla23_24_26_27.addMouseListener(eventoMouse);
		casilla24y27.setBounds(395, 385, 75, 10);
		casilla24y27.setBackground(Color.YELLOW);
		casilla24y27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla24y27.setName("casilla24y27");
		casilla24y27.addMouseListener(eventoMouse);

		fila9.setBounds(225, 395, 10, 30);
		fila9.setBackground(Color.YELLOW);
		fila9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila9.setName("fila9");
		fila9.addMouseListener(eventoMouse);
		casilla25.setBounds(235, 395, 70, 30);
		casilla25.setBackground(Color.GREEN.darker());
		casilla25.setForeground(Color.RED);
		casilla25.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25.setName("casilla25");
		casilla25.addMouseListener(eventoMouse);
		casilla25y26.setBounds(305, 395, 10, 30);
		casilla25y26.setBackground(Color.YELLOW);
		casilla25y26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25y26.setName("casilla25y26");
		casilla25y26.addMouseListener(eventoMouse);
		casilla26.setBounds(315, 395, 70, 30);
		casilla26.setBackground(Color.GREEN.darker());
		casilla26.setForeground(Color.BLACK);
		casilla26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26.setName("casilla26");
		casilla26.addMouseListener(eventoMouse);
		casilla26y27.setBounds(385, 395, 10, 30);
		casilla26y27.setBackground(Color.YELLOW);
		casilla26y27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26y27.setName("casilla26y27");
		casilla26y27.addMouseListener(eventoMouse);
		casilla27.setBounds(395, 395, 75, 30);
		casilla27.setBackground(Color.GREEN.darker());
		casilla27.setForeground(Color.RED);
		casilla27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla27.setName("casilla27");
		casilla27.addMouseListener(eventoMouse);

		seisena9.setBounds(225, 425, 10, 10);
		seisena9.setBackground(Color.YELLOW);
		seisena9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena9.setName("seisena9");
		seisena9.addMouseListener(eventoMouse);
		casilla25y28.setBounds(235, 425, 70, 10);
		casilla25y28.setBackground(Color.YELLOW);
		casilla25y28.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25y28.setName("casilla25y28");
		casilla25y28.addMouseListener(eventoMouse);
		casilla25_26_28_29.setBounds(305, 425, 10, 10);
		casilla25_26_28_29.setBackground(Color.YELLOW);
		casilla25_26_28_29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25_26_28_29.setName("casilla25_26_28_29");
		casilla25_26_28_29.addMouseListener(eventoMouse);
		casilla26y29.setBounds(315, 425, 70, 10);
		casilla26y29.setBackground(Color.YELLOW);
		casilla26y29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26y29.setName("casilla26y29");
		casilla26y29.addMouseListener(eventoMouse);
		casilla26_27_29_30.setBounds(385, 425, 10, 10);
		casilla26_27_29_30.setBackground(Color.YELLOW);
		casilla26_27_29_30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26_27_29_30.setName("casilla26_27_29_30");
		casilla26_27_29_30.addMouseListener(eventoMouse);
		casilla27y30.setBounds(395, 425, 75, 10);
		casilla27y30.setBackground(Color.YELLOW);
		casilla27y30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla27y30.setName("casilla27y30");
		casilla27y30.addMouseListener(eventoMouse);

		fila10.setBounds(225, 435, 10, 30);
		fila10.setBackground(Color.YELLOW);
		fila10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila10.setName("fila10");
		fila10.addMouseListener(eventoMouse);
		casilla28.setBounds(235, 435, 70, 30);
		casilla28.setBackground(Color.GREEN.darker());
		casilla28.setForeground(Color.BLACK);
		casilla28.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28.setName("casilla28");
		casilla28.addMouseListener(eventoMouse);
		casilla28y29.setBounds(305, 435, 10, 30);
		casilla28y29.setBackground(Color.YELLOW);
		casilla28y29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28y29.setName("casilla28y29");
		casilla28y29.addMouseListener(eventoMouse);
		casilla29.setBounds(315, 435, 70, 30);
		casilla29.setBackground(Color.GREEN.darker());
		casilla29.setForeground(Color.BLACK);
		casilla29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29.setName("casilla29");
		casilla29.addMouseListener(eventoMouse);
		casilla29y30.setBounds(385, 435, 10, 30);
		casilla29y30.setBackground(Color.YELLOW);
		casilla29y30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29y30.setName("casilla29y30");
		casilla29y30.addMouseListener(eventoMouse);
		casilla30.setBounds(395, 435, 75, 30);
		casilla30.setBackground(Color.GREEN.darker());
		casilla30.setForeground(Color.RED);
		casilla30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla30.setName("casilla30");
		casilla30.addMouseListener(eventoMouse);

		seisena10.setBounds(225, 465, 10, 10);
		seisena10.setBackground(Color.YELLOW);
		seisena10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena10.setName("seisena10");
		seisena10.addMouseListener(eventoMouse);
		casilla28y31.setBounds(235, 465, 70, 10);
		casilla28y31.setBackground(Color.YELLOW);
		casilla28y31.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28y31.setName("casilla28y31");
		casilla28y31.addMouseListener(eventoMouse);
		casilla28_29_31_32.setBounds(305, 465, 10, 10);
		casilla28_29_31_32.setBackground(Color.YELLOW);
		casilla28_29_31_32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28_29_31_32.setName("casilla28_29_31_32");
		casilla28_29_31_32.addMouseListener(eventoMouse);
		casilla29y32.setBounds(315, 465, 70, 10);
		casilla29y32.setBackground(Color.YELLOW);
		casilla29y32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29y32.setName("casilla29y32");
		casilla29y32.addMouseListener(eventoMouse);
		casilla29_30_32_33.setBounds(385, 465, 10, 10);
		casilla29_30_32_33.setBackground(Color.YELLOW);
		casilla29_30_32_33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29_30_32_33.setName("casilla29_30_32_33");
		casilla29_30_32_33.addMouseListener(eventoMouse);
		casilla30y33.setBounds(395, 465, 75, 10);
		casilla30y33.setBackground(Color.YELLOW);
		casilla30y33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla30y33.setName("casilla30y33");
		casilla30y33.addMouseListener(eventoMouse);

		fila11.setBounds(225, 475, 10, 30);
		fila11.setBackground(Color.YELLOW);
		fila11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila11.setName("fila11");
		fila11.addMouseListener(eventoMouse);
		casilla31.setBounds(235, 475, 70, 30);
		casilla31.setBackground(Color.GREEN.darker());
		casilla31.setForeground(Color.BLACK);
		casilla31.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31.setName("casilla31");
		casilla31.addMouseListener(eventoMouse);
		casilla31y32.setBounds(305, 475, 10, 30);
		casilla31y32.setBackground(Color.YELLOW);
		casilla31y32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31y32.setName("casilla31y32");
		casilla31y32.addMouseListener(eventoMouse);
		casilla32.setBounds(315, 475, 70, 30);
		casilla32.setBackground(Color.GREEN.darker());
		casilla32.setForeground(Color.RED);
		casilla32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32.setName("casilla32");
		casilla32.addMouseListener(eventoMouse);
		casilla32y33.setBounds(385, 475, 10, 30);
		casilla32y33.setBackground(Color.YELLOW);
		casilla32y33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32y33.setName("casilla32y33");
		casilla32y33.addMouseListener(eventoMouse);
		casilla33.setBounds(395, 475, 75, 30);
		casilla33.setBackground(Color.GREEN.darker());
		casilla33.setForeground(Color.BLACK);
		casilla33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla33.setName("casilla33");
		casilla33.addMouseListener(eventoMouse);

		seisena11.setBounds(225, 505, 10, 10);
		seisena11.setBackground(Color.YELLOW);
		seisena11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		seisena11.setName("seisena11");
		seisena11.addMouseListener(eventoMouse);
		casilla31y34.setBounds(235, 505, 70, 10);
		casilla31y34.setBackground(Color.YELLOW);
		casilla31y34.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31y34.setName("casilla31y34");
		casilla31y34.addMouseListener(eventoMouse);
		casilla31_32_34_35.setBounds(305, 505, 10, 10);
		casilla31_32_34_35.setBackground(Color.YELLOW);
		casilla31_32_34_35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31_32_34_35.setName("casilla31_32_34_35");
		casilla31_32_34_35.addMouseListener(eventoMouse);
		casilla32y35.setBounds(315, 505, 70, 10);
		casilla32y35.setBackground(Color.YELLOW);
		casilla32y35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32y35.setName("casilla32y35");
		casilla32y35.addMouseListener(eventoMouse);
		casilla32_33_35_36.setBounds(385, 505, 10, 10);
		casilla32_33_35_36.setBackground(Color.YELLOW);
		casilla32_33_35_36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32_33_35_36.setName("casilla32_33_35_36");
		casilla32_33_35_36.addMouseListener(eventoMouse);
		casilla33y36.setBounds(395, 505, 75, 10);
		casilla33y36.setBackground(Color.YELLOW);
		casilla33y36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla33y36.setName("casilla33y36");
		casilla33y36.addMouseListener(eventoMouse);

		fila12.setBounds(225, 515, 10, 35);
		fila12.setBackground(Color.YELLOW);
		fila12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		fila12.setName("fila12");
		fila12.addMouseListener(eventoMouse);
		casilla34.setBounds(235, 515, 70, 35);
		casilla34.setBackground(Color.GREEN.darker());
		casilla34.setForeground(Color.RED);
		casilla34.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla34.setName("casilla34");
		casilla34.addMouseListener(eventoMouse);
		casilla34y35.setBounds(305, 515, 10, 35);
		casilla34y35.setBackground(Color.YELLOW);
		casilla34y35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla34y35.setName("casilla34y35");
		casilla34y35.addMouseListener(eventoMouse);
		casilla35.setBounds(315, 515, 70, 35);
		casilla35.setBackground(Color.GREEN.darker());
		casilla35.setForeground(Color.BLACK);
		casilla35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla35.setName("casilla35");
		casilla35.addMouseListener(eventoMouse);
		casilla35y36.setBounds(385, 515, 10, 35);
		casilla35y36.setBackground(Color.YELLOW);
		casilla35y36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla35y36.setName("casilla35y36");
		casilla35y36.addMouseListener(eventoMouse);
		casilla36.setBounds(395, 515, 75, 35);
		casilla36.setBackground(Color.GREEN.darker());
		casilla36.setForeground(Color.RED);
		casilla36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla36.setName("casilla36");
		casilla36.addMouseListener(eventoMouse);

		columna1.setBounds(225, 550, 80, 35);
		columna1.setBackground(Color.GREEN.darker());
		columna1.setForeground(Color.YELLOW);
		columna1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna1.setName("columna1");
		columna1.addMouseListener(eventoMouse);
		columna1y2.setBounds(305, 550, 10, 35);
		columna1y2.setBackground(Color.YELLOW);
		columna1y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna1y2.setName("columna1y2");
		columna1y2.addMouseListener(eventoMouse);
		columna2.setBounds(315, 550, 70, 35);
		columna2.setBackground(Color.GREEN.darker());
		columna2.setForeground(Color.YELLOW);
		columna2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna2.setName("columna2");
		columna2.addMouseListener(eventoMouse);
		columna2y3.setBounds(385, 550, 10, 35);
		columna2y3.setBackground(Color.YELLOW);
		columna2y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna2y3.setName("columna2y3");
		columna2y3.addMouseListener(eventoMouse);
		columna3.setBounds(395, 550, 75, 35);
		columna3.setBackground(Color.GREEN.darker());
		columna3.setForeground(Color.YELLOW);
		columna3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna3.setName("columna3");
		columna3.addMouseListener(eventoMouse);



		contenedorNotones.add(casilla0);
		contenedorNotones.add(casilla1_18);
		contenedorNotones.add(casilla_par);
		contenedorNotones.add(casilla_black);
		contenedorNotones.add(casilla_red);
		contenedorNotones.add(casilla_impar);
		contenedorNotones.add(casilla19_36);
		contenedorNotones.add(primera12na);
		contenedorNotones.add(docena1y2);
		contenedorNotones.add(segunda12na);
		contenedorNotones.add(docena2y3);
		contenedorNotones.add(tercera12na);
		contenedorNotones.add(casilla0y1);
		contenedorNotones.add(casilla0_1_2);
		contenedorNotones.add(casilla0y2);
		contenedorNotones.add(casilla0_2_3);
		contenedorNotones.add(casilla0y3);

		contenedorNotones.add(fila1);
		contenedorNotones.add(casilla1);
		contenedorNotones.add(casilla1y2);
		contenedorNotones.add(casilla2);
		contenedorNotones.add(casilla2y3);
		contenedorNotones.add(casilla3);

		contenedorNotones.add(seisena1);
		contenedorNotones.add(casilla1y4);
		contenedorNotones.add(casilla1_2_4_5);
		contenedorNotones.add(casilla2y5);
		contenedorNotones.add(casilla2_3_5_6);
		contenedorNotones.add(casilla3y6);

		contenedorNotones.add(fila2);
		contenedorNotones.add(casilla4);
		contenedorNotones.add(casilla4y5);
		contenedorNotones.add(casilla5);
		contenedorNotones.add(casilla5y6);
		contenedorNotones.add(casilla6);

		contenedorNotones.add(seisena2);
		contenedorNotones.add(casilla4y7);
		contenedorNotones.add(casilla4_5_7_8);
		contenedorNotones.add(casilla5y8);
		contenedorNotones.add(casilla5_6_8_9);
		contenedorNotones.add(casilla6y9);

		contenedorNotones.add(fila3);
		contenedorNotones.add(casilla7);
		contenedorNotones.add(casilla7y8);
		contenedorNotones.add(casilla8);
		contenedorNotones.add(casilla8y9);
		contenedorNotones.add(casilla9);

		contenedorNotones.add(seisena3);
		contenedorNotones.add(casilla7y10);
		contenedorNotones.add(casilla7_8_10_11);
		contenedorNotones.add(casilla8y11);
		contenedorNotones.add(casilla8_9_11_12);
		contenedorNotones.add(casilla9y12);

		contenedorNotones.add(fila4);
		contenedorNotones.add(casilla10);
		contenedorNotones.add(casilla10y11);
		contenedorNotones.add(casilla11);
		contenedorNotones.add(casilla11y12);
		contenedorNotones.add(casilla12);

		contenedorNotones.add(seisena4);
		contenedorNotones.add(casilla10y13);
		contenedorNotones.add(casilla10_11_13_14);
		contenedorNotones.add(casilla11y14);
		contenedorNotones.add(casilla11_12_14_15);
		contenedorNotones.add(casilla12y15);
		////////////////////////////////////
		contenedorNotones.add(fila5);
		contenedorNotones.add(casilla13);
		contenedorNotones.add(casilla13y14);
		contenedorNotones.add(casilla14);
		contenedorNotones.add(casilla14y15);
		contenedorNotones.add(casilla15);

		contenedorNotones.add(seisena5);
		contenedorNotones.add(casilla13y16);
		contenedorNotones.add(casilla13_14_16_17);
		contenedorNotones.add(casilla14y17);
		contenedorNotones.add(casilla14_15_17_18);
		contenedorNotones.add(casilla15y18);

		contenedorNotones.add(fila6);
		contenedorNotones.add(casilla16);
		contenedorNotones.add(casilla16y17);
		contenedorNotones.add(casilla17);
		contenedorNotones.add(casilla17y18);
		contenedorNotones.add(casilla18);

		contenedorNotones.add(seisena6);
		contenedorNotones.add(casilla16y19);
		contenedorNotones.add(casilla16_17_19_20);
		contenedorNotones.add(casilla17y20);
		contenedorNotones.add(casilla17_18_20_21);
		contenedorNotones.add(casilla18y21);

		contenedorNotones.add(fila7);
		contenedorNotones.add(casilla19);
		contenedorNotones.add(casilla19y20);
		contenedorNotones.add(casilla20);
		contenedorNotones.add(casilla20y21);
		contenedorNotones.add(casilla21);

		contenedorNotones.add(seisena7);
		contenedorNotones.add(casilla19y22);
		contenedorNotones.add(casilla19_20_22_23);
		contenedorNotones.add(casilla20y23);
		contenedorNotones.add(casilla20_21_23_24);
		contenedorNotones.add(casilla21y24);

		contenedorNotones.add(fila8);
		contenedorNotones.add(casilla22);
		contenedorNotones.add(casilla22y23);
		contenedorNotones.add(casilla23);
		contenedorNotones.add(casilla23y24);
		contenedorNotones.add(casilla24);

		contenedorNotones.add(seisena8);
		contenedorNotones.add(casilla22y25);
		contenedorNotones.add(casilla22_23_25_26);
		contenedorNotones.add(casilla23y26);
		contenedorNotones.add(casilla23_24_26_27);
		contenedorNotones.add(casilla24y27);

		contenedorNotones.add(fila9);
		contenedorNotones.add(casilla25);
		contenedorNotones.add(casilla25y26);
		contenedorNotones.add(casilla26);
		contenedorNotones.add(casilla26y27);
		contenedorNotones.add(casilla27);

		contenedorNotones.add(seisena9);
		contenedorNotones.add(casilla25y28);
		contenedorNotones.add(casilla25_26_28_29);
		contenedorNotones.add(casilla26y29);
		contenedorNotones.add(casilla26_27_29_30);
		contenedorNotones.add(casilla27y30);

		contenedorNotones.add(fila10);
		contenedorNotones.add(casilla28);
		contenedorNotones.add(casilla28y29);
		contenedorNotones.add(casilla29);
		contenedorNotones.add(casilla29y30);
		contenedorNotones.add(casilla30);

		contenedorNotones.add(seisena10);
		contenedorNotones.add(casilla28y31);
		contenedorNotones.add(casilla28_29_31_32);
		contenedorNotones.add(casilla29y32);
		contenedorNotones.add(casilla29_30_32_33);
		contenedorNotones.add(casilla30y33);

		contenedorNotones.add(fila11);
		contenedorNotones.add(casilla31);
		contenedorNotones.add(casilla31y32);
		contenedorNotones.add(casilla32);
		contenedorNotones.add(casilla32y33);
		contenedorNotones.add(casilla33);

		contenedorNotones.add(seisena11);
		contenedorNotones.add(casilla31y34);
		contenedorNotones.add(casilla31_32_34_35);
		contenedorNotones.add(casilla32y35);
		contenedorNotones.add(casilla32_33_35_36);
		contenedorNotones.add(casilla33y36);

		contenedorNotones.add(fila12);
		contenedorNotones.add(casilla34);
		contenedorNotones.add(casilla34y35);
		contenedorNotones.add(casilla35);
		contenedorNotones.add(casilla35y36);
		contenedorNotones.add(casilla36);

		contenedorNotones.add(columna1);
		contenedorNotones.add(columna1y2);
		contenedorNotones.add(columna2);
		contenedorNotones.add(columna2y3);
		contenedorNotones.add(columna3);

		contenedor.add(contenedorNotones);

		this.add(contenedor,null);
	}

	/**
		*Establece las apuestas 1x1 que se hacen
		*
		*/
	private void setApuestas1X1(String apuesta){
			if(apuesta == "casilla_par" || apuesta == "casilla_impar"){
				for(int i = 1; i<=36;i++) {
							if(i % 2 == 0 ) {
									if(apuesta == "casilla_par"){
										apuesta1X1.add(i);
									}
							}else{
									if(apuesta == "casilla_impar"){
										apuesta1X1.add(i);
									}
							}
				}
			}

			else if(apuesta == "casilla_black" || apuesta == "casilla_red"){
					for(int i = 1; i<=36;i++) {
								if(  (i % 2 ==0 && (i<=10 || i > 19 && i<29))   ||    (i %2 != 0 && (i>10 && i<18 || i>=29)) ) {
										if(apuesta == "casilla_black"){
											apuesta1X1.add(i);
										}
								}else{
									  if(apuesta == "casilla_red"){
										  apuesta1X1.add(i);
										}
								}
					}
			}

			else if(apuesta == "casilla1_18"){
				for(int i = 1; i <= 18; i++){
					apuesta1X1.add(i);
				}
			}

			else if(apuesta == "casilla19_36"){
				for(int i = 19; i <= 36; i++){
					apuesta1X1.add(i);
				}
			}
	}

	private void setApuestas2X1(String apuesta){
		if(apuesta == "primera12na"){
			for (int i = 1; i <= 12; i++) {
				System.out.println("[debug] apuesta primera12na = "+i);
				apuesta2X1.add(i);
			}
		}

		else if(apuesta == "segunda12na"){
			for (int i = 13; i <= 24; i++) {
				System.out.println("[debug] apuesta segunda12na = "+i);
				apuesta2X1.add(i);
			}
		}

		else if(apuesta == "tercera12na"){
			for (int i = 25; i <= 36; i++) {
				System.out.println("[debug] apuesta tercera12na = "+i);
				apuesta2X1.add(i);
			}
		}

		else if(apuesta == "columna1"){
			for (int i = 1; i <= 34; i+=3) {
				System.out.println("[debug] apuesta columna1 = "+i);
				apuesta2X1.add(i);
			}
		}

		else if(apuesta == "columna2"){
			for (int i = 2; i <= 35; i+=3) {
				System.out.println("[debug] apuesta columna2 = "+i);
				apuesta2X1.add(i);
			}
		}

		else if(apuesta == "columna3"){
			for (int i = 3; i <= 36; i+=3) {
				System.out.println("[debug] apuesta columna3 = "+i);
				apuesta2X1.add(i);
			}
		}
	}

	private void setApuesta05X1(String apuesta){
		if(apuesta == "docena1y2"){
			for(int i = 1; i <= 24; i++){
				System.out.println("[debug] apuesta docena1y2:"+i);
				apuesta05X1.add(i);
			}
		}

		if(apuesta == "docena2y3"){
			for(int i = 13; i <= 36; i++){
				System.out.println("[debug] apuesta docena2y3:"+i);
				apuesta05X1.add(i);
			}
		}

		if(apuesta == "columna1y2" ){
			for(int i = 1; i <= 35; i++){
				if(i%3 != 0){
					System.out.println("[debug] apuesta columna1y2:"+i);
					apuesta05X1.add(i);
				}
			}
		}

		if(apuesta == "columna2y3" ){
			apuesta05X1.add(2);
			apuesta05X1.add(3);
			apuesta05X1.add(5);
			apuesta05X1.add(6);
			apuesta05X1.add(8);
			apuesta05X1.add(9);
			apuesta05X1.add(11);
			apuesta05X1.add(12);
			apuesta05X1.add(14);
			apuesta05X1.add(15);
			apuesta05X1.add(17);
			apuesta05X1.add(18);
			apuesta05X1.add(20);
			apuesta05X1.add(21);
			apuesta05X1.add(23);
			apuesta05X1.add(24);
			apuesta05X1.add(26);
			apuesta05X1.add(27);
			apuesta05X1.add(29);
			apuesta05X1.add(30);
			apuesta05X1.add(32);
			apuesta05X1.add(33);
			apuesta05X1.add(35);
			apuesta05X1.add(36);
		}
	}

	private void setApuesta5X1(String apuesta){
		if(apuesta == "seisena1"){
			for (int i = 1; i <=6 ;i++ ) {
				System.out.println("[debug] apuesta seisena1: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena2"){
			for (int i = 4; i <=9 ;i++ ) {
				System.out.println("[debug] apuesta seisena2: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena3"){
			for (int i = 7; i <=12 ;i++ ) {
				System.out.println("[debug] apuesta seisena3: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena4"){
			for (int i = 10; i <=15 ;i++ ) {
				System.out.println("[debug] apuesta seisena4: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena5"){
			for (int i = 13; i <=18 ;i++ ) {
				System.out.println("[debug] apuesta seisena5: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena6"){
			for (int i = 16; i <=21 ;i++ ) {
				System.out.println("[debug] apuesta seisena6: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena7"){
			for (int i = 19; i <=24 ;i++ ) {
				System.out.println("[debug] apuesta seisena7: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena8"){
			for (int i = 22; i <=27 ;i++ ) {
				System.out.println("[debug] apuesta seisena8: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena9"){
			for (int i = 25; i <=30 ;i++ ) {
				System.out.println("[debug] apuesta seisena9: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena10"){
			for (int i = 28; i <=33 ;i++ ) {
				System.out.println("[debug] apuesta seisena10: "+i);
				apuesta5X1.add(i);
			}
		}

		if(apuesta == "seisena11"){
			for (int i = 31; i <=36 ;i++ ) {
				System.out.println("[debug] apuesta seisena11: "+i);
				apuesta5X1.add(i);
			}
		}
	}

	private void setApuesta8X1(String apuesta){

		if(apuesta == "casilla1_2_4_5"){
			apuesta8X1.add(1);
			apuesta8X1.add(2);
			apuesta8X1.add(4);
			apuesta8X1.add(5);
		}
		else if(apuesta == "casilla2_3_5_6"){
			apuesta8X1.add(2);
			apuesta8X1.add(3);
			apuesta8X1.add(5);
			apuesta8X1.add(6);
		}
		else if(apuesta == "casilla4_5_7_8"){
			apuesta8X1.add(4);
			apuesta8X1.add(5);
			apuesta8X1.add(7);
			apuesta8X1.add(8);
		}
		else if(apuesta == "casilla5_6_8_9"){
			apuesta8X1.add(5);
			apuesta8X1.add(6);
			apuesta8X1.add(8);
			apuesta8X1.add(9);
		}
		else if(apuesta == "casilla7_8_10_11"){
			apuesta8X1.add(7);
			apuesta8X1.add(8);
			apuesta8X1.add(10);
			apuesta8X1.add(11);
		}
		else if(apuesta == "casilla8_9_11_12"){
			apuesta8X1.add(8);
			apuesta8X1.add(9);
			apuesta8X1.add(11);
			apuesta8X1.add(12);
		}
		else if(apuesta == "casilla10_11_13_14"){
			apuesta8X1.add(10);
			apuesta8X1.add(11);
			apuesta8X1.add(13);
			apuesta8X1.add(14);
		}
		else if(apuesta == "casilla11_12_14_15"){
			apuesta8X1.add(11);
			apuesta8X1.add(12);
			apuesta8X1.add(14);
			apuesta8X1.add(15);
		}
		else if(apuesta == "casilla13_14_16_17"){
			apuesta8X1.add(13);
			apuesta8X1.add(14);
			apuesta8X1.add(16);
			apuesta8X1.add(17);
		}
		else if(apuesta == "casilla14_15_17_18"){
			apuesta8X1.add(14);
			apuesta8X1.add(15);
			apuesta8X1.add(17);
			apuesta8X1.add(18);
		}
		else if(apuesta == "casilla16_17_19_20"){
			apuesta8X1.add(16);
			apuesta8X1.add(17);
			apuesta8X1.add(19);
			apuesta8X1.add(20);
		}
		else if(apuesta == "casilla17_18_20_21"){
			apuesta8X1.add(17);
			apuesta8X1.add(18);
			apuesta8X1.add(20);
			apuesta8X1.add(21);
		}
		else if(apuesta == "casilla19_20_22_23"){
			apuesta8X1.add(19);
			apuesta8X1.add(20);
			apuesta8X1.add(22);
			apuesta8X1.add(23);
		}
		else if(apuesta == "casilla20_21_23_24"){
			apuesta8X1.add(20);
			apuesta8X1.add(21);
			apuesta8X1.add(23);
			apuesta8X1.add(24);
		}
		else if(apuesta == "casilla22_23_25_26"){
			apuesta8X1.add(22);
			apuesta8X1.add(23);
			apuesta8X1.add(25);
			apuesta8X1.add(26);
		}
		else if(apuesta == "casilla23_24_26_27"){
			apuesta8X1.add(23);
			apuesta8X1.add(24);
			apuesta8X1.add(26);
			apuesta8X1.add(27);
		}
		else if(apuesta == "casilla25_26_28_29"){
			apuesta8X1.add(25);
			apuesta8X1.add(26);
			apuesta8X1.add(28);
			apuesta8X1.add(29);
		}
		else if(apuesta == "casilla26_27_29_30"){
			apuesta8X1.add(26);
			apuesta8X1.add(27);
			apuesta8X1.add(29);
			apuesta8X1.add(30);
		}
		else if(apuesta == "casilla28_29_31_32"){
			apuesta8X1.add(28);
			apuesta8X1.add(29);
			apuesta8X1.add(31);
			apuesta8X1.add(32);
		}
		else if(apuesta == "casilla29_30_32_33"){
			apuesta8X1.add(29);
			apuesta8X1.add(30);
			apuesta8X1.add(32);
			apuesta8X1.add(33);
		}
		else if(apuesta == "casilla31_32_34_35"){
			apuesta8X1.add(31);
			apuesta8X1.add(32);
			apuesta8X1.add(34);
			apuesta8X1.add(35);
		}
		else if(apuesta == "casilla32_33_35_36"){
			apuesta8X1.add(32);
			apuesta8X1.add(33);
			apuesta8X1.add(35);
			apuesta8X1.add(36);
		}

	}

	private void setApuesta11X1(String apuesta){
		if(apuesta == "casilla0_1_2"){
			apuesta11X1.add(0);
			apuesta11X1.add(1);
			apuesta11X1.add(2);
		}
		else if(apuesta == "casilla0_2_3"){
			apuesta11X1.add(0);
			apuesta11X1.add(2);
			apuesta11X1.add(3);
		}
		else if(apuesta == "fila1"){
			apuesta11X1.add(1);
			apuesta11X1.add(2);
			apuesta11X1.add(3);
		}
		else if(apuesta == "fila2"){
			apuesta11X1.add(4);
			apuesta11X1.add(5);
			apuesta11X1.add(6);
		}
		else if(apuesta == "fila3"){
			apuesta11X1.add(7);
			apuesta11X1.add(8);
			apuesta11X1.add(9);
		}
		else if(apuesta == "fila4"){
			apuesta11X1.add(10);
			apuesta11X1.add(11);
			apuesta11X1.add(12);
		}
		else if(apuesta == "fila5"){
			apuesta11X1.add(13);
			apuesta11X1.add(14);
			apuesta11X1.add(15);
		}
		else if(apuesta == "fila6"){
			apuesta11X1.add(16);
			apuesta11X1.add(17);
			apuesta11X1.add(18);
		}
		else if(apuesta == "fila7"){
			apuesta11X1.add(19);
			apuesta11X1.add(20);
			apuesta11X1.add(21);
		}
		else if(apuesta == "fila8"){
			apuesta11X1.add(22);
			apuesta11X1.add(23);
			apuesta11X1.add(24);
		}
		else if(apuesta == "fila9"){
			apuesta11X1.add(25);
			apuesta11X1.add(26);
			apuesta11X1.add(27);
		}
		else if(apuesta == "fila10"){
			apuesta11X1.add(28);
			apuesta11X1.add(29);
			apuesta11X1.add(30);
		}
		else if(apuesta == "fila11"){
			apuesta11X1.add(31);
			apuesta11X1.add(32);
			apuesta11X1.add(33);
		}
		else if(apuesta == "fila12"){
			apuesta11X1.add(34);
			apuesta11X1.add(35);
			apuesta11X1.add(36);
		}
	}

	private void setApuesta17X1(String apuesta){
		if(apuesta == "casilla1y2"){
				apuesta17X1.add(1);
				apuesta17X1.add(2);
		}
		if(apuesta == "casilla2y3"){
			apuesta17X1.add(2);
			apuesta17X1.add(3);
		}

		if(apuesta == "casilla0y3"){
			apuesta17X1.add(0);
			apuesta17X1.add(3);
		}
		if(apuesta == "casilla0y2"){
			apuesta17X1.add(0);
			apuesta17X1.add(2);
		}
		if(apuesta == "casilla0y1"){
			apuesta17X1.add(0);
			apuesta17X1.add(1);
		}
		if(apuesta == "casilla1y4"){
			apuesta17X1.add(1);
			apuesta17X1.add(4);
		}
		if(apuesta == "casilla2y5"){
			apuesta17X1.add(2);
			apuesta17X1.add(5);
		}
		if(apuesta == "casilla3y6"){
			apuesta17X1.add(3);
			apuesta17X1.add(6);
		}
		if(apuesta == "casilla4y5"){
			apuesta17X1.add(4);
			apuesta17X1.add(5);
		}
		if(apuesta == "casilla5y6"){
			apuesta17X1.add(5);
			apuesta17X1.add(6);
		}
		if(apuesta == "casilla6y9"){
			apuesta17X1.add(6);
			apuesta17X1.add(9);
		}
		if(apuesta == "casilla5y8"){
			apuesta17X1.add(5);
			apuesta17X1.add(8);
		}
		if(apuesta == "casilla4y7"){
			apuesta17X1.add(4);
			apuesta17X1.add(7);
		}
		if(apuesta == "casilla7y8"){
			apuesta17X1.add(7);
			apuesta17X1.add(8);
		}
		if(apuesta == "casilla8y9"){
			apuesta17X1.add(8);
			apuesta17X1.add(9);
		}
		if(apuesta == "casilla9y12"){
			apuesta17X1.add(9);
			apuesta17X1.add(12);
		}
		if(apuesta == "casilla8y11"){
			apuesta17X1.add(8);
			apuesta17X1.add(11);
		}
		if(apuesta == "casilla7y10"){
			apuesta17X1.add(7);
			apuesta17X1.add(10);
		}
		if(apuesta == "casilla10y13"){
			apuesta17X1.add(10);
			apuesta17X1.add(13);
		}
		if(apuesta == "casilla10y11"){
			apuesta17X1.add(10);
			apuesta17X1.add(11);
		}
		if(apuesta == "casilla11y12"){
			apuesta17X1.add(11);
			apuesta17X1.add(12);
		}
		if(apuesta == "casilla11y14"){
			apuesta17X1.add(11);
			apuesta17X1.add(14);
		}
		if(apuesta == "casilla12y15"){
			apuesta17X1.add(12);
			apuesta17X1.add(15);
		}
		if(apuesta == "casilla14y15"){
			apuesta17X1.add(14);
			apuesta17X1.add(15);
		}
		if(apuesta == "casilla13y14"){
			apuesta17X1.add(13);
			apuesta17X1.add(14);
		}
		if(apuesta == "casilla13y16"){
			apuesta17X1.add(13);
			apuesta17X1.add(16);
		}
		if(apuesta == "casilla14y17"){
			apuesta17X1.add(14);
			apuesta17X1.add(17);
		}
		if(apuesta == "casilla15y18"){
			apuesta17X1.add(15);
			apuesta17X1.add(18);
		}
		if(apuesta == "casilla17y18"){
			apuesta17X1.add(17);
			apuesta17X1.add(18);
		}
		if(apuesta == "casilla16y17"){
			apuesta17X1.add(16);
			apuesta17X1.add(17);
		}
		if(apuesta == "casilla16y19"){
			apuesta17X1.add(16);
			apuesta17X1.add(19);
		}
		if(apuesta == "casilla17y20"){
			apuesta17X1.add(17);
			apuesta17X1.add(20);
		}
		if(apuesta == "casilla18y21"){
			apuesta17X1.add(18);
			apuesta17X1.add(21);
		}
		if(apuesta == "casilla20y21"){
			apuesta17X1.add(20);
			apuesta17X1.add(21);
		}
		if(apuesta == "casilla19y20"){
			apuesta17X1.add(19);
			apuesta17X1.add(20);
		}
		if(apuesta == "casilla19y22"){
			apuesta17X1.add(19);
			apuesta17X1.add(22);
		}
		if(apuesta == "casilla20y23"){
			apuesta17X1.add(20);
			apuesta17X1.add(23);
		}
		if(apuesta == "casilla21y24"){
			apuesta17X1.add(21);
			apuesta17X1.add(24);
		}
		if(apuesta == "casilla23y24"){
			apuesta17X1.add(23);
			apuesta17X1.add(24);
		}
		if(apuesta == "casilla22y23"){
			apuesta17X1.add(22);
			apuesta17X1.add(23);
		}
		if(apuesta == "casilla22y25"){
			apuesta17X1.add(22);
			apuesta17X1.add(25);
		}
		if(apuesta == "casilla23y26"){
			apuesta17X1.add(23);
			apuesta17X1.add(26);
		}
		if(apuesta == "casilla24y27"){
			apuesta17X1.add(24);
			apuesta17X1.add(27);
		}
		if(apuesta == "casilla26y27"){
			apuesta17X1.add(26);
			apuesta17X1.add(27);
		}
		if(apuesta == "casilla25y26"){
			apuesta17X1.add(25);
			apuesta17X1.add(26);
		}
		if(apuesta == "casilla25y28"){
			apuesta17X1.add(25);
			apuesta17X1.add(28);
		}
		if(apuesta == "casilla26y29"){
			apuesta17X1.add(26);
			apuesta17X1.add(29);
		}
		if(apuesta == "casilla27y30"){
			apuesta17X1.add(27);
			apuesta17X1.add(30);
		}
		if(apuesta == "casilla29y30"){
			apuesta17X1.add(29);
			apuesta17X1.add(30);
		}
		if(apuesta == "casilla28y29"){
			apuesta17X1.add(28);
			apuesta17X1.add(29);
		}
		if(apuesta == "casilla28y31"){
			apuesta17X1.add(28);
			apuesta17X1.add(31);
		}
		if(apuesta == "casilla29y32"){
			apuesta17X1.add(29);
			apuesta17X1.add(32);
		}
		if(apuesta == "casilla30y33"){
			apuesta17X1.add(30);
			apuesta17X1.add(33);
		}
		if(apuesta == "casilla32y33"){
			apuesta17X1.add(32);
			apuesta17X1.add(33);
		}
		if(apuesta == "casilla31y32"){
			apuesta17X1.add(31);
			apuesta17X1.add(32);
		}
		if(apuesta == "casilla31y34"){
			apuesta17X1.add(31);
			apuesta17X1.add(34);
		}
		if(apuesta == "casilla32y35"){
			apuesta17X1.add(32);
			apuesta17X1.add(35);
		}
		if(apuesta == "casilla33y36"){
			apuesta17X1.add(33);
			apuesta17X1.add(36);
		}
		if(apuesta == "casilla35y36"){
			apuesta17X1.add(35);
			apuesta17X1.add(36);
		}
		if(apuesta == "casilla34y35"){
			apuesta17X1.add(34);
			apuesta17X1.add(35);
		}
	}

	private void setApuesta35X1(String button){
		if(button == "casilla1"){
			apuesta35X1.add(1);
		}
		else if(button == "casilla2"){
			apuesta35X1.add(2);
		}
		else if(button == "casilla3"){
			apuesta35X1.add(3);
		}
		else if(button == "casilla4"){
			apuesta35X1.add(4);
		}
		else if(button == "casilla5"){
			apuesta35X1.add(5);
		}
		else if(button == "casilla6"){
			apuesta35X1.add(6);
		}
		else if(button == "casilla7"){
			apuesta35X1.add(7);
		}
		else if(button == "casilla8"){
			apuesta35X1.add(8);
		}
		else if(button == "casilla9"){
			apuesta35X1.add(9);
		}
		else if(button == "casilla10"){
			apuesta35X1.add(10);
		}
		else if(button == "casilla11"){
			apuesta35X1.add(11);
		}
		else if(button == "casilla12"){
			apuesta35X1.add(12);
		}
		else if(button == "casilla13"){
			apuesta35X1.add(13);
		}
		else if(button == "casilla14"){
			apuesta35X1.add(14);
		}
		else if(button == "casilla15"){
			apuesta35X1.add(15);
		}
		else if(button == "casilla16"){
			apuesta35X1.add(16);
		}
		else if(button == "casilla17"){
			apuesta35X1.add(17);
		}
		else if(button == "casilla18"){
			apuesta35X1.add(18);
		}
		else if(button == "casilla19"){
			apuesta35X1.add(19);
		}
		else if(button == "casilla20"){
			apuesta35X1.add(20);
		}
		else if(button == "casilla21"){
			apuesta35X1.add(21);
		}
		else if(button == "casilla22"){
			apuesta35X1.add(22);
		}
		else if(button == "casilla23"){
			apuesta35X1.add(23);
		}
		else if(button == "casilla24"){
			apuesta35X1.add(24);
		}
		else if(button == "casilla25"){
			apuesta35X1.add(25);
		}
		else if(button == "casilla26"){
			apuesta35X1.add(26);
		}
		else if(button == "casilla27"){
			apuesta35X1.add(27);
		}
		else if(button == "casilla28"){
			apuesta35X1.add(28);
		}
		else if(button == "casilla29"){
			apuesta35X1.add(29);
		}
		else if(button == "casilla30"){
			apuesta35X1.add(30);
		}
		else if(button == "casilla31"){
			apuesta35X1.add(31);
		}
		else if(button == "casilla32"){
			apuesta35X1.add(32);
		}
		else if(button == "casilla33"){
			apuesta35X1.add(33);
		}
		else if(button == "casilla34"){
			apuesta35X1.add(34);
		}
		else if(button == "casilla35"){
			apuesta35X1.add(35);
		}
		else if(button == "casilla36"){
			apuesta35X1.add(36);
		}
	}
	/**
	 *Retorna las apuestas 1x1 que hay en el tablero
	 */
	public ArrayList<Integer> getApuesta1X1(){
		return apuesta1X1;
	}

	public ArrayList<Integer> getApuesta2X1(){
		return apuesta2X1;
	}

	public ArrayList<Integer> getApuesta05X1(){
		return apuesta05X1;
	}

	public ArrayList<Integer> getApuesta5X1(){
		return apuesta5X1;
	}

	public ArrayList<Integer> getApuesta8X1(){
		return apuesta8X1;
	}

	public ArrayList<Integer> getApuesta11X1(){
		return apuesta11X1;
	}

	public ArrayList<Integer> getApuesta17X1(){
		return apuesta17X1;
	}

	public ArrayList<Integer> getApuesta35X1(){
		return apuesta35X1;
	}

	/**
	*Restablece los colores de los botones
	*/
	public void resetColors(){
		casilla0.setBackground(Color.GREEN.darker());
		casilla1_18.setBackground(Color.GREEN.darker());
		casilla_par.setBackground(Color.GREEN.darker());
		casilla_black.setBackground(Color.black);
		casilla_red.setBackground(Color.red);
		casilla_impar.setBackground(Color.GREEN.darker());
		casilla19_36.setBackground(Color.GREEN.darker());
		primera12na.setBackground(Color.GREEN.darker());
		docena1y2.setBackground(Color.YELLOW);
		segunda12na.setBackground(Color.GREEN.darker());
		docena2y3.setBackground(Color.YELLOW);
		tercera12na.setBackground(Color.GREEN.darker());
		casilla0y1.setBackground(Color.YELLOW);
		casilla0_1_2.setBackground(Color.YELLOW);
		casilla0y2.setBackground(Color.YELLOW);
		casilla0_2_3.setBackground(Color.YELLOW);
		casilla0y3.setBackground(Color.YELLOW);
		fila1.setBackground(Color.YELLOW);
		casilla1.setBackground(Color.GREEN.darker());
		casilla1y2.setBackground(Color.YELLOW);
		casilla2.setBackground(Color.GREEN.darker());
		casilla2y3.setBackground(Color.YELLOW);
		casilla3.setBackground(Color.GREEN.darker());
		seisena1.setBackground(Color.YELLOW);
		casilla1y4.setBackground(Color.YELLOW);
		casilla1_2_4_5.setBackground(Color.YELLOW);
		casilla2y5.setBackground(Color.YELLOW);
		casilla2_3_5_6.setBackground(Color.YELLOW);
		casilla3y6.setBackground(Color.YELLOW);
		fila2.setBackground(Color.YELLOW);
		casilla4.setBackground(Color.GREEN.darker());
		casilla4y5.setBackground(Color.YELLOW);
		casilla5.setBackground(Color.GREEN.darker());
		casilla5y6.setBackground(Color.YELLOW);
		casilla6.setBackground(Color.GREEN.darker());
		seisena2.setBackground(Color.YELLOW);
		casilla4y7.setBackground(Color.YELLOW);
		casilla4_5_7_8.setBackground(Color.YELLOW);
		casilla5y8.setBackground(Color.YELLOW);
		casilla5_6_8_9.setBackground(Color.YELLOW);
		casilla6y9.setBackground(Color.YELLOW);
		fila3.setBackground(Color.YELLOW);
		casilla7.setBackground(Color.GREEN.darker());
		casilla7y8.setBackground(Color.YELLOW);
		casilla8.setBackground(Color.GREEN.darker());
		casilla8y9.setBackground(Color.YELLOW);
		casilla9.setBackground(Color.GREEN.darker());
		seisena3.setBackground(Color.YELLOW);
		casilla7y10.setBackground(Color.YELLOW);
		casilla7_8_10_11.setBackground(Color.YELLOW);
		casilla8y11.setBackground(Color.YELLOW);
		casilla8_9_11_12.setBackground(Color.YELLOW);
		casilla9y12.setBackground(Color.YELLOW);
		fila4.setBackground(Color.YELLOW);
		casilla10.setBackground(Color.GREEN.darker());
		casilla10y11.setBackground(Color.YELLOW);
		casilla11.setBackground(Color.GREEN.darker());
		casilla11y12.setBackground(Color.YELLOW);
		casilla12.setBackground(Color.GREEN.darker());
		seisena4.setBackground(Color.YELLOW);
		casilla10y13.setBackground(Color.YELLOW);
		casilla10_11_13_14.setBackground(Color.YELLOW);
		casilla11y14.setBackground(Color.YELLOW);
		casilla11_12_14_15.setBackground(Color.YELLOW);
		casilla12y15.setBackground(Color.YELLOW);
		fila5.setBackground(Color.YELLOW);
		casilla13.setBackground(Color.GREEN.darker());
		casilla13y14.setBackground(Color.YELLOW);
		casilla14.setBackground(Color.GREEN.darker());
		casilla14y15.setBackground(Color.YELLOW);
		casilla15.setBackground(Color.GREEN.darker());
		seisena5.setBackground(Color.YELLOW);
		casilla13y16.setBackground(Color.YELLOW);
		casilla13_14_16_17.setBackground(Color.YELLOW);
		casilla14y17.setBackground(Color.YELLOW);
		casilla14_15_17_18.setBackground(Color.YELLOW);
		casilla15y18.setBackground(Color.YELLOW);
		fila6.setBackground(Color.YELLOW);
		casilla16.setBackground(Color.GREEN.darker());
		casilla16y17.setBackground(Color.YELLOW);
		casilla17.setBackground(Color.GREEN.darker());
		casilla17y18.setBackground(Color.YELLOW);
		casilla18.setBackground(Color.GREEN.darker());
		seisena6.setBackground(Color.YELLOW);
		casilla16y19.setBackground(Color.YELLOW);
		casilla16_17_19_20.setBackground(Color.YELLOW);
		casilla17y20.setBackground(Color.YELLOW);
		casilla17_18_20_21.setBackground(Color.YELLOW);
		casilla18y21.setBackground(Color.YELLOW);
		fila7.setBackground(Color.YELLOW);
		casilla19.setBackground(Color.GREEN.darker());
		casilla19y20.setBackground(Color.YELLOW);
		casilla20.setBackground(Color.GREEN.darker());
		casilla20y21.setBackground(Color.YELLOW);
		casilla21.setBackground(Color.GREEN.darker());
		seisena7.setBackground(Color.YELLOW);
		casilla19y22.setBackground(Color.YELLOW);
		casilla19_20_22_23.setBackground(Color.YELLOW);
		casilla20y23.setBackground(Color.YELLOW);
		casilla20_21_23_24.setBackground(Color.YELLOW);
		casilla21y24.setBackground(Color.YELLOW);
		fila8.setBackground(Color.YELLOW);
		casilla22.setBackground(Color.GREEN.darker());
		casilla22y23.setBackground(Color.YELLOW);
		casilla23.setBackground(Color.GREEN.darker());
		casilla23y24.setBackground(Color.YELLOW);
		casilla24.setBackground(Color.GREEN.darker());
		seisena8.setBackground(Color.YELLOW);
		casilla22y25.setBackground(Color.YELLOW);
		casilla22_23_25_26.setBackground(Color.YELLOW);
		casilla23y26.setBackground(Color.YELLOW);
		casilla23_24_26_27.setBackground(Color.YELLOW);
		casilla24y27.setBackground(Color.YELLOW);
		fila9.setBackground(Color.YELLOW);
		casilla25.setBackground(Color.GREEN.darker());
		casilla25y26.setBackground(Color.YELLOW);
		casilla26.setBackground(Color.GREEN.darker());
		casilla26y27.setBackground(Color.YELLOW);
		casilla27.setBackground(Color.GREEN.darker());
		seisena9.setBackground(Color.YELLOW);
		casilla25y28.setBackground(Color.YELLOW);
		casilla25_26_28_29.setBackground(Color.YELLOW);
		casilla26y29.setBackground(Color.YELLOW);
		casilla26_27_29_30.setBackground(Color.YELLOW);
		casilla27y30.setBackground(Color.YELLOW);
		fila10.setBackground(Color.YELLOW);
		casilla28.setBackground(Color.GREEN.darker());
		casilla28y29.setBackground(Color.YELLOW);
		casilla29.setBackground(Color.GREEN.darker());
		casilla29y30.setBackground(Color.YELLOW);
		casilla30.setBackground(Color.GREEN.darker());
		seisena10.setBackground(Color.YELLOW);
		casilla28y31.setBackground(Color.YELLOW);
		casilla28_29_31_32.setBackground(Color.YELLOW);
		casilla29y32.setBackground(Color.YELLOW);
		casilla29_30_32_33.setBackground(Color.YELLOW);
		casilla30y33.setBackground(Color.YELLOW);
		fila11.setBackground(Color.YELLOW);
		casilla31.setBackground(Color.GREEN.darker());
		casilla31y32.setBackground(Color.YELLOW);
		casilla32.setBackground(Color.GREEN.darker());
		casilla32y33.setBackground(Color.YELLOW);
		casilla33.setBackground(Color.GREEN.darker());
		seisena11.setBackground(Color.YELLOW);
		casilla31y34.setBackground(Color.YELLOW);
		casilla31_32_34_35.setBackground(Color.YELLOW);
		casilla32y35.setBackground(Color.YELLOW);
		casilla32_33_35_36.setBackground(Color.YELLOW);
		casilla33y36.setBackground(Color.YELLOW);
		fila12.setBackground(Color.YELLOW);
		casilla34.setBackground(Color.GREEN.darker());
		casilla34y35.setBackground(Color.YELLOW);
		casilla35.setBackground(Color.GREEN.darker());
		casilla35y36.setBackground(Color.YELLOW);
		casilla36.setBackground(Color.GREEN.darker());
		columna1.setBackground(Color.GREEN.darker());
		columna1y2.setBackground(Color.YELLOW);
		columna2.setBackground(Color.GREEN.darker());
		columna2y3.setBackground(Color.YELLOW);
		columna3.setBackground(Color.GREEN.darker());
	}

	/**
	*Permite al control establecer el total, sirve para establecer el total despues de una ronda.
	*/
	public void setTotal(int total){
		this.total+=total;
		labelTotal.setText("Total:"+this.total);
	}

	private class MouseEvents implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton clickeado = (JButton) e.getSource();
			String button = clickeado.getName();
			System.out.println(clickeado.getName());

			if(total > 0){
				total-=50;
				labelTotal.setText("Total:"+total);
				clickeado.setBackground(Color.RED);
				//Apuestas 1X1
				if(button == "casilla_par" || button == "casilla_black" || button == "casilla_red" || button == "casilla_impar" || button == "casilla1_18" || button == "casilla19_36"){
					setApuestas1X1(button);
				}

				//Apuestas 2X1
				if(button == "primera12na" || button == "segunda12na" || button == "tercera12na" || button == "columna1" || button == "columna2" || button == "columna3"){
					setApuestas2X1(button);
				}

				//Apuestas 05X1
				if(button == "docena1y2" || button == "docena2y3" || button == "columna1y2" || button == "columna2y3" ){
					setApuesta05X1(button);
				}

				//Apuestas 5X1
				if(button == "seisena1" || button == "seisena2" || button == "seisena3" || button == "seisena4" || button == "seisena5" || button == "seisena6" || button == "seisena7" || button == "seisena8" || button == "seisena9" || button == "seisena10" || button == "seisena11"){
					setApuesta5X1(button);
				}

				//Apuesta 8X1
				if(button == "casilla1_2_4_5" ||
					 button == "casilla2_3_5_6" ||
					 button == "casilla4_5_7_8" ||
					 button == "casilla5_6_8_9" ||
					 button == "casilla7_8_10_11" ||
					 button == "casilla8_9_11_12" ||
					 button == "casilla10_11_13_14" ||
					 button == "casilla11_12_14_15" ||
					 button == "casilla13_14_16_17" ||
					 button == "casilla14_15_17_18" ||
					 button == "casilla16_17_19_20" ||
					 button == "casilla17_18_20_21" ||
					 button == "casilla19_20_22_23" ||
					 button == "casilla20_21_23_24" ||
					 button == "casilla22_23_25_26" ||
					 button == "casilla23_24_26_27" ||
					 button == "casilla25_26_28_29" ||
					 button == "casilla26_27_29_30" ||
					 button == "casilla28_29_31_32" ||
					 button == "casilla29_30_32_33" ||
					 button == "casilla31_32_34_35" ||
					 button == "casilla32_33_35_36"
					){
						setApuesta8X1(button);
				}

				//Apuesta 11X1
				if(button == "casilla0_1_2" || button == "casilla0_2_3" ||
				   button == "fila1" || button == "fila2" || button == "fila3" ||
					 button == "fila4" || button == "fila5" || button == "fila6" ||
					 button == "fila7" || button == "fila8" || button == "fila9" ||
					 button == "fila10" || button == "fila11" || button == "fila12"){
					setApuesta11X1(button);
				}

				//Apuesta 17X1
				if(
					button == "casilla1y2" ||
					button == "casilla2y3" ||
					button == "casilla0y3" ||
					button == "casilla0y2" ||
					button == "casilla0y1" ||
					button == "casilla1y4" ||
					button == "casilla2y5" ||
					button == "casilla3y6" ||
					button == "casilla4y5" ||
					button == "casilla5y6" ||
					button == "casilla6y9" ||
					button == "casilla5y8" ||
					button == "casilla4y7" ||
					button == "casilla7y8" ||
					button == "casilla8y9" ||
					button == "casilla9y12" ||
					button == "casilla8y11" ||
					button == "casilla7y10" ||
					button == "casilla10y13" ||
					button == "casilla10y11" ||
					button == "casilla11y12" ||
					button == "casilla11y14" ||
					button == "casilla12y15" ||
					button == "casilla14y15" ||
					button == "casilla13y14" ||
					button == "casilla13y16" ||
					button == "casilla14y17" ||
					button == "casilla15y18" ||
					button == "casilla17y18" ||
					button == "casilla16y17" ||
					button == "casilla16y19" ||
					button == "casilla17y20" ||
					button == "casilla18y21" ||
					button == "casilla20y21" ||
					button == "casilla19y20" ||
					button == "casilla19y22" ||
					button == "casilla20y23" ||
					button == "casilla21y24" ||
					button == "casilla23y24" ||
					button == "casilla22y23" ||
					button == "casilla22y25" ||
					button == "casilla23y26" ||
					button == "casilla24y27" ||
					button == "casilla26y27" ||
					button == "casilla25y26" ||
					button == "casilla25y28" ||
					button == "casilla26y29" ||
					button == "casilla27y30" ||
					button == "casilla29y30" ||
					button == "casilla28y29" ||
					button == "casilla28y31" ||
					button == "casilla29y32" ||
					button == "casilla30y33" ||
					button == "casilla32y33" ||
					button == "casilla31y32" ||
					button == "casilla31y34" ||
					button == "casilla32y35" ||
					button == "casilla33y36" ||
					button == "casilla35y36" ||
					button == "casilla34y35"){
						 setApuesta17X1(button);
				}

				//Apuesta 35X1
				if(button == "casilla1" ||
					 button == "casilla2" ||
					 button == "casilla3" ||
					 button == "casilla4" ||
					 button == "casilla5" ||
					 button == "casilla6" ||
					 button == "casilla7" ||
					 button == "casilla8" ||
					 button == "casilla9" ||
					 button == "casilla10" ||
					 button == "casilla11" ||
					 button == "casilla12" ||
					 button == "casilla12" ||
					 button == "casilla13" ||
					 button == "casilla14" ||
					 button == "casilla15" ||
					 button == "casilla16" ||
					 button == "casilla17" ||
					 button == "casilla18" ||
					 button == "casilla19" ||
					 button == "casilla20" ||
					 button == "casilla21" ||
					 button == "casilla22" ||
					 button == "casilla23" ||
					 button == "casilla24" ||
					 button == "casilla25" ||
					 button == "casilla26" ||
					 button == "casilla27" ||
					 button == "casilla28" ||
					 button == "casilla29" ||
					 button == "casilla30" ||
					 button == "casilla31" ||
					 button == "casilla32" ||
					 button == "casilla33" ||
					 button == "casilla34" ||
					 button == "casilla35" ||
					 button == "casilla36"){
						 setApuesta35X1(button);
				}
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

}