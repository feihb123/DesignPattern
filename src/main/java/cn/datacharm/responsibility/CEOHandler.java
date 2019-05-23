package cn.datacharm.responsibility;

/**
 * @author datacharm.cn
 */
public class CEOHandler extends  Handler{
    @Override
    public void Handle(Task task) {
        String taskLevle = task.name;
        if("重大任务" == taskLevle){
            System.out.println("CEO解决了此任务");
        }else {
            System.out.println("该任务无法解决");
        }
    }
}
