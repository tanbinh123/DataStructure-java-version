package Chapter3_DanLianBiao;
/*
 * �Լ�д�ĵ�����
 */
public class MyLinlListTest {
    Node1 head;
    Node1 current;
	public void addLinkList(int data){
		if(head==null){
			
		
			head=new Node1(data);
//			head=data;��������д����Ϊhead��Node�͵�data��int �͵�
			current=head;
			
		}
		else{
			current.next = new Node1(data);
//			current.next=data;
			current=current.next;
		}
	}
	public void print(Node1 head){
		if(head==null){
			return;
		}else{
			current=head;
			while(current!=null){
				System.out.print(current.data+"��");
				current=current.next;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinlListTest ml=new MyLinlListTest();
		for(int i=0;i<10;i++){
			ml.addLinkList(i);
		}
		ml.print(ml.head);
	}

}
class Node1{
	int data;
	Node1 next;
	public Node1(int data){
		this.data=data;
	}
}