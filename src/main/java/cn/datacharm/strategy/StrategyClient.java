package cn.datacharm.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Integer[] arr = {5,8,1,9,2,4,7,6};

        Sort sort1 = new BubbleSort();


        SortContext context = new SortContext();
        context.setSort(sort1);
        long start = System.currentTimeMillis();
        context.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("花费时间:"+(start-end));
        for(int value:arr){
            System.out.print(value + ",");
        }



    }
}
