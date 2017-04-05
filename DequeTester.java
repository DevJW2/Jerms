/*~~~~~~~~~~~
  FromWhat
  Yuanchu Liu (Leo) & Nikolas Cruz-Marsted
  APCS2 pd 3
  hw29 -- Stress is the Best
  2017-04-04
  ~~~~~~~~~~~ */

public class DequeTester{
    public static void main(String[] args){

	/* ~~~~~~~~~ Basic operations */
	DLLDeque ada = new DLLDeque();
	ada.addLast("Bob");
	ada.addLast("Cal");
	ada.addLast("Tim");
	ada.addLast("Zoe");
	System.out.println(ada);
	System.out.println(ada.pollFirst());//Bob
	System.out.println(ada.peekFirst());//Cal
	System.out.println(ada.pollLast());//Zoe
	System.out.println(ada.peekLast());//Tim


	
	/* ~~~~~~~~~ Robustness Test of toString
	   Should print 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0
	   Checks if your Deque can have Deques
	   ~~~~~~~~~ */
	Deque OfWhat = new DLLDeque();
	Deque FromWhat = new DLLDeque();
	Deque BelongToWhat = new DLLDeque();
	
	for(int i = 0; i < 10; i ++){
	    OfWhat.addLast(i);
	    FromWhat.addLast(i);
	    BelongToWhat.addLast(i);
	}

	Deque<Deque> HeheXD = new DLLDeque();
	HeheXD.addLast(OfWhat);
	HeheXD.addLast(FromWhat);
	HeheXD.addLast(BelongToWhat);
	System.out.println(HeheXD);

    }
}
