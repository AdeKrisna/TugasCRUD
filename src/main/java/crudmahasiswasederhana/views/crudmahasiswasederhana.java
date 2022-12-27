/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.views;

import javax.swing.SwingUtilities;

/**
 *
 * @author lenovo
 */
public class crudmahasiswasederhana {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            Mahasiswaframe form = new Mahasiswaframe();
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        }
        });
    }
}
