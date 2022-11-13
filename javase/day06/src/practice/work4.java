package practice;

public class work4 {
    public static void main(String[] args) {
        //创建一个int型数组
        int[] arr = {9, 2, 4, 7, 3, 8};
        sortArr(arr);//方法调用
        print(arr);//方法调用输出结果

    }
//冒泡排序    相邻的两个数组元素两两作比较 小的在前大的在后
    //定义一个方法 返回值类型为空 方法名为 sortarr 形参列表为int[] arr
    public static void sortArr(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {   //外层循环控制比较多少轮 数组长度为6 比五轮（arr.length-1)轮
            for (int j = 0; j < arr.length-1-i; j++) {  //内层循环控制每轮比较的次数
                //比较内容 arr[j]   arr[j+1]  交换方式 如前>后 则交换
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
        //遍历数组
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");  //打印输出结果
            }
        }
    }
