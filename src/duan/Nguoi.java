package duan;
import java.util.Scanner;
public abstract class Nguoi {
    protected String ma;
    protected String hoten;
    protected String sdt;
    protected String diachi;
    public Nguoi(){
        this.ma=null;
        this.hoten=null;
        this.sdt=null;
        this.diachi=null;
    }
    public Nguoi(String ma,String hoten,String sdt,String diachi){
        this.ma=ma;
        this.hoten=hoten;
        this.sdt=sdt;
        this.diachi=diachi;
    }
    public String getMa(){
        return ma;
    }
    public void setMa(String ma){
        this.ma=ma;
    }
    public String getHoten(){
        return hoten;
    }
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public String getSdt(){
        return sdt;
    }
    public void setSdt(String sdt){
        this.sdt=sdt;
    }
    public String getDiachi(){
        return diachi;
    }
    public void setDiachi(String diachi){
        this.diachi=diachi;
    }
    public void input(Scanner sc){
       
        System.out.println("Nhập thông tin: ");
        System.out.println("Họ tên: ");
        this.hoten= sc.nextLine();
        System.out.println("Số điện thoại: ");
        this.sdt= sc.nextLine();
        System.out.println("Địa chỉ: ");
        this.diachi= sc.nextLine();
    }
    public abstract void hienthithongtin();
    public abstract double chietkhauorthuong();
    @Override 
    public String toString(){
        return String.format("| %-10s | %-20s | %-15s | %-20s |",this.ma,this.hoten,this.sdt,this.diachi);
    }
}
