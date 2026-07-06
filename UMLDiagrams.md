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

---

#### Proxy

```text
                          Client
                             │
                             ▼
                          Subject
                       <<interface>>
                    +------------------+
                    | + request()      |
                    +------------------+
                           ▲
                 ┌─────────┴─────────┐
                 │                   │
          +--------------+    +----------------+
          | RealSubject  |    |     Proxy      |
          +--------------+    +----------------+
          | + request()  |    | - realSubject  |
          +--------------+    +----------------+
                               | + request()   |
                               +----------------+
                                       │
                                       │ delegates
                                       ▼
                                 RealSubject
```

---

#### Strategy

```text
                         Context
                  +----------------------+
                  | - strategy           |
                  +----------------------+
                  | + setStrategy()      |
                  | + executeStrategy()  |
                  +----------------------+
                           │
                           │ uses
                           ▼
                        Strategy
                     <<interface>>
                  +----------------------+
                  | + execute()          |
                  +----------------------+
                           ▲
                ┌──────────┴──────────┐
                │                     │
      +------------------+   +------------------+
      | ConcreteStrategyA|   | ConcreteStrategyB|
      +------------------+   +------------------+
      | + execute()      |   | + execute()      |
      +------------------+   +------------------+
```

---

#### Observer

```text
                         Subject
                     <<interface>>
               +------------------------+
               | + attach()             |
               | + detach()             |
               | + notifyObservers()    |
               +------------------------+
                          ▲
                          │
                 +----------------------+
                 | ConcreteSubject      |
                 +----------------------+
                 | - observers          |
                 | - state              |
                 +----------------------+
                 | + setState()         |
                 | + getState()         |
                 +----------------------+
                          │
                          │ notifies
                          ▼
                       Observer
                    <<interface>>
                  +------------------+
                  | + update()       |
                  +------------------+
                          ▲
               ┌──────────┴──────────┐
               │                     │
      +------------------+   +------------------+
      | ConcreteObserverA|   | ConcreteObserverB|
      +------------------+   +------------------+
      | + update()       |   | + update()       |
      +------------------+   +------------------+
```

---

#### Template Method

```text
                    AbstractClass
                    <<abstract>>
             +------------------------+
             | + templateMethod()     |  <<final>>
             | # step1()              |
             | # step2()              |
             | # step3()              |
             +------------------------+
                         ▲
              ┌──────────┴──────────┐
              │                     │
      +----------------+    +----------------+
      | ConcreteClassA |    | ConcreteClassB |
      +----------------+    +----------------+
      | + step2()      |    | + step2()      |
      | + step3()      |    | + step3()      |
      +----------------+    +----------------+
```
