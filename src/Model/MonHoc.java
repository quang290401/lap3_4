/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author forre
 */
public class MonHoc {
    private String maMonHoc;
    private String tenMH;
    private int soTin;
    private String batBuoc;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMH, int soTin, String batBuoc) {
        this.maMonHoc = maMonHoc;
        this.tenMH = tenMH;
        this.soTin = soTin;
        this.batBuoc = batBuoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }

    public String getBatBuoc() {
        return batBuoc;
    }

    public void setBatBuoc(String batBuoc) {
        this.batBuoc = batBuoc;
    }

   
}
