package ArrayListObject;

import java.util.ArrayList;

public class tampilData {
	ArrayList<Barang> simpan;
	

	public tampilData() {
		super();
		this.simpan = new ArrayList<Barang>();
	}
	
	public void isiData(int id, String kodeBarang, String namaBarang) {
		simpan.add(new Barang(id, kodeBarang, namaBarang));
	}
	
	public void showData() {
		for(Barang barang : simpan) {
			System.out.println("Id brg: "+barang.getId()+" Nama brg: "+barang.getNamaBarang()+" Kode brg: "+barang.getKodeBarang());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Barang br = new Barang(0, "a", "a");
//		System.out.println("Nama Barang "+br.getNamaBarang());
		
		tampilData td = new tampilData();
		td.isiData(1, "Rinso", "A01");
		td.isiData(2, "Sabun", "A02");
		td.isiData(3, "Shampoo", "A03");
		td.isiData(4, "Minyak Goreng", "A04");
		td.isiData(5, "Sepeda", "A05");
		
		td.showData();
	}

}
