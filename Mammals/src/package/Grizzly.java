public class Grizzly extends Mammal implements Hibernate {
    
    public Grizzly(String name) {
        super(name);
    }

    @Override
    public void feedThemselves() {
        System.out.println("Caza animales cercanos");
    }

    @Override
    public String getNoise() {
        return ("Ruge de manera estrepitosa");
    }

    @Override
    public void movement() {
        System.out.println("Corre o camina a cuatro patas");
    }

    @Override
    public void hibernate() {
        System.out.println("Duerme durante el invierno y sobrevive si comio lo suficiente #animoOSO");
    }
}
