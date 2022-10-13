import java.io.Serializable;

public class SinhVien implements Serializable {
    private int ma;
    private String name;
    private int tuoi;
    private String gioitinh;
    private String diachi;
    private double dtb;

    public SinhVien() {
    }

    public SinhVien(int ma, String name, int tuoi, String gioitinh, String diachi, double dtb) {
        this.ma = ma;
        this.name = name;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.dtb = dtb;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma=" + ma +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dtb=" + dtb +
                '}';
    }
}
