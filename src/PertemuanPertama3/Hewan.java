/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanPertama3;

/**
 *
 * @author mursi
 */
public class Hewan extends mahlukHidup{

    /**
     * @return the namaHewan
     */
    protected String getNamaHewan() {
        return namaHewan;
    }

    /**
     * @param namaHewan the namaHewan to set
     */
    protected void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    /**
     * @return the bergerak
     */
    protected String getBergerak() {
        return bergerak;
    }

    /**
     * @param bergerak the bergerak to set
     */
    protected void setBergerak(String bergerak) {
        this.bergerak = bergerak;
    }

    /**
     * @return the alatGerak
     */
    protected String getAlatGerak() {
        return alatGerak;
    }

    /**
     * @param alatGerak the alatGerak to set
     */
    protected void setAlatGerak(String alatGerak) {
        this.alatGerak = alatGerak;
    }

    /**
     * @return the hidupDi
     */
    protected String getHidupDi() {
        return hidupDi;
    }

    /**
     * @param hidupDi the hidupDi to set
     */
    protected void setHidupDi(String hidupDi) {
        this.hidupDi = hidupDi;
    }
    private String namaHewan;
    private String bergerak;
    private String alatGerak;
    private String hidupDi;
}
