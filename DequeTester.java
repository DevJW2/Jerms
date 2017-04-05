//David Apterman
//APCS2 Pd-3
//HW#29: Stress is the Best
//2017-04-04

public class DequeTester {

    public static void main(String[] args) {
	//comment out methods as applicable
	
	//add-in, default Deque
	//Deque tbm = new /*Your Class Name Here*/() ;
	Deque tbm = new DLLDeque();

	System.out.println("Printing first element of empty deque, expecting error or null" );
	//System.out.println( tbm.getFirst() );
	//System.out.println(tbm.peekFirst() ); //<- Implemented this? Here you go.

	System.out.println("Adding/offering elements to the end of deque");
	tbm.addLast("testing");
	//	tbm.offerFirst("testing");   
	
	tbm.addLast("brutal");
	//	tbm.offerFirst("brutal");
	
      	tbm.addLast("for");
	//tbm.offerFirst("for");   //May I offer offer?
	
	tbm.addLast("day");
	//	tbm.offerFirst("day");
	
       	tbm.addLast("pleasant");
     	//tbm.offerFirst("pleasant");

	System.out.println("Checking first value, expecting 'pleasant' ");
        System.out.println( tbm.peekFirst() );
	//System.out.println( tbm.getFirst() ); //<- Ah, a man of culture I see. 

	System.out.println("Polling first element now x3");
	System.out.println( tbm.pollFirst() );
	System.out.println(tbm.pollFirst() );
	System.out.println(tbm.pollFirst() );
	System.out.println(tbm.pollFirst() );
	System.out.println(tbm.pollFirst() ); //extra calls to hit null case if remove not implemented
	//System.out.println(tbm.pollFirst() );

	//System.out.println("Removing first element now x3;expecting an error");
	//System.out.println(tbm.removeFirst() );
	//System.out.println(tbm.removeFirst() );
	//System.out.println(tbm.removeFirst() );
	//System.out.println( tbm.removeFirst() );
	//System.out.println( tbm.removeFirst() );  //extra calls to hit exception case if poll not implemented
	//System.out.println(tbm.removeFirst() );

	System.out.println("Deque should now be empty; printing last element");
	//System.out.println( tbm.getLast() );
	//System.out.println( tbm.peekLast() ); //<- for the Toms

	System.out.println("Now checking addLast and/or offerLast");
	//tbm.offerLast("just");
	tbm.addLast("just");
	
	//tbm.offerLast("making");
	tbm.addLast("making");   //As an ADDed bonus 
	
	//tbm.offerLast("sure");
	tbm.addLast("sure");

	System.out.println("Checking last value; should be 'sure' ");
	//System.out.println( tbm.getLast() );   //<- you guys GET it
	System.out.println( tbm.peekLast() );

	System.out.println("Polling last element now x3, expecting null");
	System.out.println( tbm.pollLast() );
	System.out.println(tbm.pollLast() );
	System.out.println(tbm.pollLast() );
	System.out.println(tbm.pollLast() ); //extra calls to hit null case if remove not implemented
	System.out.println(tbm.pollLast() );

	System.out.println("Removing last element now x3;expecting an error");
	//System.out.println(tbm.removeLast() );
	//System.out.println(tbm.removeLast() );
	//System.out.println(tbm.removeLast() );
	//System.out.println( tbm.removeLast() );  //extra calls to hit exception case if poll not implemented
	//System.out.println(tbm.removeLast() );

	System.out.println("Woo! You've made it :D");
    }//end main

}//end DequeTester
	
	
