package FactoryMethodPatternExample.concrete_classes;

import FactoryMethodPatternExample.Document;


public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document...");
    }
    public void close() {
        System.out.println("Closing Word Document.");
    }
}