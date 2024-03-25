/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanujikom_tia;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class no2 {
    public static void main(String[] args){
        int harga;
        double diskon, bespot, bayar;
        
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Harga Barang: Rp. ");
        harga = keyboard.nextInt();
        System.out.println("Diskon: ");
        diskon = keyboard.nextInt();
        bespot = (diskon/100) * harga;
        bayar = harga - bespot;
        
        System.out.println("Harga Barang : Rp. "+ harga);
        System.out.println("Diskon : "+ diskon +"%");
        System.out.println("Diskon (Rp.) : Rp. "+ bespot);
        System.out.println("Total Harga :  "+ bayar);
        
    }
}
