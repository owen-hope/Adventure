import java.util.Random;

public class Fighter extends Character{

/* These new private variables are the unique attributes to what a fighter
   has. For example, a healer will not have a block, that is why
   it is not in the Character class. Fighters can block, so we instantiate it here.
*/

    protected double block;
    protected boolean didItHit = false;


    Fighter(String name,
            double health, double attackReg,
            double maxHealth, double attackSpec, double maxAccuracy, double tempAccuracy, double block)
    {
            super(name,health,      attackReg,
                       maxHealth,   attackSpec,
                       maxAccuracy, tempAccuracy);
            this.block = block;
    }

// This rage mode will/should always be constantly "watched" after every attack.
// In other words, this function should always be on
    public void rageMode(Fighter x)
    {
        double checkHealth = 0;
        checkHealth = x.maxHealth-x.health;  // For example, if my max health is 100 and I now have 80... Its safe to say I
        double increaseAttack = checkHealth; // lost 20hp. So if I lose 20hp, my attack dmg is increase by 20
        x.setAttackReg(x.attackReg+increaseAttack);
    }
//    *****Every ATTACK should somehow, one way or another, affect stamina, accuracy, and health.*****




/*  When using this attack:
    user dmg temporarily increases by 30
    user accuracy temporarily decreases by 15
    enemy hp decreased by 30*/
    public void smash(Fighter x, Character y)
    {
        x.tempAccuracy = 80;
        if (tempAccuracy > (int) (Math.random() * 100 + 1)) {   // Is the random number higher than accuracy?
            x.attackReg = attackReg + 30;           //What is the difference between this
//          x.setAttackReg(x.getAttackReg()+30);      and this?
            y.health -= x.attackReg;        // Enemy health goes down
            x.attackReg -= 30;              // Revert attackReg stat back to normal except stamina and health
            updateInfo(x,y);}
        else
            System.out.printf("%s's smash attack MISSED!\n", x.getName());
    }


// This is a basic regular attack every character will hit with.
// Dmg and accuracy will depend on what class they are.









    public void hit(Fighter x, Character y)
    {
        tempAccuracy = 95;                      // starting accuracy
        if (tempAccuracy > (int) (Math.random() * 100 + 1)) {
            y.health -= x.attackReg;            // Enemy loses ____ hp
            updateInfo(x,y);}                   // sout display their hp info
        else
            System.out.printf("%s's smash attack MISSED!\n", x.getName());
    }













}
