public class Player2 extends Player1 {
    private int health;
    private boolean armour;

    public Player2(String name, String weapon,int health, boolean armour){
        super(weapon, weapon, health);
        this.health=health;
        this.armour=armour;
    }
    
    public void damageByGun1(){
        if (armour){
            this.health-=20;
            if(this.health<=0) this.health=0;
            System.out.println("Armour is on. Got hit by gun1.Health is reduce by 20."+"New health is"+this.health);
        }
        if (!armour){
            this.health-=30;
            if(this.health<=0) this.health=0;
            System.out.println("Armour is off. Got hit by gun1.Health is reduced by 30,"+"New health is "+this.health);
        }
        if(this.health==0){
            System.out.println(getName()+"is dead");
        }
    }
    
    public String getName() {
        return null;
    }

    public void heal(){
        super.heal();
    
    }
}

