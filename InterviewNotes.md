| Pattern | Popular Use Cases | Interview Concepts / Questions |
|---------|-------------------|-------------------------------|
| **Builder** | Creating complex objects (Car, House, HTTP Request, DTOs), immutable objects | Why Builder over constructors? Builder vs Factory, Director class, fluent interface, immutable objects |
| **Factory Method** | Creating objects without exposing instantiation logic (Notifications, Payments, Documents) | Factory vs Abstract Factory vs Builder, OCP, DIP, replacing `new`, runtime object creation |
| **Singleton** | Logger, Configuration, Cache, Thread Pool, Database Connection Manager | Thread-safe Singleton, Lazy vs Eager, Double-checked locking, Bill Pugh Singleton, breaking Singleton using reflection/serialization |
| **Abstract Factory** | Creating families of related objects (Windows/Mac UI, Vehicle factories, Theme factories) | Difference from Factory Method, family of objects, dependency injection, OCP |
| **Prototype** | Cloning expensive objects, game characters, document templates | Shallow vs Deep Copy, `Cloneable`, copy constructors, when cloning is better than `new` |
| **Adapter** | Integrating legacy APIs, third-party libraries, incompatible interfaces | Adapter vs Facade vs Decorator, Object Adapter vs Class Adapter, composition over inheritance |
| **Decorator** | Adding functionality dynamically (Java I/O Streams, Coffee example, Filters, Compression, Encryption) | Decorator vs Inheritance, Decorator vs Proxy, object wrapping, recursive decoration |
| **Proxy** | Lazy loading, Security, Caching, Remote Proxy, Logging, Hibernate Proxy | Proxy vs Decorator, Static vs Dynamic Proxy, JDK Dynamic Proxy, CGLIB Proxy, Spring AOP |
| **Facade** | Simplifying complex subsystems (Spring `JdbcTemplate`, Compiler, Payment Gateway) | Facade vs Adapter, reducing coupling, hiding subsystem complexity |
| **Observer** | Event listeners, Pub/Sub, GUI events, Notification systems, Stock prices | Push vs Pull model, Subject vs Observer, avoiding memory leaks, Java EventListener, synchronous vs asynchronous notifications |
| **Strategy** | Payment methods, Sorting algorithms, Compression algorithms, Driving strategies | Strategy vs State, replacing if-else, runtime algorithm selection, composition over inheritance |
| **Template Method** | Spring `JdbcTemplate`, Servlet lifecycle, Game framework, Report generation | Template vs Strategy, abstract class necessity, hook methods, Hollywood Principle |
| **Chain of Responsibility** | Exception handling, Logging, Authentication filters, Servlet Filters, Spring Security Filter Chain | Dynamic chain creation, constructor vs setter injection, stopping vs forwarding request, CoR vs Command |
| **Command** | Undo/Redo, Remote Control, Menu actions, Job queues, Task scheduling | Receiver, Invoker, Command, undo functionality, macro commands, Command vs Strategy |
| **State** | Vending Machine, ATM, Traffic Light, Media Player, Order Status | State vs Strategy, context/state relationship, state transitions, avoiding if-else |
| **Mediator** | Chat applications, Air Traffic Control, Auction System, GUI Dialogs | Mediator vs Observer, reducing coupling, centralized communication, cyclic dependency discussion |