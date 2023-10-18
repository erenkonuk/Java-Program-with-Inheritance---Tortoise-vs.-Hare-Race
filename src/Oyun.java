import java.util.Random;

public class Oyun {
    private int limit = 100;
    private Random rand;
    public Oyun(){
        this.rand = new Random();
    }
    public void oyunuBaslat(){
        Tavsan tavsan = new Tavsan("Rifki");
        Kaplumbaga kaplumbaga = new Kaplumbaga("Ayberk");
        //YARIŞ
        while (true){
            tavsan.kos(zarAt());
            kaplumbaga.kos(zarAt());
            if(tavsan.konum >= 100 || kaplumbaga.konum >= 100){
                System.out.println("Yaris sonlandi");
                break;
            }
            System.out.println("Tavsan konumu : "+tavsan.konum);
            System.out.println("Kaplumbaga konumu : "+kaplumbaga.konum);
        }
        if(tavsan.konum >= 100 && kaplumbaga.konum >= 100){
            System.out.println("Berabere");
        }
        else if(tavsan.konum >= 100){
            System.out.println("Tavsan kazandi");
        }
        else {
            System.out.println("Kaplumbaga kazandi");
        }
    }
    public int zarAt() {
        return rand.nextInt(6)+1;
    }
}
