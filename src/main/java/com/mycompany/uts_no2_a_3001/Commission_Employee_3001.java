/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3001;

/**
 *
 * @author ASUS
 */
public class Commission_Employee_3001 {
    String nama_3001;
    int nip_3001, total_penjualan_3001;
    double gaji_pokok_3001, komisi_3001, gaji_3001;
    
    public void tampilDataCommission_Employee_3001(){
        System.out.println("Nama                : "+nama_3001);
        System.out.println("NIP                 : "+nip_3001);
        System.out.println("Total Penjualan     : "+total_penjualan_3001);
        System.out.println("Gaji Pokok          : "+gaji_pokok_3001);
        System.out.println("Komisi              : "+komisi_3001);
    }
    
    public double InfogajiCommission(){
        gaji_3001 = gaji_pokok_3001 + (komisi_3001 * total_penjualan_3001);
        return gaji_3001;
    }
}
