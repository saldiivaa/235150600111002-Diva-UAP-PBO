public class Persik extends Tanaman implements Perawatan {
    public Persik(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
        masaHidup = 180;
        berbuah = 250;
        perkembangan = 15/100;
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan()+ (2.5/100));
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
