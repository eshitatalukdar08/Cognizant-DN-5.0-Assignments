package FactoryMethodPatternExample.concrete_classes;

import FactoryMethodPatternExample.Document;

public class PdfDocument implements Document{
    public void open() {
        System.out.println("Opening PDF Document...");
    }
    public void close() {
        System.out.println("Closing PDF Document.");
    }
}
