package com.kodilla.patterns2.observer.homework;

public interface MentorObservable {
    void registerMentorObserver(MentorObserver mentorObserver);

    void notifyMentorObservers();

    void removeMentorObserver(MentorObserver mentorObserver);
}
