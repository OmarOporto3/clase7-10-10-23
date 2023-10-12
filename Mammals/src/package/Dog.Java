public class Dog extends Mammal{

    public Gazelle(String name) {
        super(name);
    }    

    //Realiza los "COMPORTAMIENTOS" normales de los mamiferos pero que se realizan de distinta forma por animal

    @Override
    public void feedThemselves(){
        System.out.println( getName() +"Come comida de humanos" );
    }

    @Override
    public void makeNoise(){
        System.out.println( getName() + "Ladra para avertir de su disconformidad" );
    }

    @Override
    public void movement(){
        System.out.println( getName() + "Corre o camina a cuatro patas agilmente" );
    }
}