package day01;

public class Node<E> {
    private E v;
    Node<E> next;
    //当前节点指向上一个节点
    Node<E> prev;

    public static void main(String[] args) {
        Node<String> node3=new Node<>();
        node3.v="c";
        Node<String> node2=new Node<>();
        node2.v="b";
        node2.next=node3;
        Node<String> node1=new Node<>();
        node1.v="a";
        node1.next=node2;
        System.out.println(node1);
        node2.prev=node1;
        node3.prev=node2;
        Node<String> node4=new  Node<>();
        node4.prev=node3;
        node4.v="d";

        addNode(node3,node4);
        System.out.println(node1);
//        //遍历整个链表
//        System.out.println("遍历链表");
//        ShowNode(node1);
//        //删除node2节点 b删除
//        node1.next=node3;
//        System.out.println("删除之后遍历链表");
//        ShowNode(node1);


    }
    public static void ShowNode(Node<?> node){
        Node<?>cuNode=node;
        while (cuNode!=null){
            System.out.println(cuNode.v);
            cuNode=cuNode.next;
        }
    }

    /**
     * 链表数据结构如何实现新增呢
     * 只需要找到链表中最后一个节点 .next===新增节点
     * 链表数据结构 不用考虑它的扩容性问题 只要内存够了就可以
     * 无限的存放我们的数据
     * 数组最开始定义 初始化容量限制
     * @param tailNode
     * @param newnode
     */
    public static void addNode(Node<String> tailNode, Node<String> newnode){
        tailNode.next=newnode;

    }
}
