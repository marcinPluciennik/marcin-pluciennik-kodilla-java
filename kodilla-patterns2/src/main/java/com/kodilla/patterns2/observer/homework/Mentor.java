package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(mentorName + ": New tasks in " + homework.getName() + "\n" +
                " (total: " + homework.getStudentHomework().size() + " tasks");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
