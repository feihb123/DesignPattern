package cn.datacharm.mediator;

/**
 * @author datacharm.cn
 */
public class BuyPerson extends Person {

    public BuyPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contract(String message) {
        mediator.contact(this,message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name+"收到信息："+message);
    }
}
