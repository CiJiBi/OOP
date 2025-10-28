package duan;
public class KhachHang extends Nguoi {
    private static int nextId=1000;
    public static final String RANK_BACH_KIM = "Bạch Kim";
    public static final String RANK_VANG = "Vàng";
    public static final String RANK_BAC = "Bạc";
    public static final String RANK_DONG = "Đồng";
    private String loaiKhachHang;
    private double diemTichLuy;
    // constructer mặc định
    public KhachHang(){
        super();
        this.ma="KH"+nextId++;
        this.diemTichLuy=0;
        updateRank();
    }
    // constructer có tham số
    public KhachHang(String ma,String hoten,String sdt,String diachi,String loaiKhachHang,double diemTichLuy){
        super(ma,hoten,sdt,diachi);
        this.diemTichLuy=diemTichLuy;
        updateRank();
        try{
            int idHientai=Integer.parseInt(ma.substring(2));
            if(idHientai>=nextId){
                nextId=idHientai+1;
            }
        }
        catch(NumberFormatException | StringIndexOutOfBoundsException e){
            System.err.println("Warning: Mã khách hàng '" + ma + "' không đúng định dạng 'KHxxxx'. Bỏ qua việc cập nhật nextId.");
        }
        
}
    private void updateRank(){
        if(diemTichLuy>=1000){
            this.loaiKhachHang=RANK_BACH_KIM;
        }
        else if(diemTichLuy>=500){
            this.loaiKhachHang=RANK_VANG;
        }
        else if(diemTichLuy>=200){
            this.loaiKhachHang=RANK_BAC;
        }
        else{
            this.loaiKhachHang=RANK_DONG;
        }
    }
    @Override
    public void hienthithongtin() {
        System.out.printf("| %-10s | %-20s | %-15s | %-20s | %-15s | %-15.0f |\n",
                this.ma, this.hoten, this.sdt, this.diachi, this.loaiKhachHang, this.diemTichLuy);
    }
    @Override
    // có thể dùng swtich
    public double chietkhauorthuong(){
        if(this.loaiKhachHang.equals(RANK_BACH_KIM))
        {
            return 0.2;
        
        }
        else if(this.loaiKhachHang.equals(RANK_VANG))
        {
            return 0.1;
        }
        else if(this.loaiKhachHang.equals(RANK_BAC))
        {
            return 0.05;
        }
        else{
            return 0;
        }
    }
}
