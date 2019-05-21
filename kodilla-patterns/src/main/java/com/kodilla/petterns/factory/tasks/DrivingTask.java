package com.kodilla.petterns.factory.tasks;

public class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isExecuted = true;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskNAme() {
        return taskName;
    }

    @Override
    public boolean isTaskExecute() {
        return isExecuted;
    }
}
