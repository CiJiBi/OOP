package duan;
 
import java.util.Scanner;

public class PhuKien extends SanPham{
    private String loai;
    public static final float THUE_VATE=0.05;
    public static final double THUE_VATE = 0.05; // Nên dùng double để nhất quán

    public PhuKien() {
        super();
        this.loai = null;
    }

    public PhuKien(String maSP, String tenSP, double gia, int soLuongTon, String loai) {
        super(maSP, tenSP, gia, soLuongTon);
        this.loai = loai;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc); // Gọi phương thức input của lớp cha để nhập thông tin chung
        System.out.println("Loại phụ kiện: ");
        this.loai = sc.nextLine();
    }

    @Override
    public void output() {
        // In thông tin chung bằng cách gọi phương thức của lớp cha
        super.output(); 
        // In thêm thông tin riêng của Phụ kiện
        System.out.printf("%-20s | %-15.0f |\n", this.loai, giaban());
    }

    /**
     * Triển khai phương thức trừu tượng từ lớp SanPham.
     * Tính thuế VAT cho phụ kiện.
     */
    @Override
    public double thueorchietkhau() {
        return this.gia * THUE_VATE;
    }
}
