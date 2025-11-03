public class Pato implements  Volador, Nadador{

    @Override
    public void volar() {
        System.out.println("el pato esta volando");
    }

    @Override
    public void nadar() {
        System.out.println("el pato esta nadadando");
    }
}
