public class Observer {

    public void listen(Mammal mammal) {

        String sound = mammal.getNoice();
        System.out.println("El observador oyó al " + mammal.getName() + " el cual \"" + sound + "\"");
        
    }
}