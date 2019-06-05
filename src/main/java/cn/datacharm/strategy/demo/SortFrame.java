/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.datacharm.strategy.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import javax.swing.JFileChooser;

/**
 *策略模式排序
 * @author feihb
 */
public class SortFrame extends javax.swing.JFrame {
    public interface Sort {
        <T extends Comparable> void sort(T arr[]);
    }
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
    public class InsertionSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            T temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(temp)>0) {
                    arr[j] = arr[j - 1];

                } else
                    break;
            }
            arr[j] = temp;
        }
        System.out.println("插入排序");
    }
}
public class SelectSort implements Sort {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        int len = arr.length;
        T temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int samllestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j].compareTo(temp)<0) {
                    temp = arr[j];
                    samllestLocation = j;
                }
            }
            arr[samllestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.println("选择排序");
    }
}

public class SortContext  {

    private Sort sort;

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public <T extends Comparable> void sort(T[] arr) {
        sort.sort(arr);
    }
}
//开始时间
double start;
//结束时间
double end;
SortContext context = new SortContext();
//待排序字符串
String str = "";
    
    /**
     * Creates new form SortFrame
     */
    public SortFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcom = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jt2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("读取文件");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt1ActionPerformed(evt);
            }
        });

        jLabel1.setText("可选择排序算法");

        jcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "冒泡排序", "选择排序", "插入排序", "堆排序" }));
        jcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomActionPerformed(evt);
            }
        });

        jButton2.setText("排序");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt2ActionPerformed(evt);
            }
        });

        jLabel2.setText("排序时间");

        jt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt3ActionPerformed(evt);
            }
        });

        jLabel3.setText("待排序数据");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt2)
                    .addComponent(jt1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(58, 58, 58)
                                .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt1ActionPerformed

    private void jt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt2ActionPerformed

    private void jt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt3ActionPerformed

    private void jcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(file));     
     
            String line = "";
            while((line = reader.readLine() )!= null){        
                str += line;
            }
            jt1.setText(str);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       int selected = jcom.getSelectedIndex();
        System.out.println("=---"+selected);
       switch(selected){
           case 0:context.setSort(new BubbleSort());break;
           case 1:context.setSort(new SelectSort());break;
           case 2:context.setSort(new InsertionSort());break;
           case 3:context.setSort(new HeapSort());break;
           default:System.out.println("选择出现错误");
       }
       char[] arr = str.toCharArray();
       Integer[] a = new Integer[arr.length];
       for(int i = 0;i < arr.length;i++){
           a[i] = Integer.parseInt(String.valueOf(arr[i]));
       }
       start = System.currentTimeMillis();
       context.sort(a);
       end = System.currentTimeMillis();
       String s = "";
       for(Integer i:a){
           s += i;
       }
       jt2.setText(s);
       jt3.setText(String.valueOf(end - start));
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SortFrame s = new SortFrame();
                s.setTitle("费浩彬-策略模式排序");
                s.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcom;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    // End of variables declaration//GEN-END:variables
}
