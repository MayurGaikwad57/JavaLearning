package OOP;

public class GarbageCollection {
    /* 1) we will discuss about finalize method and garbage collection in java
     Garbage collection in java is done by java itself
     2)You cannot tell java to clear or delete the object from the memory , it does
     this task automatically
     3) The finalize() Method:
      The finalize() method in Java is called by the garbage collector before an object is removed from memory.
      You can override this method to specify actions that should be performed before the object is reclaimed.
      Note: As of Java 9, the finalize() method is deprecated because it was often misused and caused performance issues.
     4) Java garbage collection is done in two cases :
       It focuses on objects that are no longer reachable. An object becomes unreachable if:
          **)There are no references to it from other objects.
          **)All references go out of scope.
 */
}
