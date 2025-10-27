pageage duan;
// Lớp trừu tượng
public abstract class Nguoi {
    protected String ma;
    protected String hoTen;
    protected String sdt;
    protected String diaChi;

    // Yêu cầu 2: Hàm thiết lập (Constructor)
    public Nguoi() {}

    public Nguoi(String ma, String hoTen, String sdt, String diaChi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    //Get Set
    public String getMa() { return ma; }
    public void setMa(String ma) { this.ma = ma; }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    // ... (Thêm các getter/setter khác)

    // Hàm trừu tượng
    // Mỗi loại người (NV, KH) sẽ có cách hiển thị thông tin khác nhau
    public abstract void hienThiThongTin();

    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-12s | %-25s ", ma, hoTen, sdt, diaChi);
    }
}