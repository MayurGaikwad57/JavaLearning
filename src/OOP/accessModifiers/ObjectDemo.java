package OOP.accessModifiers;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
        // hash code can be modified based on requirements
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(100);
        System.out.println(obj.hashCode());
        /* Hash code gives unique value for the object
           if you create 2 diff objects then they both will have unique values
           NOTE--> It doesn't return the memory address, it returns random integer value
    */

    }
}
