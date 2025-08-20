/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanPertama3;

/**
 *
 * @author mursi
 */
public class Rincian extends Mamalia{
    
    public static void main(String[] args){
        Mamalia kucing = new Mamalia();
        System.out.println("==== RINCIAN ====");
        kucing.Bernafas();
        kucing.Tumbuh();
        kucing.setNamaHewan("'Kucing'");
        kucing.setBergerak("'Berjalan'");
        kucing.setAlatGerak("'Kaki'");
        kucing.setHidupDi("'darat'");
        System.out.println("Nama Hewan : " + kucing.getNamaHewan());
        System.out.println("Bergerak dengan cara : " + kucing.getBergerak());
        System.out.println("Alat Gerak  dari hewan ini yaitu " + kucing.getAlatGerak());
        System.out.println("Hewan ini Hidup di " + kucing.getHidupDi());
        kucing.alatPernafasan();
        kucing.kembangBiak();
        kucing.organTubuhIdentik();
        System.out.println("==================");

        System.out.println("");
        
    }        
}
