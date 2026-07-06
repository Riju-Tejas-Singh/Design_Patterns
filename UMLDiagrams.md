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
---

#### State

```text
                          Context
                  +----------------------+
                  | - state              |
                  +----------------------+
                  | + setState()         |
                  | + request()          |
                  +----------------------+
                           │
                           │ delegates
                           ▼
                         State
                     <<interface>>
                  +----------------------+
                  | + handle()           |
                  +----------------------+
                           ▲
               ┌───────────┴───────────┐
               │                       │
      +------------------+    +------------------+
      | ConcreteStateA   |    | ConcreteStateB   |
      +------------------+    +------------------+
      | + handle()       |    | + handle()       |
      +------------------+    +------------------+
```

---

#### Command

```text
                           Client
                              │
                              ▼
                          Command
                       <<interface>>
                    +------------------+
                    | + execute()      |
                    +------------------+
                             ▲
                             │
                    +----------------------+
                    | ConcreteCommand      |
                    +----------------------+
                    | - receiver           |
                    +----------------------+
                    | + execute()          |
                    +----------------------+
                             │
                             │ invokes
                             ▼
                          Receiver
                    +------------------+
                    | + action()       |
                    +------------------+

                              ▲
                              │
                              │ uses
                        +-------------+
                        |  Invoker    |
                        +-------------+
                        | - command   |
                        +-------------+
                        | + setCommand() |
                        | + executeCommand() |
                        +-------------+
```
---

#### Chain of Responsibility

```text
                        Handler
                     <<abstract>>
                +----------------------+
                | - nextHandler        |
                +----------------------+
                | + setNextHandler()   |
                | + handleRequest()    |
                +----------------------+
                          ▲
          ┌───────────────┼───────────────┐
          │               │               │
 +----------------+ +----------------+ +----------------+
 | ConcreteHandlerA | | ConcreteHandlerB | | ConcreteHandlerC |
 +----------------+ +----------------+ +----------------+
 | + handleRequest()| | + handleRequest()| | + handleRequest()|
 +----------------+ +----------------+ +----------------+
```

---

#### Abstract Factory

```text
                        AbstractFactory
                         <<interface>>
          +--------------------------------------+
          | + createProductA() : ProductA        |
          | + createProductB() : ProductB        |
          +--------------------------------------+
                         ▲
          ┌──────────────┴──────────────┐
          │                             │
+----------------------+      +----------------------+
| ConcreteFactoryA     |      | ConcreteFactoryB     |
+----------------------+      +----------------------+
| + createProductA()   |      | + createProductA()   |
| + createProductB()   |      | + createProductB()   |
+----------------------+      +----------------------+
          │        │                    │        │
          │        │                    │        │
          ▼        ▼                    ▼        ▼
     ProductA1 ProductB1          ProductA2 ProductB2
         ▲          ▲                 ▲          ▲
         │          │                 │          │
   +------------+ +------------+ +------------+ +------------+
   | ProductA   | | ProductB   | | ProductA   | | ProductB   |
   |<<interface>>| |<<interface>>| |<<interface>>| |<<interface>>|
   +------------+ +------------+ +------------+ +------------+
```

---

#### Prototype

```text
                        Prototype
                     <<interface>>
                +----------------------+
                | + clone()            |
                +----------------------+
                          ▲
             ┌────────────┴────────────┐
             │                         │
     +------------------+      +------------------+
     | ConcreteProtoA   |      | ConcreteProtoB   |
     +------------------+      +------------------+
     | + clone()        |      | + clone()        |
     +------------------+      +------------------+

                Client -----------------> Prototype
                               clones
```

---

#### Facade

```text
                           Client
                              │
                              ▼
                           Facade
                  +----------------------+
                  | + operation()        |
                  +----------------------+
                    │        │        │
          ┌─────────┘        │        └─────────┐
          ▼                  ▼                  ▼
    SubsystemA         SubsystemB         SubsystemC
 +---------------+   +---------------+   +---------------+
 | + operationA()|   | + operationB()|   | + operationC()|
 +---------------+   +---------------+   +---------------+
```

---

#### Mediator

```text
                         Mediator
                      <<interface>>
                  +----------------------+
                  | + notify()           |
                  +----------------------+
                           ▲
                           │
                  +----------------------+
                  | ConcreteMediator     |
                  +----------------------+
                  | - colleagueA         |
                  | - colleagueB         |
                  +----------------------+
                  | + notify()           |
                  +----------------------+
                    ▲                ▲
                    │                │
                    │                │
            +---------------+  +---------------+
            |  ColleagueA   |  |  ColleagueB   |
            +---------------+  +---------------+
            | - mediator    |  | - mediator    |
            +---------------+  +---------------+
            | + send()      |  | + send()      |
            | + receive()   |  | + receive()   |
            +---------------+  +---------------+
```