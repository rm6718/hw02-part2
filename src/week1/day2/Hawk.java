package week1.day2;

/**
 * Created by reeva on 9/7/16.
 */
public class Hawk extends Bird {
    public Hawk() {
        this.name = "Hawk";
    }

    @Override
    public void makeSound() {
        System.out.println("Cawwww!");
    }
}