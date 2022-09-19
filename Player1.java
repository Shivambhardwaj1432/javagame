public class Player1 {
    private String name;
    private String weapon;
    private int health ;
    public char[] getName;
    public char[] getHealth;
    public char[] getWeapon;

    public Player1(String string, String string2, int i) {
    }
    public void player1(String name, String weapon, int health)
    {
        this.name=name;
        this.weapon=weapon;
        if(health < 0 || health > 100){
            this.health=100;
        }else this.health=health;
    }
    public void damagedbyGun1(){
        this.health-=30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by Gun1. Health is reduced by 30"+".New health is "+ this. health);
        if(this.health==0){
            System.out.println(getName()+"is dead");
        }
    }
    public void damagedbyGun2(){
        this.health-=50;
        if (this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by gun2. Health is reduced by 50"+". New health is "+ this.health);
        if(this.health==0){
            System.out.println(getName()+"is dead");
        }
    }
    public void heal(){
        if(this.health<=0)System.out.println("Player is dead.Heal not possible");
        else{
            this.health=100;
            System.out.println("Health is"+this.health);
        }
    }

    public String getName(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String Weapon){
        this.weapon=Weapon;
    }
    public int getHealth(){
        return health;
    }
    public void sethealth(int health){
        this.health=health;
    }

}