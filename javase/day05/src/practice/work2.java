package practice;
//冒泡排序：相邻的两个元素，两两作比较，小的在前 大的在后
public class work2 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {12,54,65,88,56,34};
       // sortArr(arr);
        //print(arr);
        //int index = getIndex(arr,56);
        //System.out.print(index);
        int index = seach(arr,34);
        System.out.println(index);
    }
    public static void sortArr(int[] arr){
        //外循环决定比较多少轮  6个长度 比较5轮
        for(int i = 0; i < arr.length-1; i++){
            //内循环决定每轮比较多少次（递减的规律减i）
            for (int j = 0; j < arr.length-1-i; j++){
                //交换的条件 ：前>后 交换
                //arr[j]     arr[j+1]
                if (arr[j] > arr[j+1]){
                    //引入第三方变量 做交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
   //顺序查询
    public static int getIndex(int[] arr,int num){
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == num){
                return index;
            }
        }
        return -1;
    }
    //二分查询
    public static int seach(int[] arr,int num){
        int min = 0;
        int max = arr.length-1;
        int mid = (min + max) / 2;

        while (true){
            if (min > max){
                return -1;
            } else if (arr[mid] > num) {
                max = mid -1;
                mid = (min + max) /2;
            } else if (arr[mid] < num) {
                min = mid +1;
                mid = (min + max) /2;
            }else{
                return mid;
            }
        }
    }
}
