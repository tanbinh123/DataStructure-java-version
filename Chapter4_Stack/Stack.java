package Chapter4_Stack;

/* �Լ�д��
 * ���ܣ�ʵ��ջ����ʽ�洢
 * ������������Ļ����ϸı�����ɾ���ķ�����ջ�����뼴�������ͷָ��ָ������Ԫ��
 * ջ��˳���ʵ�ַ�����������������в����ɾ������
 */
public class Stack {
	//��ͷָ�뵱��ջ����
			Node top;//ջ��
			Node current;//top����Ľ�㣬��ɾ��topʱ��current��ֵΪtop
		 int count;//����
			public void addNode (Object object){
				    if(top==null){
				    	top=new Node(object);//ע��һ����Ҫֱ����object��ֵ
				    	current=top;
				    	count++;
				    }
				    else{
				    Node  node	=new Node(object);
				    node.next=top;
				    current=node.next;
				    top=node;
				    count++;
				    }
				}
			public void delete(){
				
				if(top==null){
					System.out.println("ջΪ�գ��޷�ɾ����");
					return;
				}
				if(count==1){
					top=null;
					System.out.println("ɾ���ɹ�����û��Ԫ��");
					count--;
					return;
				}
				if(count==2){
					top=current;
					count--;
					return;
				}
				//���Ǵ�ͷ��ɾ��
				if(count>2){
				top=current;//�Ȱ�top�����current����Ϊtop
				current=current.next;//Ȼ���ٰ�current����Ϊtop����һ�����
				count--;
				return;
				}
				
			
				
			}
			 public void print1(Node node) {
		//����������βΣ�ֱ����top��current���ֱ�Ӱ����Ƕ����ˣ�����ִ������ββ���ı�ԭʼ������
			        if (node== null) {
                  System.out.println("ջΪ�ղ��ܴ�ӡ");
			            return;
			        }
			       Node current1 = node;//���¶���һ����ǰ��� ��ֹ��current��ͻ
			        while (current1 != null) {
			            System.out.print(current1.data+"  ");
			            current1 = current1.next;
			        }
			    }
				
			public static void main(String[] args) {
		// TODO Auto-generated method stub
          Stack st=new Stack();
          st.addNode("��һ����ջԪ��");
          st.addNode("�ڶ�����ջԪ��");
          st.addNode("��������ջԪ��");
          st.addNode("���ĸ���ջԪ��");
          st.print1(st.top);//��top��ʼ����
          System.out.println("��һ��ɾ����");
          st.delete();
          st.print1(st.top);
          
          System.out.println("�ڶ���ɾ��:");
          st.delete();
          st.print1(st.top);
          
          System.out.println("������ɾ��:");
          st.delete();
          st.print1(st.top);
          
          System.out.println("���Ĵ�ɾ��:");
          st.delete();
          st.print1(st.top);
        
          
		}

}
class Node{
	Object data;
	Node next;
	public Node(Object data){
		this.data=data;
	}
}