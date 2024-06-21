public class Abone {

    //Doğalgaz abonesi
    public String isim;
    public int bakiye;
    public String sehir;

    public void dogalgazkullan(int miktar){
        if(miktar>bakiye){
            System.out.println("Yeterli bakiyeniz yok");
        }
        else {
            this.bakiye-=miktar;
            System.out.println("Kalan bakiyeniz : " + bakiye);
            if(this.bakiye<=0){
                System.out.println("En kısa sürede bakiye yükleyiniz");
            }
        }
    }

    public void bakiyeogren(){
        System.out.println("Bakiyeniz : " + bakiye);
    }

}
