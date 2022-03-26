public class IntelligenceHeroes extends Heroes{
    @Override
    public void setMinDamage(int minDamage) {
        super.setMinDamage(minDamage + getIntelligence());
    }

    @Override
    public void setMaxDamage(int maxDamage) {
        super.setMaxDamage(maxDamage + getIntelligence());
    }

    @Override
    public int setDamage(int minDamage, int maxDamage) {
        damage = (int) Math.floor((Math.random() * (maxDamage - minDamage)) + minDamage + getIntelligence());
        return damage;
    }
}
