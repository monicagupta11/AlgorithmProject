




public class LinkedListFromScratch {
	
	Node head;
	
	public void add(int data){
		
		if(this.head== null){
			this.head = new Node(data);
		}
		else{
			Node notetoadd= new Node(data);
			notetoadd.next = this.head;
			this.head = notetoadd;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListFromScratch list = new LinkedListFromScratch();
		list.add(18);
		list.add(20);
		
		System.out.println(list.head.data);
		System.out.println(list.head.next.data);
	}
	
	
	
	
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
		}
	}

}
