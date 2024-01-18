/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

/**
 *
 * @author ADMIN
 */
public class Person {
    private String hoten,diachi,gioitinh;
    private int ngaysinh;
    public Person(){}
    public Person(String ht,String dc,String gt,int ns){
        hoten=ht;
        diachi=dc;
        gioitinh=gt;
        ngaysinh=ns;
    }
    public String getHoten(){
        return hoten;
    }
    public void setHoten(String ht){
        hoten=ht;
    }
    public void setNgaysinh(int ns){
        ngaysinh=ns;
    }
    public int getNgaysinh(){
        return ngaysinh;
    }
    public void setDiachi(String dc){
        diachi=dc;
    }
    public String getDiachi(){
        return diachi;
    }
    public void setGioitinh(String gt){
        gioitinh=gt;
    }
    public String getGioitinh(){
        return gioitinh;
    }
    public void display(){
        System.out.println("Ho ten: "+hoten);
        System.out.println("Ngay sinh: "+ngaysinh);
        System.out.println("Dia chi: "+diachi);
        System.out.println("Gioi tinh: "+gioitinh);
    }
}
