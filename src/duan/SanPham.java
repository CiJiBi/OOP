package duan;
// Lớp trừu tượng (Lớp cơ sở trung tâm)
public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double giaNhap;
    protected int soLuongTon;
    protected String thuongHieu;

    // Thuộc tính static
    // Dùng để tự động tạo mã SP
    private static int dem = 0;

    // Hàm thiết lập (Constructor)
    public SanPham() {
        this.maSP = "SP" + (++dem);
    }

    public SanPham(String tenSP, double giaNhap, int soLuongTon, String thuongHieu) {
        this.maSP = "SP" + (++dem);
        this.tenSP = tenSP;
        this.giaNhap = giaNhap;
        this.soLuongTon = soLuongTon;
        this.thuongHieu = thuongHieu;
    }
    
    // Get Set
    public String getMaSP() { return maSP; }
    public void setMaSP(String maSP) { this.maSP = maSP; }
    public String getTenSP() { return tenSP; }
    public int getSoLuongTon() { return soLuongTon; }
    public void setSoLuongTon(int soLuongTon) { this.soLuongTon = soLuongTon; }


    // Hàm trừu tượng
    // Đa hình (sẽ được override ở lớp con)
    // Mỗi loại sản phẩm có cách tính giá bán khác nhau
    public abstract double tinhGiaBan(); 

    // Đa hình (sẽ được override ở lớp con)
    public abstract void hienThiChiTiet();

    @Override
    public String toString() {
        return String.format("| %-10s | %-25s | %,-15.0f | %-10d | %-15s ", 
                maSP, tenSP, giaNhap, soLuongTon, thuongHieu);
    }
}