import java.util.Arrays;

public class Algo_Structures {

	
	
	public static void main(String[] args) {
			int [] lst = {4,9,7,1,3,6,5};
			
//SELECTION SORT (SWAP)
			static void selectionSort(int[] lst) {
			    // get the length
			    int n = lst.length;
			    for (int i = 0; i < n; i++) {
			        int index = 0;
			        int smallest = lst[i];
			        for (int j = i; j < n; j++) {
			            if (lst[j] < smallest) {
			                smallest = lst[j];
			                index = j;
			            }
			        int temp = lst[i];
			        lst[i] = smallest;
			        lst[index] = temp;
			    }
			   } 
			    System.out.println(Arrays.toString(lst));
			}
			
			static void linearSearch(int[] lst, int v) {
				int n = lst.length;
				for (int i = 0; i < n; i++) {
					if (lst[i] == v) {
						System.out.println("found! It is at" + i);
						return;
					}
				}
				System.out.println("the element is not in the array");
				return;
			}
			
//BUBBLE SORT (PROGRESSIVLY MOVE LARGEST NUMBERS TO END OF ARRAY)
			static void bubbleSort (int[] lst) {
				int n = lst.length;
				boolean swapped;
				
				do {
					swapped = false;
					for (int i = 0; i < n-1; i++) {
						if (lst[i] > lst[i+1]) {
							int temp = lst[i];
							lst[i] = lst[i + 1];
							swapped = true;
							
						}
					}
				} while (swapped == true);
					System.out.println(Arrays.toString(lst));
			}
			
			
//MERGE SORT (RECURSIVE ALGO)
			static  int[] mergeSort(int[] lst) {
			    int n = lst.length; 
			    int[] left;
			    int[] right;
			    
			    // create space for left and right subarrays
			    if (n % 2 == 0) {
			        left = new int[n/2];
			        right = new int[n/2];
			    } 
			    else {
			        left = new int[n/2];
			        right = new int[n/2+1];
			    }
			    
			    // fill up left and right subarrays
			    for (int i = 0; i < n; i++) {
			        if (i < n/2) {
			            left[i] = lst[i];
			        }
			        else {
			            right[i-n/2] = lst[i];
			        }
			    }
			    
			    // recursively split and merge
			    left = mergeSort(left);
			    right = mergeSort(right);
			    
			    // merge
			    return merge(left, right);
			}
			// the function for merging two sorted arrays
			static int[] merge(int[] left, int[] right) {
			    // create space for the merged array
			    int[] result = new int[left.length+right.length];
			    
			    // running indices
			    int i = 0;
			    int j = 0;
			    int index = 0;
			    
			    // add until one subarray is deplete
			    while (i < left.length && j < right.length) {
			        if (left[i] < right[j]) {
			            result[index++] = left[i++];
			            {
			        else {
			            result[index++] = right[j++];
			        }
			    }
			    
			    // add every leftover elelment from the subarray 
			    while (i < left.length) {
			        result[index++] = left[i++];
			    }
			    
			    // only one of these two while loops will be executed
			    while (j < right.length) {
			        result[index++] = right[j++];
			    }
			    
			    return result;
			}
			    
//BINARY SEARCH
			        
 /*PSUDO CODE:
		            compare with median:
    				if size of array is 1:
        				if the numbers match:
            				return found
        				else:
            				return not found
    				if greater than median:
        				compare with the second half
    				else if less than median:
        				compare with the first half
    				else:
        				return found*/			     

			        
			        static boolean binarySearch(int v, int[] lst, int low, int high) {
			            if (low > high) {
			                System.out.println("not found");
			                return false;
			            }
			            
			            int middle = (low+high)/2;
			            
			            if (v == lst[middle]) {
			                System.out.println("found! It is at " + middle);
			                return true;
			            }
			            else if (v > lst[middle]) {
			                return binarySearch(v, lst, middle+1, high);
			            }
			            else {
			                return binarySearch(v, lst, low, middle-1);
			            }
			            
// LINKED LIST ARRAY:
			           static createLL(LinkedList) { 
			         // create a new linked list
			        	LinkedList<Integer> lst = new LinkedList<Integer>();
			        	
			        	// add elements
			        	lst.add(15); // [15]
			        	lst.add(19); // [15,19]
			        	lst.add(21);	// [15,19,21]
			        	lst.addFirst(13); // [13,15,19,21]
			        	lst.addLast(24); // [13,15,19,21,24]
			        	System.out.println(lst);
			        	
			        	// remove elements
			        	lst.removeFirst(); // [15,19,21,24]
			        	lst.removeLast(); // [15,19,21]
			        	lst.remove(19); // [15,21]
			        	System.out.println(lst);
			           }
			           
//STACKS (First In, Last Out - Only have access to top of stack (ex: undo button)
			           
			       	// create a new stack
			       	Stack stack = new Stack();
			       	stack.push(new Integer(3)); // [3]
			       	stack.push(new Integer(5)); // [3,5]
			       	System.out.println(stack.peek()); // prints 5
			       	stack.push(new Integer(6)); // [3,5,6]
			       	int x = stack.pop();
			       	System.out.println(x); // prints 6
			       	System.out.println(stack); // prints [3,5]			       
			        
			        }
	}	


