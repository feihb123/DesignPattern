package cn.datacharm.responsibility;

/**
 * @author datacharm.cn
 */
public class DepartmentHandler extends  Handler{

    @Override
    public void Handle(Task task) {
        String taskLevle = task.name;
        if("一般任务" == taskLevle){
            System.out.println("部门解决了此任务");
        }else {
            System.out.println("部门移交下一位负责人处理");
            getNext().Handle(task);
        }
    }
}
