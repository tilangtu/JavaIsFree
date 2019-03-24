
public class HienThiThongTin extends NhapThongTin {
	KhaiBaoDoiTuong run = new KhaiBaoDoiTuong();
	
	public void show() {
		nhapTT();
		run.setName(name);
		run.setAge(age);
		System.out.println("Name "+run.getName());
		System.out.println("Age "+run.getAge());
	}
}
