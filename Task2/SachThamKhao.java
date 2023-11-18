package Task2;

import java.util.List;

public class SachThamKhao extends AnPham{
	private String linhVuc;
	private List<ChuongSach> dsChuongSach;
	public SachThamKhao(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien, String linhVuc,
			List<ChuongSach> dsChuongSach) {
		super(tieuDe, soTrang, namXB, tacGia, giaTien);
		this.linhVuc = linhVuc;
		this.dsChuongSach = dsChuongSach;
	}
	@Override
	public String loaiAnPham() {
		return "Sach tham khao";
	}
	
	// tìm chương sách nhiều trang nhất
	public int chuongNhieuTrangNhat() {
		int soTrangLN = 0;
		for (ChuongSach chuongSach : dsChuongSach) {
			if(chuongSach.getSoTrang() > soTrangLN) {
				soTrangLN = chuongSach.getSoTrang();
			}
		}
		return soTrangLN;
	}
	
	@Override
	public String toString() {
		return "SachThamKhao [linhVuc=" + linhVuc + ", dsChuongSach=" + dsChuongSach + ", tieuDe=" + tieuDe
				+ ", soTrang=" + soTrang + ", namXB=" + namXB + ", tacGia=" + tacGia + ", giaTien=" + giaTien + "]" +"\n";
	}
	
	
	

}
