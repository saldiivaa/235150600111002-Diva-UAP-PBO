public class Stoberi extends Tanaman implements Perawatan  {

    public Stoberi(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
        masaHidup = 60;
        berbuah = 150;
        perkembangan = 35/100;
    }

    @Override
    public void treatment() {
       setPerkembangan(getPerkembangan()+ (5/100));
    }

    @Override
    public void berkembang() {
       if (getProsesBerbuah() >= getBerbuah()) {
           setBerbuah(getBerbuah() + 1);
           return;
       } else if (getProsesBerbuah() == getBerbuah()) {
        setBerbuah(getBerbuah());
         return;
       } else if (getProsesBerbuah() > getBerbuah()) {
       
       }
    }
    
}
