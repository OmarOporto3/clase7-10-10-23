public class Main {
    public static void main(String[] args)
    {
        Grizzly bear = new Grizzly("Bear");
        Gazelle gazelle = new Gazelle("venadillo");
        Observer human = new Observer();

        bear.feedThemselves();
        gazelle.feedThemselves();
        bear.hibernate();
        bear.movement();

        String action =human.listen(bear);
        System.out.println(action);
    }
}
