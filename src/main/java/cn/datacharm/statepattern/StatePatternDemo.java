package cn.datacharm.statepattern;

public class StatePatternDemo {

    public static void main(String[] args) {
        State start = new StartPlayer();
        State pause = new PauseState();
        State stop = new StopState();
        PlayerContext playerContext = new PlayerContext(start);
        playerContext.handle();
        playerContext.setState(pause);
        playerContext.handle();
        playerContext.setState(stop);
        playerContext.handle();
    }
}
