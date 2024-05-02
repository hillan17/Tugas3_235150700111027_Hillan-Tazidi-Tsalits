public class Main {
  public static void main(String[] args) {
    PegawaiTetap pegawaiTetap = new PegawaiTetap("Muhammad Farhan", "4365374734", 5000000.0);
    PegawaiHarian pegawaiHarian = new PegawaiHarian("Hillan Junior", "6437375645", 20000.0, 240);
    PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Jo dan Med", "6969696969", 50000.0, 360);
    Sales sales = new Sales("Alvian Von Sheylong", "0986756357", 80, 12500.0);
    Sales sales1 = new Sales("Anang Septiawan", "0857373983", 100, 21500.0);


    Pegawai[] pegawai = new Pegawai[5];
    pegawai[0] = pegawaiTetap;
    pegawai[1] = pegawaiHarian;
    pegawai[2] = pegawaiHarian1;
    pegawai[3] = sales;
    pegawai[4] = sales1;

    System.out.println("Informasi dan Gaji Pegawai");
    System.out.println("=============================");
    for (Pegawai pegawaiSekarang : pegawai){        
      if (pegawaiSekarang instanceof PegawaiTetap){
        PegawaiTetap pegawai1 = (PegawaiTetap) pegawaiSekarang;
        System.out.println(pegawaiSekarang);
        System.out.println("Upah\t\t: " + pegawai1.gaji());
        System.out.println("Pendapatan\t: Rp " + (int)pegawai1.gaji());
        System.out.println("-----------------------------");

      } else if (pegawaiSekarang instanceof PegawaiHarian){
        PegawaiHarian pegawai2 = (PegawaiHarian) pegawaiSekarang;
        System.out.println(pegawaiSekarang);
        System.out.println("Upah/jam\t: Rp " + pegawai2.getUpahPerJam());
        System.out.println("Total jam kerja\t: " + pegawai2.getTotalJam());
        System.out.println("Pendapatan\t: Rp " + (int)pegawai2.gaji());
        System.out.println("-----------------------------");

      } else if (pegawaiSekarang instanceof Sales){
        Sales pegawai3 = (Sales) pegawaiSekarang;
        System.out.println(pegawaiSekarang);
        System.out.println("Total Penjualan\t: " + pegawai3.getPenjualan());
        System.out.println("Besaran Komisi\t: " + pegawai3.getKomisi());
        System.out.println("Pendapatan\t: Rp " + (int)pegawai3.gaji());
        System.out.println("-----------------------------");
      }
    }
  }
}
