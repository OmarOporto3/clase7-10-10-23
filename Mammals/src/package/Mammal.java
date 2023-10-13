public abstract class Mammal
{
    private String commonName;

    public Mammal(String commonName)
    {
        this.commonName = commonName;
    }

    public abstract void feedThemselves();
    public abstract String getNoise();
    public abstract void movement();

    public void sleep()
    {
        System.out.println("It's tired so now is sleeping :3");
    }

    public void breath()
    {
        System.out.println("obtain oxygen from the atmosphere through its oxygens");
    }

    /**
     * @return the common name of the mammal
     */
    public String getName() {
        return commonName;
    }

}