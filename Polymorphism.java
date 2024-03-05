public class Polymorphism {
    
    public static void main(String[] args){
        Standard S[] = new Standard[3];
        S[0] = new Standard();
        S[1] = new Deluxe();
        S[2] = new Suite();
        
        String[] namaTipeKamar = {"Standard", "Deluxe", "Suite"};
        
        for (int i = 0; i < 3; i++){
            System.out.println("");
            System.out.println("Tipe Kamar          : " + namaTipeKamar[i]);
            System.out.println("Harga sebelum pajak : Rp. " + S[i].gettotalharga());
         
            S[i].hargapajak();
        
            System.out.println("Harga setelah pajak : Rp. " + S[i].gettotalharga());
            System.out.println("");
        }
    }
}
