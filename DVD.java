package Persewaan;

//subclass
public class DVD extends Product{
    protected double length;
    protected String rating;
    protected String studio;

    public DVD() {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 100;
        price =20000.0;
        length=300;
        rating="PG";
        studio="HGStudio";
    }

    public void print() {
        System.out.println("Total: "+number);
        System.out.println("Nama: "+name);
        System.out.println("Jumlah: "+quantity);
        System.out.println("Harga: "+price);
        System.out.println("Durasi: "+length);
        System.out.println("Rating: "+rating);
        System.out.println("Studio: "+studio);
    }
}
