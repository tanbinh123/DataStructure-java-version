package Chapter3_ShuangLianBiao;
/*
 * �Լ�д����ʽ˫��ѭ����������add��delete������ͷ���ĺ������ Ҳ�����ڵ�һ��λ�ò��� �൱��ջɾ�������������
 * ע�� ��LinkedList��add,addlast,offer offerlast��ͬ�൱�ڶ��з���
 *                    addfirst, offerfirst ,push��ͬ �൱��ջ����
 */
public class ShuangLianBiao {
	int  size=0;
	Node3 nil=new Node3(null);//��ʾ�յ�ͷ���ߵ�ָ��ֱ�ָ���һ��Ԫ�غ����һ��Ԫ��
	Node3 current;
    public ShuangLianBiao(){  //���û�������ʼ���Ļ� ���׳��쳣
    	nil.next=nil.pre=nil;//��ʼ�� �Լ�ָ���Լ�
    }
    public int size(){
    	return size;
    }
	public void  addfirst(Object a){//�˷����൱��Դ���е�addFirst�Լ�ջ�е�push()��ͷ�����Ԫ��  Ҳ������ͷ��ǰ����� ����ʱ�临�Ӷ���O[1]
      Node3 NodeNumber=new Node3(a);
      if(nil.next==null){//���ֻ��ͷ���
    	    NodeNumber.pre=nil.pre;//����������ͬ������ ����ָ��ͬһ������
    	    NodeNumber.next=nil.next;//������ĺ�����ͬ
    	    nil.pre=NodeNumber;//��ͷ����ǰָ��ָ��Ҫ�����Ԫ��
			nil.next=NodeNumber;//��ͷ���ĺ�ָ��ָ��Ҫ�����Ԫ�� 
			size++;
      }
		else{
			NodeNumber.next=nil.next; //��������������ͬ ָ��ͬһ���� �㷨�����е�1,2��
			nil.next.pre=NodeNumber;  //��������������ͬ ָ��ͬһ����
			nil.next=NodeNumber;
			NodeNumber.pre=nil;
		    size++;
		}
    }
    public void removefirst(){ //�൱��ջ�����е�pop��removefirst��ͷ�������ɾ����
    	if(size==0){
    	    System.out.println("û�н�㣬�޷�ɾ����");
    		return;
    	}else{
    		nil.next.next.pre=nil;//�Ȱѵ�������㣨����ͷ��㣩��ǰָ��ָ��ͷ���
    		nil.next=nil.next.next;//Ȼ���ͷ���ĺ�ָ��ָ����������  ���д��뻥��Ҳ����
    	    size--;
    	}
    }
    public void insert(int index,Object data){//���뵽index�ĺ���
    	Node3 insertNode=new Node3(data);
    	if(index==0)
    		addfirst(data);
    	else{
    		Node3 preNode=serach(index);
    		insertNode.next=preNode.next;//�ȰѲ���Ԫ�غͺ����Ԫ������
    		preNode.next.pre=insertNode;
    		preNode.next=insertNode;
    		insertNode.pre=preNode;
    		//�������Ҳ�����ȰѲ���Ԫ�طֱ���һ��
//        	insertNode.next=preNode.next;
//        	insertNode.pre=preNode.next.pre;
//        	preNode.next=insertNode;
//        	preNode.next.pre=insertNode;
    	}
    }
    public Node3 serach(int index){  //������������Ԫ��  �ӵ�һ����Чֵ��ʼ
    	if(size==0||index==0||index>size)
    	    System.out.println("����û��Ҫ�ҵ�Ԫ�أ�");
    	else{ 
    		current=nil;
    		if(index>size/2){
    		    for(int i=size;i>=index;i--)
    			   current=current.pre;
    		}
    		if(index<=size/2){
    			for(int j=0;j<index;j++)
    				current=current.next;
    		}
    	}
			return current;
    }
    public void print(){
    	current=nil.next;
    	while(current.data!=null){//ע��ǧ������current��=null��Ϊ˫�����ѭ�����
    		System.out.println(current.data);
    		current=current.next;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuangLianBiao slb=new ShuangLianBiao();
		slb.addfirst(1);
		slb.addfirst(2);
		slb.addfirst("wang");
		slb.addfirst(3);
		slb.addfirst('a');
		slb.insert(2, "xin");
//		slb.removefirst();
		slb.print();
		System.out.println("size:"+slb.size());
		System.out.println("Ҫ�ҵ�Ԫ��Ϊ��"+slb.serach(4).data);
		
	}
}
class Node3{
	Node3 next;
	Node3 pre;
	Object data;
	public Node3(Object data){
		this.data=data;

	}
}