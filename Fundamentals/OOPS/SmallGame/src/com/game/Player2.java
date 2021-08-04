package com.game;

public class Player2 extends Player1{
    private int health ;
    private int armourHealth = 100;
    private boolean isArmour;

    public Player2(String name , String weapon , int health ,  boolean armour){
        super(name , weapon , health);
        this.isArmour = armour;
        this.health  = health;

    }

    @Override
    public void damageByGun1() {
        if(isArmour){
            this.armourHealth -= 30;
            if(this.armourHealth <= 0){
                System.out.println(getName()+" Armour is broken by your opponent");
            }else{
                System.out.println("Armour health is reduced."+" Remaining: "+this.armourHealth);
            }
        }

        if(this.armourHealth <= 0 || ! isArmour()) {
            this.health -= 30;
            if (this.health <= 0) {
                System.out.println(getName() + " is DEAD");
            } else {
                System.out.println("Got hit Health is reduced by 30" + ". Remaining: " + this.health);
            }
        }

    }


    @Override
    public void damageByGun2() {
        if(isArmour){
            this.armourHealth -= 50;
            if(this.armourHealth<= 0){
                System.out.println(getName()+" Armour is broken by your opponent");
            }else{
                System.out.println("Armour health is reduced."+" Remaining: "+this.armourHealth);
            }
        }
        if(this.armourHealth <= 0 || ! isArmour()) {
            this.health -= 50;
            if (this.health <= 0) {
                System.out.println(getName() + " is DEAD");
            } else {
                System.out.println("Got hit Health is reduced by 30" + ". Remaining: " + this.health);
            }
        }
    }


    public boolean isArmour() {
        return isArmour;
    }


}
