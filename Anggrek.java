public class Anggrek extends Tumbuhan implements Taman{
    
    Anggrek(String nama_tumbuhan){
        super(nama_tumbuhan, 10, true);
    }
    
    public void berbunga(){
        System.out.println(nama_tumbuhan + " berfotosintesis");
        System.out.println("");
    }
    
    public void namaPemilik(){
        System.out.println("Nama Pemilik     : Jessica");
    }
    
    public void biaya_perawatan(){
        System.out.println("Biaya perawatan  : Rp. 500000");
    }
    
    public static void main(String[] args){
        Anggrek putih = new Anggrek("Anggrek Putih");
        putih.data();
        putih.berbunga();
        System.out.println("Nama Taman       : " + namaTaman);
        putih.namaPemilik();
        putih.biaya_perawatan();
        System.out.println("Biaya pupuk      : Rp. " + pupuk);
    }
}
    
