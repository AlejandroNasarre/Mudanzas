import java.util.LinkedList;
import java.util.List;

public class Camion {
    private String matricula;
    private double volumen;
    private double peso;
    List<Bulto> bultos = new LinkedList<>();

    public Camion(String matricula, double volumen, double peso) {
        this.matricula = matricula;
        this.volumen = volumen;
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolumenOcupado() {
        double volumenOcupado = 0;
        for (int i = 0; i < bultos.size(); i++)
            volumenOcupado += bultos.get(i).getVolumen();
        return volumenOcupado;
    }

    public double getPesoOcupado() {
        double pesoOcupado = 0;
        for (int i = 0; i < bultos.size(); i++)
            pesoOcupado += bultos.get(i).getPeso();
        return pesoOcupado;
    }

    public void addBulto(Bulto bulto) {
        if (cabeBulto(bulto)) {
            bultos.add(bulto);
        }
    }

    public boolean cabeBulto(Bulto bulto) {
        boolean hayVolumen = getVolumenOcupado() + bulto.getVolumen() <= getVolumen();
        boolean hayPeso = getPesoOcupado() + bulto.getPeso() <= getPeso();
        if (hayVolumen && hayPeso) {
            return true;
        }
        return false;
    }

    public void vaciaCamion() {
        this.bultos = new LinkedList<>();
    }
}
