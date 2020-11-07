/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program perhitungan tunjangan, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
        double gaji, tunjangan;
        String status;
        
        public void masukkanTunjangan(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("=======Program Tunjangan=======");
            System.out.print("Berapa gaji pokok anda perbulan ? : ");
            gaji = scanner.nextDouble();
            System.out.print("Status Anda ? (Menikah/Belum) : ");
            status = scanner.next();   
        }
        
        public double hitungTunjangan(){
            double nominalTunjangan = 0.35 * gaji;
            return nominalTunjangan;
        }
        
        public double cekStatus(){
            if (status.toUpperCase().equals("MENIKAH")) {
                tunjangan = hitungTunjangan();
            }else {
                tunjangan = 0.0;
            }
            return tunjangan;
        }
        
        public void tampilGaji(){
            System.out.println("=======Hasil Perhitungan Gaji Anda=======");
            System.out.println("Gaji Pokok : "+gaji);
            System.out.println("Tunjangan : "+tunjangan);
            double totalGaji = tunjangan + gaji;
            System.out.println("Total Gaji : "+(totalGaji));
            System.out.println("(Developed by : Adrian Maidiyangsa)");
        }
}
