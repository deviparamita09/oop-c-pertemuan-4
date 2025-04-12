/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arayy1dimensi;

import java.util.Scanner;

/**
 *
 * @author Devi Paramita/
 * Tgl: 12 April 2025
 */
public class Arayy1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        
        NMA[0] = "Johan";
        NMA[1] = "Lala";
        NMA[2] = "Buno";
        NMA[3] = "Rai";
        NMA[4] = "Rian";
      
        
        Scanner inp = new Scanner(System.in);
        System.out.println("-----Input Data Ke Array------");
        for(int idx=0; idx<5; idx++){
            System.out.printf("Data Nama Pengunjung ke-5=%d: ", idx+1);
            NMA[idx] =inp.nextLine();
        }
        System.out.println("-----output Data Ke Array------");
        for(int idx=0; idx<5; idx++){
            System.out.println("Data Nama Pengunjung ke-"+(idx+1)+": "+ NMA[idx]);
        }
        
        System.out.println("-----output2 Data Ke Array------");
        int no=1;
        for(String isi : NMA) {
            System.out.println(no+". "+isi);
            no++;
        }
  }
}
