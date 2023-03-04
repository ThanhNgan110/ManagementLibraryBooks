import java.util.Scanner;

public class main {
    public static void Menu(){
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ THƯ VIỆN---");
        System.out.println("---1. Quản lí sách              ---");
        System.out.println("---2. Quản lí phiếu mượn        ---");
        System.out.println("---3. Thoát                     ---");
    }

    public static void Menu1(){
        System.out.println("---  QUẢN LÝ SÁCH    ---");
        System.out.println("---  1. Thêm sách    ---");
        System.out.println("---  2. Xóa sách     ---");
        System.out.println("---  3. Sửa sách     ---");
        System.out.println("---  4. Tra cứu sách ---");
        System.out.println("---  5. In thông tin ---");
        System.out.println("---  6. Sắp xếp      ---");
        System.out.println("---  7. Thoát        ---");
    }

    public static void Menu2(){
        System.out.println("---  QUẢN LÝ PHIẾU MUỢN   ---");
        System.out.println("---  1. Thêm phiếu mượn   ---");
        System.out.println("---  2. Xóa phiếu mượn    ---");
        System.out.println("---  3. Sửa phiếu mượn    ---");
        System.out.println("---  4. Tra cứu phiếu mượn---");
        System.out.println("---  5. In thông tin      ---");
        System.out.println("---  6. Sắp xếp           ---");
        System.out.println("---  7. Thoát             ---");
    }

    public static void main(String[] args) {
        ManagerTheMuon managerTheMuon = new ManagerTheMuon();
        SachManager sachManager = new SachManager();
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            Menu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    boolean isExit1 = false;
                    while (!isExit1) {
                        Menu1();
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:{
                                sachManager.themSach();
                                break;
                            }
                            case 2:{
                                sachManager.xoaSach();
                                break;
                            }
                            case 3:{
                                sachManager.suaThongTinSach();
                                break;
                            }
                            case 4:{
                                System.out.println("1. Tra cứu theo tên sách");
                                System.out.println("2. Tra cứu theo id");
                                System.out.print("Nhập lựa chọn của bạn: ");
                                int choice2 = sc.nextInt();
                                switch (choice2) {
                                    case 1:{
                                        sachManager.timKiemIdSach();
                                        break;
                                    }
                                    case 2:{
                                        sachManager.timKiemTenSach();
                                        break;
                                    }
                                    default:
                                        System.out.println("Nhập sai lựa chọn");
                                        break;
                                }
                                break;
                            }
                            case 5:{
                                sachManager.inDanhSach();
                                break;
                            }
                            case 6:{
                                System.out.println("1. Sắp xếp theo tên sách");
                                System.out.println("2. Sắp xếp theo id");
                                System.out.print("Nhập lựa chọn của bạn: ");
                                int choice3 = sc.nextInt();
                                switch (choice3) {
                                    case 1:{
                                        sachManager.sapXepTen();
                                        break;
                                    }
                                    case 2:{
                                        sachManager.sapXepId();
                                        break;
                                    }
                                    default:
                                        System.out.println("Nhập sai lựa chọn");
                                        break;
                                }
                                break;
                            }
                            case 7:{
                                isExit1 = true;
                                break;
                            }
                            default:
                                System.out.println("Nhập sai lựa chọn");
                                break;
                        }
                    }
                    break;
                }
                case 2:{
                    boolean isExit2 = false;
                    while (!isExit2) {
                        Menu2();
                        System.out.print("Nhập lựa chọn của bạn: ");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:{
                                managerTheMuon.ThemPhieuMuon();
                                break;
                            }
                            case 2:{
                                managerTheMuon.XoaPhieu();
                                break;
                            }
                            case 3:{
                                managerTheMuon.SuaThongTinPhieu();
                                break;
                            }
                            case 4:{
                                System.out.println("1. Tra cứu theo mã sinh viên");
                                System.out.println("2. Tra cứu theo tên");
                                System.out.print("Nhập lựa chọn của bạn: ");
                                int choice3 = sc.nextInt();
                                switch (choice3) {
                                    case 1:{
                                        managerTheMuon.TimKiemPhieuTheoMaSV();
                                        break;
                                    }
                                    case 2:{
                                        managerTheMuon.TimKiemPhieuTheoTenSinhVien();
                                        break;
                                    }
                                    default:
                                        System.out.println("Nhập sai lựa chọn");
                                        break;
                                }
                                break;
                            }
                            case 5:{
                                System.out.println("1. In danh sách phiếu mượn");
                                System.out.println("2. In danh sách phiếu mượn sắp đến hạn trả");
                                System.out.println("3. In danh sách phiếu mượn đã quá hạn");
                                System.out.print("Nhập lựa chọn của bạn: ");
                                int choice3 = sc.nextInt();
                                switch (choice3) {
                                    case 1:{
                                        managerTheMuon.ListPhieuMuon();
                                        break;
                                    }
                                    case 2:{
                                        System.out.println("Nhập số ngày cho là sắp đến lúc trả: ");
                                        int soNgay = sc.nextInt();
                                        managerTheMuon.InPhieuMuonCoHanSapTra(soNgay);
                                        break;
                                    }
                                    case 3:{
                                        managerTheMuon.InPhieuMuonDaQuaHan();
                                        break;
                                    }
                                    default:
                                        System.out.println("Nhập sai lựa chọn");
                                        break;
                                }
                                break;
                            }
                            case 6:{
                                managerTheMuon.SapXepTheoTen();
                                break;
                            }
                            case 7:{
                                isExit2 = true;
                                break;
                            }
                            default:
                                System.out.println("Nhập sai lựa chọn");
                                break;
                        }
                    }
                    break;
                }
                case 3:{
                    isExit = true;
                    break;
                }
                default:
                    System.out.println("Nhập sai lựa chọn");
                    break;
            }
        }
    }
}
