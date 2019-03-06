/**
 * Created by Konrad on 2015-06-21.
 * od_dnia - String - początek obowiązywania ostrzeżenia
 * do_dnia - String - koniec obowiązywania ostrzeżenia
 * Wydane otrzeżenia są typu int. 0 oznacza brak ostrzeżeń. 1,2,3 oznaczają kolejno
 * I, II, III stopień zagrożenia. Możliwe ostrzeżenia:
 * mróz, upał, wiatr, opady, burza, trąba powietrzna.
 */
public class MyComplexTypeOstrzezenia {
    private String od_dnia;
    private String do_dnia;
    private int mroz;
    private int upal;
    private int wiatr;
    private int opad;
    private int burza;
    private int traba;

    public String getOd_dnia() {
        return od_dnia;
    }

    public void setOd_dnia(String od_dnia) {
        this.od_dnia = od_dnia;
    }

    public String getDo_dnia() {
        return do_dnia;
    }

    public void setDo_dnia(String do_dnia) {
        this.do_dnia = do_dnia;
    }

    public int getMroz() {
        return mroz;
    }

    public void setMroz(int mroz) {
        this.mroz = mroz;
    }

    public int getUpal() {
        return upal;
    }

    public void setUpal(int upal) {
        this.upal = upal;
    }

    public int getWiatr() {
        return wiatr;
    }

    public void setWiatr(int wiatr) {
        this.wiatr = wiatr;
    }

    public int getOpad() {
        return opad;
    }

    public void setOpad(int opad) {
        this.opad = opad;
    }

    public int getBurza() {
        return burza;
    }

    public void setBurza(int burza) {
        this.burza = burza;
    }

    public int getTraba() {
        return traba;
    }

    public void setTraba(int traba) {
        this.traba = traba;
    }

    @Override
    public String toString() {
        return "MyComplexTypeOstrzezenia{" +
                "od_dnia='" + od_dnia + '\'' +
                ", do_dnia='" + do_dnia + '\'' +
                ", mroz=" + mroz +
                ", upal=" + upal +
                ", wiatr=" + wiatr +
                ", opad=" + opad +
                ", burza=" + burza +
                ", traba=" + traba +
                '}';
    }
}
