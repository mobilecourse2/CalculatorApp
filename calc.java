/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcproj;
import java.awt.Color;
 import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class calc extends JFrame implements ActionListener{
    JFrame jf = new JFrame();
    double number ,answer;
    calc(){
        initGUI();
        addComponents();
        addActionEvent();
    }
    int flag = 0;
    JLabel lbl = new JLabel(); 
    JTextField txt = new JTextField();
    JRadioButton rdOn = new JRadioButton("on");
    JRadioButton rdOff = new JRadioButton("off");
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
    jf.setSize(300, 590);
    jf.getContentPane().setLayout(null);
    jf.getContentPane().setBackground(Color.CYAN);
    jf.setVisible(true);
    jf.setResizable(false);
    jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponents() {
        lbl.setBounds(250,0,300,50);
        lbl.setBackground(Color.white);
        jf.add(lbl);
        txt.setBounds(10,40,270,40);
        txt.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(txt);
   rdOn.setBounds(10,95,60,40);
        rdOn.setSelected(true);
        rdOn.setFont(new Font("Arial",Font.BOLD,14));
        rdOn.setBackground(Color.BLACK);
        rdOn.setForeground(Color.WHITE);
        rdOff.setBounds(10,120,60,40);
        rdOff.setSelected(false);
        rdOff.setFont(new Font("Arial",Font.BOLD,14));
        rdOff.setBackground(Color.BLACK);
        rdOff.setForeground(Color.WHITE);
        ButtonGroup btngrp = new ButtonGroup();
        btn7.setBounds(10,230,60,40);
        btn7.setFont(new Font("Arial",Font.BOLD,20));
       jf.add(btn7);
        btn8.setBounds(80, 230, 60, 40);
        btn8.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn8);
        btn9.setBounds(150, 230, 60, 40);
        btn9.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn9);
          btn4.setBounds(10,290,60,40);
        btn4.setFont(new Font("Arial",Font.BOLD,20));
     jf.add(btn4);
        btn5.setBounds(80, 290, 60, 40);
        btn5.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn5);
        btn6.setBounds(150,290,60,40);
        btn6.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn6);
        btn1.setBounds(10,350,60,40);
        btn1.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn1);
        btn2.setBounds(80,350,60,40);
        btn2.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn2);
        btn3.setBounds(150,350,60,40);
        btn3.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn3);
        btndot.setBounds(150,410,60,40);
        btndot.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btndot);
        btn0.setBounds(10,410,130,40);
        btn0.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btn0);
        btnequal.setBounds(220,350,60,100);
        btnequal.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btnequal);
             btnSin.setBounds(12,480,80,40);
            
        btnSin.setFont(new Font("Arial",Font.BOLD,14));
        jf.add(btnSin);
           btncos.setBounds(106,480,80,40);
        btncos.setFont(new Font("Arial",Font.BOLD,14));
        jf.add(btncos);
        
           btntan.setBounds(200,480,80,40);
        btntan.setFont(new Font("Arial",Font.BOLD,14));
        jf.add(btntan);
        btndiv.setBounds(220,110,60,40);
          btndiv.setFont(new Font("Arial", Font.BOLD, 20));
        
        jf.add(btndiv);
        btnSqrt.setBounds(10,170,60,40);
        btnSqrt.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btnSqrt);
        btnMul.setBounds(220,230,60,40);
        btnMul.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btnMul);
        btnminus.setBounds(220,170,60,40);
        btnminus.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btnminus);
         btnplus.setBounds(220,290,60,40);
        btnplus.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btnplus);
        btnSquare.setBounds(80,170,60,40);
        btnSquare.setFont(new Font("Arial",Font.BOLD,20));
        jf.add(btnSquare);
         btnReciprocal.setBounds(150,170,60,40);
        btnReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        jf.add(btnReciprocal);
        btndel.setBounds(150,110,60,40);
        btndel.setFont(new Font("Arial",Font.BOLD,12));
        jf.add(btndel);
        btnC.setBounds(80,110,60,40);
        btnC.setFont(new Font("Arial",Font.BOLD,12));
        jf.add(btnC);
        btngrp.add(rdOn);
        btngrp.add(rdOff);
   jf.add(rdOn);
   jf.add(rdOff);
    
    
    
    
    
    }

    private void addActionEvent() {
       btn0.addActionListener(this);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      btn4.addActionListener(this);
      btn5.addActionListener(this);
      btn6.addActionListener(this);
      btn7.addActionListener(this);
      btn8.addActionListener(this);
      btn9.addActionListener(this);
    
      btndot.addActionListener(this);
      btnequal.addActionListener(this);
      btnplus.addActionListener(this);
      btnminus.addActionListener(this);
      btndiv.addActionListener(this);
      btnMul.addActionListener(this);
         btnSin.addActionListener(this);
      btncos.addActionListener(this);
      btntan.addActionListener(this);
      btnSqrt.addActionListener(this);
      btnSquare.addActionListener(this);
      btnC.addActionListener(this);
      btndel.addActionListener(this);
      btnReciprocal.addActionListener(this);
      rdOn.addActionListener(this);
      rdOff.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object obj = e.getSource();
       if(obj==rdOn){
           Enable();
       }
       else if(obj == rdOff){
           Disable();
       }
       else if(obj == btnC){
          txt.setText("");
          lbl.setText("");
       }
       else if(obj == btndel){
           if(txt.getText().length()>0){
          txt.setText(txt.getText().substring(0,txt.getText().length()-1));
       }
           else{
               txt.setText("");
           }
       }
       else if(obj == btn1){
          txt.setText(txt.getText().toString()+"1");                     
       }
   else if(obj == btn2){
          txt.setText(txt.getText().toString()+"2");                     
       }
   else if(obj == btn3){
          txt.setText(txt.getText().toString()+"3");                     
       }
   else if(obj == btn4){
          txt.setText(txt.getText().toString()+"4");                     
       }
   else if(obj == btn5){
          txt.setText(txt.getText().toString()+"5");                     
       }
   else if(obj == btn6){
          txt.setText(txt.getText().toString()+"6");                     
       }
   else if(obj == btn7){
          txt.setText(txt.getText().toString()+"7");                     
       }
   else if(obj == btn8){
          txt.setText(txt.getText().toString()+"8");                     
       }
   else if(obj == btn9){
          txt.setText(txt.getText().toString()+"9");                     
       }
   else if(obj == btn0){
       if(txt.getText().toString().equals("0")){
           return;
       }
       else{
          txt.setText(txt.getText().toString()+"0");                     
       }
   }
     else if(obj == btn0){
       if(txt.getText().toString().contains(".")){
           return;
       }
       else{
          txt.setText(txt.getText().toString()+".");                     
       }
     }
   else if(obj==btnplus){
       
         number = Double.parseDouble(txt.getText().toString());
       String str = txt.getText();
            txt.setText("");
            lbl.setText(str+"+");
            flag = 1;
   }
      else if(obj==btnminus){
            number = Double.parseDouble(txt.getText().toString());
          String str = txt.getText();
            txt.setText("");
            lbl.setText(str+"-");
           flag = 2;
   }
       
        else if(obj==btnMul){
             number = Double.parseDouble(txt.getText().toString());
       String str = txt.getText();
            txt.setText("");
            lbl.setText(str+"*"); 
           flag = 3;
   }
        else if(obj==btndiv){
        String str = txt.getText();
            txt.setText("");
            lbl.setText(str+"/");
           flag = 4;
   }
         
        else if(obj==btnSqrt){
                 number = Double.parseDouble(txt.getText().toString());
               double sqrt = Math.sqrt(number);
          txt.setText(Double.toString(sqrt));
        }
            else if(obj==btnReciprocal){
                number = Double.parseDouble(txt.getText().toString());
               double reciprocal = 1/number;
               String str = Double.toString(reciprocal);
          if(str.endsWith(".0")){
              txt.setText(str.replace(".0",""));
          }
          else{
              txt.setText(str);
          }
        }
                else if(obj==btnSin){
              
          number = Double.parseDouble(txt.getText().toString());
               
        txt.setText(Double.toString(Math.sin(number)));
        }
                
                else if(obj==btncos){
              
             number = Double.parseDouble(txt.getText().toString());
               
        txt.setText(Double.toString(Math.cos(number)));
        }
                
                else if(obj==btntan){
              
              number = Double.parseDouble(txt.getText().toString());
               
        txt.setText(Double.toString(Math.tan(number)));
        }
          
            else if(obj==btnSquare){
           number = Double.parseDouble(txt.getText().toString());
          double sqr = Math.pow(number, 2);
          String str = Double.toString(sqr);
          if(str.endsWith(".0")){
              txt.setText(str.replace(".0",""));
          }
          else{
              txt.setText(str);
          }
            }
            else if (obj == btnequal){
               switch(flag){
                   case 1:
                       
                        answer = number+Double.parseDouble(txt.getText());
                       if(Double.toString(answer).endsWith(".0")){
                           txt.setText(Double.toString(answer).replace(".0", ""));
                       }
                       else{
                           txt.setText(Double.toString(answer));
                       }
                        lbl.setText("");
                        break;
                   case 2:
                        answer = number - Double.parseDouble(txt.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                        txt.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        txt.setText(Double.toString(answer));
                    }
                    lbl.setText("");
                    break;
                   case 3:
                       answer = number*Double.parseDouble(txt.getText());
                       if(Double.toString(answer).endsWith(".0")){
                           txt.setText(Double.toString(answer).replace(".0", ""));
                       }
                       else{
                           txt.setText(Double.toString(answer));
                       }
                       lbl.setText("");
                       break;
                   case 4:
                       answer = number/Double.parseDouble(txt.getText());
                       if(Double.toString(answer).endsWith(".0")){
                           txt.setText(Double.toString(answer).replace(".0", ""));
                       }
                       else{
                           txt.setText(Double.toString(answer));
                       }
                      lbl.setText("");
                      break;
                      
               }
                
   
                
                
                
                
                
                
            }
       
        
    
   
          
    }

    private void Enable() {
          btn0.setEnabled(true);
          btn1.setEnabled(true);
          btn2.setEnabled(true);
          btn3.setEnabled(true);
          btn4.setEnabled(true);
          btn5.setEnabled(true);
          btn6.setEnabled(true);
          btn7.setEnabled(true);
          btn8.setEnabled(true);
          btn9.setEnabled(true);
             
          btnC.setEnabled(true);
          btndel.setEnabled(true);
          btnequal.setEnabled(true);
          btnSqrt.setEnabled(true);
          btnReciprocal.setEnabled(true);
          btnplus.setEnabled(true);
          btnminus.setEnabled(true);
          btnSquare.setEnabled(true);
          btndiv.setEnabled(true);
          btnMul.setEnabled(true);
          btndot.setEnabled(true);
            btncos.setEnabled(true);
          btnSin.setEnabled(true);
          btntan.setEnabled(true);
          
    }

    private void Disable() {
            btn0.setEnabled(false);
          btn1.setEnabled(false);
          btn2.setEnabled(false);
          btn3.setEnabled(false);
          btn4.setEnabled(false);
          btn5.setEnabled(false);
          btn6.setEnabled(false);
          btn7.setEnabled(false);
          btn8.setEnabled(false);
          btn9.setEnabled(false);
          txt.setText("");
          lbl.setText("");
          btnC.setEnabled(false);
          btndel.setEnabled(false);
          btnequal.setEnabled(false);
          btnSqrt.setEnabled(false);
          btnReciprocal.setEnabled(false);
          btnSquare.setEnabled(false);
          btnplus.setEnabled(false);
          btnminus.setEnabled(false);
          btndiv.setEnabled(false);
          btnMul.setEnabled(false);
          btndot.setEnabled(false);
            btncos.setEnabled(false);
          btntan.setEnabled(false);
          btnSin.setEnabled(false);
    }
     
}
