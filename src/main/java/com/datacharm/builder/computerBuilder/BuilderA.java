package com.datacharm.builder.computerBuilder;

public class BuilderA extends ComputerBuilder {


    @Override
    void buildCpu() {
        computer.setCpu("cpuA");
    }

    @Override
    void buildMemory() {
        computer.setMemory("memoryA");
    }

    @Override
    void buildGraphicsCard() {
        computer.setGraphicsCard("graphicsA");
    }

    @Override
    void buildMainBoard() {
        computer.setMainborad("mainboardA");
    }

    @Override
    void buildHardDisk() {
        computer.setHardDisk("hardDiskA");
    }

    @Override
    void buildDisplayer() {
        computer.setDisplayer("displayerA");
    }

    @Override
    void buildKeyBoard() {
        computer.setKeyboard("keyboardA");
    }

    @Override
    void buildMouse() {
        computer.setMouse("mouseA");
    }
}
