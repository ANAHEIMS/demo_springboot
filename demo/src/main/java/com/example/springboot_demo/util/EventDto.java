package com.example.springboot_demo.util;

public class EventDto {
    private String inputString;
    private int inputNumber;

    public EventDto (String input, int inputNumber) {
        this.inputString = input;
        this.inputNumber = inputNumber;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getInputString() {
        return inputString;
    }

    public int getInputNumber() {
        return inputNumber;
    }
}
