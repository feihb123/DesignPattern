package cn.datacharm.composite;

import java.util.ArrayList;

/**
 * 树枝组件
 * @author datacharm.cn
 */
public class Branch implements Component{
    /**
     * 子节点（可是树枝，也可是树叶）
     */
    private ArrayList<Component> children=new ArrayList<>();

    private String name;
    public Branch(String name) {
        this.name=name;
    }
    @Override
    public void add(Component c){
        children.add(c);
    }
    @Override
    public void remove(Component c){
        children.remove(c);
    }
    @Override
    public Component getChild(int i){
        return children.get(i);
    }
    @Override
    public void operation(){
        System.out.println("树枝"+name+"：被访问！");
        for(Component obj:children){
            obj.operation();
        }
    }
}

