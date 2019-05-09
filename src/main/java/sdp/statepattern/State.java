package sdp.statepattern;

/**
 * 录音机状态类
 */
public interface State {
    void play();
    void pause();
    void stop();

    void handle();//当前状态下实际能完成的的操作。
}
