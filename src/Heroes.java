public class Heroes extends Unit {

    private int strength;
    private int agility;
    private int intelligence;
    private static int exp;
    private int currentLevelExp = 500;
    private int totalExp;
    private final int totalMaxExp = 56045;
    private int maxExpForLevel;
    private int lvl;
    private int baseHP;
    private int baseMP;

    public double getBaseHP() {
        return baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public int setMaxHp() {
        maxHp = (int) (baseHP + strength * 20);
        currentHP = maxHp;
        return (int) Math.floor(maxHp);
    }

    public int getBaseMP() {
        return (int) baseMP;
    }

    public void setBaseMP(int baseMP) {
        this.baseMP = baseMP;
    }

    public int setMaxMP() {
        double maxMP = baseMP + intelligence * 12;
        return (int) Math.floor(maxMP);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }


    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int currentLevelExp() {
        if (currentLevelExp <= maxExpForLevel){
            currentLevelExp += exp;
        }
        else currentLevelExp = currentLevelExp - maxExpForLevel;
        return currentLevelExp;
    }

    public int totalExp(){
        totalExp += exp;
        return Math.min(totalExp, totalMaxExp);
    }

    public int maxExpForLevel() {
            return switch (lvl) {
                case 1 -> maxExpForLevel = 230;
                case 2 -> maxExpForLevel = 370;
                default -> maxExpForLevel;
            };
    }

    public int level (int lvl) {
        this.lvl = lvl;
        if (currentLevelExp >= maxExpForLevel()){
            return lvl++;
        }
        return lvl;
    }

    public int totalStrength (double strengthGrowth){
        strength = (int) (strength + Math.floor(strengthGrowth * (lvl - 1)));
        return (int) Math.floor(strength);
    }
    public double totalAgility (double agilityGrowth){
        agility = (int) (agility + Math.floor(agilityGrowth * (lvl - 1)));
        return Math.floor(agility);
    }
    public int totalIntelligence (double intelligenceGrowth){
        intelligence = (int) (intelligence + Math.floor(intelligenceGrowth * (lvl - 1)));
        return (int) Math.floor(intelligence);
    }
}
