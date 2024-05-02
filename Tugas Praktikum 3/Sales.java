public class Sales extends Pegawai {
  private int penjualan;
  private double komisi;

  public Sales(String nama, String noKTP, int penjualan, double komisi){
    super(nama, noKTP);
    setPenjualan(penjualan);
    setKomisi(komisi);
  }

  public int getPenjualan(){
    return penjualan;
  }

  public double getKomisi(){
    return komisi;
  }

  public void setPenjualan(int penjualan){
    this.penjualan = penjualan;
  }

  public void setKomisi(double komisi){
    this.komisi = komisi;
  }

  public double gaji(){
    return getPenjualan() * getKomisi();
  }
}
