package OOP.accessModifiers;

public class A {
   private int num;
   protected String name;
   /*  protected memeber can be accessed in same class, subClass in same package and also in subClass of diff
    package steps--> first create a subClass extending the class where the protected member is present
    then call that variable using constructor by creating obj of that class           */

    int[] arr;
    //Member which has no modifier can be accessed in class , same package and subClass of same package

    public int getter(){
        return num;
    }
   public A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
