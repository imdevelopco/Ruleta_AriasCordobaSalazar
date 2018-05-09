package proyectoRuleta;

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
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTablero extends JPanel {

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
	
	public void paintComponent(Graphics g) {
		casilla0.setBounds(230, 10, 240, 45);
		casilla0.setBackground(Color.GREEN.darker());
		casilla0.setForeground(Color.YELLOW);
		casilla0.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		casilla1_18.setBounds(10, 60, 100, 80);
		casilla1_18.setBackground(Color.GREEN.darker());
		casilla1_18.setForeground(Color.YELLOW);
		casilla1_18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_par.setBounds(10, 140, 100, 80);
		casilla_par.setBackground(Color.GREEN.darker());
		casilla_par.setForeground(Color.YELLOW);
		casilla_par.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_black.setBounds(10, 220, 100, 80);
		casilla_black.setBackground(Color.black);
		casilla_black.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_red.setBounds(10, 300, 100, 80);
		casilla_red.setBackground(Color.red);
		casilla_red.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla_impar.setBounds(10, 380, 100, 80);
		casilla_impar.setBackground(Color.GREEN.darker());
		casilla_impar.setForeground(Color.YELLOW);
		casilla_impar.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19_36.setBounds(10, 460, 100, 80);
		casilla19_36.setBackground(Color.GREEN.darker());
		casilla19_36.setForeground(Color.YELLOW);
		casilla19_36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		primera12na.setBounds(110, 60, 115, 155);
		primera12na.setBackground(Color.GREEN.darker());
		primera12na.setForeground(Color.YELLOW);
		primera12na.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		docena1y2.setBounds(110, 215, 115, 10);
		docena1y2.setBackground(Color.YELLOW);
		docena1y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		segunda12na.setBounds(110, 225, 115, 150);
		segunda12na.setBackground(Color.GREEN.darker());
		segunda12na.setForeground(Color.YELLOW);
		segunda12na.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		docena2y3.setBounds(110, 375, 115, 10);
		docena2y3.setBackground(Color.YELLOW);
		docena2y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		tercera12na.setBounds(110, 385, 115, 155);
		tercera12na.setBackground(Color.GREEN.darker());
		tercera12na.setForeground(Color.YELLOW);
		tercera12na.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		casilla0y1.setBounds(225, 55, 80, 10);
		casilla0y1.setBackground(Color.YELLOW);
		casilla0y1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0_1_2.setBounds(305, 55, 10, 10);
		casilla0_1_2.setBackground(Color.YELLOW);
		casilla0_1_2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0y2.setBounds(315, 55, 70, 10);
		casilla0y2.setBackground(Color.YELLOW);
		casilla0y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0_2_3.setBounds(385, 55, 10, 10);
		casilla0_2_3.setBackground(Color.YELLOW);
		casilla0_2_3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla0y3.setBounds(395, 55, 75, 10);
		casilla0y3.setBackground(Color.YELLOW);
		casilla0y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila1.setBounds(225, 65, 10, 30);
		fila1.setBackground(Color.YELLOW);
		fila1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1.setBounds(235, 65, 70, 30);
		casilla1.setBackground(Color.GREEN.darker());
		casilla1.setForeground(Color.RED);
		casilla1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1y2.setBounds(305, 65, 10, 30);
		casilla1y2.setBackground(Color.YELLOW);
		casilla1y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2.setBounds(315, 65, 70, 30);
		casilla2.setBackground(Color.GREEN.darker());
		casilla2.setForeground(Color.BLACK);
		casilla2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2y3.setBounds(385, 65, 10, 30);
		casilla2y3.setBackground(Color.YELLOW);
		casilla2y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla3.setBounds(395, 65, 75, 30);
		casilla3.setBackground(Color.GREEN.darker());
		casilla3.setForeground(Color.RED);
		casilla3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));


		seisena1.setBounds(225, 95, 10, 10);
		seisena1.setBackground(Color.YELLOW);
		seisena1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1y4.setBounds(235, 95, 70, 10);
		casilla1y4.setBackground(Color.YELLOW);
		casilla1y4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla1_2_4_5.setBounds(305, 95, 10, 10);
		casilla1_2_4_5.setBackground(Color.YELLOW);
		casilla1_2_4_5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2y5.setBounds(315, 95, 70, 10);
		casilla2y5.setBackground(Color.YELLOW);
		casilla2y5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla2_3_5_6.setBounds(385, 95, 10, 10);
		casilla2_3_5_6.setBackground(Color.YELLOW);
		casilla2_3_5_6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla3y6.setBounds(395, 95, 75, 10);
		casilla3y6.setBackground(Color.YELLOW);
		casilla3y6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila2.setBounds(225, 105, 10, 30);
		fila2.setBackground(Color.YELLOW);
		fila2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4.setBounds(235, 105, 70, 30);
		casilla4.setBackground(Color.GREEN.darker());
		casilla4.setForeground(Color.BLACK);
		casilla4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4y5.setBounds(305, 105, 10, 30);
		casilla4y5.setBackground(Color.YELLOW);
		casilla4y5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5.setBounds(315, 105, 70, 30);
		casilla5.setBackground(Color.GREEN.darker());
		casilla5.setForeground(Color.RED);
		casilla5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5y6.setBounds(385, 105, 10, 30);
		casilla5y6.setBackground(Color.YELLOW);
		casilla5y6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla6.setBounds(395, 105, 75, 30);
		casilla6.setBackground(Color.GREEN.darker());
		casilla6.setForeground(Color.BLACK);
		casilla6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena2.setBounds(225, 135, 10, 10);
		seisena2.setBackground(Color.YELLOW);
		seisena2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4y7.setBounds(235, 135, 70, 10);
		casilla4y7.setBackground(Color.YELLOW);
		casilla4y7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla4_5_7_8.setBounds(305, 135, 10, 10);
		casilla4_5_7_8.setBackground(Color.YELLOW);
		casilla4_5_7_8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5y8.setBounds(315, 135, 70, 10);
		casilla5y8.setBackground(Color.YELLOW);
		casilla5y8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla5_6_8_9.setBounds(385, 135, 10, 10);
		casilla5_6_8_9.setBackground(Color.YELLOW);
		casilla5_6_8_9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla6y9.setBounds(395, 135, 75, 10);
		casilla6y9.setBackground(Color.YELLOW);
		casilla6y9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila3.setBounds(225, 145, 10, 30);
		fila3.setBackground(Color.YELLOW);
		fila3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7.setBounds(235, 145, 70, 30);
		casilla7.setBackground(Color.GREEN.darker());
		casilla7.setForeground(Color.RED);
		casilla7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7y8.setBounds(305, 145, 10, 30);
		casilla7y8.setBackground(Color.YELLOW);
		casilla7y8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8.setBounds(315, 145, 70, 30);
		casilla8.setBackground(Color.GREEN.darker());
		casilla8.setForeground(Color.BLACK);
		casilla8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8y9.setBounds(385, 145, 10, 30);
		casilla8y9.setBackground(Color.YELLOW);
		casilla8y9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla9.setBounds(395, 145, 75, 30);
		casilla9.setBackground(Color.GREEN.darker());
		casilla9.setForeground(Color.RED);
		casilla9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena3.setBounds(225, 175, 10, 10);
		seisena3.setBackground(Color.YELLOW);
		seisena3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7y10.setBounds(235, 175, 70, 10);
		casilla7y10.setBackground(Color.YELLOW);
		casilla7y10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla7_8_10_11.setBounds(305, 175, 10, 10);
		casilla7_8_10_11.setBackground(Color.YELLOW);
		casilla7_8_10_11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8y11.setBounds(315, 175, 70, 10);
		casilla8y11.setBackground(Color.YELLOW);
		casilla8y11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla8_9_11_12.setBounds(385, 175, 10, 10);
		casilla8_9_11_12.setBackground(Color.YELLOW);
		casilla8_9_11_12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla9y12.setBounds(395, 175, 75, 10);
		casilla9y12.setBackground(Color.YELLOW);
		casilla9y12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila4.setBounds(225, 185, 10, 30);
		fila4.setBackground(Color.YELLOW);
		fila4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10.setBounds(235, 185, 70, 30);
		casilla10.setBackground(Color.GREEN.darker());
		casilla10.setForeground(Color.BLACK);
		casilla10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10y11.setBounds(305, 185, 10, 30);
		casilla10y11.setBackground(Color.YELLOW);
		casilla10y11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11.setBounds(315, 185, 70, 30);
		casilla11.setBackground(Color.GREEN.darker());
		casilla11.setForeground(Color.BLACK);
		casilla11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11y12.setBounds(385, 185, 10, 30);
		casilla11y12.setBackground(Color.YELLOW);
		casilla11y12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla12.setBounds(395, 185, 75, 30);
		casilla12.setBackground(Color.GREEN.darker());
		casilla12.setForeground(Color.RED);
		casilla12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena4.setBounds(225, 215, 10, 10);
		seisena4.setBackground(Color.YELLOW);
		seisena4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10y13.setBounds(235, 215, 70, 10);
		casilla10y13.setBackground(Color.YELLOW);
		casilla10y13.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla10_11_13_14.setBounds(305, 215, 10, 10);
		casilla10_11_13_14.setBackground(Color.YELLOW);
		casilla10_11_13_14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11y14.setBounds(315, 215, 70, 10);
		casilla11y14.setBackground(Color.YELLOW);
		casilla11y14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla11_12_14_15.setBounds(385, 215, 10, 10);
		casilla11_12_14_15.setBackground(Color.YELLOW);
		casilla11_12_14_15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla12y15.setBounds(395, 215, 75, 10);
		casilla12y15.setBackground(Color.YELLOW);
		casilla12y15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		////////////////////////////////////////////////
		fila5.setBounds(225, 225, 10, 30);
		fila5.setBackground(Color.YELLOW);
		fila5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13.setBounds(235, 225, 70, 30);
		casilla13.setBackground(Color.GREEN.darker());
		casilla13.setForeground(Color.BLACK);
		casilla13.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13y14.setBounds(305, 225, 10, 30);
		casilla13y14.setBackground(Color.YELLOW);
		casilla13y14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14.setBounds(315, 225, 70, 30);
		casilla14.setBackground(Color.GREEN.darker());
		casilla14.setForeground(Color.RED);
		casilla14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14y15.setBounds(385, 225, 10, 30);
		casilla14y15.setBackground(Color.YELLOW);
		casilla14y15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla15.setBounds(395, 225, 75, 30);
		casilla15.setBackground(Color.GREEN.darker());
		casilla15.setForeground(Color.BLACK);
		casilla15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena5.setBounds(225, 255, 10, 10);
		seisena5.setBackground(Color.YELLOW);
		seisena5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13y16.setBounds(235, 255, 70, 10);
		casilla13y16.setBackground(Color.YELLOW);
		casilla13y16.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla13_14_16_17.setBounds(305, 255, 10, 10);
		casilla13_14_16_17.setBackground(Color.YELLOW);
		casilla13_14_16_17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14y17.setBounds(315, 255, 70, 10);
		casilla14y17.setBackground(Color.YELLOW);
		casilla14y17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla14_15_17_18.setBounds(385, 255, 10, 10);
		casilla14_15_17_18.setBackground(Color.YELLOW);
		casilla14_15_17_18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla15y18.setBounds(395, 255, 75, 10);
		casilla15y18.setBackground(Color.YELLOW);
		casilla15y18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila6.setBounds(225, 265, 10, 30);
		fila6.setBackground(Color.YELLOW);
		fila6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16.setBounds(235, 265, 70, 30);
		casilla16.setBackground(Color.GREEN.darker());
		casilla16.setForeground(Color.RED);
		casilla16.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16y17.setBounds(305, 265, 10, 30);
		casilla16y17.setBackground(Color.YELLOW);
		casilla16y17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17.setBounds(315, 265, 70, 30);
		casilla17.setBackground(Color.GREEN.darker());
		casilla17.setForeground(Color.BLACK);
		casilla17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17y18.setBounds(385, 265, 10, 30);
		casilla17y18.setBackground(Color.YELLOW);
		casilla17y18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla18.setBounds(395, 265, 75, 30);
		casilla18.setBackground(Color.GREEN.darker());
		casilla18.setForeground(Color.RED);
		casilla18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena6.setBounds(225, 295, 10, 10);
		seisena6.setBackground(Color.YELLOW);
		seisena6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16y19.setBounds(235, 295, 70, 10);
		casilla16y19.setBackground(Color.YELLOW);
		casilla16y19.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla16_17_19_20.setBounds(305, 295, 10, 10);
		casilla16_17_19_20.setBackground(Color.YELLOW);
		casilla16_17_19_20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17y20.setBounds(315, 295, 70, 10);
		casilla17y20.setBackground(Color.YELLOW);
		casilla17y20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla17_18_20_21.setBounds(385, 295, 10, 10);
		casilla17_18_20_21.setBackground(Color.YELLOW);
		casilla17_18_20_21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla18y21.setBounds(395, 295, 75, 10);
		casilla18y21.setBackground(Color.YELLOW);
		casilla18y21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila7.setBounds(225, 305, 10, 30);
		fila7.setBackground(Color.YELLOW);
		fila7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19.setBounds(235, 305, 70, 30);
		casilla19.setBackground(Color.GREEN.darker());
		casilla19.setForeground(Color.RED);
		casilla19.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19y20.setBounds(305, 305, 10, 30);
		casilla19y20.setBackground(Color.YELLOW);
		casilla19y20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20.setBounds(315, 305, 70, 30);
		casilla20.setBackground(Color.GREEN.darker());
		casilla20.setForeground(Color.BLACK);
		casilla20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20y21.setBounds(385, 305, 10, 30);
		casilla20y21.setBackground(Color.YELLOW);
		casilla20y21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla21.setBounds(395, 305, 75, 30);
		casilla21.setBackground(Color.GREEN.darker());
		casilla21.setForeground(Color.RED);
		casilla21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena7.setBounds(225, 335, 10, 10);
		seisena7.setBackground(Color.YELLOW);
		seisena7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19y22.setBounds(235, 335, 70, 10);
		casilla19y22.setBackground(Color.YELLOW);
		casilla19y22.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla19_20_22_23.setBounds(305, 335, 10, 10);
		casilla19_20_22_23.setBackground(Color.YELLOW);
		casilla19_20_22_23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20y23.setBounds(315, 335, 70, 10);
		casilla20y23.setBackground(Color.YELLOW);
		casilla20y23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla20_21_23_24.setBounds(385, 335, 10, 10);
		casilla20_21_23_24.setBackground(Color.YELLOW);
		casilla20_21_23_24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla21y24.setBounds(395, 335, 75, 10);
		casilla21y24.setBackground(Color.YELLOW);
		casilla21y24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila8.setBounds(225, 345, 10, 30);
		fila8.setBackground(Color.YELLOW);
		fila8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22.setBounds(235, 345, 70, 30);
		casilla22.setBackground(Color.GREEN.darker());
		casilla22.setForeground(Color.BLACK);
		casilla22.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22y23.setBounds(305, 345, 10, 30);
		casilla22y23.setBackground(Color.YELLOW);
		casilla22y23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23.setBounds(315, 345, 70, 30);
		casilla23.setBackground(Color.GREEN.darker());
		casilla23.setForeground(Color.RED);
		casilla23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23y24.setBounds(385, 345, 10, 30);
		casilla23y24.setBackground(Color.YELLOW);
		casilla23y24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla24.setBounds(395, 345, 75, 30);
		casilla24.setBackground(Color.GREEN.darker());
		casilla24.setForeground(Color.BLACK);
		casilla24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena8.setBounds(225, 375, 10, 10);
		seisena8.setBackground(Color.YELLOW);
		seisena8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22y25.setBounds(235, 375, 70, 10);
		casilla22y25.setBackground(Color.YELLOW);
		casilla22y25.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla22_23_25_26.setBounds(305, 375, 10, 10);
		casilla22_23_25_26.setBackground(Color.YELLOW);
		casilla22_23_25_26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23y26.setBounds(315, 375, 70, 10);
		casilla23y26.setBackground(Color.YELLOW);
		casilla23y26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla23_24_26_27.setBounds(385, 375, 10, 10);
		casilla23_24_26_27.setBackground(Color.YELLOW);
		casilla23_24_26_27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla24y27.setBounds(395, 375, 75, 10);
		casilla24y27.setBackground(Color.YELLOW);
		casilla24y27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila9.setBounds(225, 385, 10, 30);
		fila9.setBackground(Color.YELLOW);
		fila9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25.setBounds(235, 385, 70, 30);
		casilla25.setBackground(Color.GREEN.darker());
		casilla25.setForeground(Color.RED);
		casilla25.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25y26.setBounds(305, 385, 10, 30);
		casilla25y26.setBackground(Color.YELLOW);
		casilla25y26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26.setBounds(315, 385, 70, 30);
		casilla26.setBackground(Color.GREEN.darker());
		casilla26.setForeground(Color.BLACK);
		casilla26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26y27.setBounds(385, 385, 10, 30);
		casilla26y27.setBackground(Color.YELLOW);
		casilla26y27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla27.setBounds(395, 385, 75, 30);
		casilla27.setBackground(Color.GREEN.darker());
		casilla27.setForeground(Color.RED);
		casilla27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena9.setBounds(225, 415, 10, 10);
		seisena9.setBackground(Color.YELLOW);
		seisena9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25y28.setBounds(235, 415, 70, 10);
		casilla25y28.setBackground(Color.YELLOW);
		casilla25y28.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla25_26_28_29.setBounds(305, 415, 10, 10);
		casilla25_26_28_29.setBackground(Color.YELLOW);
		casilla25_26_28_29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26y29.setBounds(315, 415, 70, 10);
		casilla26y29.setBackground(Color.YELLOW);
		casilla26y29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla26_27_29_30.setBounds(385, 415, 10, 10);
		casilla26_27_29_30.setBackground(Color.YELLOW);
		casilla26_27_29_30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla27y30.setBounds(395, 415, 75, 10);
		casilla27y30.setBackground(Color.YELLOW);
		casilla27y30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila10.setBounds(225, 425, 10, 30);
		fila10.setBackground(Color.YELLOW);
		fila10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28.setBounds(235, 425, 70, 30);
		casilla28.setBackground(Color.GREEN.darker());
		casilla28.setForeground(Color.BLACK);
		casilla28.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28y29.setBounds(305, 425, 10, 30);
		casilla28y29.setBackground(Color.YELLOW);
		casilla28y29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29.setBounds(315, 425, 70, 30);
		casilla29.setBackground(Color.GREEN.darker());
		casilla29.setForeground(Color.BLACK);
		casilla29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29y30.setBounds(385, 425, 10, 30);
		casilla29y30.setBackground(Color.YELLOW);
		casilla29y30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla30.setBounds(395, 425, 75, 30);
		casilla30.setBackground(Color.GREEN.darker());
		casilla30.setForeground(Color.RED);
		casilla30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena10.setBounds(225, 455, 10, 10);
		seisena10.setBackground(Color.YELLOW);
		seisena10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28y31.setBounds(235, 455, 70, 10);
		casilla28y31.setBackground(Color.YELLOW);
		casilla28y31.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla28_29_31_32.setBounds(305, 455, 10, 10);
		casilla28_29_31_32.setBackground(Color.YELLOW);
		casilla28_29_31_32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29y32.setBounds(315, 455, 70, 10);
		casilla29y32.setBackground(Color.YELLOW);
		casilla29y32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla29_30_32_33.setBounds(385, 455, 10, 10);
		casilla29_30_32_33.setBackground(Color.YELLOW);
		casilla29_30_32_33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla30y33.setBounds(395, 455, 75, 10);
		casilla30y33.setBackground(Color.YELLOW);
		casilla30y33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila11.setBounds(225, 465, 10, 30);
		fila11.setBackground(Color.YELLOW);
		fila11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31.setBounds(235, 465, 70, 30);
		casilla31.setBackground(Color.GREEN.darker());
		casilla31.setForeground(Color.BLACK);
		casilla31.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31y32.setBounds(305, 465, 10, 30);
		casilla31y32.setBackground(Color.YELLOW);
		casilla31y32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32.setBounds(315, 465, 70, 30);
		casilla32.setBackground(Color.GREEN.darker());
		casilla32.setForeground(Color.RED);
		casilla32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32y33.setBounds(385, 465, 10, 30);
		casilla32y33.setBackground(Color.YELLOW);
		casilla32y33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla33.setBounds(395, 465, 75, 30);
		casilla33.setBackground(Color.GREEN.darker());
		casilla33.setForeground(Color.BLACK);
		casilla33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		seisena11.setBounds(225, 495, 10, 10);
		seisena11.setBackground(Color.YELLOW);
		seisena11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31y34.setBounds(235, 495, 70, 10);
		casilla31y34.setBackground(Color.YELLOW);
		casilla31y34.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla31_32_34_35.setBounds(305, 495, 10, 10);
		casilla31_32_34_35.setBackground(Color.YELLOW);
		casilla31_32_34_35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32y35.setBounds(315, 495, 70, 10);
		casilla32y35.setBackground(Color.YELLOW);
		casilla32y35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla32_33_35_36.setBounds(385, 495, 10, 10);
		casilla32_33_35_36.setBackground(Color.YELLOW);
		casilla32_33_35_36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla33y36.setBounds(395, 495, 75, 10);
		casilla33y36.setBackground(Color.YELLOW);
		casilla33y36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		fila12.setBounds(225, 505, 10, 35);
		fila12.setBackground(Color.YELLOW);
		fila12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla34.setBounds(235, 505, 70, 35);
		casilla34.setBackground(Color.GREEN.darker());
		casilla34.setForeground(Color.RED);
		casilla34.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla34y35.setBounds(305, 505, 10, 35);
		casilla34y35.setBackground(Color.YELLOW);
		casilla34y35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla35.setBounds(315, 505, 70, 35);
		casilla35.setBackground(Color.GREEN.darker());
		casilla35.setForeground(Color.BLACK);
		casilla35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla35y36.setBounds(385, 505, 10, 35);
		casilla35y36.setBackground(Color.YELLOW);
		casilla35y36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		casilla36.setBounds(395, 505, 75, 35);
		casilla36.setBackground(Color.GREEN.darker());
		casilla36.setForeground(Color.RED);
		casilla36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

		columna1.setBounds(225, 540, 80, 35);
		columna1.setBackground(Color.GREEN.darker());
		columna1.setForeground(Color.YELLOW);
		columna1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna1y2.setBounds(305, 540, 10, 35);
		columna1y2.setBackground(Color.YELLOW);
		columna1y2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna2.setBounds(315, 540, 70, 35);
		columna2.setBackground(Color.GREEN.darker());
		columna2.setForeground(Color.YELLOW);
		columna2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna2y3.setBounds(385, 540, 10, 35);
		columna2y3.setBackground(Color.YELLOW);
		columna2y3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		columna3.setBounds(395, 540, 75, 35);
		columna3.setBackground(Color.GREEN.darker());
		columna3.setForeground(Color.YELLOW);
		columna3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));


		this.add(casilla0);
		this.add(casilla1_18);
		this.add(casilla_par);
		this.add(casilla_black);
		this.add(casilla_red);
		this.add(casilla_impar);
		this.add(casilla19_36);
		this.add(primera12na);
		this.add(docena1y2);
		this.add(segunda12na);
		this.add(docena2y3);
		this.add(tercera12na);
		this.add(casilla0y1);
		this.add(casilla0_1_2);
		this.add(casilla0y2);
		this.add(casilla0_2_3);
		this.add(casilla0y3);

		this.add(fila1);
		this.add(casilla1);
		this.add(casilla1y2);
		this.add(casilla2);
		this.add(casilla2y3);
		this.add(casilla3);

		this.add(seisena1);
		this.add(casilla1y4);
		this.add(casilla1_2_4_5);
		this.add(casilla2y5);
		this.add(casilla2_3_5_6);
		this.add(casilla3y6);

		this.add(fila2);
		this.add(casilla4);
		this.add(casilla4y5);
		this.add(casilla5);
		this.add(casilla5y6);
		this.add(casilla6);

		this.add(seisena2);
		this.add(casilla4y7);
		this.add(casilla4_5_7_8);
		this.add(casilla5y8);
		this.add(casilla5_6_8_9);
		this.add(casilla6y9);

		this.add(fila3);
		this.add(casilla7);
		this.add(casilla7y8);
		this.add(casilla8);
		this.add(casilla8y9);
		this.add(casilla9);

		this.add(seisena3);
		this.add(casilla7y10);
		this.add(casilla7_8_10_11);
		this.add(casilla8y11);
		this.add(casilla8_9_11_12);
		this.add(casilla9y12);

		this.add(fila4);
		this.add(casilla10);
		this.add(casilla10y11);
		this.add(casilla11);
		this.add(casilla11y12);
		this.add(casilla12);

		this.add(seisena4);
		this.add(casilla10y13);
		this.add(casilla10_11_13_14);
		this.add(casilla11y14);
		this.add(casilla11_12_14_15);
		this.add(casilla12y15);
		////////////////////////////////////
		this.add(fila5);
		this.add(casilla13);
		this.add(casilla13y14);
		this.add(casilla14);
		this.add(casilla14y15);
		this.add(casilla15);

		this.add(seisena5);
		this.add(casilla13y16);
		this.add(casilla13_14_16_17);
		this.add(casilla14y17);
		this.add(casilla14_15_17_18);
		this.add(casilla15y18);

		this.add(fila6);
		this.add(casilla16);
		this.add(casilla16y17);
		this.add(casilla17);
		this.add(casilla17y18);
		this.add(casilla18);

		this.add(seisena6);
		this.add(casilla16y19);
		this.add(casilla16_17_19_20);
		this.add(casilla17y20);
		this.add(casilla17_18_20_21);
		this.add(casilla18y21);

		this.add(fila7);
		this.add(casilla19);
		this.add(casilla19y20);
		this.add(casilla20);
		this.add(casilla20y21);
		this.add(casilla21);

		this.add(seisena7);
		this.add(casilla19y22);
		this.add(casilla19_20_22_23);
		this.add(casilla20y23);
		this.add(casilla20_21_23_24);
		this.add(casilla21y24);

		this.add(fila8);
		this.add(casilla22);
		this.add(casilla22y23);
		this.add(casilla23);
		this.add(casilla23y24);
		this.add(casilla24);

		this.add(seisena8);
		this.add(casilla22y25);
		this.add(casilla22_23_25_26);
		this.add(casilla23y26);
		this.add(casilla23_24_26_27);
		this.add(casilla24y27);

		this.add(fila9);
		this.add(casilla25);
		this.add(casilla25y26);
		this.add(casilla26);
		this.add(casilla26y27);
		this.add(casilla27);

		this.add(seisena9);
		this.add(casilla25y28);
		this.add(casilla25_26_28_29);
		this.add(casilla26y29);
		this.add(casilla26_27_29_30);
		this.add(casilla27y30);

		this.add(fila10);
		this.add(casilla28);
		this.add(casilla28y29);
		this.add(casilla29);
		this.add(casilla29y30);
		this.add(casilla30);

		this.add(seisena10);
		this.add(casilla28y31);
		this.add(casilla28_29_31_32);
		this.add(casilla29y32);
		this.add(casilla29_30_32_33);
		this.add(casilla30y33);

		this.add(fila11);
		this.add(casilla31);
		this.add(casilla31y32);
		this.add(casilla32);
		this.add(casilla32y33);
		this.add(casilla33);

		this.add(seisena11);
		this.add(casilla31y34);
		this.add(casilla31_32_34_35);
		this.add(casilla32y35);
		this.add(casilla32_33_35_36);
		this.add(casilla33y36);

		this.add(fila12);
		this.add(casilla34);
		this.add(casilla34y35);
		this.add(casilla35);
		this.add(casilla35y36);
		this.add(casilla36);

		this.add(columna1);
		this.add(columna1y2);
		this.add(columna2);
		this.add(columna2y3);
		this.add(columna3);

	}


}