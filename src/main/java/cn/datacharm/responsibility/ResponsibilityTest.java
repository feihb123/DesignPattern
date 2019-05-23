package cn.datacharm.responsibility;

/**
 * @author datacharm.cn
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        ProjectHandler projectHandler = new ProjectHandler();
        DepartmentHandler departmentHandler = new DepartmentHandler();
        CEOHandler ceoHandler = new CEOHandler();
        projectHandler.setNext(departmentHandler).setNext(ceoHandler);
        projectHandler.Handle(new Task("一般任务"));
    }
}
