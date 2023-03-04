public class Sach extends Book{
    private int soHieuSach;
    private String theLoai;
    private String tenTacGia;

    public Sach(int soHieuSach, String idSach, String tenSach, String theLoai, String tenTacGia) {
        super(tenSach, idSach);
        this.soHieuSach = soHieuSach;
        this.theLoai = theLoai;
        this.tenTacGia = tenTacGia;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "soHieuSach=" + soHieuSach +
                ", theLoai='" + theLoai + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                "," + super.toString() +
                '}';
    }
}