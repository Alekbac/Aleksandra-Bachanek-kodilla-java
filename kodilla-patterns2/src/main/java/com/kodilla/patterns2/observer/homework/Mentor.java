package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void show(HomeworkQueue homeworkQueue){
        System.out.println(mentorName + ": New homeworks in topic " + homeworkQueue.getName() + "\n"+
                "total: " + homeworkQueue.getHomeworks().size() + " hommeworks");
        updateCount++;
    }

    public String getUsername(){
        return mentorName;
    }

    public int getUpdateCount(){
        return updateCount;
    }
}
