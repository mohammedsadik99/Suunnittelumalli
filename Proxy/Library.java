package Proxy;

import java.util.HashMap;

public class Library {
    private final HashMap<Integer, Proxy.iDocument> documents = new HashMap<>();

    public void addDocument(Proxy.iDocument document) {
        documents.put(document.getIdentifier(), document);
    }

    public Proxy.iDocument fetchDocument(int documentId) {
        return documents.get(documentId);
    }
}