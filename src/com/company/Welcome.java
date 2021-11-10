package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome implements ActionListener{
    JFrame frame=new JFrame();
    JLabel welcomLabel=new JLabel("Hello");
    JButton exitBotton=new JButton("Exit");

    Welcome(String userID){

        welcomLabel.setBounds(10,10,200,35);
        welcomLabel.setFont(new Font(null,Font.PLAIN,20));
        welcomLabel.setText("Hello "+userID);
        exitBotton.setBounds(250,10,100,40);
        exitBotton.setFont(new Font(null,Font.ITALIC,30));
        exitBotton.setFocusable(false);
        exitBotton.addActionListener((ActionListener) this);

        frame.add(welcomLabel);
        frame.add(exitBotton);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitBotton){

            IDandPasswords idandPasswords = new IDandPasswords();
            LoginPage loginPage =new LoginPage(idandPasswords.getLogininfo());
            frame.dispose();
        }
    }
}
