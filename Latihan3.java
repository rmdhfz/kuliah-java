import java.util.Scanner;
public class Latihan3{
	public static void main(String args[]){
		Scanner simpan = new Scanner(System.in);
		int hargaPensil = 2000;
		int hargaBuku   = 3000;
		int hargaPenghapus = 1000;
		int total = 0, satuan = 0, pilihMenu = 0, uangBayar = 0, uangKurang = 0, sisaKembalian = 0;
		String loop;

		System.out.println("=================");
                System.out.println("Lapaku");
                System.out.println("1. Pensil = " + hargaPensil);
                System.out.println("2. Buku   = " + hargaBuku);
                System.out.println("3. Penghapus = " + hargaPenghapus);
                System.out.println("=================");

		System.out.print("Kamu mau Beli apa ? (1/2/3) ");
                pilihMenu = simpan.nextInt();
                        switch (pilihMenu){
                                case 1:
                                        total = total+hargaPensil;
                                        System.out.println("====== STRUK BELANJA KAMU ======");
                                        System.out.println("Kamu beli pensil harganya : Rp. " + total);
                                        System.out.println("Total yang harus kamu bayar: Rp. " + total);
                                        System.out.println("================================");
                                        break;
                                case 2:
                                        total = total+hargaBuku;
                                        System.out.println("====== STRUK BELANJA KAMU ======");
                                        System.out.println("Kamu beli buku harganya : Rp. " + total);
                                        System.out.println("Total yang harus kamu bayar: Rp. " + total);
                                        System.out.println("================================");
                                        break;
                                case 3:
                                        total = total+hargaPenghapus;
                                        System.out.println("======= STRUK BELANJA KAMU =======");
                                        System.out.println("Kamu beli penghapus harganya : Rp. " + total);
                                        System.out.println("Total yang harus kamu bayar: Rp. " + total);
                                        System.out.println("==================================");
                                        break;
                                default:
                                        System.out.println("Pembelian kamu tidak diketahui :(");
                                        break;
                        }

		System.out.print("Kamu mau beli lagi (y/n) ?");
		loop = simpan.next();

		for (loop = "y"; loop.equals("y");){
			System.out.println("=================");
	                System.out.println("Lapaku");
        	        System.out.println("1. Pensil = " + hargaPensil);
                	System.out.println("2. Buku   = " + hargaBuku);
                	System.out.println("3. Penghapus = " + hargaPenghapus);
                	System.out.println("=================");
			System.out.print("Kamu mau Beli apa ? (1/2/3) ");
                        pilihMenu = simpan.nextInt();
                        switch (pilihMenu){
                                case 1:
                                        total = total+hargaPensil;
                                        System.out.println("====== STRUK BELANJA KAMU ======");
                                        System.out.println("Kamu beli pensil harganya : Rp. " + total);
                                        System.out.println("Total yang harus kamu bayar: Rp. " + total);
                                        System.out.println("================================");
                                        break;
                                case 2:
                                        total = total+hargaBuku;
                                        System.out.println("====== STRUK BELANJA KAMU ======");
                                        System.out.println("Kamu beli buku harganya : Rp. " + total);
                                        System.out.println("Total yang harus kamu bayar: Rp. " + total);
                                        System.out.println("================================");
                                        break;
                                case 3:
                                        total = total+hargaPenghapus;
                                        System.out.println("======= STRUK BELANJA KAMU =======");
                                        System.out.println("Kamu beli penghapus harganya : Rp. " + total);
                                        System.out.println("Total yang harus kamu bayar: Rp. " + total);
                                        System.out.println("==================================");
                                        break;
                                default:
                                        System.out.println("Pembelian kamu tidak diketahui :(");
                                        break;
                        }
                        System.out.print("Kamu mau beli lagi ? (y/n) ");
                        loop = simpan.next();
		}
		System.out.println("Total Belanjaan Kamu adalah: Rp. " + total);
		System.out.print("Masukan uang kamu : ");
		uangBayar = simpan.nextInt();
		if (uangBayar <= total){
			uangKurang = total - uangBayar;
			System.out.println("Uang kamu kurang" + uangKurang);
		}else{
			sisaKembalian = uangBayar - total;
			System.out.println("Pembayaran anda: LUNAS");
			System.out.println("Kembalian anda: Rp. " + sisaKembalian);
		}
	}
}
