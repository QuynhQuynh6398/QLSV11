package model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP
 */
public class diemDAO {
    List<diem> ls = new ArrayList<>();
    public int add(diem d){
        ls.add(d);
        return 1;
    }
    public List<diem> getAlldiem(){
        return ls;
    }
    public diem getOnediemBymasv(String masv){
        for(diem d: ls){
            if(d.getSv().getMasv().equalsIgnoreCase(masv)){
                return d;
            }
        }
        return null;
    }
    public int updatediem(diem dNew){
        for(diem d: ls){
            if(d.getSv().getMasv().equalsIgnoreCase(dNew.getSv().getMasv())){
                d.setAnhVan((dNew.getAnhVan()));
                d.setCsdl(dNew.getCsdl());
                d.setGiaitich(dNew.getGiaitich());
                return 1;
            }
        }
        return -1;
    }
    public int deldiem(String masv){
        diem d = getOnediemBymasv(masv);
        if(d != null){
            ls.remove(d);
            return 1;
        }
        return -1;
    }
    
    public diem getAtPosition(int pos){
        return ls.get(pos);
    }
}
