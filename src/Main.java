
public class Main {
    public static void main(String[] args) {

        Abone abone = new Abone();
        abone.isim = "kaan";
        abone.bakiye = 200;
        abone.sehir = "izmit";
        abone.dogalgazkullan(10);

        gelismisAbone gelismisAbone = new gelismisAbone("kaan",250,"izmit");
        gelismisAbone.bakiye_ogren();

    }
}