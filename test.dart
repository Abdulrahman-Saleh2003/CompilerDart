import 'dart:core';
import 'dart:async' show Future, Stream;

// 1. Enum
enum Status {
    pending,
    approved,
    rejected;

    bool get isApproved => this == Status.approved;
}

// 2. Mixin
mixin Logger {
    void log(String message) {
        print('[LOG] ' + message);
    }
}

// 3. Abstract Class & Inheritance & Generics
abstract class Animal {
    String name;
    Animal(this.name);
    void makeSound();
}

class Dog<T> extends Animal with Logger {
    int age;
    T tag;

    Dog(String name, this.age, this.tag) : super(name) {
        assert(age >= 0);
    }

    // Named Constructor
    Dog.puppy(String name, T tag) : this(name, 0, tag);

    // Operator Overload
    bool operator ==(Object other) {
        if (other is Dog) {
            return name == other.name;
        }
        return false;
    }

    @override
    void makeSound() {
        log('Bark! My name is ' + name);
    }
}

// 4. Extension
extension StringUtils on String {
    bool get isBlank => trim().isEmpty;
}

// 5. Functions & Async/Await & Collections & Control Flow
Future<void> main() async {
    // Variables & Null-Safety
    int count = 42;
    String? optionalGreeting = null;
    String greeting = optionalGreeting ?? 'Hello Dart!';
    print(greeting);

    // Cascade Notation & Generics
    Dog<int> dog = Dog<int>('Buddy', 3, 101)
        ..makeSound();

    // Advanced Collections: Spread & Collection-if & Collection-for
    List<int> numbers = [1, 2, 3];
    List<int> combined = [
        0,
        ...numbers,
        if (count > 40) 99,
        for (int i = 100; i <= 102; i++) i
    ];
    print(combined);

    Map<String, dynamic> userMap = {
        'username': 'Abdulrahman',
        'status': Status.approved,
        'active': true
    };
    print(userMap);

    // Switch Case
    Status currentStatus = Status.approved;
    switch (currentStatus) {
        case Status.approved:
            print('Access granted');
            break;
        case Status.rejected:
            print('Access denied');
            break;
        default:
            print('Pending review');
    }

    // Try-Catch-Finally
    try {
        if (count < 50) {
            throw 'Count is too low!';
        }
    } on String catch (error) {
        print('Caught error: ' + error);
    } finally {
        print('Execution finished safely.');
    }
}
