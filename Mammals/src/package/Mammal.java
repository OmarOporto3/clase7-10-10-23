public abstract class Mammal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    /**
    * Abstract Classes
    */
    public abstract void feedThemselves();
    public abstract String getNoise();
    public abstract void movement();

    //Métodos heredables por todos los mamíferos
    public void sleep() {
        System.out.println("Se cansa y se duerme :3");
    }
    
    public void breath() {
        System.out.println("obtiene óxigeno del aire por sus pulmones");
    }

    //Getter para el Unico atributo que tiene la clase mammal

    public String getName() {
        return name;
    }
}
