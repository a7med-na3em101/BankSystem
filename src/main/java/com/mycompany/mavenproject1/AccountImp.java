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

public class AccountImp implements Account{
    private double balance;
    AccountImp(double balance)
    {
        this.balance = balance;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;    }

    @Override
    public boolean withdraw(double amount) {
        if(balance >=amount)
        balance -= amount;
        return false;
    }

    @Override
    public void doClear() {
        balance=0;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

