package cn.datacharm.builder.computerBuilder;



public class ComputerShop {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new BuilderA();
        Employee employee = new Employee(computerBuilder);
        Computer computer = employee.build();
        System.out.println(computer.toString());
    }
}
