public class Observer
{
    public String listen(Mammal mammal)
    {
        String sound = mammal.getNoise();
        return ("El observador oyó al " + mammal.getName() + " el cual \"" + sound + "\"");

    }
}
