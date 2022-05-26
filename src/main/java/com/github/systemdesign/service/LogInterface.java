package com.github.systemdesign.service;

public interface LogInterface {
    void hit(int timestamp);
    int getCount(int timestamp);
}
