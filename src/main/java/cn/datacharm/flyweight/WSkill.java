package cn.datacharm.flyweight;

/**
 * @author datacharm.cn
 */
public class WSkill implements Skill {
    @Override
    public void release() {
        System.out.println("疾跑");
    }
}
