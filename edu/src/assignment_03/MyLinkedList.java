package assignment_03;

import java.util.List;

public class MyLinkedList {

	private Node head;
	public MyLinkedList() {
		head = null;
	}
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}
	public void add(String data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			next.link = newNode;
			
		}
			
		
	}
	public void printList() {
		//printList() 결과는 A -> B -> C 등으로 출력한다 > 240507 이거 아직 안풀음 바꿔야함! 그리고 이거 바꾸게되면 delete도 바꿔야하는지 확인필요! 어떤식으로 정렬하나에 따라 바뀔듯.
		if(head == null) {
			System.out.println("");
		}else {
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
	public void delete(String data) { // 교수님이 풀어줌! 이거 코드 뜯어보면서 고민해보기! 내가 코드를 못짰던 이유는 원리를 알아도 그걸 알고리즘화를 시키지 못했기 때문 왜? 데이터의 돌아가는 알고리즘을 잘 몰라서.
		Node p = head, q = null;
		if (p == null){
			System.out.println("해당 객체가 없습니다.");
		}else {
			while( p != null) {
				if (p.data.compareTo(data)==0) {
					if (q == null) {
						head = p.link;
					} else
						q.link = p.link;
					return;
				}
				else {
					q = p;
					p = p.link;
				}
			}
				
		}
	}
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.printList();

		myList.add("JAVA");
		myList.add("HTML");
		myList.add("CSS");
		myList.add("Javascript");
		myList.printList();
		myList.delete("CSS");
		myList.printList();

}


}
