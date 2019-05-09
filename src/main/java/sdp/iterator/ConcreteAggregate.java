package sdp.iterator;

import java.util.*;
public class ConcreteAggregate<T> implements Aggregate<T>{
    private List<T> list=new ArrayList<T>();
    @Override
    public void add(T obj){
        list.add(obj);
    }
    @Override
    public void remove(T obj){
        list.remove(obj);
    }
    @Override
    public Iterator getIterator(){
        return(new ConcreteIterator(list));
    }
}

