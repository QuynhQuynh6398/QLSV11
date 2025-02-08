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
public class tendangnhapDAO {
    List<tendangnhap> ls = new ArrayList<>();

    public tendangnhapDAO() {
        ls.add(new tendangnhap("admin", "12345", true));
        ls.add(new tendangnhap("Son", "123456", true));
        ls.add(new tendangnhap("Dang", "1234567", true));
        ls.add(new tendangnhap("Hoa", "1234578", true));
      
    }
    
    public boolean checkDangNhap(String username, String password){
        for(tendangnhap t: ls){
            if(t.getUsername().equals(username)&& t.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
}
