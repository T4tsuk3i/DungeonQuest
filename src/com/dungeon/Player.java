package com.dungeon;

public class Player {
    String name;
    int health, attack, level, exp, expToNext;

    public Player(String n) {
        name = n;
        health = 100;
        attack = 20;
        level = 1;
        exp = 0;
        expToNext = 50; // starting requirement
    }

    public void showStats() {
        System.out.println("\n=== " + name + " ===");
        System.out.println("Level: " + level + " | HP: " + health + " | ATK: " + attack);
        System.out.println("EXP: " + exp + "/" + expToNext);
    }

    public void gainExp(int amount) {
        exp += amount;
        System.out.println("✨ Gained " + amount + " EXP!");
        if (exp >= expToNext) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        exp -= expToNext;
        expToNext += 25; // scaling requirement
        health += 20;
        attack += 5;
        System.out.println("⭐ Level Up! Now level " + level + "!");
    }

    public void attack(Monster m) {
        System.out.println(name + " attacks " + m.name + "!");
        m.health -= attack;
    }
}
