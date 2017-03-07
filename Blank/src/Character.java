/*
THINGS NOT IMPLEMENTED - SAVED FOR LATER:
    SPEED(ATTACK SPEED OR RUN SPEED)
    ACCURACY
    LOCK-ON
 */

public class Character {
    protected String name;
    protected double health=100, attackReg=1,
                 maxHealth=100, attackSpec=1,
                 maxAccuracy=100, tempAccuracy=1;
    public Character(){}

    public Character(String name, double health, double attackReg,
                     double maxHealth, double attackSpec, double maxAccuracy, double tempAccuracy)
    {
        this.name = name;
        this.health = health;       this.maxHealth = maxHealth;
        this.attackReg = attackReg; this.attackSpec = attackSpec;
        this.maxAccuracy = maxAccuracy; this.tempAccuracy = tempAccuracy;
    }

// Getters and Setters
    public String getName() {
        return this.name;}
    public double getMaxHealth() {
        return this.maxHealth;}
    public double getHealth() {
        return this.health;}
    public double getAttackReg(){
        return this.attackReg;}
    public double getAttackSpec() {
        return this.attackSpec;}
    public double getMaxAccuracy() {
        return this.maxAccuracy;}
    public double getTempAccuracy() {
        return this.tempAccuracy;}




    public void setName(String x){
        this.name = x;}
    public void setHealth(double x){
        this.health = x;}
    public void setMaxHealth(double x){
        this.maxHealth = x;}
    public void setAttackReg(double x){
        this.attackReg = x;}
    public void setAttackSpec(double x){
        this.attackSpec = x;}
    public void setMaxAccuracy(double x){
        this.maxAccuracy = x;}
    public void setTempAccuracy(double x){
        this.tempAccuracy = x;}


    public void updateInfo(Character x, Character y)
    {
        System.out.printf("%s has %shp left.\nHowever,%s has %shp remaining", x.name, x.health, y.name, y.health);
    }
}
