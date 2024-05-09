package project;

import java.util.LinkedList;

public class ChainedHashMap<K, V> {
    private LinkedList<Entry<K, V>>[] buckets;
    private int capacity;
    private int size;

    // Внутренний класс для представления пары ключ-значение
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Конструктор
    public ChainedHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    // Метод для добавления элемента в HashMap
    public void put(K key, V value) {
        int index = key.hashCode() % capacity;
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
        size++;
    }

    // Метод для получения значения по ключу из HashMap
    public V get(K key) {
        int index = key.hashCode() % capacity;
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    // Метод для удаления элемента из HashMap
    public void remove(K key) {
        int index = key.hashCode() % capacity;
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }
}
