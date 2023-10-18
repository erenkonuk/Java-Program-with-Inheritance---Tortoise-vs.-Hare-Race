public class Tavsan extends Hayvan {

    public Tavsan(String isim) {
        super(isim);
    }

    @Override
    public void kos(int zar) {
        switch (zar){
            case 1:
            case 2:
                System.out.println(this.isim + " zipladi");
                this.konum += 2;
                break;
            case 3:
            case 4:
                System.out.println(this.isim + " yemek yiyior");
                break;
            case 5:
            case 6:
                System.out.println(this.isim + " uyuyakaldi");
                this.konum--;
                break;
        }
    }
}
