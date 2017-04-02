//Team Jerms
//Jeffrey Weng, Matteo Wong, Ricky Chen
//APCS2 - pd3
//LAB#02 -- All Hands on Deque!
//2017-03-31

import java.util.ArrayList;

public class DLLDeque<T> implements Deque<T>{

    private DLLNode<T> _head, _tail;
    private int _size;

    public DLLDeque(){
	_head=_tail=null;
    }
    
    public void addLast(T val){
	if (isEmpty())
	    _tail=_head=new DLLNode<T>(val, null, null);
	else if (_size==1) {
	    _tail.setNext(new DLLNode<T>(val, null, _head));
	    _tail=_tail.getNext();
	    _head.setNext(_tail);
	}
	else {
	    _tail.setNext(new DLLNode<T>(val, null, _tail));
	    _tail=_tail.getNext();
	}
	_size+=1;
    }

    public T peekLast(){
	return _tail.getCargo();
    }

    public T pollFirst(){
	if (isEmpty())
	    return null;
	T ret = _head.getCargo();
	if (_size==1){
	    _head=_tail=null;
	}
	else {
	    _head=_head.getNext();
	    _head.setPrev(null);
	}
	_size-=1;
	return ret;
    }

    public T pollLast(){
	if (isEmpty())
	    return null;
	T ret = _tail.getCargo();
	if (_size==1)
	    _tail=_head=null;
	else {
	    _tail=_tail.getPrev();
	    _tail.setNext(null);
	}
	_size-=1;
	return ret;
    }
    
    public T peekFirst(){
	return _head.getCargo();
    }

    public boolean isEmpty(){
	return _size==0;
    }

    public int size(){
	return _size;
    }
    
    public String toString(){
	String ret="FRONT<-";
	DLLNode<T> temp = _head;
	for (int i=0;i<_size;i++) {
	    ret+=temp.getCargo()+"<-";
	    temp=temp.getNext();
	}
	ret+="END";
	return ret;
	    
    }



    
    public static void main( String[] args ) 
    {
	Deque<String> ALDe = new DLLDeque<String>();

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
