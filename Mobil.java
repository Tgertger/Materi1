public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public void setnoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getWarna() {
        return warna;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
    }

}