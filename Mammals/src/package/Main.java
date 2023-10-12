public class Main {
    public static void main(String[] args) {

        Grizzly oso = new Grizzly("Oso");
        Gazelle gacela = new Gazelle("venadillo");
        Observer humano = new Observer();
        
        oso.feedThemselves();
        gacela.feedThemselves();
        oso.hibernate();
        oso.movement();
        humano.listen(oso);
    }
}