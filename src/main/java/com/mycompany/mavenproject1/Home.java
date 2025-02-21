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

public class Home extends JFrame {
    private JPanel p;
    private JButton btn;
    private JLabel head, nameLabel, accountNumberLabel, balanceLabel, nameLabelValue, accountNumberLabelValue, balanceLabelValue;
    private stack user;

    public Home(stack n) {
        this.user = n;

        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home");

        p = new JPanel();
        p.setLayout(new GridLayout(5, 2));

        head = new JLabel("Account Details");
        nameLabel = new JLabel("Name:");
        nameLabelValue = new JLabel(user.array[user.top][2]);
        accountNumberLabel = new JLabel("Account Number:");
        accountNumberLabelValue = new JLabel(user.array[user.top][0]);
        balanceLabel = new JLabel("Balance:");
        balanceLabelValue = new JLabel(user.array[user.top][3]);
        btn = new JButton("Go To Transaction Page");

        p.add(head);
        p.add(new JLabel());
        p.add(nameLabel);
        p.add(nameLabelValue);
        p.add(accountNumberLabel);
        p.add(accountNumberLabelValue);
        p.add(balanceLabel);
        p.add(balanceLabelValue);
        p.add(btn);

        this.add(p);

        btn.addActionListener((e) -> {
            Transaction trt = new Transaction(Double.parseDouble(user.array[user.top][3]));
            trt.setVisible(true);
            this.setVisible(false);
        });
    }
}
