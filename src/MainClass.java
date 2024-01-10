import java.util.Scanner;

class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh và khối thi");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập khối thi (A/B/C): ");
                    String khoiThi = scanner.nextLine().toUpperCase();

                    System.out.print("Nhập số báo danh: ");
                    String soBaoDanh = scanner.nextLine();

                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();

                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    System.out.print("Nhập mức ưu tiên: ");
                    int mucUuTien = scanner.nextInt();

                    switch (khoiThi) {
                        case "A":
                            tuyenSinh.themMoiThiSinh(new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien));
                            break;
                        case "B":
                            tuyenSinh.themMoiThiSinh(new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien));
                            break;
                        case "C":
                            tuyenSinh.themMoiThiSinh(new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien));
                            break;
                        default:
                            System.out.println("Không hỗ trợ khối thi này.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập SBD để xem thông tin và khối thi của thí sinh: ");
                    String soBaoDanhHienThi = scanner.nextLine();
                    tuyenSinh.hienThiThongTinThiSinh(soBaoDanhHienThi);
                    break;
                case 3:
                    System.out.print("Nhập số báo danh cần tìm kiếm: ");
                    String soBaoDanhTimKiem = scanner.nextLine();
                    tuyenSinh.hienThiThongTinThiSinh(soBaoDanhTimKiem);
                    break;
                case 4:
                    System.out.println("Đã thoát khỏi chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
            }
        }
    }
}
