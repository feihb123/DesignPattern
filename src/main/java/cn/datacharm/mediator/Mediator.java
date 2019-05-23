package cn.datacharm.mediator;

/**
 * 中介者接口，负责联络
 * @author datacharm.cn
 */
public interface Mediator {
    void contact(Person person,String message);
}
