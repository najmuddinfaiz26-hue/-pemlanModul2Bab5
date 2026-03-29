package modulbab5;
//Muhamad Faiz Najmuudin
//255150707111013
public class Aritmatika {

public void hitungPenjumlahan(int a,int b){
int nilai = a+b;
System.out.println("nilai penjumlahan adalah :"+nilai);

}

public static void hitungPerkalian(int a, int b) {
int nilai = a*b;
System.out.println("nilai perkalian adalah : "+nilai);

}
public static void hitungPengurangan(int a, int b){
int nilai = a-b;
System.out.println("nilai pengurangan adalah : "+nilai);

}

public double hitungPembagian(String nil, String nil2) {
    double a = Double.parseDouble(nil);
    double b = Double.parseDouble(nil2);
    if (b == 0) {
        System.out.println("Error: tidak bisa dibagi nol!");
        return 0;
    }
    double hasil = a / b;
    System.out.println("nilai pembagian adalah : " + hasil);
    return hasil;

    
}

}
