package duan;
public class NhanVien extends Nguoi{
	private String chucVu;
    private double luong;
    public NhanVien() {
        super();
    }
    public NhanVien(String ma, String HoTen, String SDT, String DiaChi, String chucVu, double luong)
    {
        super(ma,HoTen,SDT,DiaChi);
        this.chucVu=chucVu;
        this.luong=luong;
    }
    // Đa Hình
	@Override
	public void hienThiThongTin() {
		
		System.out.println(super.toString()+String.format("%-15s | %,.0f VND |", chucVu, luong));
	}
}