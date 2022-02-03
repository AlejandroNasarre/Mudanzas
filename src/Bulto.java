public class Bulto {
    private int id;
    private double volumen;
    private double peso;
    private boolean fragil;
    private Boolean transportado = false;

    public Boolean isTransportado() {
        return transportado;
    }

    public void setTransportado() {
        this.transportado = true;
    }

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

    @Override
    public String toString() {
        return "Bulto{" +
                "id=" + id +
                ", volumen=" + volumen +
                ", peso=" + peso +
                ", fragil=" + fragil +
                '}';
    }
}
