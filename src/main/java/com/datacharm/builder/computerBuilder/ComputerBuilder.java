package com.datacharm.builder.computerBuilder;

public abstract  class ComputerBuilder {
    //setter注入
    Computer computer = new Computer();
    abstract  void buildCpu();
    abstract  void buildMemory();
    abstract  void buildGraphicsCard();
    abstract  void buildMainBoard();
    abstract  void buildHardDisk();
    abstract  void buildDisplayer();
    abstract  void buildKeyBoard();
    abstract  void buildMouse();

    Computer get(){
        return computer;
    }


}
