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

    public int viajes() {
        int viajes = 0;
        boolean todoTransportado = false;
        while (!todoTransportado) {
            todoTransportado = true;
            for (int i = 0; i < bultos.size(); i++) {
                if (!(bultos.get(i).isTransportado())) {
                    todoTransportado = false;
                }
            }
            if (!todoTransportado) {
                for (int i = 0; i < bultos.size(); i++) {
                    if (camion.cabeBulto(bultos.get(i)) && !(bultos.get(i).isTransportado())) {
                        camion.addBulto(bultos.get(i));
                        bultos.get(i).setTransportado();
                    }
                }
                camion.vaciaCamion();
                viajes += 2;
            }
        }
        return viajes - 1;
    }
}
