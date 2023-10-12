package DZ;

import java.util.LinkedList;

public class program8{
    /*
     * 
     * Реализация очереди
     * с помощью LinkedList со следующими методами:
     * 
     * enqueue() - помещает элемент в конец очереди
     * dequeue() - возвращает первый элемент из очереди и удаляет его
     * first() - возвращает первый элемент из очереди, не удаляя
     * getElements() - возвращает все элементы в очереди
     */
    
    public static void main(String[] args) {
        MyQueue <Integer> queue;
        queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

class MyQueue<T> {
    private LinkedList<T> elements= new LinkedList<T>();
    // public MyQueue(){
    //     elements  ;
    // }
    public void enqueue(T element) {
        elements.addLast(element);

    }


    
    public T dequeue() {
        return elements.pollFirst();

    }

    public T first() {
        return elements.peekFirst();

    }

    public LinkedList<T> getElements() {
        return elements;

    }
}

