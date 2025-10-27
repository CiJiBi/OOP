package duan;

// Kế thừa
public class QuanAo extends SanPham {
    private String kichCo;
    private String chatLieu; 

    // Hàm thiết lập
    public QuanAo() {
        super();
    }

    public QuanAo(String tenSP, double giaNhap, int soLuongTon, String thuongHieu, String kichCo, String chatLieu) {
        super(tenSP, giaNhap, soLuongTon, thuongHieu);
        this.kichCo = kichCo;
        this.chatLieu = chatLieu;
    }

    // Cài đặt và sử dụng đa hình (Override)
    @Override
    public double tinhGiaBan() {
        // Quần áo có giá bán = 150% giá nhập
        return this.giaNhap * 1.5;
    }

    @Override
    public void hienThiChiTiet() {
        System.out.println(super.toString() + 
            String.format("| %-10s | %-15s | %,.0f VND |", kichCo, chatLieu, tinhGiaBan()));
    }
}