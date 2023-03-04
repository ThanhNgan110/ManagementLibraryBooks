import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

public class ManagerTheMuon {
    Scanner sc=new Scanner(System.in);
    private ArrayList<TheMuon> listTheMuon = new ArrayList<TheMuon>();
    public void setListTheMuon(ArrayList<TheMuon> listTheMuon) {
        this.listTheMuon = listTheMuon;
    }
    public ArrayList<TheMuon> getListTheMuon() {
        return listTheMuon;
    }

    public void ThemPhieuMuon() {
        System.out.println("Nhập số lượng phiếu muốn thêm: ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++) {
            System.out.println("Nhập thông tin phiếu mượn thứ "+(i+1));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Calendar calendar1 = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            System.out.println("Nhập họ và tên của sinh viên: ");
            String HoTenSinhVien=sc.nextLine();
            System.out.println("Nhập mã sinh viên: ");
            String MaSinhVien=sc.nextLine();
            System.out.println("Nhập số phiếu mượn: ");
            int SoPhieuMuon=sc.nextInt();
            sc.nextLine();
            System.out.println("Nhâp ngày mượn: ");
            String NgayMuon=sc.nextLine();
            System.out.println("Nhâp hạn mượn: ");
            String HanMuon=sc.nextLine();
            Date date1 = Date.valueOf(NgayMuon);
            Date date2 = Date.valueOf(HanMuon);
            calendar1.setTime(date1);
            calendar2.setTime(date2);
            System.out.println("Nhâp id sách: ");
            String IdSach=sc.nextLine();
            System.out.println("Nhâp tên sách: ");
            String TenSach=sc.nextLine();
            TheMuon theMuon=new TheMuon(TenSach,IdSach,HoTenSinhVien,MaSinhVien,SoPhieuMuon,NgayMuon,calendar1, calendar2, HanMuon);
            listTheMuon.add(theMuon);
        }
    }
    public void XoaPhieu() {
        boolean check=false;
        System.out.println("Nhâp mã sinh viên muốn xóa: ");
        String MaSinhVien=sc.nextLine();
        for(int i=0;i<listTheMuon.size();i++) {
            if(listTheMuon.get(i).getMaSinhVien().equals(MaSinhVien)) {
                listTheMuon.remove(i);
                check=true;
            }
        }
        if(check==false) {
            System.out.println("Không tìm thấy sinh viên để xóa");
        }
        else {
            System.out.println("Xóa thành công");
        }
    }
    public void TimKiemPhieuTheoMaSV() {
        boolean check=false;
        System.out.println("Nhâp mã sinh viên muốn tìm: ");
        String MaSinhVien=sc.nextLine();
        for(int i=0;i<listTheMuon.size();i++) {
            if(listTheMuon.get(i).getMaSinhVien().equals(MaSinhVien)) {
                System.out.println(listTheMuon.get(i).toString());
                check=true;
            }
        }
        if(check==false) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public void TimKiemPhieuTheoTenSinhVien(){
        boolean check=false;
        System.out.println("Nhâp tên sinh viên muốn tìm: ");
        String HoTenSinhVien=sc.nextLine();
        for(int i=0;i<listTheMuon.size();i++) {
            if(listTheMuon.get(i).getHoTenSinhVien().equals(HoTenSinhVien)) {
                System.out.println(listTheMuon.get(i).toString());
                check=true;
            }
        }
        if(check==false) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public void SuaThongTinPhieu() {
        System.out.println("Nhâp mã sinh viên muốn sửa: ");
        String MaSinhVien=sc.nextLine();
        for(int i=0;i<listTheMuon.size();i++) {
            if(listTheMuon.get(i).getMaSinhVien().equals(MaSinhVien)) {
                System.out.println("Nhâp họ tên sinh viên: ");
                String HoTenSinhVien=sc.nextLine();
                System.out.println("Nhâp mã sinh viên: ");
                int SoPhieuMuon=sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập ngày mượn (dd-mm-yy): ");
                String NgayMuon=sc.nextLine();
                System.out.println("Nhập hạn mượn (dd-mm-yy): ");
                String HanMuon=sc.nextLine();
                System.out.println("Nhập id sách: ");
                String IdSach=sc.nextLine();
                System.out.println("Nhập tên sách: ");
                String TenSach=sc.nextLine();
                Calendar calendar1 = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                Date date1 = Date.valueOf(NgayMuon);
                Date date2 = Date.valueOf(HanMuon);
                calendar1.setTime(date1);
                calendar2.setTime(date2);
                listTheMuon.get(i).setMuon(calendar1);
                listTheMuon.get(i).setTra(calendar2);
                listTheMuon.get(i).setHoTenSinhVien(HoTenSinhVien);
                listTheMuon.get(i).setSoPhieuMuon(SoPhieuMuon);
                listTheMuon.get(i).setNgayMuon(NgayMuon);
                listTheMuon.get(i).setHanMuon(HanMuon);
                listTheMuon.get(i).setIdSach(IdSach);
                listTheMuon.get(i).setTenSach(TenSach);
                System.out.println("Sửa thành công");
            }
            else {
                System.out.println("Không tìm thấy sinh viên");
            }
        }

    }
    public void ListPhieuMuon() {
        System.out.println("-------------------Danh sách phiếu mượn-------------------");
        for(int i=0;i<listTheMuon.size();i++) {
            System.out.println(listTheMuon.get(i).toString());
        }
    }
    public void SapXepTheoTen() {
        for(int i=0;i<listTheMuon.size();i++) {
            for(int j=i+1;j<listTheMuon.size();j++) {
                if(listTheMuon.get(i).getHoTenSinhVien().compareTo(listTheMuon.get(j).getHoTenSinhVien())>0) {
                    TheMuon temp=listTheMuon.get(i);
                    listTheMuon.set(i, listTheMuon.get(j));
                    listTheMuon.set(j, temp);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo tên");
    }
    public void InPhieuMuonCoHanSapTra(int SoNgay) {
        System.out.println("-------------------Danh sách phiếu mượn có hạn sắp trả-------------------");
        boolean check=false;
        Calendar Now=Calendar.getInstance();
        for(int i=0;i<listTheMuon.size();i++) {
            //Tính số ngày giữa hai mốc thời gian
            long SoNgayHanTra = (listTheMuon.get(i).getTra().getTime().getTime() - Now.getTime().getTime()) / (24*60*60*1000);
            if(SoNgayHanTra<=SoNgay) {
                System.out.println(listTheMuon.get(i).toString());
                check=true;
            }
        }
        if(check==false) {
            System.out.println("Không tìm thấy phiếu mượn có hạn sắp trả");
        }
    }

    public void InPhieuMuonDaQuaHan() {
        System.out.println("-------------------Danh sách phiếu mượn đã quá hạn-------------------");
        boolean check=false;
        Calendar Now=Calendar.getInstance();
        for(int i=0;i<listTheMuon.size();i++) {
            //Tính số ngày giữa hai mốc thời gian
            long SoNgayHanTra = (listTheMuon.get(i).getTra().getTime().getTime() - Now.getTime().getTime()) / (24*60*60*1000);
            if(SoNgayHanTra<0) {
                System.out.println(listTheMuon.get(i).toString());
                check=true;
            }
        }
        if(check==false) {
            System.out.println("Không tìm thấy phiếu mượn đã quá hạn");
        }
    }
}