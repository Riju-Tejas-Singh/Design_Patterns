# Design Patterns Classification

## 1. Creational Design Patterns

### Purpose

> **How do we create objects?**

These patterns are concerned with **object creation**.

Instead of writing:

```java
new Car();
```

they provide better ways to create objects.

### Simple Analogy

You're opening a restaurant.

Instead of customers going into the kitchen and cooking food themselves (`new`), they simply place an order.

The kitchen decides how to prepare it.

That's a **Creational Design Pattern**.

### One-line Memory

> **Creational = Object Creation**

---

## 2. Structural Design Patterns

### Purpose

> **How do we organize or connect objects/classes?**

Once objects are created, these patterns help us build larger structures by composing them.

### Simple Analogy

You have Lego blocks.

- Creational patterns make the blocks.
- Structural patterns tell you how to connect the blocks.

### One-line Memory

> **Structural = Object Organization / Composition**

---

## 3. Behavioral Design Patterns

### Purpose

> **How do objects communicate and collaborate?**

These patterns define how objects interact, exchange information, and share responsibilities.

### Simple Analogy

You have employees in a company.

- Structural patterns decide **who sits where**.
- Behavioral patterns decide **how they communicate**.

### One-line Memory

> **Behavioral = Object Interaction**

---

# The Complete Picture

Imagine you're building a house.

## Step 1: Creational

Buy or manufacture the materials.

```text
Bricks
Doors
Windows
```

↓

Objects are created.

---

## Step 2: Structural

Arrange them into

```text
Rooms
Walls
Roof
```

↓

Objects are connected.

---

## Step 3: Behavioral

People move into the house.

Now define:

- Who talks to whom?
- Who answers the door?
- Who cooks?
- Who cleans?

↓

Objects interact.

---

# Easy Interview Table

| Category | Main Question | Memory Trick |
|----------|---------------|--------------|
| **Creational** | How are objects created? | Object Creation |
| **Structural** | How are objects/classes organized? | Object Composition / Structure |
| **Behavioral** | How do objects communicate? | Object Interaction / Behavior |

---

# Quick Memory Trick

- 🏗️ **Creational** → Build the objects.
- 🧩 **Structural** → Arrange the objects.
- 💬 **Behavioral** → Make the objects communicate.

Or simply remember:

> **Create → Connect → Communicate**

- **Creational** → Create Objects
- **Structural** → Connect Objects
- **Behavioral** → Communicate Between Objects