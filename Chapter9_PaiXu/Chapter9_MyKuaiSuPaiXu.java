package Chapter9_PaiXu;

import java.util.Arrays;

public class Chapter9_MyKuaiSuPaiXu {
	public void quicksort(int []a,int low,int high){//�������������
		if(low<high){  
		int resultIndex=pointIndex(a,low,high);
		quicksort(a,low,resultIndex-1);
		quicksort(a,resultIndex+1,high);
		}
	}
	public int pointIndex(int []a,int low,int high){
		int j=low-1;                         //���С���м�ֵֵ�����Ԫ�ص�λ�õ���һ�� Ҳ���Ǵ����м�ֵ�ĵ�һ��λ�� ���ڰ�С���м�ֵ�������뵽�˴�  ���Ѵ˴���ԭ����������i��
		int i=low; 
		int k=high;
		for(i=0;i<=k-1;i++){             //��Ϊ���һ��Ԫ�����м�ֵ ���Բ���Ҫѭ�������һ��Ԫ��
			if(a[i]<=a[k]){
				j=j+1;                      //��������Ԫ����С���м�ֵ�İѵ�һ�������м�ֵ��Ԫ�غ����Ԫ�ؽ���λ��
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int temp1=a[j+1];             //�����м�ֵ�ĵ�һ��Ԫ��
		a[j+1]=a[k];
		a[k]=temp1;
		return j+1;
	}
	public static void quickSort(int[] a, int l, int r) {  //��һ�ַ���  ����Ч �����߿�ʼ����
		//http://www.cnblogs.com/skywang12345/p/3596746.html
		if (l < r) {
			int i,j,x;
			i = l;
			j = r;
			x = a[i];                   //�ѵ�һ��Ԫ�ص����м�ֵ
			while (i < j) {
				while(i < j && a[j] > x)
					j--;               // ���������ҵ�һ��С��x����
				if(i < j)
					a[i++] = a[j];
				while(i < j && a[i] < x)
					i++;               // ���������ҵ�һ������x����
				if(i < j)
					a[j--] = a[i];
			}
			a[i] = x;//�����м�ֵ����a[i] a[j]Ҳ����
			quickSort(a, l, i-1); /* �ݹ���� */
			quickSort(a, i+1, r); /* �ݹ���� */
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={2,8,7,1,3,5,6,4,0};
		Chapter9_MyKuaiSuPaiXu ks=new Chapter9_MyKuaiSuPaiXu();
//		ks.quicksort(a, 0, a.length-1);
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
