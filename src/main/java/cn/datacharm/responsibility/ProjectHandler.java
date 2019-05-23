package cn.datacharm.responsibility;

/**
 * @author datacharm.cn
 */
public class ProjectHandler extends  Handler {


    @Override
    public void Handle(Task task) {
        String taskLevel = task.name;
        if("小任务" == taskLevel){
            System.out.println("项目组解决了此任务");
        }else {
            System.out.println("项目组移交下一位负责人处理");
            getNext().Handle(task);
        }
    }
}
