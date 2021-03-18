package TUAN03_Bai03;


public class DanhSachCD {
	CD[] dsCD ;
	private int sl = 0;
	/*public CD[] getDsCD() {
		return dsCD;
	}
	public void setDsCD(int n) {
		this.dsCD = n;
	}*/
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public void NhapDSCD(int n) {
		dsCD = new CD[n];
		for(int i = 0 ; i < n ; i++) {
			dsCD[i].Nhap1CD();
			sl++;
		}
	}
	
}
