/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juni2024;

/**
 *
 * @author A-3
 */
import com.mycompany.juni2024.UI.TextUI;
import java.util.Scanner;
public class Main {
   // private static DataManager dataManager;
    SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
    
    public static void main(String[] args) {
        // Create DataManager instance (specify array sizes)
        //dataManager = new DataManager(100, 50, 20, 200);
       TextUI ui = new TextUI();
       ui.run();
    }
}


