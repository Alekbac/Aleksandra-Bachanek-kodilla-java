package com.kodilla.petterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isExecuted = true;
    }

    @Override
    public void executeTask() {
        isExecuted = false;
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
