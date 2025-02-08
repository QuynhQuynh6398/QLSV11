/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class sinhvienDAO {
    public static List<sinhvien> ls = new ArrayList<>();

    public sinhvienDAO() {
        ls.add(new sinhvien("SV01", "NGÔ HOÀNG MINH ĐĂNG"));
        ls.add(new sinhvien("SV02", "TRẦN THỊ THÙY DƯƠNG"));
        ls.add(new sinhvien("SV03", "NGUYỄN THỊ THÙY DƯƠNG"));
        ls.add(new sinhvien("SV04", "NGUYỄN NGỌC NHƯ QUỲNH"));
        ls.add(new sinhvien("SV05", "TRẦN THỊ XUÂN HƯƠNG"));
    }
    
    
    
    public int add(sinhvien sv){
        ls.add(sv);
        return 1;
    }
    public List<sinhvien> getAllsinhvien(){
        return ls;
    }
    
    public int delsinhvienByID(String ma){
        for(sinhvien sv : ls){
            if(sv.getMasv().equalsIgnoreCase(ma)){
                ls.remove(sv);
                return 1;
            }
        }
        return -1;
    }
    
    public sinhvien getsinhvienByID(String id){
        for(sinhvien sv : ls){
            if(sv.getMasv().equalsIgnoreCase(id)){
                return sv;
            }
        }
        return null;
    }
    
    public int updatesinhvienByID(sinhvien svNew){
        for(sinhvien sv: ls){
            if(sv.getMasv().equalsIgnoreCase(svNew.getMasv())){
                sv.setDiachi(svNew.getDiachi());
                sv.setGioitinh(sv.isGioitinh());
                sv.setHinhanh(sv.getHinhanh());
                sv.setNgaysinh(svNew.getNgaysinh());
                sv.setTensv(svNew.getTensv());
                return 1;
            }
        }
        return -1;
    }
}
