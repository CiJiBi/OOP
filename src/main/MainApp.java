package main;

import java.util.Scanner;
import utils.ValidationUtils;
import duan.DanhSachSanPham; // THAY ĐỔI: Thay 'doan' bằng tên gói thực tế chứa DanhSachSanPham

public class MainApp {

    // FIX LỖI 1: Khai báo Scanner và đối tượng quản lý là thành viên static
    private static Scanner sc = new Scanner(System.in);
    private static DanhSachSanPham dssp = new DanhSachSanPham(); // THAY ĐỔI: Khởi tạo đối tượng quản lý

    // =================================================================
    
    public static void main(String[] args) {
        // FIX LỖI 2: Đảm bảo Scanner được đóng khi chương trình thoát
        try {
            chayChuongTrinh();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
    
    // Yêu cầu 7: Phương thức static
    private static void chayChuongTrinh() {
        int luaChon;
        do {
            hienThiMenuChinh();
            // Lỗi ValidationUtils và sc đã được khắc phục
            luaChon = ValidationUtils.nhapSoNguyen(sc, "Nhập lựa chọn của bạn: ");
            
            switch (luaChon) {
                case 1:
                    menuQuanLySanPham();
                    break;
                case 2:
                    System.out.println("Chức năng đang phát triển...");
                    break;
                case 3:
                    System.out.println("Chức năng đang phát triển...");
                    break;
                case 0:
                    System.out.println("Cảm ơn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }
    
    // ... Các phương thức hienThiMenuChinh() giữ nguyên ...
    private static void hienThiMenuChinh() {
        System.out.println("\n--- CHƯƠNG TRÌNH QUẢN LÝ CỬA HÀNG THỜI TRANG ---");
        System.out.println("1. Quản lý Sản phẩm");
        System.out.println("2. Quản lý Nhân viên");
        System.out.println("3. Quản lý Hóa đơn");
        System.out.println("0. Thoát");
    }
    
    // ... Phương thức menuQuanLySanPham() đã được fix lỗi sc và dssp ...
    private static void menuQuanLySanPham() {
        int luaChonSP;
        do {
            System.out.println("\n--- QUẢN LÝ SẢN PHẨM ---");
            System.out.println("1. Xem danh sách sản phẩm (Thể hiện Đa hình)");
            System.out.println("2. Thêm sản phẩm mới");
            System.out.println("3. Xóa sản phẩm theo mã");
            System.out.println("4. Tìm sản phẩm theo mã");
            System.out.println("5. Thống kê tồn kho");
            System.out.println("0. Quay lại menu chính");
            
            // Lỗi ValidationUtils và sc đã được khắc phục
            luaChonSP = ValidationUtils.nhapSoNguyen(sc, "Chọn chức năng: ");
            
            switch (luaChonSP) {
                case 1:
                    dssp.xuatDanhSach(); // Đã fix lỗi dssp
                    break;
                case 2:
                    dssp.themSanPham(sc); // Đã fix lỗi dssp
                    break;
                case 3:
                    String maXoa = ValidationUtils.nhapChuoi(sc, "Nhập mã SP cần xóa: ");
                    dssp.xoaTheoMa(maXoa);
                    break;
                case 4:
                    String maTim = ValidationUtils.nhapChuoi(sc, "Nhập mã SP cần tìm: ");
                    if (dssp.timKiemTheoMa(maTim) != null) {
                        System.out.println("Tìm thấy sản phẩm:");
                        // Giả sử Product có phương thức displayInfo()
                        dssp.timKiemTheoMa(maTim).displayInfo(); 
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 5:
                    dssp.thongKeSoLuongTon();
                    break;
                case 0:
                    System.out.println("Đang quay lại menu chính...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (luaChonSP != 0);
    }
}