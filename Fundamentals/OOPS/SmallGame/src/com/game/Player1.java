package com.game;

public class Player1 {
    private String name;
    private String weapon;
    private int health;
    private int healCount = 4;

    Player1(String name , String weapon , int health ){

        this.weapon = weapon;
        this.name = name;
        if(health > 0 && health <= 100){
            this.health = health;
        }else{
            this.health = 100;
        }
    }  // constructor

    public void damageByGun1(){
        this.health -= 30;
        if(health <= 0){
            System.out.println(getName()+" is DEAD");
        }else {
            System.out.println("Got hit Health is reduced by 30" + ". Remaining: " + this.health);
        }
    }

    public void damageByGun2(){
        this.health -= 50;
        if(health <= 0){
            System.out.println(getName()+" is DEAD");
        }else {
            System.out.println("Got hit Health is reduced by 30" + ". Remaining: " + this.health);
        }
    }

    public void heal(){
        if(this.health <= 0){
            System.out.println("Player is DEAD Already ");
        }else{
            if(this.health == 100){
                System.out.println("Health is Already Full");
            }else {
                healCount--;
                this.health = 100;
                System.out.println("Health is Full Now");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth(){
        return health;
    }


}
