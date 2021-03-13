import java.util.Scanner;
public class Latihan2{
	public static void main(String args[]){
		Scanner simpan = new Scanner(System.in);
		// variabel properties
		String nama = "";
		int usia = 0;
		System.out.print("Masukan Nama: ");
		nama = simpan.nextLine();
		System.out.print("Masukan Usia: ");
		usia = simpan.nextInt();

		// Kondisi
		if (usia >= 17){
			System.out.println("Kamu dewasa");
		}else{
			System.out.println("Kamu remaja");
		}
		// Output
		System.out.println("Nama kamu : " + nama);
		System.out.println("Usia kamu : " + usia);
	}
}
