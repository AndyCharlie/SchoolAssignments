/* CompleteBinaryTree
 * public class CompleteBinaryTree
 * tree implemented using an array
 * Parameters:
 * int[] data - array used for storing elements of the tree
 * int root - stores the index for the root value of the tree
 * int manyitems - stores the index of the next open index to the array, and also holds the value of the number of items in the tree
 */
package deaton_lab13_datastructures;

/**
 *
 * @author Adeat
 */




public class CompleteBinaryTree {
    int[] data;
    int root = 0;
    int manyitems = 0;


    // CompleteBinaryTree
    // public CompleteBinaryTree()
    // initalizes an object of the CompleteBinaryTree class with a tree able to hold 10 elements initially
    // Parameters:
    // Precondition:
    // Returns:
    // CompleteBinaryTree initialized with a empty array of size 10 to store the tree
    
    public CompleteBinaryTree(){
        data = new int[10];
    }
    
    // CompleteBinaryTree
    // public void addToTree(int input)
    // adds the given input the the array by first checking if the array can hold that value, and if not it will resize the array to fit it
    // Parameters:
    // int input
    // Precondition:
    // Returns:
    // CompleteBinaryTree with given value added to the tree 
    
    public void addToTree(int input){
        if(manyitems > data.length){
            ensureCapacity(manyitems*2 +1);
        }
        data[manyitems] = input;
        manyitems++;
    }
    
    // CompleteBinaryTree
    // public void removeFromTree()
    // removes the last item in the tree (last item in the array as specified)
    // Parameters:
    // Precondition:
    // tree that this is called on is not empty
    // Returns:
    // CompleteBinaryTree with last added value removed 
    
    
    public void removeFromTree(){
        if(manyitems == 0){
            System.out.println("This tree is empty, you cannot remove any items");
        }
        else{
        manyitems--;
        }
    }
    
    // CompleteBinaryTree
    // public void ensureCapacity(int minimumCapacity)
    // resizes the called objects array
    // Parameters:
    // int minimumCapacity
    // Precondition:
    // data array has already been initialized
    // Returns:
    // CompleteBinaryTree with tree size increased to minimumCapacity
    
        public void ensureCapacity(int minimumCapacity){
        int[] biggerArray;
        if (data.length < minimumCapacity){
            biggerArray = new int[minimumCapacity];
            System.arraycopy(data, 0, biggerArray, 0, manyitems);
            data = biggerArray;
        }
    }
    
}
