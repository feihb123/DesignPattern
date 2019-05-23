package cn.datacharm.mediator;

/**
 * @author datacharm.cn
 */
public class RentPerson extends Person {

    public RentPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介联系
     */
    @Override
    public void contract(String message) {
        mediator.contact(this,message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name+"收到信息："+message);
    }
}
