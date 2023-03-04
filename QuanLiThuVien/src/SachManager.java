import java.util.ArrayList;
import java.util.Scanner;

public class SachManager {
    private ArrayList<Sach> sachArrayList = new ArrayList<Sach>();

    public ArrayList<Sach> getSachArrayList() {
        return sachArrayList;
    }

    public void themSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lương sách cần thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            System.out.println("Nhập số hiệu sách:");
            int soHieuSach = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập id sách:");
            String idSach = sc.nextLine();
            System.out.println("Nhập tên sách:");
            String tenSach = sc.nextLine();
            System.out.println("Nhập thể loại sách:");
            String theLoai = sc.nextLine();
            System.out.println("Nhập tên tác giả sách:");
            String tenTacGia = sc.nextLine();
            Sach s = new Sach(soHieuSach, idSach, tenSach, theLoai, tenTacGia);
            sachArrayList.add(s);
        }
    }
    public void timKiemIdSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sách cần tìm:");
        String idSach = sc.nextLine();
        boolean check = false;
        for(int i=0; i<sachArrayList.size(); i++){
            if(sachArrayList.get(i).getIdSach().equalsIgnoreCase(idSach)){
                check = true;
                System.out.println(sachArrayList.get(i).toString());
            }
        }
        if(check!= true){
            System.out.println("Không tìm thấy id sách trong danh sách");
        }
    }
    public void timKiemTenSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách cần tìm:");
        String tenSach = sc.nextLine();
        boolean check = false;
        for(int i=0; i<sachArrayList.size(); i++){
            if(sachArrayList.get(i).getTenSach().equalsIgnoreCase(tenSach)){
                check = true;
                System.out.println(sachArrayList.get(i).toString());
            }
        }
        if(check!= true){
            System.out.println("Không tìm thấy tên sách");
        }
    }
    public void xoaSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sách cần xóa:");
        String idSach = sc.nextLine();
        boolean check = false;
        for(int i=0; i<sachArrayList.size();i++){
            if(sachArrayList.get(i).getIdSach().equalsIgnoreCase(idSach)){
                sachArrayList.remove(i);
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Không tìm thấy id sách cần xóa");
        }
    }
    public void suaThongTinSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sách cần sửa:");
        String idSach= sc.nextLine();
        boolean tk = false;
        for(int i=0; i<sachArrayList.size(); i++){
            if(sachArrayList.get(i).getIdSach().equalsIgnoreCase(idSach)){
                tk = true;
                System.out.println("Nhập số hiệu sách:");
                int soHieuSach = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên sách:");
                String tenSach = sc.nextLine();
                System.out.println("Nhập thể loại sách:");
                String theLoai = sc.nextLine();
                System.out.println("Nhập tên tác giả sách:");
                String tenTacGia = sc.nextLine();
                sachArrayList.get(i).setSoHieuSach(soHieuSach);
                sachArrayList.get(i).setTenSach(tenSach);
                sachArrayList.get(i).setTheLoai(theLoai);
                sachArrayList.get(i).setTenTacGia(tenTacGia);
            }
        }
        if(tk != true){
            System.out.println("Không tìm thấy id sách cần sửa");
        }
    }
    public void inDanhSach(){
        for (int i=0; i<sachArrayList.size(); i++){
            System.out.println(sachArrayList.get(i).toString());
        }
    }

    public void sapXepId(){
        for(int i=0; i<sachArrayList.size(); i++){
            for(int j = i+1; j<sachArrayList.size(); j++){
                if(sachArrayList.get(i).getIdSach().compareTo(sachArrayList.get(j).getIdSach())>0){
                    Sach temp = sachArrayList.get(i);
                    sachArrayList.set(i, sachArrayList.get(j));
                    sachArrayList.set(j,temp);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo id");
    }

    public void sapXepTen(){
        for(int i=0; i<sachArrayList.size(); i++){
            for(int j = i+1; j<sachArrayList.size(); j++){
                if(sachArrayList.get(i).getTenSach().compareTo(sachArrayList.get(j).getTenSach())>0){
                    Sach temp = sachArrayList.get(i);
                    sachArrayList.set(i, sachArrayList.get(j));
                    sachArrayList.set(j,temp);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo tên");
    }

}
