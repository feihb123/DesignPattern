package cn.datacharm.statepattern.Hero;

/**
 * @author datacharm.cn
 */
public class Hero {
    private State state;

    public Hero(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start() throws Exception {
        state.handle();
    }
}
