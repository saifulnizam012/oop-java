

public class bst {
 
    /* Class containing left and right child of current node and key value*/
    class Node {
        String key;
        Node left, right;
 
        public Node(String item) {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    bst() {  
        root = null;  
    }
 
    // This method mainly calls insertRec()
    void insert(String key) {
       root = insertRec(root, key);
    }
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, String key) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key)< 0)
        // if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key)> 0)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void printInorder()  {
       System.out.print("Inorder: ");
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }  
    
    void printPreorder()  {
        System.out.print("\nPreorder: ");
        preorderRec(root);
     }
   
    void preorderRec(Node root) {
        //***************************
    	//write the  PREORDER code here
    	//****************************
        

    }
    
    void printPostorder()  {
        System.out.print("\nPostorder: ");
        postorderRec(root);
     }
    
    void postorderRec(Node root) {
    	//*****************************
        // write the POSTORDER code here
    	//*****************************

    }
    
 
    // Driver Program to test above functions
    public static void main(String[] args) {
    // ********************************************
    // You need to modify the code as QUESTION EXAMPLE 
    //*********************************************
        bst tree = new bst();
 

        tree.insert("i");
        tree.insert("go");
        tree.insert("to");
        tree.insert("school");
        tree.insert("by");
        tree.insert("bus");

 
        // print inorder traversal of the BST
        tree.printInorder();
        tree.printPreorder();
        tree.printPostorder();
    }
} 
