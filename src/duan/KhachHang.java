package duan;
public class KhachHang extends Nguoi {
    private String loaiThanhVien; // VIP, Thường

    // Yêu cầu 2: Hàm thiết lập
    public KhachHang() {
        super();
    }

    public KhachHang(String ma, String hoTen, String sdt, String diaChi, String loaiThanhVien) {
        super(ma, hoTen, sdt, diaChi);
        this.loaiThanhVien = loaiThanhVien;
    }

    // Yêu cầu 4: Đa hình (Override)
    @Override
    public void hienThiThongTin() {
        System.out.println(super.toString() + 
            String.format(" %-20s |", loaiThanhVien));
    }
}