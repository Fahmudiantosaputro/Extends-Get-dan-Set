/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanpertama1;

/**
 *
 * @author mursi
 */
public class Rincian {
 
    public static void main(String[] args){
        Aves merpati = new Aves();
        System.out.println(" ==== RINCIAN ==== ");
        merpati.Bernafas();
        merpati.Tumbuh();
        merpati.setNamaHewan("'Merpati'");
        merpati.setAlatGerak("'Kaki dan Sayap'");
        merpati.setHidupDi("'Darat dan Udara'");
        merpati.setJumlahKaki("'2'");
        merpati.setJumlahMata("'2'");
        System.out.println("Nama Hewan " + merpati.getNamaHewan());
        System.out.println("Bergerak dengan " + merpati.getAlatGerak());
        System.out.println("Hewan ini Hidup di " + merpati.getHidupDi());
        System.out.println("Memiliki Kaki Berjumlah " + merpati.getJumlahKaki());
        System.out.println("Memiliki Mata Berjumlah " + merpati.getJumlahMata());
        merpati.alatPernafasan();
        merpati.kembangBiak();
        merpati.organTubuhIdentik();
        System.out.println("==================");
        
        System.out.println(" ");
    }
}
