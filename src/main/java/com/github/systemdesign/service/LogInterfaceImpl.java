package com.github.systemdesign.service;

import org.springframework.stereotype.Service;

@Service
public class LogInterfaceImpl implements LogInterface {

    private int[] logs;
    private int[] timestampArr;

    public LogInterfaceImpl() {
        this.logs = new int[300];
        this.timestampArr = new int[300];
    }

    @Override
    public void hit(int timestamp) {
        int index = timestamp % 300;
        if(timestampArr[index] != timestamp) {
            timestampArr[index] = timestamp;
            logs[index] = 1;
        } else {
            ++logs[index];
        }
    }

    @Override
    public int getCount(int timestamp) {
        int res = 0;
        for(int i = 0; i < 300; i++) {
            if(timestamp - timestampArr[i] < 300) {
                res += logs[i];
            }
        }

        return res;
    }
}
