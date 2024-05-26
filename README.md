# Java-Project
The Java project is a basic grocery wallet system that applies fundamental Object-Oriented Programming (OOP) concepts, showcasing the use of classes, objects, methods, and constructors. It manages customer accounts for a grocery store, enabling operations such as shopping and recharging the account balance.  
It manages customer accounts for a grocery store, enabling operations such as shopping and recharging the account balance.

**Application of OOP Concepts**

**Classes and Objects**
The project is structured around two main classes: grocery and main. The grocery class, encapsulated within the functions package, represents a customer's account with attributes for the customer's name, ID, phone number, account balance, and address. An object of this class is instantiated in the main class to simulate interactions with the grocery wallet system.

**Encapsulation**
Encapsulation is achieved by defining private attributes in the grocery class and providing public getter and setter methods. This ensures that the internal state of the object can only be accessed and modified through controlled methods, maintaining data integrity. For instance, methods such as setCustomername, getCustomerId, and setAccbal allow controlled access to the private attributes.

**Constructors**
The grocery class includes a default constructor, which is implicitly called when an object of this class is created. While the provided code does not explicitly define custom constructors, it can be enhanced by adding parameterized constructors to initialize objects more conveniently.

**Methods**
Two key methods, shop and recharge, are implemented in the grocery class to handle transactions. The shop method deducts a specified amount from the account balance if sufficient funds are available, updating the balance and providing feedback to the user. The recharge method adds a specified amount to the account balance, updating it accordingly and confirming the new balance to the user.

**Practical Implementation**
In the main class, an instance of the grocery class is created, and the customer details are set using the setter methods. The system simulates a series of transactions, including shopping and recharging, demonstrating the real-world applicability of the class methods.

**Conclusion**
This project effectively demonstrates the practical application of OOP principles in Java. By encapsulating customer data and providing methods to manipulate this data, the project ensures a modular, maintainable, and scalable approach to software development. The use of classes and objects not only simplifies the design but also makes the code reusable and adaptable to future requirements.
