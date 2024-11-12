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
public class TinggiBadan {
    String nama;
    int tinggi;
    String kategori;
    
public TinggiBadan(String nama, int tinggi){
    this.nama = nama;
    this.tinggi = tinggi;
    this.kategori = tentukankategori();
}

String tentukankategori(){
    if(tinggi < 150){
        return "Rendah";
    } else if (tinggi >= 150 && tinggi < 170){
        return "Sedang";
    }else {
        return "Tinggi";
    }
}

public String getNama(){
    return nama;
}
public int getTinggi(){
    return tinggi;
}
public String getKategori(){
    return kategori;
}

    void tampilkanInfo(){
    System.out.println("Nama:"+nama);
    System.out.println("Tinggi Badan:"+tinggi+"cm");
    System.out.println("Kategori:"+kategori);
    }
}
