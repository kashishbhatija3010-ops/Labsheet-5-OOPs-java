public class Q17InheritanceConceptMain {
    public static void main(String[] args) {
        // Multiple inheritance means inheriting from more than one class.
        // Java does not support multiple inheritance of classes.

        // A class cannot extend two classes because it may cause
        // ambiguity when both parent classes have the same method.
        // Example of invalid syntax:
        // class C extends A, B { }

        // Hybrid inheritance is a combination of two or more
        // forms of inheritance, such as single and hierarchical inheritance.

        // Java uses interfaces when multiple or hybrid inheritance
        // of type and behavior is required.
        // Interfaces can help a class obtain behavior contracts
        // from multiple sources without extending multiple classes.

        System.out.println("Multiple and Hybrid Inheritance in Java");
        System.out.println("Java does not support multiple inheritance of classes.");
        System.out.println("Interfaces support multiple inheritance of type.");
    }
}

