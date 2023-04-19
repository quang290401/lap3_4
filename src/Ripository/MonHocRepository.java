/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ripository;

import Model.MonHoc;
import java.util.ArrayList;

/**
 *
 * @author forre
 */
public class MonHocRepository {

    ArrayList<MonHoc> giangViens = new ArrayList<>();

    public void xem() {
        giangViens.add(new MonHoc("001", "toán", 1, "co"));
    }

    public ArrayList<MonHoc> danhsachMonHocs() {

        return giangViens;
    }

    public void Them(MonHoc p) {
        giangViens.add(p);
    }

    public void Sua(int vitri, MonHoc p) {
        giangViens.set(vitri, p);
    }

    public void Xoa(int vitri) {
        giangViens.remove(vitri);
    }

}
