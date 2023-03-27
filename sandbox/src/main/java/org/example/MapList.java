package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    List<String> list = new ArrayList<>();
    Map<String, String> map = new HashMap<>();

    public void insert(String item) {
        list.add(item);
    }
    public void insert(int index, String item) {
        // 값 추가
        list.add(index, item);
    }
    public void insert(String key, String value) {
        map.put(key, value);
    }
    public int sizeOfList() {
        return list.size();
    }
    public int sizeOfMap() {
        return map.size();
    }
    public String getItem(int index) {
        return list.get(index);
    }
    public String getItem(String key) {
        return map.get(key);
    }
    public void updateItem(int index, String item) {
        list.set(index, item);
    }
    public void updateItem(String key, String item) {
        // Map에는 값을 수정하는 replace 메소드가 있지만,
        // Map 특성상 원래 있던 키에 다른 값을 할당하면 값이 수정되어 put을 사용하기도 한다.
        map.put(key, item);
    }
    public void deleteItem(int index) {
        list.remove(index);
    }
    public void deleteItem(String key) {
        map.remove(key);
    }
    public boolean isContainItem(String item) {
        return list.contains(item);
    }
    public boolean isContainItemToKey(String key) {
        return map.containsKey(key);
    }
    public boolean isContainItemToValue(String value) {
        return map.containsValue(value);
    }
    public int indexOfItem(String item) {
        return list.indexOf(item);
    }
    public void clearList() {
        list.clear();
    }
    public void clearMap() {
        map.clear();
    }
    public List<String> printList() {
        return list;
    }
    public Map<String, String> printMap() {
        return map;
    }
}
