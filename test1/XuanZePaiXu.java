package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * @author wang
 * ʵ��ѡ�����򣺴ӵ�һ����ʼ�ֱ���������Ƚϣ�����һ��������С�����С���Ǹ��ŵ���һ��λ�ã��Դ�����
 * ���Ӷ�ΪO(n*n)���Ǳ�ð�ݺõ�
 *
 */
public class XuanZePaiXu {
	int []arr;
	public void scan()  {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   String s;
	try {
		s = br.readLine();
		String str[]=s.split(" ");
		arr=new int[str.length];
		   for(int i=0;i<s.length();i++){
				  arr[i]=Integer.parseInt(str[i]);
		   }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
	public void  test(){
		int minindex;
		for(int i=0;i<arr.length-1;i++){
			//��ѭ��
			for(int j=i+1;j<arr.length;j++){
				//��ѭ��
				minindex=i;
				if(arr[minindex]>arr[j]){
					minindex=j;
				}
				if(i!=minindex){
					int temp=arr[i];
					arr[i]=arr[minindex];
					arr[minindex]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XuanZePaiXu paixu=new XuanZePaiXu();
		System.out.println("������һ����");
		paixu.scan();
		paixu.test();
		
	}

}
