import java.util.*;

/**
 * Created by Norbert on 2017-08-12.
 */
public class Race {

    public static void main(String[] args) {

        Collection<Dog> dogList = new LinkedList<>();
        dogList.add(new Dog("Burek", 8));
        dogList.add(new Dog("Andrzej", 5));
        dogList.add(new Dog("Adolf", 10));

        int totalDistance = 200;

        boolean isOver = false;

        int i=0;

        while (true){
            i++;
            Iterator<Dog> iterator = dogList.iterator();

            while (iterator.hasNext()) {
                Dog dog = iterator.next();

                int dogSpeed = dog.getSpeed();
                int currentDistance = dogSpeed * i;

                if (currentDistance >= totalDistance) {
                    System.out.println(String.format("The winner is %s", dog.getName()));
                    isOver = true;
                    break;
                }
            }

            if (isOver) {
                break;
            }

        }

    }
}
