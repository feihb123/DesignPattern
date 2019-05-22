package cn.datacharm.flyweight;

/**
 * @author datacharm.cn
 */
public class ESkill implements Skill {
    @Override
    public void release() {
        System.out.println("上毒");
    }
}
