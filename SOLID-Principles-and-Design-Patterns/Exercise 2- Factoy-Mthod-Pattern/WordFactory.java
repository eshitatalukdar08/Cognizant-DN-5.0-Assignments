package FactoryMethodPatternExample.concrete_factories;

import FactoryMethodPatternExample.Document;
import FactoryMethodPatternExample.DocumentFactory;
import FactoryMethodPatternExample.concrete_classes.WordDocument;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
