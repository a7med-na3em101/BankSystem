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
import java.awt.event.ActionListener;


public class Transaction extends JFrame {

    public JPanel p1,p2,p3,p4;
    private AccountImp account;
    private JLabel balanceLabel;
    private JTextField amountField;

    public Transaction(double initialBalance) {
        account = new AccountImp(initialBalance);
        setTitle("Transaction");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

p1=new JPanel();
        balanceLabel = new JLabel("Balance: " + account.getBalance());
        p2=new JPanel();
        amountField = new JTextField(10);
        p3=new JPanel();
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton clearButton = new JButton("Clear");
        p4=new JPanel();
        JButton LogOut = new JButton("LogOut");
        LogOut.addActionListener((ActionEvent e) ->{
            stack n = new stack(10);
LogIn dds= new LogIn(n);
dds.setVisible(true);
this.setVisible(false);
        });
        depositButton.addActionListener((e)-> {
                double amount = Double.parseDouble(amountField.getText());
                account.deposit(amount);
                updateBalanceLabel();
            }
        );

        withdrawButton.addActionListener((e)-> {
                double amount = Double.parseDouble(amountField.getText());
                    account.withdraw(amount);
                updateBalanceLabel();

            
        });

        clearButton.addActionListener((e)-> {
                account.doClear();
                updateBalanceLabel();
            
        });

        setLayout(new GridLayout(5, 1));

        p1.add(balanceLabel);
        p2. add(new JLabel("Enter amount:"));
        p2. add(amountField);
        p3. add(depositButton);
        p3. add(withdrawButton);
        p3. add(clearButton);
        p4. add(LogOut);
        this.setLayout(new GridLayout(4,1));
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Balance: " + account.getBalance());
    }

}
