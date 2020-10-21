package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements MentorObservable {
    private final List<MentorObserver> mentors;
    private final List<String> studentHomework;
    private final String name;

    public Homework(String name) {
        mentors = new ArrayList<>();
        studentHomework = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String homework) {
        studentHomework.add(homework);
        notifyMentorObservers();
    }

    @Override
    public void notifyMentorObservers() {
        for (MentorObserver mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void registerMentorObserver(MentorObserver mentorObserver) {
        mentors.add(mentorObserver);
    }

    @Override
    public void removeMentorObserver(MentorObserver mentorObserver) {
        mentors.remove(mentorObserver);
    }

    public List<String> getStudentHomework() {
        return studentHomework;
    }

    public String getName() {
        return name;
    }
}
