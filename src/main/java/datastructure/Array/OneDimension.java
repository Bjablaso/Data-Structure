package datastructure.Array;

public class OneDimension<E> {
    private int capacity;
    private int length;
    private E[] data;

    public OneDimension(int initLength) {
        this.capacity = -1;
        this.length = initLength;
        this.data = (E[]) new Object[initLength];
    }

    public void add(E element) {
        if (capacity  == data.length) {
            //do something
        }
        capacity += 1;
        data[length] = element;
    }

    public void autoIncreaselength() {
        this.length = length * 2;
        E[] temp = (E[]) new Object[length];

        System.arraycopy(data, 0, temp, 0,length); // O(n) time complexity and Space complexity.

       data = (E[]) new Object[length];
       data = temp;

    }

    /**
     * Copy all element from old array into new array
     * @param tempArray take in the new array and copy its element
     */
    public void copyElements(E[] tempArray) {
        for (int i = 0; i < data.length; i++) {
            tempArray[i] = data[i];
        }
    }

    public void printCurrentArrayInstance() {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",\t");
        }
        System.out.print("[");
    }
}
