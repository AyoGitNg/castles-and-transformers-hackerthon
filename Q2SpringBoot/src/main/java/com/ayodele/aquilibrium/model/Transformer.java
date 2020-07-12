package com.ayodele.aquilibrium.model;

import java.util.Objects;

public class Transformer  implements Comparable<Transformer> {

    private final String name;
    private final String type;
    private final int strength;
    private final int intelligence;
    private final int speed;
    private final int endurance;
    private final int rank;
    private final int courage;
    private final int firepower;
    private final int skill;

    public Transformer(String name, String type, int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.endurance = endurance;
        this.rank = rank;
        this.courage = courage;
        this.firepower = firepower;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getRank() {
        return rank;
    }

    public int getCourage() {
        return courage;
    }

    public int getFirepower() {
        return firepower;
    }

    public int getSkill() {
        return skill;
    }

    public int getOverallRating() {
        return (strength + intelligence + speed + endurance + firepower);
    }

    @Override
    public int compareTo(Transformer otherTransformer) {
        return this.getOverallRating() - otherTransformer.getOverallRating();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transformer that = (Transformer) o;
        return strength == that.strength &&
                intelligence == that.intelligence &&
                speed == that.speed &&
                endurance == that.endurance &&
                rank == that.rank &&
                courage == that.courage &&
                firepower == that.firepower &&
                skill == that.skill &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, strength, intelligence, speed, endurance, rank, courage, firepower, skill);
    }
}
