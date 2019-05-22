package cn.datacharm.flyweight;

import java.util.*;

/**
 * 类似工厂类，若存在技能直接使用，不存在则新建
 * @author datacharm.cn
 */
public class Teemo {
    /**
    学习的技能列表
     */
    private Map<String,Skill> skills ;
    public Teemo() {
        skills = new HashMap<>();
    }

    public void release(String skill) throws Exception {
        switch (skill){
            case "Q":{
                String key = "Q";
                if(skills.containsKey(key)){
                    System.out.print("已学习Q：");
                    skills.get(key).release();
                }else{
                    System.out.print("首次学习Q：");
                    Skill q = new QSkill();
                    skills.put("Q",q);
                    q.release();
                }
                break;
            }
            case "W":{
                String key = "W";
                if(skills.containsKey(key)){
                    System.out.print("已学习W：");
                    skills.get(key).release();
                }else{
                    System.out.print("首次学习W：");
                    Skill w = new WSkill();
                    skills.put("W",w);
                    w.release();
                }
                break;
            }
            case "E":{
                String key = "E";
                if(skills.containsKey(key)){
                    System.out.print("已学习E：");
                    skills.get(key).release();
                }else{
                    System.out.print("首次学习E：");
                    Skill e = new ESkill();
                    skills.put("E",e);
                    e.release();
                }
                break;
            }
            case "R":{
                String key = "R";
                if(skills.containsKey(key)){
                    System.out.print("已学习R：");
                    skills.get(key).release();
                }else{
                    System.out.print("首次学习R：");
                    Skill r = new RSkill();
                    skills.put("R",r);
                    r.release();
                }
                break;
            }

            default:{
                throw new Exception("按键错误");
            }
        }

    }


}
