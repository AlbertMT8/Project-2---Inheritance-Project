# Animal Hierarchy Simulation in Java

This project represents a hierarchy of animals using Java classes, showcasing inheritance, composition, and polymorphism. The classes include various animal types with distinct properties and behaviors.

## Project Overview

The project contains classes representing generic animals and more specific animals like birds and mammals. Each class has specific attributes and methods to demonstrate the unique characteristics and actions of each animal type. 

### Key Classes and Features

- **Animal**: A base class representing a generic animal.
- **Bird**: A subclass of `Animal`, with methods related to bird-specific behaviors.
- **Mammal**: A subclass of `Animal`, representing mammal-specific properties.
- **Falcon**: A subclass of `Bird`, with an additional composition relationship with the `Talon` class.
- **PolarBear**: A subclass of `Mammal`, with additional attributes and methods specific to polar bears.
- **Talon**: Represents a falcon's talon, showing composition with the `Falcon` class.

## Class Descriptions

### 1. `Animal`

The base class for all animals, containing attributes like `species`, `habitat`, and `name`.

- **Constructor**: Initializes `species`, `habitat`, and `name`.
- **Methods**:
  - `eat()`: Simulates the animal eating.
  - `toString()`: Returns a string representation of the animal.

### 2. `Bird` (extends `Animal`)

Represents a bird with additional properties and methods.

- **Attributes**: `wingspan` - the bird's wingspan in feet.
- **Methods**:
  - `layEggs()`: Simulates the bird laying eggs.
  - `protectNest()`: Simulates the bird protecting its nest with its wingspan.

### 3. `Mammal` (extends `Animal`)

Represents a mammal with unique attributes and behaviors.

- **Attributes**: `hairColor` - the color of the mammal's fur.
- **Methods**:
  - `sleep()`: Simulates the mammal sleeping on its fur.

### 4. `Falcon` (extends `Bird`)

Represents a falcon with an added composition relationship with `Talon`.

- **Attributes**: `myTalon` - an instance of the `Talon` class representing the falcon’s talon.
- **Methods**:
  - `fly()`: Simulates the falcon flying.
  - `toString()`: Includes talon size in the falcon's description.

### 5. `PolarBear` (extends `Mammal`)

Represents a polar bear with specific attributes and customized methods.

- **Attributes**: `weight` - the weight of the polar bear.
- **Methods**:
  - `rollOver()`: Simulates the polar bear rolling over.
  - `eat()`: Overrides the `Animal` eat method to simulate eating salmon.

### 6. `Talon`

Represents a talon, which is associated with falcons.

- **Attributes**: `size` - the size of the talon.
- **Methods**:
  - `getSize()`: Returns the size of the talon.

## Code Example

The following example shows how to use these classes in the `Driver` class:

```java
public class Driver {
    public static void main(String[] args) {
        Falcon Jeffrey = new Falcon(5, 10, "Jeffrey");
        Jeffrey.fly();
        Jeffrey.protectNest();
        
        PolarBear Eddie = new PolarBear("white", 2000, "Eddie");
        Eddie.rollOver();
        Eddie.sleep();
        Eddie.eat();
        System.out.println(Eddie);
    }
}
