public abstract class Mammal
{
    private String name;

    public Mammal(String name) 
    {
        this.name = name;
    }

    public abstract void feedThemselves();
    public abstract void makeNoice();
    public abstract void movement();

    public void sleep() 
    {
        System.out.println("Se cansa y se duerme :3");
    }
    
    public void breath() 
    {
        System.out.println("obtiene óxigeno del aire por sus pulmones");
    }

    public final String getName() 
    {
        return name;
    }
}