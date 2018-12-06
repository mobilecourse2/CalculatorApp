/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcproj;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
class Kal extends JFrame{
    Kal(){
        initGUI();
        addComponenets();
    }
   JPanel jp = new JPanel();
      JPanel jp1 = new JPanel();
     
        JFrame jf = new JFrame();
   int flag = 0;
    JLabel lbl = new JLabel(); 
    JTextField txt = new JTextField();
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenu submenu = new JMenu("SubMenu");
    JMenuItem item1 = new JMenuItem("New");
    JMenuItem item = new JMenuItem("Open");
 
 JButton btn0 = new JButton("0");
 JButton btn1 = new JButton("1");
 JButton btn2 = new JButton("2");
 JButton btn3 = new JButton("3");
 JButton btn4 = new JButton("4");
 JButton btn5 = new JButton("5");
 JButton btn6 = new JButton("6");
 JButton btn7 = new JButton("7");
 JButton btn8 = new JButton("8");
 JButton btn9 = new JButton("9");
 JButton btndot = new JButton(".");
  JButton btnequal = new JButton("=");
 JButton btnplus = new JButton("+");
 JButton btnminus = new JButton("-");
 JButton btnMul = new JButton("*");
 
   JButton btnSin = new JButton("sin");
 JButton btncos = new JButton("cos");
 JButton btntan = new JButton("tan");
 JButton btndiv = new JButton("/");
  JButton btndel = new JButton("DEL");
 JButton btnC = new JButton("C");
 JButton btnSqrt = new JButton("\u221A");
 JButton btnSquare = new JButton("x\u00B2");
 JButton btnReciprocal = new JButton("1/x");
 
    private void initGUI() {
    
    jf.setTitle("Calculator");
    jf.setSize(500, 450);
    jf.getContentPane().setLayout(null);
    jf.getContentPane().setBackground(Color.CYAN);
    jf.setVisible(true);
    jf.setResizable(false);
    jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextField jt = new JTextField();
    jt.setBounds(20, 40, 460, 40);
    jf.add(jt);
    }

    
    private void addComponenets() {
        panel1();
        panel2();
        
    }

    private void panel1() {
       
         jp.setBounds(230,100,250,300);
       
         btn7.setBounds(20,20,60,40);
        btn7.setFont(new Font("Arial",Font.BOLD,20));
       jp.add(btn7);
        btn8.setBounds(80, 100, 60, 40);
        btn8.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn8);
        btn9.setBounds(150, 180, 60, 40);
        btn9.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn9);
          btn4.setBounds(10,290,60,40);
        btn4.setFont(new Font("Arial",Font.BOLD,20));
     jp.add(btn4);
        btn5.setBounds(80, 290, 60, 40);
        btn5.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn5);
        btn6.setBounds(150,290,60,40);
        btn6.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn6);
        btn1.setBounds(10,350,60,40);
        btn1.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn1);
        btn2.setBounds(80,350,60,40);
        btn2.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn2);
        btn3.setBounds(150,350,60,40);
        btn3.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn3);
        btndot.setBounds(150,410,60,40);
        btndot.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btndot);
        btn0.setBounds(10,410,130,40);
        btn0.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btn0);
        btnequal.setBounds(220,350,60,100);
        btnequal.setFont(new Font("Arial",Font.BOLD,20));
        jp.add(btnequal);
        jf.add(jp);
    }

    private void panel2() {
           jp1.setBounds(20,100,200,300);
      btnSin.setBounds(20,20,60,40);
            
        btnSin.setFont(new Font("Arial",Font.BOLD,14));
        jp1.add(btnSin);
           btncos.setBounds(80,20,60,40);
        btncos.setFont(new Font("Arial",Font.BOLD,14));
        jp1.add(btncos);
        
           btntan.setBounds(140,480,80,40);
        btntan.setFont(new Font("Arial",Font.BOLD,14));
        jp1.add(btntan);
        btndiv.setBounds(220,110,60,40);
          btndiv.setFont(new Font("Arial", Font.BOLD, 20));
        
        jp1.add(btndiv);
        btnSqrt.setBounds(10,170,60,40);
        btnSqrt.setFont(new Font("Arial",Font.BOLD,20));
        jp1.add(btnSqrt);
        btnMul.setBounds(220,230,60,40);
        btnMul.setFont(new Font("Arial",Font.BOLD,20));
        jp1.add(btnMul);
        btnminus.setBounds(220,170,60,40);
        btnminus.setFont(new Font("Arial",Font.BOLD,20));
        jp1.add(btnminus);
         btnplus.setBounds(220,290,60,40);
        btnplus.setFont(new Font("Arial",Font.BOLD,20));
        jp1.add(btnplus);
        btnSquare.setBounds(80,170,60,40);
        btnSquare.setFont(new Font("Arial",Font.BOLD,20));
        jp1.add(btnSquare);
         btnReciprocal.setBounds(150,170,60,40);
        btnReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        jp1.add(btnReciprocal);
        btndel.setBounds(150,110,60,40);
        btndel.setFont(new Font("Arial",Font.BOLD,12));
        jp1.add(btndel);
        btnC.setBounds(80,110,60,40);
        btnC.setFont(new Font("Arial",Font.BOLD,12));
        jp1.add(btnC);
        jf.add(jp1);
 
    }

   
    
}
