// Q1

import java.util.*;

public class ObjectList<OL> {

    // Attributes
    private int maxItems;
    private int numItems;
    private OL[] objectArray;
    private Object[] oList;
    private int total;


    // Constructor -- same name as class, no return
    public ObjectList(int maxItem){
        this.maxItems = maxItem;
        this.numItems = 0;
        this.objectArray = ((OL[])new Object[maxItem]);
    }


    //  Getters and Setters
    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.objectArray = ((OL[])new Object[maxItems]);
        this.maxItems = maxItems;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public OL[] getObjectArray() {
        return objectArray;
    }

    public void setObjectArray(OL[] objectArray) {
        this.objectArray = objectArray;
    }


    // Functionality -- ObjectList, add, remove, isEmpty, isFull
    public ObjectList() {
    }

    public OL add(OL i) {
        if(numItems < maxItems) {
            this.objectArray[this.numItems] = i;
            this.numItems++;
        }
        else {
            System.out.println("The list is full.");
        }
        return i;
    }

    public void remove(int i) {
        if(numItems == 0) {
            System.out.println("There are no items to remove.");
        }
        else {
        for (int a = 0; a < this.numItems - 1; a++) {
            this.objectArray[a] = this.objectArray[a + 1];
            this.numItems = this.numItems - 1;}

//            objectArray[i] = null;
//            this.numItems--;
//        for (int i = 0; i < this.numItems - 1; i++) {
//            this.objectArray[i] = this.objectArray[i + 1];
//        }
//        this.objectArray[this.objectArray -1 ] = 0;
//        this.numItems = this.numItems - 1;
        }
    }

    public OL getObject(int i) {
        OL g = objectArray[i];
        return g;
    }

    public int getTotal() {
        return this.numItems;
    }

    public boolean isEmpty() {
        boolean res;

        if(numItems == 0) {                     // list is empty
            res = true;
        }
        else {                                  // list is not empty
            res = false;
        }

        return res;
    }

    public boolean isFull() {
        boolean res = true;                     // list is full
        return res;
    }

    public void print() {
        for(int i = 0; i < objectArray.length; i++) {
            System.out.println(objectArray[i]);
        }
    }
}