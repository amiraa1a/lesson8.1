package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
       int random = RPG_Game.random.nextInt(25)+1;

       setHealth(getHealth() + random);
       boss.setHealth(boss.getHealth() - random);

        //setDamage(getDamage()+ boss.getDamage()/2);
        System.out.println("Berserk applies " + getAbility() + random);
    }
}
