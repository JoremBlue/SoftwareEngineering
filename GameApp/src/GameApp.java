import java.util.Arrays;
import java.util.List;

public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new SwingSword(), List.of(new Shield(), new Dodge(), new MagicBarrier()));
        Character wizard = new Character(new CastSpell(), List.of(new MagicBarrier()));
        Character archer = new Character(new ShootArrow(), List.of(new Dodge()));

        System.out.println("Knight:");
        knight.attack();
        knight.defend();

        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();

        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();
    }
}