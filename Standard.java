public class Standard {
    
    double harga;
    private double breakfast;
    
    Standard(){
        harga = 500000;
        breakfast = 150000;
        System.out.println("Harga kamar Rp. " + harga + " dan Add On Breakfast " + breakfast);
    }
    
    private double hitungharga(double harga, double breakfast){
        return harga + breakfast;
    }
    
   void hargapajak(){
        harga += 50000; 
   }
    
    void setbreakfast(double breakfast){
        this.breakfast = breakfast;
    }
    
    double gettotalharga(){
        return hitungharga(harga, breakfast);
    }
}

