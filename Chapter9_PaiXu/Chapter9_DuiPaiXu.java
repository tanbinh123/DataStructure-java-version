package Chapter9_PaiXu;
import java.util.Arrays;
/*
 * ������ʱ�临�Ӷ�ΪO[NlgN]  ����ԭַ��  ���ȶ�  �����ų����Ǵ�С���������Լ�д��
 */
public class Chapter9_DuiPaiXu {
	public static int  n;
    public void heapsort(int []a){
    	n=a.length-1;
    	for(int i=(n/2);i>=0;i--){
    		changeNode(a,i,n);// ����ǽ�������
    	}
    	System.out.println(Arrays.toString(a));//[16, 14, 10, 8, 7, 9, 3, 2, 4, 1]
    	for(int j=n;j>=0;j--){//ʼ�հѵ�һ�����ڵ�����Ԫ�طŵ����Ȼ�����µݹ�õ����ڵ�����ֵ
    		int temp=a[0];
			a[0]=a[j];
            a[j]=temp;
            changeNode(a,0,j-1); //������������İ����ѱ�Ϊ�źõ�˳������
    	}
    	System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 7, 8, 9, 10, 14, 16]
    }
    public void changeNode(int[]a,int i,int n){
		int l=2*i+1;
		int r=2*i+2;
		int maxIndex=0;
		if(l<=n&&a[l]>a[i]){
			maxIndex=l;
		}else{maxIndex=i;}
		if(r<=n&&a[r]>a[maxIndex]){
			maxIndex=r;
		}
		if(maxIndex!=i){
			int temp=a[i];
			a[i]=a[maxIndex];
            a[maxIndex]=temp;	
            changeNode(a,maxIndex,n);
		}
	}
	public static void main(String[] args) {
    int[]a={4,1,3,2,16,9,10,14,8,7};
    Chapter9_DuiPaiXu dp=new Chapter9_DuiPaiXu();
    dp.heapsort(a);
    
	}
}
