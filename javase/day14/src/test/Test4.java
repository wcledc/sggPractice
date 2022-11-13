package test;
/*
    4.需求：把数组中的数据按照指定格式拼接成一个字符串
		举例：
			int[] arr = {1,2,3,4,5,6};
		输出结果：
			"[1,2,3,4,5,6]"
	分析:

		1.遍历数组获取每一个元素
		2.按照指定的格式进行拼接
			首元素 : [ + 元素
			中间元素: 元素 + ","
			尾元素:元素+ ]
     */
public class Test4 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4,5,6};
        String s = "";
        //遍历数组 获取每一个元素
        for (int i = 0; i < arr.length; i++) {
            //按照指定的格式进行拼接
            if (i == 0){
                //首元素 : [ + 元素
                s += "[" + arr[i] + ",";
            } else if (i == arr.length-1) {
                //尾元素:元素+ ]
                s += arr[i] + "]";
            }else{
                //中间元素: 元素 + ","
                s += arr[i] + ",";
            }
        }
        System.out.println(s);
    }
}
