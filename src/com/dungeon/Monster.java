package com.dungeon;

public class Monster {
    String name;
    int health, attack;

    // base scaling
    private static int extraHealth = 0;
    private static int extraAttack = 0;

    public Monster(String n, int h, int a) {
        name = n; health = h + extraHealth; attack = a + extraAttack;
    }

    public void attack(Player p) {
        System.out.println(name + " attacks!");
        p.health -= attack;
    }

    // Cycle monsters: Goblin -> Orc -> Dragon
    public static Monster create(int level) {
        int type = (level - 1) % 3;
        if (type == 0) return new Monster("Goblin", 40, 10);
        if (type == 1) return new Monster("Orc", 60, 15);
        return new Monster("Dragon", 80, 20);
    }

    public static void increaseDifficulty() {
        extraHealth += 10;
        extraAttack += 3;
    }
}
