package by.it.kaminskii.jd01_11;

import java.util.*;

public class ListB<E> implements List<E> {

    private E[] elements = (E[]) new Object[0];
    int size = 0;

    @Override
    public boolean add(E t) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size * 3 / 2 + 1));
        elements[size++] = t;
        return true;
    }

    @Override
    public E remove(int index) {
        E element = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        elements[size] = null;
        return element;
    }

    @Override
    public E get(int index) {

        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        E el = elements[index];
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size * 3 / 2 + 1));
        elements[index] = element;

        return el;

    }

    @Override
    public void add(int index, E element) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size * 3 / 2 + 1));
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E element : c) {
            this.add(element);
        }
        return true;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                sj.add("null");
            } else sj.add(elements[i].toString());
        }
        return sj.toString();
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}

