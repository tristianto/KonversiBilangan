package tdh.konversi.demo;

public class KonversiAngka {
	
	String angka(int satuan){
 
		String[] huruf ={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
		String hasil="";
		
		if(satuan<12)
			hasil=hasil+huruf[satuan];
		else if(satuan<20)
			hasil=hasil+angka(satuan-10)+" Belas";
		else if(satuan<100)
			hasil=hasil+angka(satuan/10)+" Puluh "+angka(satuan%10);
		else
			hasil="Angka terlalu besar, harus kurang dari 100 !";
		
		return hasil;
		
	}
	
	/*========== EOC ==========*/
}