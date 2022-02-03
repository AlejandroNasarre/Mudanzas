import java.util.LinkedList;
import java.util.List;

public class Mudanza {
    private int id;
    private double distancia;
    private Camion camion;

    List<Bulto> bultos = new LinkedList<>();

    public Mudanza(int id, double distancia, Camion camion) {
        this.id = id;
        this.distancia = distancia;
        this.camion = camion;
    }

    public void addBulto(Bulto bulto) {
        bultos.add(bulto);
    }

    public double coste() {
        double coste = 2 * distancia * viajes();
        for (int i = 0; i < bultos.size(); i++) {
            coste += bultos.get(i).getCoste();
        }
        return coste;
    }

    public void cargaCamion(List<Bulto> bultos) {
        List<Bulto> bultosCopia = new LinkedList<>(bultos);
        for (Bulto bulto : bultosCopia) {
            if (camion.cabeBulto(bulto)) {
                camion.addBulto(bulto);
                bultos.remove(bulto);
            }
        }
    }

    public int viajes() {
        int viajes = 0;
        List<Bulto> bultosCopia = new LinkedList<>(bultos);
        while (!bultosCopia.isEmpty()) {
            cargaCamion(bultosCopia);
            viajes += 2;
            camion.vaciaCamion();
        }
        return viajes-1;
    }
}
