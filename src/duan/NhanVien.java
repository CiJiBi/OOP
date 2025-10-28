package duan;
import java.util.Scanner;
public class NhanVien extends Nguoi {
    private static int nextId=1000;
    public static final String CHUC_VU_QUAN_LY = "Quan Ly";

    private String chucvu;
    private double luong;
    public NhanVien(){
        super();
        this.ma="NV"+nextId++;
        this.chucvu=null;
        this.luong=0;
    }
    public NhanVien(String ma,String hoten,String sdt,String diachi,String chucvu,double luong)
    {
        super(ma,hoten,sdt,diachi);
        this.chucvu=chucvu;
        this.luong=luong;
        try {
            int idHientai=Integer.parseInt(ma.substring(2));
            if(idHientai>=nextId){
                nextId=idHientai+1;
            }
        } catch(NumberFormatException | StringIndexOutOfBoundsException e) {
            // Ghi lại lỗi hoặc thông báo rằng định dạng mã nhân viên không hợp lệ
            System.err.println("Warning: Mã nhân viên '" + ma + "' không đúng định dạng 'NVxxxx'. Bỏ qua việc cập nhật nextId.");
        }
    }
    public double getLuong(){
        if(CHUC_VU_QUAN_LY.equalsIgnoreCase(this.chucvu)) return luong*1.2;
        else return this.luong;
    }
    // Truyền Scanner vào để tránh tạo nhiều instance không cần thiết
    public void nhapThongTin(Scanner sc){
        System.out.println("--- Nhập thông tin nhân viên ---");
        super.input(sc);
        System.out.println("Chức vụ: ");
        this.chucvu=sc.nextLine();
        System.out.println("Lương: ");
        // Đọc cả dòng rồi chuyển đổi để tránh lỗi `InputMismatchException` và lỗi `nextDouble` còn sót lại ký tự newline
        while(true) {
            try {
                this.luong = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lương không hợp lệ. Vui lòng nhập lại một số: ");
            }
        }
    }
    @Override 
    public void hienthithongtin(){
        System.out.printf("| %-10s | %-20s | %-15s | %-20s | %-15s | %-15.0f |\n",
                this.ma, this.hoten, this.sdt, this.diachi, this.chucvu, getLuong());
    }

    @Override
    public double chietkhauorthuong() {
        return 0;
    }
}
