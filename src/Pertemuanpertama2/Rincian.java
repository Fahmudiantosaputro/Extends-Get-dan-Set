/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuanpertama2;

public class Rincian extends Dikotil {

    public static void main(String[] args) {
        Dikotil mangga = new Dikotil();
        System.out.println(" ==== RINCIAN ==== ");
        mangga.Bernafas();
        mangga.Tumbuh();
        mangga.setNamaTumbuhan("'Pohon Mangga'");
        mangga.setJaringanPengangkut("'Xilem dan Floem'");
        mangga.setSiklusHidup("'Angiosperma'");
        mangga.setAlatReproduksi("'kecambah, vegetatif, reproduksi, penyebaran biji'");
        System.out.println("Tumbuhan " + mangga.getNamaTumbuhan());
        System.out.println("Memiliki Jaringan Penggangkut AIR yaitu " + mangga.getJaringanPengangkut());
        System.out.println("Memiliki Siklus Hidup " + mangga.getSiklusHidup()+ "artinya bijinya terlindungi oleh buah.");
        System.out.println("Alat Reproduksi yaitu " + mangga.getAlatReproduksi());
        mangga.alatPernafasan();
        mangga.kembangBiak();
        mangga.organTubuhIdentik();
        System.out.println("==================");

        System.out.println(" ");
    }
}
