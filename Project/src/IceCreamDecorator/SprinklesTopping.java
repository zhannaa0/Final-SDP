package IceCreamDecorator;
import IceCreamFactory.*;

public class SprinklesTopping extends IceCreamDecorator{

    public SprinklesTopping(ProductManagment iceCream) {
        super(iceCream);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sprinkles added");
    }

    @Override
    public double getCost(){
        return super.getCost() + 50.0;
    }
}
