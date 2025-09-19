package com.dungeon;

public class Dungeon {
    public static Monster generate(int level, int defeats) {
        System.out.println("\n🌌 Entering Dungeon Level " + level);

        if (level <= 5) {
            System.out.println("🟢 Easy Dungeon");
        } else {
            System.out.println("🔴 Hard Dungeon");
        }
        return Monster.create(level);
    }
}
