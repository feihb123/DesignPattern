package cn.datacharm.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者  - 服务器
 * @author datacharm.cn
 */
public class Server implements  Obeserverable{
    private List<Observer> observers;
    private String message;

    public Server() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(message);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
