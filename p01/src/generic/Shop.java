package generic;

public class Shop<X> {
    public X[] array;

    public Shop(X[] array) {
        this.array = array;
    }

    public void  printObject() {
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
    }





