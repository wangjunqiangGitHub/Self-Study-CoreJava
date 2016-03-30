package com.wjq.cn.array;

public class ArrayUtil {
	/**
	 *	求数组的最大值
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr){
		int max=arr[0];
		for (int i : arr) {
			if(i>max){
				max=i;
			}
		}
		return max;
	}
	
	/**
	 * 球数组的最小值
	 * @param arr
	 * @return
	 */
	public static int getMin(int arr[]){
		int min=arr[0];
		for (int i : arr) {
			if(i<min){
				min=i;
			}
		}
		return min;
	}
	
	/**
	 * 遍历数组
	 * @param arr
	 */
	public static void printArray(int[] arr){
		System.out.println("[");
		for (int i : arr) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
	/**
	 * 求数组的总和
	 * @param arr
	 * @return
	 */
	public static int getSum(int arr[]){
		int sum=0;
		for (int i : arr) {
			sum+=i;
		}
		return sum;
	}
	
	/**
	 * 求平均值
	 * @param arr
	 * @return
	 */
	public static int getAvg(int arr[]){
		return getSum(arr)/arr.length;
	}
	
	/**
	 * 数组的反转
	 * @param arr
	 * @return
	 */
	public static int[] reverse(int arr[]){
		for (int i = 0,j=arr.length-1; i <j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
	
	/**
	 * 数组的复制
	 * @param arr
	 * @return
	 */
	public static int[] arrayCopy(int[] arr){
		int[] copy=new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);
		return copy;
	}
	
	/**
	 * 对数组进行排序
	 * @param arr
	 * @param order
	 */
	public static void arrSort(int arr[],String order){
		if("asc"==order){//小到大
			for (int i = 0; i < arr.length-1; i++) {
				//从大到小依次挑出,从数组的末尾开始向头部存放，第一趟内循环挑出最大的，第二趟内循环挑出次大的。。。。
				for (int j = 0; j < arr.length-1-i; j++) {
					if(arr[j]>arr[j+1]){
						swap(arr, j, j+1);
					}
				}
			}
		}else if ("desc"==order) {//大到小
			for(int i=0;i<arr.length-1;i++){
				//从小到大依次挑出，也是从数组的末尾开始向头部存放
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]<arr[j+1]){
						swap(arr, j, j+1);
					}
				}
			}
		}else {
			System.out.println("请问要如何排序呢？？？？？？");
		}
	}
	
	
	/**
	 * 交换数组中元素的位置
	 * @param arr
	 * @param x
	 * @param y
	 */
	public static void swap(int[] arr,int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	
	
	
	
	

}
