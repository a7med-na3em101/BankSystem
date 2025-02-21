/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lenovo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {
    JPanel p1,p2,p3,p4;
    JLabel sfirst1,sfirst2,sfirst3;
    JTextField  text1;
    JPasswordField pass1;
    JButton btn1,btn2;
    LogIn(stack n)
    {
        this.setSize(350, 250);
        this.setTitle("LOGIN");
        this .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
        p1 = new JPanel();
        sfirst1 = new JLabel("accountNumber: ");
        text1 = new JTextField();
        text1.setPreferredSize(new Dimension(200,30));
        p2 = new JPanel();
        sfirst2 = new JLabel("pin: ");
        pass1 = new JPasswordField();
        pass1.setPreferredSize(new Dimension(200,30));
        p3 = new JPanel();
        btn1=new JButton("LOGIN");
        btn2=new JButton("Sign Up");

        btn2.addActionListener((ActionEvent e) ->{
            SignUp mys = new SignUp();
            mys.setVisible(true);
            this.setVisible(false);
        });
        p4=new JPanel();
        sfirst3 = new JLabel("");

        this.setLayout(new GridLayout(4,1));
        p1.add(sfirst1);
        p1.add(text1);
        p2.add(sfirst2);
        p2.add(pass1);
        p3.add(btn1);
        p3.add(btn2);
        p4.add(sfirst3);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

        btn1.addActionListener((ActionEvent e) -> {
            String name = text1.getText();
            String pass = String.valueOf(pass1.getPassword());

            if (n.search(name) && n.search(pass)) {
                sfirst3.setText("Login Success");

                Home home = new Home(n);
                home.setVisible(true);
                this.setVisible(false);
            } else {
                sfirst3.setText("Login Failure");
            }
        });

    }


}

