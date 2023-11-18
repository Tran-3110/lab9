package Task2;

import java.time.LocalDateTime;

public class TapChi extends AnPham{
	private String tenTapChi;

	public TapChi(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien, String tenTapChi) {
		super(tieuDe, soTrang, namXB, tacGia, giaTien);
		this.tenTapChi = tenTapChi;
	}

	@Override
	public String loaiAnPham() {
		return "Tap chi";
	}
	
	// tìm sách xuất bản cách đây 10 năm
	public boolean sxCach10Nam() {
		LocalDateTime tg = LocalDateTime.now();
		return tg.getYear() - this.namXB == 10; 
	}

	public String getTenTapChi() {
		return tenTapChi;
	}

	@Override
	public String toString() {
		return "TapChi [tenTapChi=" + tenTapChi + ", tieuDe=" + tieuDe + ", soTrang=" + soTrang + ", namXB=" + namXB
				+ ", tacGia=" + tacGia + ", giaTien=" + giaTien + "]" +"\n";
	}
	
	public boolean chuaTenTapChi(String tenTapChi) {
		return this.getTenTapChi().equals(tenTapChi);
	}
	
	//Tap chi duoc xuat ban vao nam cho truoc
	public boolean xbVaoNam(int nam) {
		return this.namXB == nam;
	}
	
	
	

}
