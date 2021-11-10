package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginBotton=new JButton("Login");
    JButton resetBotton=new JButton("Reset");
    JButton registrationBatton=new JButton("Registration");
    JTextField userIDField=new JTextField();
    JPasswordField userPasswordField =new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordIDLabel = new JLabel("password:");
    JLabel massageLabel = new JLabel("");
    ImageIcon imageIcon= new ImageIcon("C:\\Users\\iuser\\Desktop\\LoginSystem\\src\\com\\company\\Earth_at_night_NASA.jpg");


  static   HashMap<String,String> logininfo= new HashMap<String,String>();

     LoginPage(HashMap<String,String> loginInfoOriginal){
        logininfo=loginInfoOriginal;

        userIDLabel.setBounds(30,100,75,25);
        userPasswordIDLabel.setBounds(30,150,75,25);
        massageLabel.setBounds(125,230,250,35);
        massageLabel.setFont(new Font(null,Font.ITALIC,15));
        userIDField.setBounds(100,100,150,25);
        userPasswordField.setBounds(100,150,150,25);
        loginBotton.setBounds(100,190,70,20);
        loginBotton.setFocusable(false);
        loginBotton.addActionListener(this);
        resetBotton.setBounds(170,190,70,20);
        resetBotton.setFocusable(false);
        resetBotton.addActionListener(this);
        registrationBatton.setBounds(100,220,100,15);
        registrationBatton.setFont(new Font(null,Font.PLAIN,10));
        registrationBatton.setFocusable(false);
        registrationBatton.addActionListener(this);




        frame.add(userIDLabel);
        frame.add(userPasswordIDLabel);
        frame.add(massageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginBotton);
        frame.add(resetBotton);
        frame.add(registrationBatton);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setIconImage(imageIcon.getImage());
    }




    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==resetBotton){
             userIDField.setText("");
             userPasswordField.setText("");
         }
         if(e.getSource()==registrationBatton){

             frame.dispose();

             Registration registration=new Registration();

         }
         if (e.getSource()==loginBotton){
             String usetID=userIDField.getText();
             String password = String.valueOf(userPasswordField.getPassword());
             if(logininfo.containsKey(usetID)){
                 if(logininfo.get(usetID).equals(password)){
                     massageLabel.setForeground(Color.GREEN);
                     massageLabel.setText("Login successful");
                     frame.dispose();
                     Welcome welcome=new Welcome(usetID);
                 }
                 else {
                     massageLabel.setForeground(Color.RED);
                     massageLabel.setText("Wrong password");
                 }
             }
             else {
                 massageLabel.setForeground(Color.RED);
                 massageLabel.setText("Username not found");
             }
         }

    }
}
