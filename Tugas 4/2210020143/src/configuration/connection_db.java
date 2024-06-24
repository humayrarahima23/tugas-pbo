/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuration;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author 
 */
public class connection_db {
    private String databaseName = "2210020143";
    private String username = "root";
    private String password = "";
    
    public static Connection koneksi;
    
    public connection_db(){
    
        try {
            String url = "jdbc:mysql://localhost/"+this.databaseName+"?characterEncoding=latin1";
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url,this.username,this.password);
            System.out.println("database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public void simpanBagian(String kd_bag, String nm_bag){
        try {
            String sql = "INSERT INTO tb_bagian (kd_bag, nm_bag) value(?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_bag);
            perintah.setString(2, nm_bag);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahBagian(String kd_bag, String nm_bag){
        try {
            String sql = "UPDATE tb_bagian SET kd_bag=? , nm_bag=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_bag);
            perintah.setString(2, nm_bag);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusBagian(String kd_bag){
        try {
            String sql = "DELETE FROM tb_bagian WHERE kd_bag=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_bag);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariBagian(String kd_bag) {
        try {
            String sql ="SELECT * FROM tb_bagian WHERE kd_bag=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,kd_bag);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("kd_bag"));
                System.out.println(data.getString("nm_bag"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanMerk(String kd_merk, String merk){
        try {
            String sql = "INSERT INTO tb_merk (kd_merk, merk) value(?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_merk);
            perintah.setString(2, merk);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahMerk(String kd_merk, String merk){
        try {
            String sql = "UPDATE tb_merk SET kd_merk=? , merk=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_merk);
            perintah.setString(2, merk);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusMerk(String kd_merk){
        try {
            String sql = "DELETE FROM tb_merk WHERE kd_merk=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_merk);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariMerk(String kd_merk) {
        try {
            String sql ="SELECT * FROM tb_merk WHERE kd_merk=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,kd_merk);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("kd_merk"));
                System.out.println(data.getString("merk"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanPemakaian(String kd_pemakaian, String kd_brg, String nip, String kd_bag, String tgl_pakai, String keperluan, String stt_p){
        try {
            String sql = "INSERT INTO tb_pemakaian (kd_pemakaian, kd_brg, nip, kd_bag, tgl_pakai, keperluan, stt_p) value(?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_pemakaian);
            perintah.setString(2, kd_brg);
            perintah.setString(3, nip);
            perintah.setString(4, kd_bag);
            perintah.setString(5, tgl_pakai);
            perintah.setString(6, keperluan);
            perintah.setString(7, stt_p);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPemakaian(String kd_pemakaian, String kd_brg, String nip, String kd_bag, String tgl_pakai, String keperluan, String stt_p){
        try {
            String sql = "UPDATE tb_pemakaian SET kd_pemakaian=?, kd_brg=?, nip=?, kd_bag=?, tgl_pakai=?, keperluan=?, stt_p=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_pemakaian);
            perintah.setString(2, kd_brg);
            perintah.setString(3, nip);
            perintah.setString(4, kd_bag);
            perintah.setString(5, tgl_pakai);
            perintah.setString(6, keperluan);
            perintah.setString(7, stt_p);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPemakaian(String kd_pemakaian){
        try {
            String sql = "DELETE FROM tb_pemakaian WHERE kd_pemakaian=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_pemakaian);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPemakaian(String kd_pemakaian) {
        try {
            String sql ="SELECT * FROM tb_pemakaian WHERE kd_pemakaian=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,kd_pemakaian);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("kd_pemakaian"));
                System.out.println(data.getString("kd_brg"));
                System.out.println(data.getString("nip"));
                System.out.println(data.getString("kd_bag"));
                System.out.println(data.getString("tgl_pakai"));
                System.out.println(data.getString("keperluan"));
                System.out.println(data.getString("stt_p"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanPeralatan(String kd_brg, String nm_brg, String no_reg, String kd_merk, String ukuran, String no_prmbp, String m_manfaat, String th_pembelian, String kd_bag, String hrg_perolehan, String tgl_input){
        try {
            String sql = "INSERT INTO tb_peralatan (kd_brg, nm_brg, no_reg, kd_merk, ukuran, no_prmbp, m_manfaat, th_pembelian, kd_bag, hrg_perolehan, tgl_input) value(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_brg);
            perintah.setString(2, nm_brg);
            perintah.setString(3, no_reg);
            perintah.setString(4, kd_merk);
            perintah.setString(5, ukuran);
            perintah.setString(6, no_prmbp);
            perintah.setString(7, m_manfaat);
            perintah.setString(8, th_pembelian);
            perintah.setString(9, kd_bag);
            perintah.setString(10, hrg_perolehan);
            perintah.setString(11, tgl_input);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPeralatan(String kd_brg, String nm_brg, String no_reg, String kd_merk, String ukuran, String no_prmbp, String m_manfaat, String th_pembelian, String kd_bag, String hrg_perolehan, String tgl_input){
        try {
            String sql = "UPDATE tb_peralatan SET kd_brg=?, nm_brg=?, no_reg=?, kd_merk=?, ukuran=?, no_prmbp=?, m_manfaat=?, th_pembelian=?, kd_bag=?, hrg_perolehan=?, tgl_input=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_brg);
            perintah.setString(2, nm_brg);
            perintah.setString(3, no_reg);
            perintah.setString(4, kd_merk);
            perintah.setString(5, ukuran);
            perintah.setString(6, no_prmbp);
            perintah.setString(7, m_manfaat);
            perintah.setString(8, th_pembelian);
            perintah.setString(9, kd_bag);
            perintah.setString(10, hrg_perolehan);
            perintah.setString(11, tgl_input);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPeralatan(String kd_brg){
        try {
            String sql = "DELETE FROM tb_peralatan WHERE kd_brg=?";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, kd_brg);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPeralatan(String kd_brg) {
        try {
            String sql ="SELECT * FROM tb_peralatan WHERE kd_brg=? ";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1,kd_brg);
            ResultSet data=perintah.executeQuery();
            while(data.next()) {
                System.out.println(data.getString("kd_brg"));
                System.out.println(data.getString("nm_brg"));
                System.out.println(data.getString("no_reg"));
                System.out.println(data.getString("kd_merk"));
                System.out.println(data.getString("ukuran"));
                System.out.println(data.getString("no_prmbp"));
                System.out.println(data.getString("m_manfaat"));
                System.out.println(data.getString("th_pembelian"));
                System.out.println(data.getString("kd_bag"));
                System.out.println(data.getString("hrg_perolehan"));
                System.out.println(data.getString("tgl_input"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
