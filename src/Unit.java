public class Unit {


    protected int minDamage;
    protected int maxDamage;
    protected int currentHP;
    protected int maxHp;
    protected int armor;
    protected int moveSpeed;
    protected int goldValue;
    protected int expValue;
    protected boolean attack;
    protected int damage;
    protected boolean isEnemy = true;

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int setDamage(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        damage = (int) Math.floor((Math.random() * (maxDamage - minDamage)) + minDamage);
        return damage;
    }

    public int getDamage(){
        return damage;
    }

    public void attack(){
    }

    public boolean canAttack(){
        return isEnemy();
    }

    public boolean isEnemy() {
        return isEnemy;
    }
}
