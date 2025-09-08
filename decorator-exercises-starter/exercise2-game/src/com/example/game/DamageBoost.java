package com.example.game;

public class DamageBoost extends CharacterDecorator{
    private int boostAmount;

    public DamageBoost(Character character, int boostAmount) {
        super(character);
        this.character = character;
        this.boostAmount = boostAmount;
    }

    @Override
    public void move() {
        System.out.println("Moving with speed " + getSpeed() + " using sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return character.getSpeed();
    }

    @Override
    public int getDamage() {
        return character.getDamage() + boostAmount;
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }
}
