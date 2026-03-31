# screenmatch

# 📚 screenmatch — Java Studies & Practice

A collection of daily Java exercises, POO concepts, and mini-projects built during my learning journey as a self-taught backend developer.

---

## 🎯 About this repository

This repo documents my hands-on study process. Instead of just reading theory, I coded every concept — sometimes the same idea in multiple ways — until it clicked. It covers everything from basic OOP to a playable turn-based RPG built from scratch.

---

## 📂 Project Structure

```
src/
└── br.com/
    └── alura.screenmatch/
        ├── Animal/          # Inheritance and polymorphism (Animal, Cachorro, Gato)
        ├── calculos/        # Calculations, interfaces (Classificavel, FiltroRecomendacao)
        ├── Funcionario/     # Encapsulation and hierarchy (Funcionario, Desenvolvedor, Gerente)
        ├── HoraPratica/     # Practice exercises (converters, area calculators)
        ├── modelos/         # Data modeling (Filme, Serie, Episodio, Titulo)
        ├── principal/       # Entry points and list manipulation
        └── eduar.rpg/       # Turn-based RPG mini-game
```

---

## ⚔️ Highlight: Turn-Based RPG

The most complete mini-project in the repo. A terminal RPG game where you choose a hero and fight through a sequence of enemies.

**Concepts applied:**
- Object-oriented design with `Personagens` class (encapsulation, getters/setters)
- `ArrayList` for dynamic player/enemy management
- Game loop with turn-based logic
- Heal mechanic with limited uses
- Win/loss conditions

**How to run:**
1. Open the project in IntelliJ IDEA (or any Java IDE)
2. Navigate to `src/br/com/alura/screenmatch/eduar.rpg/Main.java`
3. Run `Main.java`
4. Choose your hero (1, 2 or 3) and fight!

**Sample gameplay:**
```
===== ESCOLHA SEU HERÓI =====
1 - Victor Lopes
2 - Joao Gabriel
3 - Eduardo Sonego

Um novo inimigo apareceu: Eduardo Ciudad
Sua vida: 100 | Vida do inimigo: 10000
1 - Atacar
2 - Curar (curas restantes: 5)
```

---

## 🧠 Concepts Covered

| Topic | Examples in this repo |
|---|---|
| Inheritance | `Animal → Cachorro / Gato`, `Funcionario → Gerente` |
| Encapsulation | Private fields with getters/setters throughout |
| Polymorphism | Method overriding across class hierarchies |
| Interfaces | `Classificavel`, `ConversaoFinanceira` |
| Collections | `ArrayList` usage in RPG and principal packages |
| Logic & Control Flow | Daily exercises across `HoraPratica` and `Treino.java` |
| Data Modeling | `Filme`, `Serie`, `Episodio`, `Titulo` with relationships |

---

## 🛠️ Tech

- **Language:** Java 17
- **IDE:** IntelliJ IDEA
- **Build:** No external dependencies — pure Java

---

## 👨‍💻 About

I'm Eduardo, a self-taught backend developer focused on Java and Spring Boot. This repo represents the foundation — the daily reps that built my understanding of OOP before moving on to APIs and frameworks.

- 🔗 [GitHub](https://github.com/educiudad)
- 💼 [LinkedIn](https://www.linkedin.com/in/eduardo-ciudad)