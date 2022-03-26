public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("Player " + i  + " is " + new Player().getSide());
        }
//        Invoker invoker = new Invoker();
//        invoker.setBaseHP(400);
//        invoker.setStrength(15);
//        invoker.setMinDamage(37);
//        invoker.setMaxDamage(43);
//        invoker.setIntelligence(10);
//        invoker.level(4);
//        invoker.totalIntelligence(10);
//        System.out.println("Invoker HP: " + invoker.setMaxHp());
//        invoker.attack();
//        System.out.println("Invoker HP: " + invoker.getCurrentHP());
//        invoker.attack();
//        System.out.println("Invoker HP: " + invoker.getCurrentHP());
//        invoker.attack();
//        System.out.println("Invoker HP: " + invoker.getCurrentHP());

        System.out.println(Side.getRadiantPlayers().size());
        System.out.println(Side.getDirePlayers().size());
    }
}
