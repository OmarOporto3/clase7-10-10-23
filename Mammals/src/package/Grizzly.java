public class Grizzly extends Mammal implements Hibernate{
    public Grizzly(String name) {
        super(name);
    }    

    //Realiza los "COMPORTAMIENTOS" normales de los mamiferos pero que se realizan de distinta forma por animal
    @Override
    public void feedThemselves(){
        System.out.println("Caza animales cercanos");
    }

    @Override
    public void makeNoice(){
        System.out.println("Ruge de manera estrepitosa");
    }

    @Override
    public void movement(){
        System.out.println("Corre o camina a cuatro patas");
    }

    //Realiza los "Comportamientos" genéricos e iguales de los mamíferos, pero esto desde la clase abstracta

    //Realiza un "comportamiento (Método)" cuasi-único para algunos mamíferos
    @Override
    public void hibernate(){
        System.out.println("Duerme durante el invierno y sobrevive si comio lo suficiente #animoOSO");
    }


}
