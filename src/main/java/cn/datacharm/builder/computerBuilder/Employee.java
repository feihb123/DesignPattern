package cn.datacharm.builder.computerBuilder;

public class Employee {
    ComputerBuilder computerBuilder;

    public Employee(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer build(){
        computerBuilder.buildCpu();
        computerBuilder.buildDisplayer();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDisk();
        computerBuilder.buildKeyBoard();
        computerBuilder.buildMainBoard();
        computerBuilder.buildMemory();
        computerBuilder.buildMouse();
        return computerBuilder.get();
    }
}
