package nthToTheLastLinkedListElement;

public class NthToTheLastLinkedListElement {
	
//	Given a singly linked list, write a function 
//	to find the nth- to - last element of the list
//	eg.
	
//	 list = 1 -> 2 -> 3 -> 4 - > 5
	
//	n= 1, output =4
//	n= 2, output =3
//	n= 3, output =2
//	n= 4, output =1
	

	 private static class Node {
	        private int value;
	        private Node next;
	        
	        private Node(int value) {
	            this.value = value;
	        }
	    }
	    
	    public static Node nthToLast(Node node, int n) {
	        Node curr = node;
	        Node follower = node;
	        
	        // Iterate curr forward by n. If you reach the end of the list then it is 
	        // shorter than n, so you can't possible have an nth-to-last node
	        for (int i = 0; i < n; i++) {
	            if (curr == null) return null;
	            curr = curr.next;
	        }
	        
	        // If length is exactly n, the nth-to-last node would be null
	        if (curr == null) return null;
	        
	        // Move both nodes forward in unison until curr is at the end of the list
	        while (curr.next != null) {
	            curr = curr.next;
	            follower = follower.next;
	        }
	        System.out.println(curr);
	        System.out.println(follower);
	        return follower;
	    }
	    
	    // Sample test cases
	    public static void main(String[] args) {
	        Node n = new Node(1);
	        n.next = new Node(2);
	        n.next.next = new Node(3);
	        n.next.next.next = new Node(4);
	        n.next.next.next.next = new Node(5);
	        
	        assert nthToLast(n, 0).value == 5;
	        assert nthToLast(n, 1).value == 4;
	        assert nthToLast(n, 2).value == 3;
	        assert nthToLast(n, 3).value == 2;
	        assert nthToLast(n, 4).value == 1;
	        assert nthToLast(n, 5) == null;
	    }
	}


