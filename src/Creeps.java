public class Creeps extends Unit {

    private int expValue;
    private int goldValue;
    private int minDamage;
    private int maxDamage;
    private int hp;
    private int armor;

    public void rangedCreep(){
        minDamage = 21;
        maxDamage = 26;
        setDamage(minDamage, maxDamage);
    }

    @Override
    public int setDamage(int minDamage, int maxDamage) {
        return super.setDamage(minDamage, maxDamage);
    }
}

