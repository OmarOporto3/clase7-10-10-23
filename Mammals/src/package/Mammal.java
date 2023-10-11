public abstract class Mammal{
    private String name;

    public Mammal(String name){
        this.name = name;
    };

    //En este punto creare los métodos abstractos que considero son heredables por los mamiferos pero no se aplican de la misma manera

    public abstract void feedThemselves();
    public abstract void makeNoice();
    public abstract void movement();

    /*  En esta parte colocare metodos heredados por todos los mamiferos, aunque no necesariamente se realicen de manera similar para fines del proyecto
    se considerara que si lo hacen */

    public void sleep() {
        System.out.println("Se cansa y se duerme :3");
    };
    
    public void breath(){
        System.out.println("obtiene óxigeno del aire por sus pulmones");
    };

    //Getter para el Unico atributo que tiene la clase mammal

    public String getName()
    {
        return name;
    };
}