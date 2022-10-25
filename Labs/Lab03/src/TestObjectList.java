// Q1

/**
 * The class TestObjectList holds the main for the classes Dog and DVD.
 * It tests functionality by adding various different data types into an array.
 * It also tests removing the items from the array.
 * The method bark is called from the Dog class.
 * In order for this to work, it must be cast (pointed to).
 *
 * @author      Deirdre Connolly
 * @version     22/10/18
 */

public class TestObjectList
{
    public static void main(String[] args)                      // creates the main, void returns nothing
    {
        ObjectList ol = new ObjectList(3);             			// creates new object list using array as it is static, note fixed length of 3

        String s = "I'm Happy";                                 // creates new string using wrapper class
        Dog d = new Dog();                                      // creates new object Dog
        DVD v = new DVD();                                      // creates new object DVD
        //Flea f = new Flea();
        Integer i = 1234;                                       // creates new integer using wrapper class

        System.out.println(ol.add(s));                          // add string s to the list, print output
        System.out.println(ol.add(d));                          // add dog to the list, print output
        System.out.println(ol.add(v));                          // add DVD to the list, print output
        System.out.println(ol.add(i));                          // add Integer to the list, print output

        ol.remove(0);                                        // remove the item in position 0 of the array
        System.out.println(ol.add(i));                          // add Integer to the list, print output

        System.out.println("Is the list full? " + ol.isFull());     // asks if the list full
        System.out.println("Is the list empty? " + ol.isEmpty());   // asks if the list is empty

        System.out.println("Total number of objects in the list: " + ol.getTotal()); // checks the total number of objects in the list

        Object g = ol.getObject(0);                          // getObject method, named as g, returns the item in position 1 of the array
        ((Dog) g).bark();                                       // cast to Dog class
    }
}
