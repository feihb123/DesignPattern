package cn.datacharm.responsibility;

/**
 * @author datacharm.cn
 */
public abstract class Handler {
    Handler next;

    public Handler getNext() {
        return next;
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void Handle(Task task);
}
