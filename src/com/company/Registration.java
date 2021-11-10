package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class Registration extends IDandPasswords implements ActionListener {
    JFrame frame=new JFrame();
    JButton registrationNowBotton=new JButton("Registration Now");
    JLabel registrationLabel=new JLabel("Signup with");
    JTextField userIDField=new JTextField();
    JPasswordField userPasswordField =new JPasswordField();
    JLabel userIDLabel = new JLabel("New userID:");
    JLabel userPasswordIDLabel = new JLabel("New password:");
    JLabel massageLabel = new JLabel("");



    Registration(){
        userIDLabel.setBounds(30,100,75,25);
        userPasswordIDLabel.setBounds(30,150,100,25);
        userIDField.setBounds(120,100,150,25);
        userPasswordField.setBounds(120,150,150,25);
        registrationNowBotton.setBounds(120,190,150,20);
        registrationNowBotton.setFocusable(false);
        registrationNowBotton.addActionListener( this);
        massageLabel.setBounds(125,230,250,35);
        massageLabel.setFont(new Font(null,Font.ITALIC,15));

        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(userIDLabel);
        frame.add(userPasswordIDLabel);
        frame.add(registrationNowBotton);
        frame.add(massageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        registrationLabel.setBounds(140,50,200,35);
        registrationLabel.setFont(new Font(null,Font.PLAIN,20));


        frame.add(registrationLabel);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registrationNowBotton){
            String usetID=userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());








            if(usetID.equals("")&&password.equals("")){
                  massageLabel.setForeground(Color.red);
                  massageLabel.setText("Input userID and password");
                }
           else if(usetID.equals("")) {
                massageLabel.setForeground(Color.red);
                massageLabel.setText("Input userID");
            }
            else if(password.equals("")){
                massageLabel.setForeground(Color.red);
                massageLabel.setText("Input password");
            }
            else{
                frame.dispose();
                IDandPasswords.logininfo.put(userIDField.getText(),String.valueOf(userPasswordField.getPassword()));
                 Welcome welcome = new Welcome(usetID);
            }

        }

    }
}
