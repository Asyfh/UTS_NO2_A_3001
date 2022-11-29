/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3001;

/**
 *
 * @author ASUS
 */
public class Project_Planner_3001 {
    String nama_3001;
    int nip_3001, total_hasil_proyek_3001;
    double gaji_pokok_3001, komisi_3001, gaji_3001, pajak_3001;
    
    public void tampilDataProject_Planner_3001(){
        System.out.println("Nama                : "+nama_3001);
        System.out.println("NIP                 : "+nip_3001);
        System.out.println("Total Hasil Proyek  : "+total_hasil_proyek_3001);
        System.out.println("Gaji Pokok          : "+gaji_pokok_3001);
        System.out.println("Komisi              : "+komisi_3001);
        
    }
        public double InfogajiProject(){
        pajak_3001 = (0.05 * gaji_pokok_3001);
        gaji_3001 = gaji_pokok_3001 + (komisi_3001 * total_hasil_proyek_3001) - pajak_3001; 
        return gaji_3001;
        
        }
}
