package ArrayListObject;

public class Barang {
	private int id;
	private String kodeBarang, namaBarang;
	public Barang(int id, String kodeBarang, String namaBarang) {
		super();
		this.id = id;
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
	}
	public int getId() {
		return id;
	}
	public String getKodeBarang() {
		return kodeBarang;
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	
//function setter getter
//setter -> function untuk set nilai
//getter -> fnction untuk tampil nilai
}
