package com.dungeon;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player hero = null;
        int level = 1; // game level
        int monsterDefeats = 0; // track defeats for scaling

        System.out.println("🏰 Welcome to Dungeon Quest 🏰");

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Create Character");
            System.out.println("2. Explore Dungeon");
            System.out.println("3. Save Game");
            System.out.println("4. Load Game");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = in.nextInt();
            in.nextLine();

            if (choice == 1) {
                System.out.print("Enter hero name: ");
                String name = in.nextLine();
                hero = new Player(name);
                hero.showStats();
            } 
            else if (choice == 2) {
                if (hero == null) {
                    System.out.println("⚠️ Create a character first!");
                    continue;
                }
                Monster m = Dungeon.generate(level, monsterDefeats);
                boolean won = Battle.start(hero, m);
                if (won) {
                    monsterDefeats++;
                    if (monsterDefeats % 3 == 0) {
                        Monster.increaseDifficulty();
                        System.out.println("💥 Monsters have grown stronger!");
                    }
                    level++;
                }
            } 
            else if (choice == 3) {
                if (hero != null) GameSave.saveGame(hero, level, monsterDefeats);
                else System.out.println("⚠️ Nothing to save!");
            } 
            else if (choice == 4) {
                Object[] data = GameSave.loadGame();
                if (data != null) {
                    hero = (Player) data[0];
                    level = (int) data[1];
                    monsterDefeats = (int) data[2];
                }
            } 
            else if (choice == 5) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        in.close();
    }
}

