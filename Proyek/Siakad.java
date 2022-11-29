import java.util.Scanner;
public class Siakad {
    static int jumlahData = 0;
    static Mahasiswa[] mahasiswa = new Mahasiswa[1000];

    public static void tambahData() {
        System.out.println("Silahkan tambah data");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM = ");
        String nim = scan.nextLine();
        System.out.print("Masukan Nama = ");
        String nama = scan.nextLine();
        mahasiswa[jumlahData] = new Mahasiswa();
        mahasiswa[jumlahData].setNim(nim);
        mahasiswa[jumlahData].setNama(nama);
        jumlahData = jumlahData + 1;
    }

    public static void tampilData() {
        System.out.println("Berikut data Anda");
        int i = 0;
        while (i<jumlahData) {
            System.out.println(mahasiswa[i].getNim()+"  "+mahasiswa[i].getNama());
            i++;
        }
    }

    public static void urutkanData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih algoritma pengurutan");
        System.out.println("1. EXCHANGE SORT");
        System.out.print("Pilih algoritma = ");
        int algo = scanner.nextInt();
        switch (algo) {
            case 1: {
                exchangeSort();
                break;
            }
        }
    }

    public static void exchangeSort() {
        for (int x = 0; x<jumlahData; x++) {
            for (int y = x+1; y<jumlahData; y++) {
                if (mahasiswa[x].getNim().compareTo(mahasiswa[y].getNim())>=1) {
                    Mahasiswa temp = mahasiswa[x];
                    mahasiswa[x] = mahasiswa[y];
                    mahasiswa[y] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Menu Siakad");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Urutkan Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu = ");
            menu = scan.nextInt();
            if (menu==1) {
                tambahData();
            } else if (menu==2) {
                tampilData();
            } else if (menu==3) {
                urutkanData();
            }
        } while (menu!=4);
    }
}
