package com.datacharm.statepattern;

/**
 * 环境（Context）角色
 */
public class PlayerContext {
    //状态对象
    private State state ;
    //构造注入初始状态
    public PlayerContext(State state) {
        this.state = state;
    }
    //修改其状态
    public void setState(State state) {
        this.state = state;
    }
    //执行的操作
    public void handle(){
        state.handle();
    }
}
