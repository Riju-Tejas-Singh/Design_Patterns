#### Singleton

```text
                    +------------------------------+
                    |          Singleton           |
                    +------------------------------+
                    | - instance : Singleton       |
                    +------------------------------+
                    | - Singleton()               |
                    | + getInstance() : Singleton |
                    | + businessMethod()          |
                    +------------------------------+
```
---

#### Factory Method

```text
                         Product
                      <<interface>>
                    +---------------+
                    | + operation() |
                    +---------------+
                           ▲
              ┌────────────┴────────────┐
              │                         │
       +---------------+         +---------------+
       | ProductA      |         | ProductB      |
       +---------------+         +---------------+


                         Creator
                      <<abstract>>
             +---------------------------+
             | + factoryMethod()         |
             +---------------------------+
                           ▲
              ┌────────────┴────────────┐
              │                         │
      +------------------+      +------------------+
      | CreatorA         |      | CreatorB         |
      +------------------+      +------------------+
      | + factoryMethod()|      | + factoryMethod()|
      +------------------+      +------------------+
              │                         │
              │ creates                 │ creates
              ▼                         ▼
          ProductA                  ProductB
```

---

#### Builder

```text
                        Product
                  +----------------------+
                  | - field1             |
                  | - field2             |
                  | - field3             |
                  +----------------------+
                  | - Product(Builder)   |
                  +----------------------+
                           ▲
                           │ builds
                           │
                  +----------------------+
                  | Builder              |
                  | <<static>>           |
                  +----------------------+
                  | + field1(...)        |
                  | + field2(...)        |
                  | + field3(...)        |
                  | + build()            |
                  +----------------------+
```

---

#### Adapter

```text
                         Client
                            │
                            ▼
                       Target
                   <<interface>>
                 +------------------+
                 | + request()      |
                 +------------------+
                          ▲
                          │
                    +-------------+
                    |   Adapter   |
                    +-------------+
                    | - adaptee   |
                    +-------------+
                    | + request() |
                    +-------------+
                          │
                          │ delegates
                          ▼
                     Adaptee
                 +------------------+
                 | + specificRequest() |
                 +------------------+
```

---

#### Decorator

```text
                        Component
                     <<interface>>
                  +------------------+
                  | + operation()    |
                  +------------------+
                           ▲
                  ┌────────┴────────┐
                  │                 │
        ConcreteComponent      Decorator
                               <<abstract>>
                         +----------------------+
                         | - component          |
                         +----------------------+
                         | + operation()        |
                         +----------------------+
                                   ▲
                                   │
                     ┌─────────────┴─────────────┐
                     │                           │
            ConcreteDecoratorA        ConcreteDecoratorB
```
