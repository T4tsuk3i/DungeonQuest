package com.dungeon;

import java.util.Scanner;

public class Battle {
    public static boolean start(Player p, Monster m) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n⚔️ Battle: " + p.name + " vs " + m.name);

        while (p.health > 0 && m.health > 0) {
            System.out.println("\n" + p.name + " HP: " + p.health + " | " + m.name + " HP: " + m.health);
            System.out.println("1.Attack  2.Run");
            int c = in.nextInt();

            if (c == 1) {
                p.attack(m);
                if (m.health <= 0) { 
                    System.out.println(m.name + " defeated! 🎉"); 
                    p.gainExp(30); 
                    return true; 
                }
                m.attack(p);
                if (p.health <= 0) { 
                    System.out.println("💀 You died!"); 
                    return false; 
                }
            } else {
                System.out.println("You ran away!");
                return false;
            }
        }
        return false;
    }
}
