package Practice;
//冒泡排序 相邻的两个元素 两两比较 小的在前 大的在后
public class work1 {
    public static void main(String[] args) {
        //创建一个int形数组
        int[] arr = {24,55,76,31,67,18};
        sortArr(arr);
        print(arr);
        //遍历数组 得出数组中的每个元素值
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }
    //定义返回值为int 形参列表为int[] arr的方法
    public static void sortArr(int[] arr){
        //冒泡排序
        //6个元素 比较5次 比较arr.length-1次
        for (int i = 0; i < arr.length-1; i++) { //外层循环控制交换多少轮
            for (int j = 0; j < arr.length-1-i; j++) { //内层循环控制每轮比较的次数
                //交换内容 arr[j]  arr[j+1] 小的在前 大的在后 前 > 后 则交换
                if (arr[j] > arr[j+1]){
                    //引入第三方变量 进行交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //遍历数组
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
