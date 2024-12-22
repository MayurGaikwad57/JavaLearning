package OOP.Elder;

// package is a path that helps java to know the hierarchy where it is currently
// Inside OOP package , there is elder package inside that we there is Elder Package
// and inside that elder package we have our class callYounger

import static OOP.Younger.callElder.message;
/*Import means that we can use methods or properties of that path in our current file
 Provided it should be public
 Import statement needs to used only when the files that you want to use are
 in different packages , if both are present in same package then import can be avoided
 In our case we wanted to use the message method
 similarly , there can be other methods , properties , objects etc can be used      */


/* Packages are basically folder structure
helps us to keep our files organized , neat and clean and maintains structure
Packages also helps us to create different files with same name
e.x -> there might be a file named welcome with some specific methods
where's we also might want to have the same fileName greeting for some other task
so in that case as there is restriction
******** We cannot create two files with the same name inside package ***********
so we have to create anothere package and inside that we have to create a new file
named greeting and perform any tasks that we want to perform here

          */



public class callYounger {
    public static void main(String[] args) {
        System.out.println("Hey!");
        message();
    }
}
