class ThiSinhKhoiB extends ThiSinh {
    private String[] monThi = {"Toán", "Hóa", "Sinh"};

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: B");
        System.out.println("Môn thi: " + String.join(", ", monThi));
    }
}