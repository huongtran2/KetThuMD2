import java.util.ArrayList;
import java.util.Scanner;

public class QuanlySinhVien {
    ArrayList<SinhVien> sinhViens = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void Show() {
        for (SinhVien sinhVien : sinhViens) {
            System.out.println(sinhVien.toString());
        }
    }

    public void Delete() {
        System.out.println("Nhập tên sv muốn xóa :");
        String name = scanner.nextLine();
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getName().equals(name)) {
                sinhViens.remove(i);
            }
        }
    }

    public SinhVien DoiTuong() {
        System.out.println(" Nhập mã sv :");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sv muốn thêm :");
        String name = scanner.nextLine();
        System.out.println(" Nhập tuổi muốn thêm ;");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập gioitinh sv muốn thêm :");
        String gioitinh = scanner.nextLine();
        System.out.println(" Nhập địa chỉ sv ");
        String diachi = scanner.nextLine();
        System.out.println(" Điểm trung bình");
        double dtb = Integer.parseInt(scanner.nextLine());

        SinhVien sp = new SinhVien(ma,name, tuoi,gioitinh, diachi, dtb);
        return sp;
    }

    public void Create() {
        sinhViens.add(DoiTuong());


    }

    public void Edit() {
        System.out.println("Nhập tên sv muốn sửa :");
        String name = scanner.nextLine();
        sinhViens.set(Integer.parseInt(name), DoiTuong());
    }
    public void Sapxep(){
        for (int i = 0; i <sinhViens.size()-1;i++){
            for (int j = i +1; j< sinhViens.size(); j++){
                if(sinhViens.get(i).getDtb()>sinhViens.get(j).getDtb()){
                    SinhVien temp = sinhViens.get(i);
                    sinhViens.set(i,sinhViens.get(j));
                    sinhViens.set(j,temp);
                }
            }
        }
    }
}

