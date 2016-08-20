package Chapter9_PaiXu;
import java.util.Arrays;
/**
 * �鲢����Java�鲢�����ʱ�临�Ӷ���O(N*lgN)�� �ȶ�����   ������ԭַ��
 * http://www.cnblogs.com/skywang12345/p/3602369.html
 * @author skywang
 * @date 2014/03/12
 */
public class Chapter9_GuiBingPaiXu {
	   public static void mergeSortUp2Down(int[] a, int start, int end) {
	        if(a==null || start >= end)
	            return ;
	        int mid = (end + start)/2;
	        mergeSortUp2Down(a, start, mid); // �ݹ�����a[start...mid]
	        mergeSortUp2Down(a, mid+1, end); // �ݹ�����a[mid+1...end]
	        // a[start...mid] �� a[mid...end]����������ռ䣬
	        // �����������һ������ռ�a[start...end]
	        merge(a, start, mid, end);
	    }
    /*
     * ��һ�������е�����������������ϲ���һ��
     *     a -- ���������������������
     *     start -- ��1�������������ʼ��ַ��
     *     mid   -- ��1����������Ľ�����ַ��Ҳ�ǵ�2�������������ʼ��ַ��
     *     end   -- ��2����������Ľ�����ַ��
     */
    public static void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[a.length];    // tmp�ǻ���2������������ʱ����
        int i = start;            // ��1��������������
        int j = mid + 1;        // ��2��������������
        int k = 0;                // ��ʱ���������
        while(i <= mid && j <= end) {
        	tmp[k++]=(a[i]<=a[j]?a[i++]:a[j++]);
        }
        //����һ��i��j��ֵ�Ѿ�����mid����end
        while(i <= mid)
            tmp[k++] = a[i++];
        while(j <= end)
            tmp[k++] = a[j++];
        // ��������Ԫ�أ�ȫ�������ϵ�����a�С�
        for (i = 0; i < k; i++)
            a[start + i] = tmp[i];
    }
    /*
     * �鲢����(��������)
     *
     * ����˵����
     *     a -- �����������
     *     start -- �������ʼ��ַ
     *     endi -- ����Ľ�����ַ
     */
    public static void main(String[] args) {
        int i;
        int a[] = {80,30,60,40,20,10,50,70,0};
        mergeSortUp2Down(a, 0, a.length-1);        // �鲢����(��������)
        System.out.printf("after  sort:"+Arrays.toString(a));
      
    }
}