/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanpertama1;

/**
 *
 * @author mursi
 */
public class Hewan extends MahlukHidup {

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

    protected String getHidupDi() {
        return hidupDi;
    }

    /**
     * @param hidupDi the hidupDi to set
     */
    protected void setHidupDi(String hidupDi) {
        this.hidupDi = hidupDi;
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
     * @return the jumlahMata
     */
    protected String getJumlahMata() {
        return jumlahMata;
    }

    /**
     * @param jumlahMata the jumlahMata to set
     */
    protected void setJumlahMata(String jumlahMata) {
        this.jumlahMata = jumlahMata;
    }

    /**
     * @return the jumlahKaki
     */
    protected String getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    protected void setJumlahKaki(String jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

  private String namaHewan;
  private String hidupDi;
  private String alatGerak;
  private String jumlahMata;
  private String jumlahKaki;
}
