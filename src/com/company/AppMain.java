package com.company;

import com.company.util.HashMapCustom;

public class AppMain {

    private HashMapCustom<Object, Object> map = null;

    private static final Object tempObject = new Object();

    public AppMain() {
        map = new HashMapCustom<>();
    }

    public static void main(String[] args) {

        int [] A = {8, 7, 7, 5 , 3, 8, 8 , 3, 5, 3, 7};
        AppMain mainObject = new AppMain();
        for (int i = 0; i < A.length; i++) {
            mainObject.add(A[i]);
        }
        mainObject.display();
    }

    public void add(Object object) {
        map.put(object, tempObject);
    }

    public boolean contains(Object object) {
        return map.get(object) != null;
    }

    public boolean remove(Object object) {
        return map.remove(object);
    }

    public void display() {
        map.displaySet();
    }

    public int size() {
        return 0;
    }
}
