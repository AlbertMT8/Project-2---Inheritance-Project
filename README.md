# Animal Hierarchy Simulation in Java

This project is an object-oriented simulation of a hierarchy of animals, illustrating inheritance, polymorphism, and composition in Java. The program defines various classes for animals, with unique characteristics, methods, and relationships.

## Project Overview

The project defines a structure of animal classes with specific behaviors and properties. This includes generic animals and more specialized animals like birds, mammals, reptiles, and snakes. The class hierarchy highlights the use of inheritance to share common attributes, polymorphism to override methods, and composition for "has-a" relationships.

### Key Features

- **Class Inheritance**: Demonstrates class inheritance with `Animal` as the base class, and subclasses like `Bird`, `Mammal`, and `Reptile`.
- **Polymorphism**: Uses overridden methods to customize behaviors in subclasses, such as `eat()` in different animal types.
- **Composition**: Implements composition through "has-a" relationships, such as `Falcon` having a `Talon` and `Rattlesnake` having a `Rattle`.

## Class Descriptions

### 1. `Animal`

The base class for all animals, containing shared properties like `species`, `habitat`, and `name`.

- **Attributes**: `species`, `habitat`, and `name`.
- **Methods**:
  - `eat()`: Simulates eating.
  - `toString()`: Returns a string representation of the animal.

### 2. `Bird` (extends `Animal`)

Represents a bird with bird-specific behaviors.

- **Attributes**: `wingspan`.
- **Methods**:
  - `layEggs()`: Simulates laying eggs.
  - `protectNest()`: Simulates protecting the nest using its wingspan.

### 3. `Mammal` (extends `Animal`)

Represents a mammal with unique properties.

- **Attributes**: `hairColor`.
- **Methods**:
  - `sleep()`: Simulates the mammal sleeping on its fur.

### 4. `Falcon` (extends `Bird`)

Represents a falcon with a composition relationship with the `Talon` class.

- **Attributes**: `myTalon` - a `Talon` object.
- **Methods**:
  - `fly()`: Simulates flying.
  - `toString()`: Includes talon size in the falcon's description.

### 5. `PolarBear` (extends `Mammal`)

Represents a polar bear with specific characteristics.

- **Attributes**: `weight`.
- **Methods**:
  - `rollOver()`: Simulates rolling over.
  - `eat()`: Overrides `eat()` to simulate eating salmon.

### 6. `Talon`

Represents a talon, which is associated with `Falcon`.

- **Attributes**: `size`.
- **Methods**:
  - `getSize()`: Returns the talon size.

### 7. `Rattle`

Represents a rattle, associated with `Rattlesnake`.

- **Attributes**: `scales` - the number of scales in the rattle.
- **Methods**:
  - `rattle()`: Simulates the rattling sound.

### 8. `Reptile` (extends `Animal`)

Represents a reptile with specific properties and methods.

- **Attributes**: `scaleTexture` - the texture of the reptile's scales.
- **Methods**:
  - `shedSkin()`: Simulates shedding skin.
  - `camouflage()`: Simulates camouflage.

### 9. `Snake` (extends `Reptile`)

Abstract class representing snakes with shared attributes.

- **Attributes**: `length`.
- **Methods**:
  - `slither()`: Abstract method for slithering, implemented by subclasses.
  - `eat()`: Customized eating behavior for snakes.

### 10. `Rattlesnake` (extends `Snake`)

Represents a rattlesnake, which has a `Rattle`.

- **Attributes**: `rattle` - a `Rattle` object.
- **Methods**:
  - `slither()`: Simulates slithering and rattling.

## Code Example

The `Driver` class demonstrates usage by creating instances of `Falcon` and `PolarBear`:

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
