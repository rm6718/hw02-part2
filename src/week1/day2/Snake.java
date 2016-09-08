package week1.day2;

/**
 * Created by reeva on 9/7/16.
 */
public class Snake extends Reptile {
    public Snake() {
        this.name = "Snake";
    }
    @Override
    public void makeSound() {
        System.out.println("Sssssssss!");
    }
}