package cn.datacharm.composite;

/**
 * @author datacharm.cn
 */
interface Component{
     void add(Component c);
     void remove(Component c);
     Component getChild(int i);
     void operation();
}

