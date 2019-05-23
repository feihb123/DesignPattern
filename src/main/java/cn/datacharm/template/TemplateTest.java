package cn.datacharm.template;

/**
 * @author datacharm.cn
 */
public class TemplateTest {
    public static void main(String[] args) {
        FiredChicken firedChicken = new FiredChicken();
        firedChicken.cook();
        System.out.println("------------");
        Chips chips = new Chips();
        chips.cook();
    }
}
