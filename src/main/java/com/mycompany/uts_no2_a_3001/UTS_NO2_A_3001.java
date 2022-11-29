/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_a_3001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UTS_NO2_A_3001 {

    public static void main(String[] args) throws IOException {
        Salaried_Employee_3001 S = new Salaried_Employee_3001();
        Commission_Employee_3001 C = new Commission_Employee_3001();
        Project_Planner_3001 P = new Project_Planner_3001();
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       try{
           S.nama_3001 = "Aisyah";
           S.nip_3001  = 21103001;
           S.upah_mingguan_3001 = 500.000;
          
           C.nama_3001 = "Fitri";
           C.nip_3001  = 31103002;
           C.total_penjualan_3001 = 10;
           C.gaji_pokok_3001 = 1000000;
           C.komisi_3001 = 100000;
     
           P.nama_3001 = "Hidayati";
           P.nip_3001 = 21103003;
           P.total_hasil_proyek_3001 = 100;
           P.gaji_pokok_3001 = 5000000;
           P.komisi_3001 = 3000000;
           
           S.tampilDataSalaried_Employee_3001();
           System.out.println(" ");
           C.tampilDataCommission_Employee_3001();
           System.out.println(" ");
           P.tampilDataProject_Planner_3001();
       }
       catch(Exception ex){
            System.out.println(ex);
        }
    }
 }