package learnInterfaces;

public class MainIceCream {
    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("Strowberry");
        System.out.println("#1 main >>"+myIceCream);
        changeFlavor(myIceCream);
    }
    public static void changeFlavor(IceCream iceCream){
        //System.out.println("#1 main >>"+iceCream);
        iceCream = new IceCream("Vanilla");
        System.out.println("#2 main >>"+iceCream);
    }
}
