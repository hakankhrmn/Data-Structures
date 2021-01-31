package LinkedListLab;

// In order to simply code-reading, I moved main function to here,
//differently than I did on class

// Node is a struct
// LinkedList is the data structure based on nodes
// Consider node is a ring and, LinkedList is the chain consist of those rings


// Complete the missing functions on LinkedList class
// This is not a homework, make the exercise for yourself


public class Main {
    public static void main(String args[]){

        LinkedList list = new LinkedList();

        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        list = list.insert(list, 7);
        list = list.insert(list, 8);

        list.PrintList(list);

        System.out.println("Size of LinkedList = " + list.findSize(list));

        // Delete the comments after filling the given methods

// ************************************************
			/*
		list = list.insert(list,9,2);
    	list = list.insert(list,10,5);

			 */

// ************************************************
			/*
			list.deleteByKey(list, 1);
			list.PrintList(list);

			list.deleteByKey(list, 4);
			list.PrintList(list);

			list.deleteByKey(list, 10);
	    	list.PrintList(list);

			 */

// ************************************************
			/*
	    	list.deleteByPosition(list, 0);
	      	list.PrintList(list);

	        list.deleteByPosition(list, 3);
	        list.PrintList(list);

	        list.deleteByPosition(list, 10);
	        list.PrintList(list);
			 */


// ************************************************

    } //end-of-main
}
