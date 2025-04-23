# Design-Pattern
Design Pattern in Java and it's uses
## :love_letter: Factory Design Pattern
When there is superclass and having multiple subclasses for that class then, the creation/instantion of object is taking care by subclasses then, we should go for Factory Design Pattern.
In simple term we don't care about object creation in Factory Design Pattern.

- In Spring ApplicationContext using factory Beans.
- When we create notification system (email, sms, push notification) or when we create Logging systems (Console/File/Remote) or Payment gateways (PayPal/Stripe/Razorpay) or File readers (PDF/Excel/CSV) or Spring’s ApplicationContext.getBean(...).

## :love_letter: Abstract Factory Design Pattern
Abstract Factory Design Pattern is a creational design pattern and it is almost similar to the Factory Design Pattern and there is another layer of abstraction over Factory Design Pattern.

### Note: 
- When we want to create only one object then we should go for Factory Design Pattern.
- When we want to create multiple of related object then we should go for Abstract Design Pattern.(100% abstraction)




