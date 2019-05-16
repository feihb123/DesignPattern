package cn.datacharm.strategy;

public interface Sort {
    <T extends Comparable> void sort(T arr[]);
}
