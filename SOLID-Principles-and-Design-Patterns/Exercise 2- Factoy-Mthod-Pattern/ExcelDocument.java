package FactoryMethodPatternExample.concrete_classes;

import FactoryMethodPatternExample.Document;

public class ExcelDocument implements Document{
    public void open() {
        System.out.println("Opening Excel Document...");
    }
    public void close() {
        System.out.println("Closing Excel Document.");
    }
}
