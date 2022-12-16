package day01;

public class MayiktLinkedList<E> {
    private Node<E> first;//第一个节点
    private Node<E> last;//最后一个节点
    int size=0;//LinkedList存放的元素个数
    private static class Node<E>{
        private E item;//当前节点的值
        private Node<E> next;//下一个节点
        private Node<E> prev;//上一个节点
        public Node(Node<E>prev,E item,Node<E>next){
            this.item=item;
            this.next=next;
            this.prev=prev;
        }


    }
    public void add(E e){
//创建一个新的node节点 add方法 创建一个新的node节点 新的node节点上一个节点
        Node l=last;//获取当前链表中最后一个节点
        //新的node节点上一个节点 当前链表中的最后一个节点
        Node<E> newNode = new Node<>(l, e, null);
        last=newNode;
        if (l==null){
            first=newNode;
        }else {
            l.next=newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        MayiktLinkedList<String> mayiktLinkedList = new MayiktLinkedList<>();
        mayiktLinkedList.add("mayikt1");
        mayiktLinkedList.add("mayikt2");
        mayiktLinkedList.add("mayikt3");
        System.out.println("链表结构的add方法执行完毕");
        System.out.println(mayiktLinkedList.first);
    }
}
