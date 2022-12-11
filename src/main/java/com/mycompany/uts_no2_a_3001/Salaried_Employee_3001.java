/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3001;

/**
 *21103001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */
public class Salaried_Employee_3001 {
    String nama_3001;
    int nip_3001;
    double upah_3001, gaji_3001;
    
    public double gaji_3001(){
        gaji_3001 = upah_3001;
        return gaji_3001;
    }
    
    public void tampilDataSalaried_Employee_3001(){
        System.out.println("Nama               : " + nama_3001);
        System.out.println("NIP                : " + nip_3001);
        System.out.println("Upah Mingguan      : " + gaji_3001);
    }
}