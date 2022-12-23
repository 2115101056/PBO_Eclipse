package id.ac.undiksha.siak.entities;

public class Manusia {
	private String 	nama;
	private boolean	jenisKelamin; //0 perempuan 1 laki-laki
	private String 	alamat;
	
	public Manusia () {
		this.setNama("<Nama belum diisi>");
//		this.setJenisKelamin("<Jenis Kelamin belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
	}

	public Manusia(String nama, boolean jenisKelamin, String alamat) {
		super();
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
	}



	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Jenis Kelamin: " + 
		(jenisKelamin ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	
}