package com.example.game;

public class GoldenAura extends CharacterDecorator {
    private int boostAmount;

    public GoldenAura(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    public GoldenAura (Character character) {
        this(character, 10);
    }

    @Override
    public String getSprite() {
        return "Golden " + super.getSprite();
    }

    @Override
    public int getDamage() {
        return super.getDamage() + boostAmount;
    }
}
