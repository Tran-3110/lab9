package Task2;

public abstract class AnPham {
	protected String tieuDe;
	protected int soTrang;
	protected int namXB;
	protected String tacGia;
	protected double giaTien;
	public AnPham(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien) {
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXB = namXB;
		this.tacGia = tacGia;
		this.giaTien = giaTien;
	}
	//Phương thức xác định loại của ấn phẩm (Tạp chí hay Sách tham khảo)
	public abstract String loaiAnPham();
	
	//Phương thức kiểm tra ấn phẩm là tạp chí và có thời gian xuất bản cách đây 
	//(2021) 10 năm hay không
	public boolean laTapChiVaXBcach10Nam() {
		if(this.loaiAnPham().equals("Tap chi")) {
			TapChi tapChi = (TapChi) this;
			if(tapChi.sxCach10Nam()) {
				return true;
			}
		}
		return false;
	}
	
	//Phương thức kiểm tra hai ấn phẩm có cùng loại và cùng tác giả hay không
	public boolean cungLoaiVaCungTG(AnPham other) {
		return this.cungLoai(other) && this.cungTG(other);
	}
	
	public boolean cungLoai(AnPham other) {
		return this.loaiAnPham().equals(other.loaiAnPham());
	}
	
	public boolean cungTG(AnPham other) {
		return this.tacGia.equals(other.tacGia);
	}
	
	
	public double getGiaTien() {
		return giaTien;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public int getNamXB() {
		return namXB;
	}



}
