package practice;

public class work1 {
    public static void main(String[] args) {
        //创建一个int型数组
        int[] arr = {23,54,67,21,34};
       // getSum(arr);  //调用方法
        //System.out.println(getSum(arr)); //打印输出结果
        //System.out.println(getAvg(arr)); //调用方法并打印输出
        //System.out.println(getMax(arr)); //调用方法并打印输出
        //System.out.println(getMin(arr)); //调用方法并打印输出
        //System.out.println(getProduct(arr));//调用方法并打印输出
        //sortArr(arr); //调用方法
        //print(arr);  //调用方法
        sort1(arr);
        print(arr);
        //数组下标值
        //System.out.println(arr.length-1);
        //遍历数组 获取每个数组的值
        //for (int i = 0; i < arr.length; i++) {
          //  System.out.print(arr[i] + " ");
        //}
    }
    //求和
    //定义一个返回值类型为int型的 形参列表为int[] arr的方法
    public static int getSum(int[] arr){
        int sum = 0;  //定义一个变量初始化为0
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   //累加 数组中的每一个元素相加 arr[i] 代表数组中的每一个元素值
        }
        return sum;   //返回结果
    }
    //求平均值
    public static int getAvg(int[] arr){
        int avg = 0;    //定义一个变量
        avg = getSum(arr)/ arr.length;  // 数组和除以数组长度
         return avg;
    }
    //求最大值
    public static int getMax(int[] arr){
        int max = arr[0];  //假设第一个元素最大
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){  //用每一个数与第一个数作比较
                max = arr[i];  //比较出来的最大值赋给max
            }
        }
        return max;  //返回结果（最大值）
    }
    //求最小值
    public static int getMin(int[] arr){
        int min = arr[0];  //假设第一个元素最小
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){  //用每一个数与第一个数作比较
                min = arr[i];  //比较出来的最小值赋给min
            }
        }
        return min;  //返回结果（最小值）
    }
    //求乘积
    public static int getProduct(int[] arr){
        int product = 1;  //定义一个int型变量（数组元素相乘数值会很大，int变量取值范围太小，如果不够，用long定义；
        // 初始化为1，因为1乘以任何数都不影响结果
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i]; //累乘 数组中的每个元素相乘 arr[i]代表数组中的每一个元素值
        }
        return product;
    }
    //冒泡排序  相邻的两个元素，两两作比较，小的在前，大的在后；
    public static void sortArr(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { //外层循环控制比较多少轮 5个长度比较4轮，数组长度（arr.length-1轮）
            for (int j = 0; j < arr.length-1-i; j++) {  //内层循环控制每轮比较的次数  递减的规律减一
                //比较内容 arr[j] arr[j+1] 比较条件： 如前 > 后 则交换
                if (arr[j] > arr[j+1]){
                    //引入第三方变量 进行交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        //数组遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //打印输出比较结果
        }
    }
    //选择排序
    public static void sort1(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length- 1 - i + 1 + i ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void print1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
