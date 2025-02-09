import java.util.List;

public class Character {
    private final AttackStrategy attackStrategy;
    private final List<DefenseStrategy> defenseStrategies;

    public Character(AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}