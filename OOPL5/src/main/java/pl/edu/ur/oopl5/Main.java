package pl.edu.ur.oopl5;

public class Main {

    public static void main(String[] args) {
        Ksiazka ks1 = new Ksiazka("Ja sam",200,1997,50);
        System.out.println(ks1.toString());
        ks1.setCena(1);
        System.out.println(ks1.toString());
        Data data = new Data(2,2018,26);
        data.pokazData();
        data.przesunDatePrzód();
        data.pokazData();
        data.przesunDateTyl();
        data.pokazData();

    }
    
}
