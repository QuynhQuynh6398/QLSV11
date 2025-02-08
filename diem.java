/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class diem {
    private int id;
    private sinhvien sv;
    private double anhVan, csdl, giaitich;

    public diem() {
    }

    public diem(int id, sinhvien sv, double anhVan, double csdl, double giaitich) {
        this.id = id;
        this.sv = sv;
        this.anhVan = anhVan;
        this.csdl = csdl;
        this.giaitich = giaitich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public sinhvien getSv() {
        return sv;
    }

    public void setSv(sinhvien sv) {
        this.sv = sv;
    }

    public double getAnhVan() {
        return anhVan;
    }

    public void setAnhVan(double anhVan) {
        this.anhVan = anhVan;
    }

    public double getCsdl() {
        return csdl;
    }

    public void setCsdl(double csdl) {
        this.csdl = csdl;
    }

    public double getGiaitich() {
        return giaitich;
    }

    public void setGiaitich(double giaitich) {
        this.giaitich = giaitich;
    }
    
    public double getTBC(){
        return (getAnhVan()+getGiaitich()+getGiaitich())/3;
    }
    
    public String getXeploai(){
        String xl = "";
        double tbc = getTBC();
        if(tbc>8){
            xl = "GIỎI";
        }else if(tbc >=7){
            xl = "KHÁ";
        }else if(tbc >= 5){
            xl = "TRUNG BÌNH";
        }else{
           xl = "YẾU";
        }
        return xl;
    }
}
