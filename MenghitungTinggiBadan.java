/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungtinggibadan;

/**
 *
 * @author ITBI 28
 */
public class MenghitungTinggiBadan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TinggiBadan orang1= new TinggiBadan("Noval", 168);
        TinggiBadan orang2= new TinggiBadan("Andi", 145);
        TinggiBadan orang3= new TinggiBadan("Hara", 160);
        TinggiBadan orang4= new TinggiBadan("Dodi", 177);
        
        System.out.println("====Data Tinggi Badan====");
        orang1.tampilkanInfo();
        System.out.println();
        orang2.tampilkanInfo();
        System.out.println();
        orang3.tampilkanInfo();
        System.out.println();
        orang4.tampilkanInfo();
    }
    
}
