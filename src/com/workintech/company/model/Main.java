package com.workintech.company.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Task task1 = new Task("java senaryo", "write list","Ann",Priority.HIGH,Status.ASSIGNED);
        Task task2 = new Task("java senaryo", "write","Bob",Priority.HIGH,Status.ASSIGNED);
        Task task3 = new Task("java senaryo", "write arrayList","Carol",Priority.HIGH,Status.ASSIGNED);
        Task task4 = new Task("java senaryo", "write set","Ann",Priority.HIGH,Status.ASSIGNED);

        Set<Task> annsTasks= new LinkedHashSet<>();
        annsTasks.add(task1);
        annsTasks.add(task4);

        Set<Task> bobsTasks= new LinkedHashSet<>();
        bobsTasks.add(task2);
        Set<Task> carolsTasks= new LinkedHashSet<>();
        carolsTasks.add(task3);
        TaskData taskData= new TaskData(annsTasks, bobsTasks, carolsTasks);
        List<Set<Task>> tasks= new ArrayList<>();
        tasks.add(annsTasks);
        tasks.add(bobsTasks);
        tasks.add(carolsTasks);
        System.out.println( taskData.getUnion(tasks));
        System.out.println("anns tasks: " + taskData.getAnnsTasks());
        System.out.println("bobs tasks: " + taskData.getBobsTasks());
        System.out.println("carols tasks: " + taskData.getCarolsTasks());
        System.out.println(taskData.getIntersect(annsTasks,bobsTasks));
        System.out.println(taskData.getDifference(carolsTasks,bobsTasks));
    }
}
