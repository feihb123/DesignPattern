package com.datacharm.statepattern;

public class PauseState implements State {
    @Override
    public void play() {
        System.out.println("---");
    }

    @Override
    public void pause() {
        System.out.println("暂停播放");
    }

    @Override
    public void stop() {
        System.out.println("---");
    }

    @Override
    public void handle() {
        pause();
    }
}
