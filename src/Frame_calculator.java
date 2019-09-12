
import javax.swing.JButton;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Frame_calculator extends JFrame{

   
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,addition,subtraction,division,multiplication,b0,bpoint,clear;
        //TextField text,text1;
        JTextField text,text1;
         Label actionReceived;
         

    public Frame_calculator() throws HeadlessException {
        setSize(550,450);
        setLayout(null);
        
        getContentPane().setBackground(Color.lightGray);
       
        actionReceived=new Label("");
        actionReceived.setBounds(100,125,100,20);
        actionReceived.setBackground(Color.white);
        actionReceived.setForeground(Color.red);
        add(actionReceived);
        
        
        text=new JTextField();
        text.setBounds(100,150,340,30);
        text.setBorder(null);
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        add(text);
        
        text1=new JTextField();
        text1.setBounds(100,125,340,30);
        text1.setBorder(null);
        text1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        text.setBorder(null);

        add(text1);
        
        b1=new JButton("1");
        b1.setBounds(100,200,70,30);
        b1.setBackground(Color.white);
        add(b1);
        
        
        b2=new JButton("2");
        b2.setBounds(190,200,70,30);
        b2.setBackground(Color.white);
        add(b2);
        
        
        b3=new JButton("3");
        b3.setBounds(280,200,70,30);
        b3.setBackground(Color.white);
        add(b3);
        
        
        //division
        division=new JButton("/");
        division.setBounds(370,200,70,30);
        division.setBackground(Color.white);
        add(division);
        
        
         
        b4=new JButton("4");
        b4.setBounds(100,250,70,30);
        b4.setBackground(Color.white);
        add(b4);
        
        
        b5=new JButton("5");
        b5.setBounds(190,250,70,30);
        b5.setBackground(Color.white);
        add(b5);
        
        
        b6=new JButton("6");
        b6.setBounds(280,250,70,30);
        b6.setBackground(Color.white);
        add(b6);
      
        
        
        multiplication=new JButton("*");
        multiplication.setBounds(370,250,70,30);
        multiplication.setBackground(Color.white);
        add(multiplication);
      
        
        b7=new JButton("7");
        b7.setBounds(100,300,70,30);
        b7.setBackground(Color.white);
        add(b7);
        
        
        b8=new JButton("8");
        b8.setBounds(190,300,70,30);
       b8.setBackground(Color.white);
        add(b8);
        
        
        b9=new JButton("9");
        b9.setBounds(280,300,70,30);
        b9.setBackground(Color.white);
        add(b9);
        
        
        subtraction=new JButton("-");
        subtraction.setBounds(370,300,70,30);
        subtraction.setBackground(Color.white);
        add(subtraction);
        
        
        
        addition=new JButton("+");
        addition.setBounds(370,350,70,30);
        addition.setBackground(Color.white);
        add(addition);
        
      
        bpoint=new JButton("CE");
        bpoint.setBounds(100,350,70,30);
        bpoint.setBackground(Color.white);
        add(bpoint);
        
        
        b0=new JButton("0");
        b0.setBounds(190,350,70,30);
        b0.setBackground(Color.white);
        add(b0);
        
        
        clear=new JButton("=");
        clear.setBounds(280,350,70,30);
        clear.setBackground(Color.white);
        add(clear);
        
        b1.setBorder(null);
        b2.setBorder(null);
        b3.setBorder(null);
        b4.setBorder(null);
        b5.setBorder(null);
        b6.setBorder(null);
        b7.setBorder(null);
        b8.setBorder(null);
        b9.setBorder(null);
        b0.setBorder(null);
        
        addition.setBorder(null);
        subtraction.setBorder(null);
        multiplication.setBorder(null);
        division.setBorder(null);
        bpoint.setBorder(null);
        
        
        clear.setBorder(null);
        
        
        
        
        setVisible(true);
        
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                text.setText(text.getText()+1);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
       
        
         
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+2);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
         b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+3);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         
          b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+4);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
          
           b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+5);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
           
            b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+6);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
             b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+7);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
              b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+8);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
              
               b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+9);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
                b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+0);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
            bpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               text.setText(null);
               text1.setText(null);
               actionReceived.setText(null);
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(text.getText());
                text.setText(null);
                actionReceived.setText("ADDITION");
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         
         subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(text.getText());
                text.setText(null);
                actionReceived.setText("SUBTRACTION");
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(text.getText());
                text.setText(null);
                actionReceived.setText("MULTIPLICATION");
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(text.getText());
                text.setText(null);
                actionReceived.setText("DIVISION");
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
      
            
            
            
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d1=Double.parseDouble(text1.getText());
                double d2=Double.parseDouble(text .getText());
                if(actionReceived.getText().equals("ADDITION")){
                    text.setText(String.valueOf(d1+d2));
                   
                }
                
                if(actionReceived.getText().equals("SUBTRACTION")){
                    text.setText(String.valueOf(d1-d2));
                   
                }
                
                if(actionReceived.getText().equals("MULTIPLICATION")){
                    text.setText(String.valueOf(d1*d2));
                   
                }
                
                if(actionReceived.getText().equals("DIVISION")){
                    text.setText(String.valueOf(d1/d2));
                   
                }
                
                
                
                
                
                
                
                   
               
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
       
        
       
        
        
        
        
        addWindowListener(new MyWindowListner());
    }
    

    
    
}
