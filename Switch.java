import java.text.DecimalFormat; import java.text.DecimalFormatSymbols; import java.util.Scanner; import java.util.*;
public class Switch{
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
                                carts.add("1 Pensil\t -> " + kursIndonesia.format(hargaPensil));
                                break;
                        case 2:
                                total = total+hargaBuku;
                                carts.add("1 Buku\t -> " + kursIndonesia.format(hargaBuku));
                                break;
                        case 3:
                                total = total+hargaPenghapus;
                                carts.add("1 Penghapus\t -> " + kursIndonesia.format(hargaPenghapus));
                                break;
                        default:
                                System.out.println("Pembelian tidak diketahui :(");
                                break;
                }

        }
}