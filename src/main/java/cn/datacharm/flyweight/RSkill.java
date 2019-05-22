package cn.datacharm.flyweight;

/**
 * @author datacharm.cn
 */
public class RSkill implements Skill {
    @Override
    public void release() {
        System.out.println("放蘑菇");
    }
}
