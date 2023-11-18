package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanhMucAnPham {
	private List<AnPham> dsAnPham;

	public DanhMucAnPham(List<AnPham> dsAnPham) {
		this.dsAnPham = dsAnPham;
	}
	
	//Tính tổng tiền của tất các ấn phẩm trong nhà sách
	public double tongTienAnPham() {
		double result = 0;
		for (AnPham anPham : dsAnPham) {
			result += anPham.getGiaTien();
		}
		return result;
	}
	
	//Tìm quyển sách tham khảo có chương sách nhiều trang nhất 
	public SachThamKhao chuongSachNhieuTrangNhat() {
		int max = 0;
		SachThamKhao result = null;
		for (AnPham anPham : dsAnPham) {
			if(anPham.loaiAnPham().equals("Sach tham khao")) {
				SachThamKhao stk = (SachThamKhao) anPham;
				if(stk.chuongNhieuTrangNhat() > max) {
					max = stk.chuongNhieuTrangNhat();
					result = stk;
				}
			}
		}
		return result;
	}
	
	//Tìm xem trong danh sách các ấn phẩm có chứa một tạp chí có tên cho trước 
	//hay không?
	public boolean chuaTapChi(String tenTapChi) {
		for (AnPham anPham : dsAnPham) {
			if(anPham.loaiAnPham().equals("Tap chi")) {
				if((((TapChi) anPham).chuaTenTapChi(tenTapChi))) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Lấy ra danh sách các tạp chí được xuất bản vào 1 năm cho trước
	public List<TapChi> xb1NamTruoc(int nam) {
		List<TapChi> result = new ArrayList<>();
		for (AnPham anPham : dsAnPham) {
			if(anPham.loaiAnPham().equals("Tap chi")) {
				TapChi tapChi = (TapChi) anPham;
				if(tapChi.xbVaoNam(nam)) result.add(tapChi);
			}
		}
		return result;
	}
	
	//Sắp xếp ấn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản (sử 
	//dụng interface Comparable hoặc Comparator)
	public void sapXep() {
		Collections.sort(dsAnPham, new Comparator<AnPham>() {
			@Override
			public int compare(AnPham o1, AnPham o2) {
				if(o1.getTieuDe().compareTo(o2.getTieuDe()) == 0) return o2.getNamXB() - o1.getNamXB();
				return o1.getTieuDe().compareTo(o2.getTieuDe());
			}
		});
	}
	
	//)Thống kê số lượng ấn phẩm theo năm xuất bản. Ví dụ 2020: 5, 2021: 10, … 
	//năm 2020 có 5 ấn phẩm, năm 2021 có 10 ấn phẩm
	public Map<Integer, Integer> thongKeSL() {
		Map<Integer, Integer> result = new HashMap<>();
		for (AnPham anPham : dsAnPham) {
			result.put(anPham.getNamXB(), result.getOrDefault(anPham.getNamXB(), 0)+1);
		}
		return result;
	}

	@Override
	public String toString() {
		return "DanhMucAnPham [dsAnPham=" + dsAnPham + "]";
	}
	
	
	
}
