package cn.datacharm.observer;

public interface Obeserverable {
     void register(Observer oberver);
     void remove(Observer oberver);
     void notifyObservers();
}
