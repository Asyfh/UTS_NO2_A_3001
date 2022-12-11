/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_a_3001;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 21103001
 * @author Aisyah Fitri Hidayati
 * S1SI05A
 */
public class UTS_NO2_A_3001 {

    public static void main(String[] args) {
        Salaried_Employee_3001 S = new Salaried_Employee_3001();
        Commission_Employee_3001 C = new Commission_Employee_3001();
        Project_Planner_3001 P = new Project_Planner_3001();
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            S.nama_3001 = "Aisyah";
            S.nip_3001 = 21103001;
            S.gaji_3001 = 2000000;
            
            C.nama_3001 = "Fitri";
            C.nip_3001 = 21103002;
            C.gaji_pokok_3001 = 3000000;
            C.komisi_3001 = 100000;
            C.penjualan_3001 = 50;
            
            P.nama_3001 = "Hidayati";
            P.nip_3001 = 21103003;
            P.gaji_pokok_3001 = 4000000;
            P.komisi_3001 = 100000;
            P.proyek_3001 = 100;
            
            S.tampilDataSalaried_Employee_3001();
            System.out.println("");
            C.tampilDataCommission_Employee_3001();
            System.out.println("");
            P.tampilDataProject_Planner_3001();
            System.out.println("");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}