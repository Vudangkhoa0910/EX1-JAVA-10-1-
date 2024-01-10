class ThiSinhKhoiC extends ThiSinh {
    private String[] monThi = {"Văn", "Sử", "Địa"};

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: C");
        System.out.println("Môn thi: " + String.join(", ", monThi));
    }
}