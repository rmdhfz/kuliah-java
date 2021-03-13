import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Latihan3{

        public static void main(String args[]){
        	
                DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

                formatRp.setCurrencySymbol("Rp. ");
                formatRp.setMonetaryDecimalSeparator('.');
                formatRp.setGroupingSeparator('.');
                kursIndonesia.setDecimalFormatSymbols(formatRp);

                Scanner simpan = new Scanner(System.in);
                int hargaPensil = 2000, hargaBuku   = 3000, hargaPenghapus = 1000, jumlahBarangYangDiBeli;
        	int total = 0, satuan = 0, pilihMenu = 0, uangBayar = 0, uangKurang = 0, sisaKembalian = 0;
        	String loop, barangYangDibeli;
                do {
                        System.out.println("=================");
                        System.out.println("::- Lapaku -::");
                        System.out.println("=================");
                        System.out.println("1. Pensil\t - " + kursIndonesia.format(hargaPensil));
                        System.out.println("2. Buku\t\t - " + kursIndonesia.format(hargaBuku));
                        System.out.println("3. Penghapus\t - " + kursIndonesia.format(hargaPenghapus));
                        System.out.println("=================");
                        System.out.print("Kamu mau Beli apa ? (1/2/3) ");
                        
                        pilihMenu = simpan.nextInt();
                        switch (pilihMenu){
                                case 1:
                                        total = total+hargaPensil;
                                        barangYangDibeli = "Pensil";
                                        break;
                                case 2:
                                        total = total+hargaBuku;
                                        barangYangDibeli = "Buku";
                                        break;
                                case 3:
                                        total = total+hargaPenghapus;
                                        barangYangDibeli = "Penghapus";
                                        break;
                                default:
                                        System.out.println("Pembelian kamu tidak diketahui :(");
                                        break;
                        }
                        System.out.print("Kamu mau beli lagi (y/n) ? ");
                        loop = simpan.next();
                } while (loop.equals("y") || loop.equals("Y"));

                /*struk area*/
                System.out.println("Informasi Belanja");
                System.out.println("----------------");
                System.out.println("Total Belanja: " + kursIndonesia.format(total));
                System.out.println("----------------");
                System.out.print("Masukan uang kamu:  ");

                uangBayar = simpan.nextInt();
                
                if (uangBayar <= total){
                        uangKurang = total - uangBayar;
                        System.out.println("Maaf, uang kamu kurang " + kursIndonesia.format(uangKurang));
                        System.out.println("Masukan uang sebesar " + kursIndonesia.format(uangKurang) + " untuk melanjutkan transaksi.");
                }else{
                        sisaKembalian = uangBayar - total;
                        System.out.println("Informasi Struk Lapaku Anda");
                        System.out.println("---------------------------------");
                        System.out.println("Selamat Pembayaran Berhasil");
                        System.out.println("Kembalian: " + kursIndonesia.format(sisaKembalian));
                }
        }
}
