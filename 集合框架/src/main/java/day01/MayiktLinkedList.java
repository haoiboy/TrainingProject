package day01;

import java.util.LinkedList;

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
        MayiktLinkedList<String> stringMayiktLinkedList = new MayiktLinkedList<>();
        stringMayiktLinkedList.add("mayikt1");
        stringMayiktLinkedList.add("mayikt2");
        stringMayiktLinkedList.add("mayikt3");
        System.out.println(stringMayiktLinkedList.get(0));
        System.out.println(stringMayiktLinkedList.get(1));
        System.out.println(stringMayiktLinkedList.get(2));
//        System.out.println("链表结构的add方法执行完毕");
//        System.out.println(mayiktLinkedList.first);
        Node node3=new Node(null,"node3",null);
        Node node2=new Node(null,"node2",null);
        Node node1=new Node(null,"node1",null);
        System.out.println(node1);
        Node temp=node1;
        int index=0;
        while (temp!=null){
            index++;
            String item=(String)temp.item;
            if ("node2".equals(item)){
                System.out.println("node3 查询次数"+index);
            }
            System.out.println(item);
            temp=temp.next;
        }
    }

    /**
     * 根据index下表查询链表中 对应的node节点
     * @param index
     * @return
     */
    Node<E> node(int index){
        if (index<size>>1){
            //查询链表的中间值的左边
            Node<E>f=first;
            for (int i=0;i<index;i++)
                    f=f.next;
                    return f;

        }else {
            //查询链表中间值的右边
            Node<E>l=last;
            for (int i=size-1;i<index;i--)
                l=l.prev;
            return l;

        }
    }
    public E remove(int index){
        //checkElementIndex(index);
        return unlink(node(index));
    }
    public E unlink(Node<E>node){
        /**
         * 1.根据index下标 查询对应的node节点 时间复杂度已经 O(n)
         * 2.删除链表效率确实非常高 比ArrayList效率高  arraylist移动数组
         * 获取删除的node节点上一个和下一个node节点
         */
        final E element=node.item;//获取删除节点的元素值
        Node<E> prev=node.prev;
        Node<E> next=node.next;
//如果删除的节点上一个节点为空
        if (prev==null){
            //删除的节点为头节点
            first=next;
        }else {
            prev.next=next;
            next.prev=null;
        }
        if (next==null){
            //删除的节点是尾结点 如果删除的节点是尾结点 则尾节点改成 删除节点的下一个节点
            last=prev;
        }else {
            //如果删除的不是尾结点 则删除的节点的下一个节点.上一个节点改成=删除的上一个节点
            next.prev=prev;
            //gc 回收
            node.next=null;
        }
        node.item=null;
        size--;
        return element   ;
    }
    public E get(int index){
        //下表如果越界的 需要报错
        return node(index).item;
    }

}
