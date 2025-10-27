package duan;
import java.util.List;

// Yêu cầu 9: Sử dụng Interface
// Định nghĩa các hành vi chung cho việc đọc và ghi file
public interface IFileService<T> {
    // Yêu cầu 6: Đọc và ghi dữ liệu lên file (text)
    List<T> docDuLieu(String tenFile);
    void ghiDuLieu(String tenFile, List<T> danhSach);
}