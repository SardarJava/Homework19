import com.Peaksoft.*;

public class Main {
    public static void main(String[] args) {

        Oplata gostinica = new Gostinica(4, "Ulitsa Shopokova dom 34");
        Oplata kvartira = new Kvartira(2, "Ulitsa Ivana Franko dom 54, kvartira 12");
        Oplata obwaga = new Obwaga(3, "Ulitsa Bokonbaeva 47");
        System.out.println(gostinica);
        System.out.println(gostinica.platit() + "\n");
        System.out.println(kvartira);
        System.out.println(kvartira.platit() + "\n");
        System.out.println(obwaga);
        System.out.println(obwaga.platit() + "\n");

    }
}