/**
 * The class demonstrates dynamic method dispatch in Java using inheritance and overriding.
 */


class Phone {
    public void name() {
        System.out.println("My name is Nokia E72");
    }
}

class Smartphone extends Phone {
    // `@Override` is an annotation in Java that is used to indicate that a method in a subclass is
    // intended to override a method in its superclass. It is not required, but it helps to ensure that
    // the method is actually overriding a method in the superclass and not just a new method with a
    // similar name. If the method is not actually overriding a method in the superclass, the compiler
    // will generate an error.
    @Override
    public void name() {
        System.out.println("My name is Realme 3");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
       // `Phone obj = new Smartphone();` is creating a new object of the `Smartphone` class and
       // assigning it to a reference variable of type `Phone`. This is an example of polymorphism in
       // Java, where an object of a subclass can be assigned to a reference variable of its
       // superclass. This allows for dynamic method dispatch, where the method to be called is
       // determined at runtime based on the actual object type rather than the reference type. In this
       // case, the `name()` method of the `Smartphone` class will be called instead of the `name()`
       // method of the `Phone` class, because the actual object type is `Smartphone`.
        Phone obj = new Smartphone();
        obj.name();
    }
}

