package project;

public class OpenAddressingHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private Entry<K, V>[] buckets;
    private int size;

    // ���������� ����� ��� ������������� ���� ����-��������
    private static class Entry<K, V> {
        K key;
        V value;
        boolean deleted;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }
    }

    // �����������
    public OpenAddressingHashMap() {
        this(DEFAULT_CAPACITY);
    }

    // ����������� � �������� ��������
    public OpenAddressingHashMap(int capacity) {
        buckets = new Entry[capacity];
        size = 0;
    }

    // ����� ��� ���������� �������� � HashMap
    public void put(K key, V value) {
        int index = key.hashCode() % buckets.length;
        while (buckets[index] != null && !buckets[index].deleted) {
            if (buckets[index].key.equals(key)) {
                buckets[index].value = value;
                return;
            }
            index = (index + 1) % buckets.length;
        }
        buckets[index] = new Entry<>(key, value);
        size++;
    }

    // ����� ��� ��������� �������� �� ����� �� HashMap
    public V get(K key) {
        int index = key.hashCode() % buckets.length;
        while (buckets[index] != null) {
            if (buckets[index].key.equals(key) && !buckets[index].deleted) {
                return buckets[index].value;
            }
            index = (index + 1) % buckets.length;
        }
        return null;
    }

    // ����� ��� �������� �������� �� HashMap
    public void remove(K key) {
        int index = key.hashCode() % buckets.length;
        while (buckets[index] != null) {
            if (buckets[index].key.equals(key) && !buckets[index].deleted) {
                buckets[index].deleted = true;
                size--;
                return;
            }
            index = (index + 1) % buckets.length;
        }
    }
}

