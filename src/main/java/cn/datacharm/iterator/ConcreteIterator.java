package cn.datacharm.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list=null;
    private int index=-1;
    public ConcreteIterator(List<T> list){
        this.list=list;
    }
    @Override
    public boolean hasNext()
    {
        if(index<list.size()-1){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public T first(){
        index=0;
        T obj=list.get(index);;
        return obj;
    }
    @Override
    public T next(){
        T obj=null;
        if(this.hasNext()){
            obj=list.get(++index);
        }
        return obj;
    }
}

