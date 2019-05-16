package cn.datacharm.strategy;

/**
 * create by hjx on 2019-05-16
 */
public class HeapSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        if (arr == null)
            throw new RuntimeException("数据为空");
        int length = arr.length;
        if (length > 1) {
            // 1、初始化最大堆
            initMaxHeap(arr, length - 1);
            // 2、堆排序
            // 将堆顶数据与末尾数据交换，再将i=N-1长的堆调整为最大堆；不断缩小待排序范围直到，无序区元素为0。
            for (int i = length - 1; i > 0; i--) {
                // 2.1 将堆顶数据与末尾数据交换
                swap(arr, 0, i);
                // 2.2 缩小数组待排序范围 i - 1 ，重新调整为最大堆
                adjustMaxHeap(arr, 0, i - 1);
            }
        }
        System.out.println("堆排序");
    }

    /// 构建最大堆  （还未进行排序）
    /// <param name="arr">待排序数组</param>
    /// <param name="maxIndex">待排序数组最大索引</param>
    private  <T extends Comparable>void initMaxHeap(T arr[], int maxIndex){
        // 从完全二叉树最后一个非叶节点 ：
        // 如果根节点在数组中的位置是0，第n个位置的子节点分别在2n+1和 2n+2，其父节点的下标是 (n-1)/2 。
        for (int i = (maxIndex - 1) / 2; i >= 0; i--) {
            adjustMaxHeap(arr, i, maxIndex);
        }
    }

    /// 调整指定父节点的二叉树为最大堆
    /// <param name="arr">待排序数组</param>
    /// <param name="parentNodeIndex">指定父节点</param>
    /// <param name="maxIndex">待排序数组最大索引</param>
    private  <T extends Comparable>void adjustMaxHeap(T arr[], int parentNodeIndex, int maxIndex){
        if (maxIndex > 0){   // 只有堆顶一个元素，就不用调整了
            int resultIndex = -1;
            // 下标为i的节点的子节点是2i + 1与2i + 2
            int leftIndex = 2 * parentNodeIndex + 1;
            int rightIndex = 2 * parentNodeIndex + 2;
            if (leftIndex > maxIndex) {
                // 该父节点没有左右子节点
                return;
            }
            else if (rightIndex > maxIndex)
                resultIndex = leftIndex;
            else
                // 比较左右节点。
                resultIndex = max(arr, leftIndex, rightIndex);

            // 父节点与较大的子节点进行比较
            resultIndex = max(arr, parentNodeIndex, resultIndex);

            if (resultIndex != parentNodeIndex) {
                // 如果最大的不是父节点，则交换。
                swap(arr, parentNodeIndex, resultIndex);
                // 交换后子树可能不是最大堆，所以需要重新调整交换元素的子树
                adjustMaxHeap(arr, resultIndex, maxIndex);
            }
        }
    }

    /// 获取较大数的数组索引
    /// <param name="arr">待排序数组</param>
    /// <param name="leftIndex">左节点索引</param>
    /// <param name="rightIndex">右节点索引</param>
    /// <returns>返回较大数的数组索引</returns>
    private  <T extends Comparable>int max(T arr[], int leftIndex, int rightIndex){
        // 相等，以左节点为大
        T leftObj = arr[leftIndex];
        T rightObj = arr[rightIndex];
        return leftObj.compareTo(rightObj)>= 0 ? leftIndex : rightIndex;
    }


    /// 数组元素交换
    /// <typeparam name="T"></typeparam>
    /// <param name="arr">数组</param>
    /// <param name="i">交换元素1</param>
    /// <param name="j">交换元素2</param>
    private  <T extends Comparable>void swap(T arr[], int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
