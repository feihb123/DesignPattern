package com.datacharm.statepattern;

public class StopState implements State {
    @Override
    public void play() {
        System.out.println("---");
    }

    @Override
    public void pause() {
        System.out.println("---");
    }

    @Override
    public void stop() {
        System.out.println("关机");
    }

    @Override
    public void handle() {
        stop();
    }
}
