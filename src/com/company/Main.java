package com.company;

import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Задание 3.1
        int[] arr = new int [10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr [i] = random.nextInt(10);
        }
        long start2 = System.nanoTime();
        List<Integer> myArr = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            myArr.add(arr[i]);
        }
        System.out.println("Преобразование массива в список " + (System.nanoTime() - start2));
        long start = System.nanoTime();
        // Добавим элемент 45 в конец массива
        myArr.add(45);
        // Добавим элемент 100 под индексом 1
        myArr.add(1, 100);
        // Удалим элемент под индексом 0
        myArr.remove(0);
        ArrayList<Integer> copy = new ArrayList<>(myArr);
        myArr.addAll(copy);
        System.out.println("Добавили все элементы массива copy в массив myArr " + myArr.toString());
        myArr.addAll(9, copy);
        System.out.println("Вставили массив copy в myArr начиная с 9го индекса "+myArr.toString());
        System.out.println("Получили 0й элемент массива " + myArr.get(0));
        myArr.set(0, 66);
        System.out.println("Заменили первый элемент массива на 66 " + myArr.toString());
        System.out.println("Содержит ли список эдемент 65? " + myArr.contains(65));
        System.out.println("Первре вхождение элемента 45 в список под индексом "+myArr.indexOf(45));
        myArr.clear();
        System.out.println(myArr.toString());
        System.out.println("Время затраченное на выполнение методов = " + (System.nanoTime()-start));

        //Задание 3.4 Двухсторонний список и его базовые методы

        LinkedList<Integer> intList = new LinkedList<>(copy);
        long start3 = System.nanoTime();
        //Вставка элемента в конец списка
        intList.add(111);
        //Вставка элемента под индексом 2
        intList.add(2,222);
        System.out.println("Вставка элемента 222 под индексом 2 " + intList.toString());
        //Удалим 3й элемент
        intList.remove(2);
        System.out.println("Удалим 3й элемент " + intList.toString());
        //Добвыим все элементы массива copy
        intList.addAll(copy);
        System.out.println("Добвыим все элементы массива copy " + intList.toString());
        //Вставили массив copy в начиная сo 2го индекса
        intList.addAll(2,copy);
        System.out.println("Вставили массив copy в начиная сo 2го индекса " + intList.toString());
        //Заменили первый элемент массива на 200
        intList.set(0,200);
        System.out.println("Заменили первый элемент массива на 200 " + intList.toString());
        System.out.println("Содержит ли список эдемент 100? " + intList.contains(100));
        System.out.println("Первре вхождение элемента 45 в список под индексом "+intList.indexOf(45));
        intList.clear();
        System.out.println("Время затраченное на выполнение методов = " + (System.nanoTime()-start3));

        //Реализовать список заполненный объектами класса из задания 1.3
        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("Zenya"));
        persons.add(new Person("Vera"));
        persons.add(new Person("Olga"));
        System.out.println(persons.toString());

        //3.5 Итератор и базовые методы
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(persons.toString());
        persons.add(new Person("Katya"));
        persons.add(new Person("Mish"));
        persons.add(new Person("Ira"));

        ListIterator<Person> iter = persons.listIterator();
        while (iter.hasNext()){
            iter.next();
        }

        Person p;
        while (iter.hasPrevious()){
            p = iter.previous();
            p.info();
        }

    }
}
