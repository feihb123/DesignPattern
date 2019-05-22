package cn.datacharm.flyweight;

/**
 * 技能类
 * @author datacharm.cn
 */
public class QSkill implements Skill {
    @Override
    public void release() {
        System.out.println("致盲");
    }
}
