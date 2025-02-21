/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lenovo
 */
public class stack {
    
    String[][] array;
    int maxsize;
    int top;

    public stack(int size) {
        array = new String[size][4];
        maxsize = size;
        top = -1;
    }

    public void push(String accountNumber, String pin, String name, String balance) {
        if (top < maxsize - 1) {
            top++;
            array[top][0] = accountNumber;
            array[top][1] = pin;
            array[top][2] = name;
            array[top][3] = balance;
        } else {
            System.out.println("Stack overflow!");
        }

    }
    public Boolean search(String o) {
        for (int i = top; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("Account Number: " + array[i][0]);
            System.out.println("PIN: " + array[i][1]);
            System.out.println("Name: " + array[i][2]);
            System.out.println("Balance: " + array[i][3]);
            System.out.println("--------------------");
        }
    }
}