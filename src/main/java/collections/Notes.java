package collections;

public class Notes {

    //Collection
    //Set - SortedSet, HashSet, TreeSet
    //List - ArrayList, LinkedList
    //Queue
    //Map - SortedMap, HashMap, TreeMap, LinkedHashMap
    //Iterator - iterator() or ListIterator

    /*
    * Basic Methods:
    * int size();
    * boolean isEmpty(); verifies if collection is empty
    * boolean contains(Object element); verifies if collection contains
    * boolean add(E element); adds element to collection
    * boolean remove(Object element); removes element from collection
    * Iterator<> iterator(); Is an interface that has 3 methods:
    *           boolean hasNext(); Does collection have any object
    *           Object next(); will return the next object
    *           void remove(); will remove the object (can only be called once per call to next())
    *
    * Bulk operations:
    * boolean containsAll(Collection<?>c);
    * boolean addAll(Collection<? extends E>c);
    * boolean removeAll(Collection<?>c);
    * boolean retainAll(Collection<?>c);
    * void clear();
    *
    * //Array operations
    * Object[] toArray(); allows collection to be converted to an array
    *       toList(); allows array to be converted to a List
    * <T> T[]toArray(T[]a);
    *
    *
    * for-each loop
    *   for(Object o : collectionObject){
    *       Do whatever with member object
    * }
    *
    *
    * Iterator Class - used to iterate over a collection
    * iterator() method and for collections that implement List, ListIterator:
    * Steps to iterate through a collection -->
    *       >Obtain an iterator by calling iterator() method
    *       >Setup loop that calls hasNext() and continue as long as hasNext() method is true
    *       >Within loop, obtain each element using next() method.
    *
    *
    * Collections Methods:
    * Collections.sort(I);
    * Collections.shuffle(I);
    * Supported Algorithms:
    * Sorting - reorders a List so that elements are in ascending order (according to its elements natural ordering OR sorts with a Comparator)
    * Shuffling - does the opposite of sort, destroys any trace of order, could be use to shuffle a list of Card objects representing a deck
    * Routine data manipulation -
    *           reverse - reverses the order of elements in list
    *           fill - overwrites every element in a List with a specified value. Useful for reinitializing
    *           copy - takes two arguments, a destination List and a source List, and copies from source to destination list
    *           swap - swaps the elements at the specified position in list
    *           addAll - adds all the specified elements to a Collection. Could be specified individually or as an array.
    * Searching - has binarySearch() method for searching a specified element in a sorted list
    * Composition -
    * Find extreme values
    *
    * Misc Functions -
    * Collections.frequency(myCollection, myElement)
    * >Returns number of elements in the specified collection equal to the specified object
    *
    * Collections.disjoint(myCollection1, myCollection2)
    * >Returns true if the two specified collection have no elements in common.
    *
    */

}
