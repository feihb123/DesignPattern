package cn.datacharm.composite;

/**
 * 树叶组件
 * @author datacharm.cn
 */
class Leaf implements Component{
    private String name;
    public Leaf(String name) {
        this.name=name;
    }
    @Override
    public void add(Component c){
        throw new RuntimeException("无法添加子节点");
    }
    @Override
    public void remove(Component c){
        throw new RuntimeException("无法删除子节点");
    }
    @Override
    public Component getChild(int i){
        return null;
    }
    @Override
    public void operation(){
        System.out.println("  树叶"+name+"：被访问！");
    }
}

