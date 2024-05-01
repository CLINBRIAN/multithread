/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.threadcount;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kamau
 */
public class ThreadCount extends Thread {

    public ThreadCount() {
        super("overriding Thread class ");
        System.out.println("new thread created" + this);
        start();
    }

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("New thread created " + this);
                Thread.sleep(4500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Currently executing thread is interrupted");
        }
        System.out.println("Currently executing thread run is terminated");

    }

    @Override
    public void start() {
        super.start(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public static void main(String[] args) {
        ThreadCount c = new ThreadCount();
        try {
            while (c.isAlive()) {
                System.out.println("Main Method Thread will be alive, until it's Child Thread stays alive");
                Thread.sleep(2500); //Sleep method
            }
            }catch (InterruptedException ex) {
                System.out.println("Main Method thread is interrupted");
            }
        System.out.println("Main Method's thread run is terminated" );
        
        }
    }

