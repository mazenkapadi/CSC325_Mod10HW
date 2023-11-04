README:
In your README file, you can include the following information:

**Design Pattern:**
- Abstract Factory Pattern

**Problem:**
- The problem is the creation of individual garment objects that must match other objects of the same family, while also allowing for future changes in the product catalog without modifying the core code.

**Solution:**
- We applied the Abstract Factory pattern, which provides an interface for creating families of related objects without specifying their concrete classes.
- The program includes abstract factory interfaces for creating tops, pants, and shoes, with concrete factory classes for different families (Professional, Casual, Party).
- Concrete product classes implement interfaces for specific product variants (e.g., ProfessionalTop, CasualTop, etc.).
- The client code uses the abstract factory to create matching garments without knowledge of concrete classes.

**Usage:**
- The driver class, demonstrates how to use the Abstract Factory pattern to create matching garments for different families and variants.
- You can modify the selected factory to create garments based on the customer's choice.

**Benefits:**
- The Abstract Factory pattern ensures that garments are always consistent within a family.
- It allows for easy addition of new products or families without modifying the core code.
- Code remains clean, maintainable, and extensible.
