package cn.datacharm.mediator;

/**
 * @author datacharm.cn
 */
public class ConcreteMediator implements Mediator {
    private RentPerson rentPerson;
    private BuyPerson buyPerson;

    public ConcreteMediator() {

    }

    public RentPerson getRentPerson() {
        return rentPerson;
    }

    public void setRentPerson(RentPerson rentPerson) {
        this.rentPerson = rentPerson;
    }

    public BuyPerson getBuyPerson() {
        return buyPerson;
    }

    public void setBuyPerson(BuyPerson buyPerson) {
        this.buyPerson = buyPerson;
    }

    @Override
    public void contact(Person person, String message) {
        if(person == buyPerson){
            rentPerson.getMessage(message);
        }else{
            buyPerson.getMessage(message);
        }
    }
}
