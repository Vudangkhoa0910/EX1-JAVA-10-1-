import java.util.ArrayList;

class TuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh;

    public TuyenSinh() {
        danhSachThiSinh = new ArrayList<>();
    }

    public void themMoiThiSinh(ThiSinh thiSinh) {
        danhSachThiSinh.add(thiSinh);
        System.out.println("Thêm mới thành công!");
    }

    public void hienThiThongTinThiSinh(String soBaoDanh) {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.soBaoDanh.equals(soBaoDanh)) {
                thiSinh.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh có số báo danh " + soBaoDanh);
    }
}