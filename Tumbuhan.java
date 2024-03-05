public abstract class Tumbuhan{
    
    protected String nama_tumbuhan;
    protected int jumlah_tumbuhan;
    protected boolean bisaCangkok;
    
    public Tumbuhan(String nama_tumbuhan, int jumlah_tumbuhan, boolean bisaCangkok){
        this.nama_tumbuhan = nama_tumbuhan;
        this.jumlah_tumbuhan = jumlah_tumbuhan;
        this.bisaCangkok = bisaCangkok;
    }
    
    abstract void berbunga();
    
    public void data(){
        System.out.println("Nama Tumbuhan    : " + nama_tumbuhan);
        System.out.println("Jumlah Tumbuhan  : " + jumlah_tumbuhan);
        System.out.println("Bisa di cangkok? : " + bisaCangkok);
        System.out.println("");
    }
    
}
