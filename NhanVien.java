/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;


/**
 *
 * @author ADMIN
 */
public class NhanVien extends Person{
    private String phongBan;
    private double heSoLuong;
    private int thamNien;
    private double luongCoBan;

    // Phương thức khởi tạo
    public NhanVien(String hoTen, int ngaySinh, String diaChi, String gioiTinh,String phongBan, double heSoLuong, int thamNien, double luongCoBan) {
        super(hoTen, diaChi, gioiTinh,ngaySinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    // Phương thức tính lương thực lĩnh
    public double tinhLuongThucLinh() {
        return luongCoBan * heSoLuong * (1 + thamNien / 100.0);
    }
    public String getPhongBan(){
        return phongBan;
    }
    public double getHeSoLuong(){
        return heSoLuong;
    }
    public int getThamNien(){
        return thamNien;
    }
    public double getLuongCb(){
        return luongCoBan;
    }
    // Phương thức hiển thị thông tin cá nhân
    @Override
    public void display() {
        super.display();
        System.out.println("Phòng ban: " + phongBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Thâm niên: " + thamNien + " năm");
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Lương thực lĩnh: " + tinhLuongThucLinh());
    }
}
