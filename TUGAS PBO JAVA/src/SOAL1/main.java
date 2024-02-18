/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SOAL1;

import java.util.Scanner;

/**
 *
 * @author dellaputrw
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima inputan tiga bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bilangan3 = input.nextInt();

        // Menampilkan hasil operasi penjumlahan, pengurangan, perkalian, dan pembagian
        System.out.println("Hasil penjumlahan: " + (bilangan1 + bilangan2 + bilangan3));
        System.out.println("Hasil pengurangan: " + (bilangan1 - bilangan2 - bilangan3));
        System.out.println("Hasil perkalian: " + (bilangan1 * bilangan2 * bilangan3));
        System.out.println("Hasil pembagian: " + (bilangan1 / bilangan2 / bilangan3));

    }
   
}