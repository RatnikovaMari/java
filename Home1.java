package Human;

import Human.Human;

import javax.swing.*;
import java.util.Random;

public class home1 {
    private static Object Treadmill;
    private static Object Wall;

    public static void main(String[] args) {
        Random random = new Random();
        Actions[] actions = new Actions[3];


        int distance = random.nextInt(20);
        int height = random.nextInt(20);
        Human human = new Human("Eva", 20, 20);
        Cat cat = new Cat("Koks", 20, 20);
        Robot robot = new Robot(" 011011011", 20, 20);

        Barriers[] barriers = new Barriers[8];


        boolean isTreadmill;
        for (int i = 0; i < actions.length; i++) {
            distance = random.nextInt(20);
            isTreadmill = random.nextBoolean();
            if (isTreadmill) {
                Treadmill = new Treadmill("Treadmill" + i, distance);
            } else {
                Wall = new Wall("Wall" + i, distance);
            }
        }

        for (int i = 0; i < barriers.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                barriers[j].moving(actions[i]);
                if (result) {
                    break;

                }
            }
            if (result) {
                System.out.println("Yes!!");
            } else {
                System.out.println("No!!");
            }
        }

    }
}

