public class Bulto {
    private int id;
    private double volumen;
    private double peso;
    private boolean fragil;

    public Bulto(int id, double volumen, double peso, boolean fragil) {
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.fragil = fragil;
    }

    public Bulto(int id, double volumen, double peso) {
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.fragil = false;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public double getCoste() {
        return isFragil() ? getPeso() * 4 : getPeso();
    }
}
