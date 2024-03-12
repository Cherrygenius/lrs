package lr9.task6;

import com.sun.source.tree.Tree;

import java.util.*;

public class Filling {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();


        System.out.println("����� ���������� �������� ���������� arrayList = " + getRunningTime(arrayList));
        System.out.println("����� ���������� �������� ���������� treeSet = " + getRunningTimeTreeSet(treeSet));
        System.out.println("����� ���������� �������� ���������� treeMap = " + getRunningTimeTreeMap(treeMap));

    }

    public static long getRunningTime(List<Integer> list){

        // ����� ������ ������� ������� ���������� ���������
        long start = System.currentTimeMillis();

        // ���� ���� � ������� ����������� �������� ����������
        for (int i = 0; i < 20_000_000; i++) {
            list.add(i);
        }

        // ����� ��������� ������� ������� ���������� ���������
        long end = System.currentTimeMillis();

        // ����� � ������� ������� ���������� ����� ���� ����������� ��������
        return end - start;

    }
    public static long getRunningTimeTreeSet(TreeSet<Integer> list){

        // ����� ������ ������� ������� ���������� ���������
        long start = System.currentTimeMillis();

        // ���� ���� � ������� ����������� �������� ����������
        for (int i = 0; i < 20_000_000; i++) {
            list.add(i);
        }

        // ����� ��������� ������� ������� ���������� ���������
        long end = System.currentTimeMillis();

        // ����� � ������� ������� ���������� ����� ���� ����������� ��������
        return end - start;

    }

    public static long getRunningTimeTreeMap(TreeMap<Integer, Integer> list){

        // ����� ������ ������� ������� ���������� ���������
        long start = System.currentTimeMillis();

        // ���� ���� � ������� ����������� �������� ����������
        for (int i = 0; i < 20_000_000; i++) {
            list.put(i,i);
        }

        // ����� ��������� ������� ������� ���������� ���������
        long end = System.currentTimeMillis();

        // ����� � ������� ������� ���������� ����� ���� ����������� ��������
        return end - start;

    }
}
