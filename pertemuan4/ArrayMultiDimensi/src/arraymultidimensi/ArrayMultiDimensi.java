/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensi;

import java.util.Scanner;

/**
 *
 * @author Devi Paramita
 * Tgl: 12 April 2025
 */
public class ArrayMultiDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][2];
        
        meja[0][0] = "Meja A";
        meja[0][1] = "Meja B";
        
        meja[1][0] = "Meja C";
        meja[1][1] = "Meja D";
        
        meja[2][0] = "Meja E";
        meja[2][1] = "Meja f";
        
        Scanner inp = new Scanner (System.in);
        for(int brs= 0; brs< 3; brs++) {                
            System.out.printf("Baris ke-%d\n", brs);
            for (int klm=0; klm<2; klm++){
            System.out.printf(">> Kolom ke-%d ", klm);
            meja[brs][klm] = inp.nextLine();
        }
        }
    }  
   }

