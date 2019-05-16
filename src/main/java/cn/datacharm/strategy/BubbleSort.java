package cn.datacharm.strategy;

/**
 * create by hjx on 2019-05-16
 */
public class BubbleSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                T temp;
                if(arr[i].compareTo(arr[j])>0){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("冒泡排序");
    }
}
