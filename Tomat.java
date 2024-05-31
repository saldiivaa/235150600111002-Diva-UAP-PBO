public class Tomat extends Tanaman implements Perawatan {
    public Tomat(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
        masaHidup = 100;
        berbuah = 100;
        perkembangan = 25/100;
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan()+ (5/100));
    }

    @Override
    public void berkembang() {
        if (getProsesBerbuah() >= getBerbuah()) {
            setBerbuah(getBerbuah() + 1);
        } else if (getProsesBerbuah() == getBerbuah()) {
            setBerbuah(getBerbuah());
             return;
        } else if (getProsesBerbuah() > getBerbuah()) {
           
        }
    }
    
}
