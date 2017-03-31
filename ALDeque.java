import java.util.ArrayList;

public class ALDeque<T> implements Deque<T> {

    private ArrayList<T> _deque;

    public ALDeque(){
	_deque=new ArrayList<T>();//.get(0)=front .get(size-1)=end
    }

    public void addLast(T val){
	_deque.add(val);
    }

    public T peekLast(T val){
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
}
