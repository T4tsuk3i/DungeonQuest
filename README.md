# 🏰 Dungeon Quest  

<p align="center">
  <img src="src/resources/LoL.jpg" width="200" alt="League of Legends Logo">
</p>

A simple **terminal-based RPG** built in **Java**.  
Created as a **student learning project** covering Java basics, OOP, file I/O, and Git/GitHub workflows.  

***

## 🎮 Features
- ⚔️ **Turn-based combat** between hero and monsters  
- 👤 **Player leveling system** with EXP scaling  
- 👹 **3 monster types** (Goblin, Orc, Dragon)  
- 📈 **Monster difficulty increases** every 3 defeats  
- 🟢 **Easy dungeon (levels 1–5)** → train & level up  
- 🔴 **Hard dungeon (levels 6–15)** → real challenge  
- 💾 **Save & Load system** (progress persistence via file I/O)  
- 🌐 **GitHub project workflow** with version tagging  

***

## 📂 Project Structure

DungeonQuest/  
└── src/  
  └── dungeon/  
    ├── GameMain.java  # Main entry, menu system  
    ├── Player.java    # Hero stats, EXP, leveling  
    ├── Monster.java   # Enemies with scaling  
    ├── Dungeon.java   # Level generation  
    ├── Battle.java    # Combat loop  
    └── GameSave.java  # Save & load system  

***

## 🛠️ Tech Used
- **Java** (OOP, loops, Random, File I/O)  
- **Git & GitHub** (version control, commits, tagging)  
- **Terminal-based gameplay**  

***

## 🚀 How to Run
1. Clone the repository:  
   ```bash
   git clone https://github.com/<username>/DungeonQuest.git
   cd DungeonQuest
   ```

2. Compile the code:  
   ```bash
   javac src/dungeon/*.java
   ```

3. Run the game:  
   ```bash
   java -cp src dungeon.GameMain
   ```

***

## 🔧 Git Workflow

- Initial commit: Version 0.1 Beta (GameMain setup)  
- Final commit: Version 1.0 Full Release (complete game)  
- Release tagging:  
  ```bash
  git tag -a v1.0 -m "Dungeon Quest Full Release"
  git push origin v1.0
  ```

***

## 🎯 Learning Outcomes
By building this game, students learn:  
✅ Java basics – classes, objects, loops, conditionals  
✅ OOP concepts – constructors, methods, encapsulation  
✅ Game logic – leveling, scaling, turn-based combat  
✅ File I/O – saving & loading progress  
✅ Version control – Git workflow & GitHub releases  

***

## 🖼️ Screenshots (Terminal Output)


```
🏰 Welcome to Dungeon Quest 🏰

=== MENU ===
1. Create Character
2. Explore Dungeon
3. Save Game
4. Load Game
5. Exit

Enter hero name: Aria
=== Aria ===
Level: 1 | HP: 100 | ATK: 20
EXP: 0/50
```

***

## 📜 License
This project is free to use for educational purposes.  
Feel free to fork, modify, and expand into your own RPG!

***

👉 Just copy this into a file named `README.md` in the root of your repo.
