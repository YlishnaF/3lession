package com.company;
//Задание 3.3 Односвязный список и его базовые методы
class Link<T>{
    private T link;
    private Link<T> next;

    public Link(T link) {
        this.link = link;
    }
    public Link<T> getNext(){return next;}
    public void setNext(Link<T> next){this.next=next;}
    public T getValue(){return link;}

}
class LinkedList<T>{
    private Link<T> first;

    public boolean isEmpty(){return (first == null);}

    public LinkedList(){first = null;}

    public void insert(T link) {
        Link<T> l = new Link<>(link);
        l.setNext(first);
        this.first = l;
    }
    public Link<T> delete(){
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public void display(){
        Link<T> current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();

        }
    }

    public T find(T searchNode){
        Link<T> findNode = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null){
            if(current.getValue().equals(findNode.getValue())){
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}
public class MyList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.insert("Yulia");
        list.insert("Slava");

        list.display();

        System.out.println("Нашли Юлю? " + list.find("Yulia") + " Нашли Вову? " + list.find("Vova"));
    }

}
