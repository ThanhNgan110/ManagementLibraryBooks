import java.util.Calendar;

public class TheMuon extends Book{
    private String hoTenSinhVien;
    private String maSinhVien;
    private int soPhieuMuon;
    private String ngayMuon;
    private Calendar muon;
    private Calendar tra;
    private String hanMuon;

    public TheMuon(String tenSach, String idSach, String hoTenSinhVien, String maSinhVien, int soPhieuMuon, String ngayMuon, Calendar muon, Calendar tra, String hanMuon) {
        super(tenSach, idSach);
        this.hoTenSinhVien = hoTenSinhVien;
        this.maSinhVien = maSinhVien;
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.muon = muon;
        this.tra = tra;
        this.hanMuon = hanMuon;
    }

    public String getHoTenSinhVien() {
        return hoTenSinhVien;
    }

    public void setHoTenSinhVien(String hoTenSinhVien) {
        hoTenSinhVien = hoTenSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        maSinhVien = maSinhVien;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public Calendar getMuon() {
        return muon;
    }

    public void setMuon(Calendar muon) {
        this.muon = muon;
    }

    public Calendar getTra() {
        return tra;
    }

    public void setTra(Calendar tra) {
        this.tra = tra;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        ngayMuon = ngayMuon;
    }

    public String getHanMuon() {
        return hanMuon;
    }

    public void setHanMuon(String hanMuon) {
        hanMuon = hanMuon;
    }

    public void setIdSach(String idSach) {
        idSach = idSach;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "hoTenSinhVien='" + hoTenSinhVien + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", soPhieuMuon=" + soPhieuMuon +
                ", " + super.toString() +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanMuon='" + hanMuon + '\'' +
                '}';
    }
}