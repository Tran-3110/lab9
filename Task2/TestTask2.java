package Task2;

import java.util.ArrayList;
import java.util.List;

public class TestTask2 {
	public static void main(String[] args) {
		AnPham ap1 = new TapChi("A", 200, 2022, "Nguyen Van A", 20000, "abc");
		AnPham ap3 = new TapChi("A", 200, 2008, "Nguyen Van A", 30000, "abc");
		
		ChuongSach cs1 = new ChuongSach("Chuong 1", 200);
		ChuongSach cs2 = new ChuongSach("Chuong 2", 100);
		ChuongSach cs3 = new ChuongSach("Chuong 3", 230);
		ChuongSach cs4 = new ChuongSach("Chuong 4", 34);
		
		List<ChuongSach> listCS1 = new ArrayList<>();
		listCS1.add(cs1);
		listCS1.add(cs2);
		listCS1.add(cs3);
		listCS1.add(cs4);
		AnPham ap2 = new SachThamKhao("t", 200, 2022, "a", 20000, "abc", listCS1);
		
		List<ChuongSach> listCS2 = new ArrayList<>();
		listCS2.add(cs1);
		listCS2.add(cs4);
		AnPham ap4 = new SachThamKhao("h", 200, 2009, "a", 20000, "abc", listCS2);
		
		System.out.println("Cung loai va tac gia: "+ap2.cungLoaiVaCungTG(ap4));
		System.out.println("La tap chi va xuat ban cach 10 nam: "+ap3.laTapChiVaXBcach10Nam());
		
		List<AnPham> dsAP = new ArrayList<>();
		dsAP.add(ap1);
		dsAP.add(ap2);
		dsAP.add(ap3);
		dsAP.add(ap4);
		DanhMucAnPham ds = new DanhMucAnPham(dsAP);
		
		System.out.println("Tong tien an pham: "+ds.tongTienAnPham());
		System.out.println("Sach co chuong nhieu trang nhat: "+ds.chuongSachNhieuTrangNhat());
		System.out.println("Chua ten tap chi: "+ds.chuaTapChi("abc"));
		System.out.println("Xuat ban vao nam 2022: "+ds.xb1NamTruoc(2022));
		
		System.out.println("Sau khi sap xep: ");
		ds.sapXep();
		System.out.println(ds);
		
		System.out.println("Thong ke so luong an pham: ");
		System.out.println(ds.thongKeSL());
		
	}
}
