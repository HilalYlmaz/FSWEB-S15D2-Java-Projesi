package com.workintech.company.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

//    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
//    }


    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getTasks(String type){
        if (type.equals("ann")){
            return annsTasks;
        }
        if (type.equals("bob")){
            return bobsTasks;
        }
        if (type.equals("carol")){
            return carolsTasks;
        }
        if (type.equals("all")){
            List<Set<Task>> taskList = new ArrayList<>();
            taskList.add(annsTasks);
            taskList.add(bobsTasks);
            taskList.add(carolsTasks);
            return getUnion(taskList);
        }
        return null;

    }
    public Set<Task> getUnion(List<Set<Task>> taskList){
        Set<Task> total = new HashSet<>();
        for (Set<Task> tasks: taskList){
            total.addAll(tasks);
        }
        return total;


    }
    public Set<Task> getIntersect(Set<Task> first, Set<Task> second){
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;

    }
    public Set<Task> getDifference(Set<Task> first, Set<Task> second){
        Set<Task> difference = new HashSet<>(first);
        difference.removeAll(second);
        return difference;
    }


}
