/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA : Tegar Lucky'Q Oakley 
 * NIM : 10118066 
 * KELAS : IF2 
 * Deskripsi Program : Program ini berisi program untuk Menjumlahkan Kambing Global
 */
public class KambingGlobal {

    // Variabel jumlahkambing menjadi variabel instance 
    
        int jumlahKambing = 88;
        
        // Method untuk menampilkan jumlah kambing
        public void getjumlahKambing() {
            System.out.println("Jumlah Kambing : " + jumlahKambing);
        }
        
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5; 
            System.out.println("Jumlah Kambing Setelah Ditambah : " + jumlahKambing);
        }
        
    public static void main(String[] args) {
       KambingGlobal kambingSusu = new KambingGlobal();
       
       // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
       kambingSusu.getjumlahKambing();
       
       // Menambah satu kambing
       kambingSusu.tambahKambing();
       
       // Menampilkan jumlah kambing yang ada
       kambingSusu.getjumlahKambing();
                
    }
    
}
