/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.MonHoc;
import Ripository.MonHocRepository;
import java.util.ArrayList;

/**
 *
 * @author forre
 */
public class MonHocService {
    MonHocRepository hocRepository = new MonHocRepository();
    
  
    
    public void Them(MonHoc p){
        hocRepository.Them(p);
    }
    public void Sua(int vitri,MonHoc p){
        hocRepository.Sua(vitri, p);
    }
    public void Xoa(int vitri){
        hocRepository.Xoa(vitri);
    }
    public void Xem(){
        hocRepository.xem();
    }
    public ArrayList<MonHoc>select(){
       return (ArrayList<MonHoc>)this.hocRepository.danhsachMonHocs();
    }
}
