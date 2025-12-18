package org.example.Document;

public class Document {
    protected String title;

    protected Document(){

    }

    protected Document(Document document){
        this.title = document.title;
    }

    protected Document(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
