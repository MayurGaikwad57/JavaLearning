

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mayur");
         sb.append(" Gaikwad");
        System.out.println(sb);
        System.out.println(sb.capacity());
// Initial capacity of stringBuffer is 16,it grows as strings are injected in stringBuffer
        System.out.println(sb.length());
// same as string length method gives the length of the string
        sb.insert(6,"Legend ");
        System.out.println(sb);


/* StringBuffer in Java
The StringBuffer class in Java is a part of the java.lang package and is used to create mutable (modifiable) strings.
Unlike the String class, which creates immutable strings, StringBuffer allows for changes to the
content of the string without creating new objects, making it more efficient in scenarios
where frequent modifications are required.
Mutability: The content of a StringBuffer object can be changed (e.g., appending, inserting, replacing, or deleting characters).
Thread-Safe: StringBuffer is synchronized, meaning it is thread-safe and can be used safely in
a multithreaded environment. However, this can make it slightly slower than StringBuilder.
Initial Capacity: When a StringBuffer object is created, it has an initial capacity, which grows automatically as needed.
 */
/* Anothere important concept known as StringBuilder
StringBuilder --> 1) allows you to create mutable strings, without creating new object
is same as stringBuffer , it has all the needed string methods to manipulate the string
1) Same as string buffer,it is also mutable
2) stringBuilder is not thread safe
3) stringBuilder is faster than stringBuffer , stringBuffer is slower in performance
than stringBuilder
4) If you want high performance,and thread safety is not a concern then you can use stringBuilder
 */
    }
}
