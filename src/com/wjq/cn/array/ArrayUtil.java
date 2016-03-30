package com.wjq.cn.array;

public class ArrayUtil {
	/**
	 *	����������ֵ
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
	 * ���������Сֵ
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
	 * ��������
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
	 * ��������ܺ�
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
	 * ��ƽ��ֵ
	 * @param arr
	 * @return
	 */
	public static int getAvg(int arr[]){
		return getSum(arr)/arr.length;
	}
	
	/**
	 * ����ķ�ת
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
	 * ����ĸ���
	 * @param arr
	 * @return
	 */
	public static int[] arrayCopy(int[] arr){
		int[] copy=new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);
		return copy;
	}
	
	/**
	 * �������������
	 * @param arr
	 * @param order
	 */
	public static void arrSort(int arr[],String order){
		if("asc"==order){//С����
			for (int i = 0; i < arr.length-1; i++) {
				//�Ӵ�С��������,�������ĩβ��ʼ��ͷ����ţ���һ����ѭ���������ģ��ڶ�����ѭ�������δ�ġ�������
				for (int j = 0; j < arr.length-1-i; j++) {
					if(arr[j]>arr[j+1]){
						swap(arr, j, j+1);
					}
				}
			}
		}else if ("desc"==order) {//��С
			for(int i=0;i<arr.length-1;i++){
				//��С��������������Ҳ�Ǵ������ĩβ��ʼ��ͷ�����
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]<arr[j+1]){
						swap(arr, j, j+1);
					}
				}
			}
		}else {
			System.out.println("����Ҫ��������أ�����������");
		}
	}
	
	
	/**
	 * ����������Ԫ�ص�λ��
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
