public class Invoker extends IntelligenceHeroes {
    @Override
    public void setMinDamage(int minDamage) {
        super.setMinDamage(minDamage);
    }

    @Override
    public void setMaxDamage(int maxDamage) {
        super.setMaxDamage(maxDamage);
    }

    @Override
    public void setIntelligence(int intelligence) {
        super.setIntelligence(intelligence);
    }

    @Override
    public int totalIntelligence(double intelligenceGrowth) {
        return super.totalIntelligence(intelligenceGrowth);
    }

    @Override
    public void attack() {
        if (canAttack()) {
            System.out.println("Attack damage: " + setDamage(getMinDamage(), getMaxDamage()));
            currentHP = currentHP - getDamage();
        }
        else System.out.println("Can't attack this");
    }
}