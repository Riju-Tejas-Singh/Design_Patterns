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
---
## Proxy vs Decorator

| **Decorator** | **Proxy** |
|---------------|-----------|
| Adds new functionality to an object. | Controls access to an object. |
| Enhances behavior. | Protects, delays, caches, logs, or secures access. |
| Client usually wants the extra behavior. | Client is often unaware it's talking to a proxy. |
| Example: `MilkDecorator`, `SugarDecorator` for Coffee. | Example: `ProxyImage` lazily loads `RealImage`. |

### Memory Trick

- **Decorator = Enhance**
- **Proxy = Control**

### Same UML, Different Intent

Both use **composition**:

```text
Wrapper
   │
   ▼
Real Object
```

- **Decorator:** Adds behavior before/after delegating to the real object.
- **Proxy:** Decides whether/how the real object should be accessed.

### Interview One-liner

> **Decorator extends an object's behavior, whereas Proxy controls access to an object without changing its core behavior.**
---
## Static Proxy vs Dynamic Proxy

| **Static Proxy** | **Dynamic Proxy** |
|------------------|-------------------|
| Proxy class is written manually. | Proxy class is generated at runtime. |
| One proxy class per interface/object. | One proxy implementation can work for many interfaces. |
| More boilerplate code. | Less boilerplate, more flexible. |
| Compile-time implementation. | Runtime implementation using reflection. |

### Static Proxy

You write the proxy yourself.

```java
Image image = new ProxyImage(new RealImage());
```

### Dynamic Proxy

The JVM generates the proxy.

```java
MyService proxy = (MyService) Proxy.newProxyInstance(...);
```

### Common Uses

**Static Proxy**
- Lazy loading, Access control, Caching, Logging

**Dynamic Proxy**
- Spring AOP, `@Transactional`, Security, Logging

### Interview One-liner

> **Static Proxy is manually coded for a specific interface, whereas Dynamic Proxy is generated at runtime using reflection, allowing one proxy implementation to intercept calls for multiple interfaces.**

### Java Interview Note

- **JDK Dynamic Proxy** → Works only with **interfaces**.
- **CGLIB Proxy** → Creates proxies by subclassing **concrete classes** (used by Spring when no interface exists).
---
## Facade vs Adapter

| **Facade** | **Adapter** |
|------------|-------------|
| Provides a new, simpler interface. | Converts one interface into another. |
| Client uses the Facade instead of interacting with many subsystem classes. | Client continues using the expected interface without knowing about the adaptee. |
| Focuses on **simplifying usage**. | Focuses on **compatibility**. |
| Usually wraps **multiple** classes. | Usually wraps **one** class. |

### Memory Trick

- **Facade = Simplify**
- **Adapter = Convert**

### Interview One-liner

> **Facade simplifies interaction with a complex subsystem, whereas Adapter converts one interface into another so incompatible classes can work together.**