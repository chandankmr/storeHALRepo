package com.design.observer;

public interface Subject {
public void registerObservers(Observer observer);
public void unRegisterObservers(Observer observer);
public void notifyObservers();
}
