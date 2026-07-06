# Common Interview Concepts

## Push vs Pull (Observer Pattern)

| Push | Pull |
|------|------|
| Subject sends data to observers | Observer fetches data from subject |
| Simpler observers | More flexible observers |
| May send unnecessary data | Fetches only required data |

**Memory:**
- **Push** → Subject **pushes** data.
- **Pull** → Observer **pulls** data.

---

## Strategy vs State

| Strategy | State |
|----------|-------|
| Changes **algorithm** | Changes **behavior based on state** |
| Client chooses implementation | Context/object changes implementation |
| Implementations are independent | States are connected via transitions |
| Example: Payment methods | Example: Vending Machine |

**Memory:**
- **Strategy** → *How should I do this?* (Choose an algorithm)
- **State** → *What state am I in?* (Behavior changes automatically)

---

## Composition vs Inheritance

| Composition | Inheritance |
|-------------|-------------|
| **Has-a** relationship | **Is-a** relationship |
| Reuses behavior by containing objects | Reuses behavior by extending classes |
| More flexible | Less flexible |
| Behavior can change at runtime | Behavior is fixed at compile time |
| Preferred in most designs | Use only for true "is-a" relationships |

**Memory:**
- **Composition** → *Reuse by containing objects* (`Car has an Engine`)
- **Inheritance** → *Reuse by extending classes* (`Dog is an Animal`)

> **Design Principle:** Prefer **Composition over Inheritance** because it provides better flexibility, loose coupling, and easier maintenance.

---

## Builder vs Constructors

| Builder | Constructors |
|---------|--------------|
| Ideal for many optional parameters | Suitable for few parameters |
| Readable and self-documenting | Long constructors become hard to read |
| Avoids telescoping constructors | Often leads to constructor overloading |
| Supports immutable objects | Harder to build immutable complex objects |
| Step-by-step object creation | All values must be provided at once |

**Memory:**
- **Builder** → *Build complex objects step by step.*
- **Constructor** → *Create simple objects in one shot.*

> **Why Builder?** It improves **readability**, **maintainability**, and **flexibility**, especially when an object has many optional parameters.