public class Gazelle extends Mammal implements Migrate{

    public Gazelle(String name) {
        super(name);
    }

    @Override
    public void feedThemselves(){
        System.out.println("Come Hierba en la Sabana");
    }

    @Override
    public void makeNoise(){
        System.out.println("Hace un chirrido poco perceptible");
    }

    @Override
    public void movement(){
        System.out.println("Corre o camina a cuatro patas agilmente");
    }

    @Override
    public void migrate(){
        System.out.println("Se mueve de las planicies a los acuiferos (cuidado con los cocodrilos)");
    }
}
