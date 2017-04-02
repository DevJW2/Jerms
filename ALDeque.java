//Team Jerms
//Jeffrey Weng, Matteo Wong, Ricky Chen
//APCS2 - pd3
//LAB#02 -- All Hands on Deque!
//2017-03-31



import java.util.ArrayList;

public class ALDeque<T> implements Deque<T> {

    private ArrayList<T> _deque;

    public ALDeque(){
	_deque=new ArrayList<T>();//.get(0)=front .get(size-1)=end
    }

    public void addLast(T val){
	_deque.add(val);
    }

    public T peekLast(){
	return _deque.get(size()-1);
    }

    public T pollFirst(){
	if (isEmpty())
	    return null;
	return _deque.remove(0);
    }

    public T pollLast(){
	if (isEmpty())
	    return null;
	return _deque.remove(size()-1);
    }

    public T peekFirst(){
	return _deque.get(0);
    }

    public boolean isEmpty(){
	return size()==0;
    }

    public int size(){
	return _deque.size();
    }
    
    public String toString(){
	return _deque.toString();
    }

     public static void main( String[] args ) 
    {
	  Deque<String> ALDe = new ALDeque<String>();

	  System.out.println("\nnow adding thrice..."); 
	  ALDe.addLast("Al");
	  ALDe.addLast("B.");
	  ALDe.addLast("Sure!");

	  System.out.println("\nnow testing toString()..."); 
	  System.out.println( ALDe ); //for testing toString()...

	  System.out.println("\nnow dequeuing thrice...from the end.."); 
	  System.out.println( ALDe.pollLast() );
	  System.out.println( ALDe.pollLast() );
	  System.out.println( ALDe.pollLast() );

	  
	  System.out.println("\nnow printing out queue..."); 
	  System.out.println( ALDe ); //for testing toString()...

	  System.out.println("\nnow adding thrice... ");
	  ALDe.addLast("Matteo");
	  ALDe.addLast("Jeffrey.");
	  ALDe.addLast("Ricky!");
	  
	  System.out.println("\nnow printing out queue..."); 
	  System.out.println( ALDe ); //for testing toString()...

	  
	  System.out.println("\nnow dequeuing thrice..."); 
	  System.out.println( ALDe.pollFirst());
	  System.out.println( ALDe.pollFirst() );
	  System.out.println( ALDe.pollFirst() );


	  System.out.println("\nDequeuing from empty queue should yield null..."); 
	  System.out.println( ALDe.pollLast() );
}
}
