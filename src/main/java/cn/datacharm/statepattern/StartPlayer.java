package cn.datacharm.statepattern;

public class StartPlayer implements State {

    @Override
    public void play() {
        System.out.println("开始播放");
    }

    @Override
    public void pause() {
        System.out.println("---");
    }

    @Override
    public void stop() {
        System.out.println("---");
    }

    @Override
    public void handle() {
        play();
    }
}
