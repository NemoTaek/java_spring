package org.example;

import java.io.*;

public class Main {
    static String inputFilePath = "src/main/resources/inputFile.txt";
    static String outputFilePath = "src/main/resources/outputFile.txt";
    public static void main(String[] args) {
//        System.out.println("JSON 파싱하기");
//        System.out.println("쓰레드 생성하기");
//        System.out.println("상속해서 오버로딩 오버라이딩 해보기");
//        System.out.println("Map<String, List<String>> 해보기");

//        testList();
//        testMap();
//        testAbstract();
//        testThread();
//        testFileStream();
//        testFileReaderWriter();

    }

    public static void testList() {
        MapList arrayList = new MapList();
        arrayList.insert("abc");
        arrayList.insert("def");
        arrayList.insert(1, "ghi");
        System.out.println("현재 리스트: " + arrayList.printList());
        System.out.println("2번째 인덱스 아이템: " + arrayList.getItem(2));
        arrayList.updateItem(2, "jkl");
        System.out.println("수정된 2번째 인덱스 아이템: " + arrayList.getItem(2));
        arrayList.deleteItem(0);
        System.out.println("리스트 길이: " + arrayList.sizeOfList());
        System.out.println("abc가 포함되어 있는가?: " + arrayList.isContainItem("abc"));
        System.out.println("jkl이 포함되어 있는가?: " + arrayList.isContainItem("jkl"));
        System.out.println("ghi가 있는 인덱스 번호: " + arrayList.indexOfItem("ghi"));
        System.out.println("abc가 있는 인덱스 번호: " + arrayList.indexOfItem("abc"));
        System.out.println("현재 리스트: " + arrayList.printList());
        arrayList.clearList();
        System.out.println("현재 리스트: " + arrayList.printList());
    }

    public static void testMap() {
        MapList hashMap = new MapList();
        hashMap.insert("1번키", "1번값");
        hashMap.insert("2번키", "2번값");
        hashMap.insert("3번키", "3번값");
        System.out.println("현재 맵: " + hashMap.printMap());
        System.out.println("2번키의 값: " + hashMap.getItem("2번키"));
        hashMap.updateItem("2번키", "2번값이 수정되었을까?");
        System.out.println("수정된 2번키의 값: " + hashMap.getItem("2번키"));
        hashMap.deleteItem("1번키");
        System.out.println("맵 길이: " + hashMap.sizeOfMap());
        System.out.println("1번키가 있는가?: " + hashMap.isContainItemToKey("1번키"));
        System.out.println("2번값이 있는가?: " + hashMap.isContainItemToValue("2번값"));
        System.out.println("수정된 2번값이 있는가?: " + hashMap.isContainItemToValue("2번값이 수정되었을까?"));
        System.out.println("3번값이 있는가?: " + hashMap.isContainItemToValue("3번값"));
        System.out.println("현재 맵: " + hashMap.printMap());
        hashMap.clearMap();
        System.out.println("현재 맵: " + hashMap.printMap());
    }

    public static void testAbstract() {
        Student student = new SeoulStudent("신짱구");
        student.printInfo();
        student.printSchool();

        Phone galaxy = new Galaxy();
        Phone iPhone = new IPhone();
        System.out.println("제조사: " + galaxy.getManufacturer() + " / OS: " + galaxy.getOS());
        galaxy.printRing();
        System.out.println("제조사: " + iPhone.getManufacturer() + " / OS: " + iPhone.getOS());
        iPhone.printRing();

        Phone.printUser("김철수");
    }
    public static void testThread() {
//        for (int i = 0; i < 10 ; i++) {
//            Thread myThread = new Thread(new MyThread(i));
//            myThread.start();   // 쓰레드 클래스에는 run 메소드인데 왜 start 메소드로 실행??
//            // start 메소드 안에 run 메소드가 포함되어 있다.
//        }
        Thread myThread = new Thread(new StateThread(new Thread(new MyThread())));
        try {
            myThread.start();
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testFileStream() {
        try {
            File outputFile = new File(outputFilePath);

            // 바이트 기반 입출력 클래스 Stream 사용
            FileInputStream fis = new FileInputStream(inputFilePath);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int data;
            while((data = bis.read()) != -1) {
                bos.write(data);
            }
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testFileReaderWriter() {
        try {
            // Char 기반 입출력 클래스 Reader Writer 사용
            FileReader reader = new FileReader(inputFilePath);
            BufferedReader br = new BufferedReader(reader);

            FileWriter writer = new FileWriter(outputFilePath);
            BufferedWriter bw = new BufferedWriter(writer);

            String line = "";
            while((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}