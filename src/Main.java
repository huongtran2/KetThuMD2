import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanlySinhVien quanlysanpham = new QuanlySinhVien();
        while (true) {
            System.out.println("====================================");
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN---");
            System.out.println(" Chọn chức năng theo số để tiếp tục ");
            System.out.println("  1. Xem danh sách sinh viên :");
            System.out.println("  2. Thêm mới :");
            System.out.println("  3. Cập nhật :");
            System.out.println("  4. Xóa");
            System.out.println("  5. Sắp xếp :");
            System.out.println("  6. Đọc file");
            System.out.println("  7. Ghi file");
            System.out.println("  0. Exit sản phẩm");
            System.out.println("=====================================");
            System.out.print("Bạn chọn chức năng :");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
//                    show
                    quanlysanpham.Show();
                    break;
                case 2:
//                    Thêm
                    quanlysanpham.Create();
                    break;
                case 3:
//                    cập nhật
                    quanlysanpham.Edit();
                    break;
                case 4:
//                    xóa
                    quanlysanpham.Delete();
                    break;
                case 5 :
//                   dtb bé đến lớn
                    quanlysanpham.Sapxep();
                    break;

                case 6:
                    File file = new File("C:\\Users\\Tran Thi Thu Hang\\ThiModule2\\src\\file.txt");
                            try {
                                SinhVien list = new SinhVien();
                                //kết nối
                                FileOutputStream ketnoi = new FileOutputStream(file);
                                //tạo bút
                                ObjectOutputStream but = new ObjectOutputStream(ketnoi);
                                but.writeObject(list);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                    break;
                case 7:
//
                    break;
                case 0:
//                    exit
                    return;
            }
        }
    }
}
