public class Dog extends Mammal
{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void feedThemselves()
    {
        System.out.println(getName() + "Come comida de humanos");
    }

    @Override
    public void movement()
    {
        System.out.println(getName() + "Corre o camina a cuatro patas agilmente");
    }

    @Override
    public String getNoise()
    {
        return (getName() + "Ladra para avertir de su disconformidad");
    }
}
