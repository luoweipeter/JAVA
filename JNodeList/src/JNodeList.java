
public class JNodeList {

	/**
	 * @param args
	 */
	private int length;
	private final Node header;
	
	public JNodeList(){
		this.length=0;
		this.header=null;
	}
	
	public JNodeList(Node header){
		this.length=1;
		this.header=header;
	}
	
	private void display(){
		Node cursor=this.header;
		System.out.println("this is display method~!");
		while(cursor!=null){
			System.out.println("ID:"+cursor.data.ID+"\n"+
							   "data:"+cursor.data.date+"\n");
			cursor=cursor.next;
			
		}
	}
	
	private void addTail(Node node){
		Node cursor=this.header;
		System.out.println("this is add method");

		while(cursor.next!=null){
			cursor=cursor.next;
		}
		
		if(cursor.next==null){
			cursor.next=node;
			}
	}
	
	private void delete(){
		System.out.println("this is delete method");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JNodeList nodelist=new JNodeList(new Node(new Elem(1,222)));
		
		nodelist.addTail(new Node(new Elem(2, 333)));
		nodelist.display();
		

	}

}

class Elem{
	int ID;
	int date;
	
	public Elem(int id,int date){
		this.ID=id;
		this.date=date;
	}
}

class Node{
	Elem data;
	Node next;
	public Node(Elem elem){
		this.data=elem;
		this.next=null;
	}
}