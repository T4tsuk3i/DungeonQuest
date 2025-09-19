package com.dungeon;

import java.io.*;

public class GameSave {
    public static void saveGame(Player p, int level, int defeats) {
        try (FileWriter w = new FileWriter("save.txt")) {
            w.write(p.name + "\n");
            w.write(p.health + "\n");
            w.write(p.attack + "\n");
            w.write(p.level + "\n");
            w.write(p.exp + "\n");
            w.write(p.expToNext + "\n");
            w.write(level + "\n");
            w.write(defeats + "\n");
            System.out.println("💾 Game saved!");
        } catch (Exception e) {
            System.out.println("Save failed");
        }
    }

    public static Object[] loadGame() {
        try (BufferedReader r = new BufferedReader(new FileReader("save.txt"))) {
            String name = r.readLine();
            Player p = new Player(name);
            p.health = Integer.parseInt(r.readLine());
            p.attack = Integer.parseInt(r.readLine());
            p.level = Integer.parseInt(r.readLine());
            p.exp = Integer.parseInt(r.readLine());
            p.expToNext = Integer.parseInt(r.readLine());
            int level = Integer.parseInt(r.readLine());
            int defeats = Integer.parseInt(r.readLine());
            System.out.println("📂 Game loaded!");
            return new Object[]{p, level, defeats};
        } catch (Exception e) {
            System.out.println("Load failed");
            return null;
        }
    }
}

