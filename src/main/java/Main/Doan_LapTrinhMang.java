/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.Xampp_Connection;
import Model.Calender;
import Model.HocPhan_CT;
import classes.model.ChiTietMonHoc;
import org.json.JSONArray;

import java.util.ArrayList;

/**
 *
 * @author Admins
 */
public class Doan_LapTrinhMang {
    static Xampp_Connection conn = new Xampp_Connection();
    public static void main(String[] args) {
        ArrayList<HocPhan_CT> e = new ArrayList<>();
        int[] a = new int[]{841404};
        int[] c = new int[]{1,2,3,4,5};
        Calender d = new Calender(a);
        d.XepLich(2);
        e.addAll(d.outCalender());
        for (int i = 0; i < e.size();i++) {
            System.out.println("Ma mon hoc: "+e.get(i).getMamh());
            System.out.println("Ten mon hoc: "+e.get(i).getTenmh());
            System.out.println("Nhom mon hoc: "+e.get(i).getManhom());
            for (int j=0;j<e.get(i).getCtmh().size();j++)
                System.out.print(e.get(i).getCtmh().get(j).toString()+" ");
            System.out.println();
            System.out.println();
        }
        System.out.print(d.outMonTrung().toString());
        System.out.print(e);
        d.printWeek();
        //String a="minh";
        //System.out.print(a.substring(2,3));
        
    }
    
}