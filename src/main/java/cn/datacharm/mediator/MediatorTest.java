package cn.datacharm.mediator;

/**
 * @author datacharm.cn
 */
public class MediatorTest {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        RentPerson rentPerson = new RentPerson("出租者1号",mediator);
        BuyPerson buyPerson = new BuyPerson("购买者1号",mediator);
        mediator.setRentPerson(rentPerson);
        mediator.setBuyPerson(buyPerson);
        rentPerson.contract("房子要伐");
        buyPerson.contract("租一年多少");
        rentPerson.contract("8888");

    }
}
