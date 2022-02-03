public class Main {
    public static void main(String[] args) {
        Bulto objeto1 = new Bulto(1, 5, 5);
        Bulto objeto2 = new Bulto(2, 5, 5);
        Bulto objeto3 = new Bulto(3, 5, 5);
        Bulto objeto4 = new Bulto(4, 5, 5);
        Bulto objeto5 = new Bulto(5, 5, 5);
        Camion camion1 = new Camion("123232F", 10, 10);
        Mudanza mudanza1 = new Mudanza(1, 20, camion1);
        mudanza1.addBulto(objeto1);
        mudanza1.addBulto(objeto2);
        mudanza1.addBulto(objeto3);
        mudanza1.addBulto(objeto4);
        mudanza1.addBulto(objeto5);
        System.out.println(mudanza1.coste());
    }
}
