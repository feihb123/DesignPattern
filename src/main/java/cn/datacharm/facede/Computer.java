package cn.datacharm.facede;

/**
 * 门面类  核心
 * @author datacharm.cn
 */
public class Computer {
    CPU cpu;
    Memory memory;
    BIOS bios;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        bios = new BIOS();
    }

    public void start(){
        cpu.start();
        memory.start();
        bios.start();
        System.out.println("电脑启动完成");
    }

    public void shutDown(){
        cpu.shutDown();
        memory.shutDown();
        bios.shutDown();
        System.out.println("电脑关闭完成");
    }
}
