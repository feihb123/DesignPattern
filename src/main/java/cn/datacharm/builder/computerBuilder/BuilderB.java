package cn.datacharm.builder.computerBuilder;

public class BuilderB extends ComputerBuilder {


    @Override
    void buildCpu() {
        computer.setCpu("cpuB");
    }

    @Override
    void buildMemory() {
        computer.setMemory("memoryB");
    }

    @Override
    void buildGraphicsCard() {
        computer.setGraphicsCard("graphicsB");
    }

    @Override
    void buildMainBoard() {
        computer.setMainborad("mainboardB");
    }

    @Override
    void buildHardDisk() {
        computer.setHardDisk("hardDiskB");
    }

    @Override
    void buildDisplayer() {
        computer.setDisplayer("displayerB");
    }

    @Override
    void buildKeyBoard() {
        computer.setKeyboard("keyboardB");
    }

    @Override
    void buildMouse() {
        computer.setMouse("mouseB");
    }
}
