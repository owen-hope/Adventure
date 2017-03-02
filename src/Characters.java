/**
 * Created by Owen on 3/2/2017.
 */
public class Characters {
    private static int health;
    String name;
    private int attackReg, attackSpecial, dodge;

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setName (String playerName) {
        this.name = playerName;
    }

    public String getName(){
        return name;
    }

    public void setAttackReg(int attackReg){
        this.attackReg = attackReg;
        this.dodge = dodge;

    }

    public int getAttackReg() {
        return attackReg;
    }

    public void setAttackSpecial(int attackSpecial) {
        this.attackSpecial = attackSpecial;
    }

    public int getAttackSpecial(){
        return attackSpecial;
    }

    public void setDodge(int dodge){
        this.dodge = dodge;
    }

    public int getDodge(){
        return dodge;
    }


}
