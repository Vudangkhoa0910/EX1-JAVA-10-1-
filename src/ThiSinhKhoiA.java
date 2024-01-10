class ThiSinhKhoiA extends ThiSinh {
    private String[] monThi = {"Toán", "Lý", "Hóa"};

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: A");
        System.out.println("Môn thi: " + String.join(", ", monThi));
    }
}