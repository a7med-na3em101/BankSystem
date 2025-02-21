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

    public class SignUp extends JFrame{
        JPanel p1,p2,p3,p4,p5;
        JLabel sfirst1,sfirst2,sfirst3,sfirst4;
        JTextField  text1,text2,text3,text4;
        JButton btn;
        SignUp()
        {
            this.setSize(400, 500);
            this.setTitle("Signup");
            this .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);

            p1 = new JPanel();

            sfirst1 = new JLabel("accountNumber: ");
            text1 = new JTextField();
            text1.setPreferredSize(new Dimension(200,30));
            p2 = new JPanel();
            sfirst2 = new JLabel("name: ");
            text2 = new JTextField();
            text2.setPreferredSize(new Dimension(200,30));
            p3 = new JPanel();
            sfirst3 = new JLabel("pin: ");
            text3 = new JTextField();
            text3.setPreferredSize(new Dimension(200,30));
            p4 = new JPanel();
            sfirst4 = new JLabel("balance: ");
            text4 = new JTextField();
            text4.setPreferredSize(new Dimension(200,30));
            p5 = new JPanel();
            btn=new JButton("Sign up");
            this.setLayout(new GridLayout(5,1));
            p1.add(sfirst1);
            p1.add(text1);
            p2.add(sfirst2);
            p2.add(text2);
            p3.add(sfirst3);
            p3.add(text3);
            p4.add(sfirst4);
            p4.add(text4);
            p5.add(btn);
            this.add(p1);
            this.add(p2);
            this.add(p3);
            this.add(p4);
            this.add(p5);

            btn.addActionListener((e) ->{
                String accountNumber = text1.getText();
                String name = text2.getText();
                String pin = text3.getText();
                String balance = text4.getText();

                stack b = new stack(10);
                b.push(accountNumber, pin, name, balance);

                LogIn myLogin = new LogIn(b);
                myLogin.setVisible(true);
                this.setVisible(false);
            });
        }
    }

