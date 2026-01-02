package org.example.separate;

public class Page {
    private int numberOfLetters;
    private int numberOfVowels;
    private int fontSize;
    private int numberOfParagraphs;
    private int pageNumber;
    private int numberOfRows;

    public Page(){

    }

    public Page(Page page){
        this.numberOfLetters = page.numberOfLetters;
        this.numberOfVowels = page.numberOfVowels;
        this.fontSize = page.fontSize;
        this.numberOfParagraphs = page.numberOfParagraphs;
        this.pageNumber = page.pageNumber;
        this.numberOfRows = page.numberOfRows;
    }

    public Page(int numberOfLetters, int numberOfVowels, int fontSize, int numberOfParagraphs,
         int pageNumber, int numberOfRows){
        this.numberOfLetters = numberOfLetters;
        this.numberOfVowels = numberOfVowels;
        this.fontSize = fontSize;
        this.numberOfParagraphs = numberOfParagraphs;
        this.pageNumber = pageNumber;
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getFontSize() {
        return fontSize;
    }

    public int getNumberOfParagraphs() {
        return numberOfParagraphs;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfLetters(int numberOfLetters) {
        this.numberOfLetters = numberOfLetters;
    }

    public void setNumberOfVowels(int numberOfVowels) {
        this.numberOfVowels = numberOfVowels;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setNumberOfParagraphs(int numberOfParagraphs) {
        this.numberOfParagraphs = numberOfParagraphs;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public void show(){
        System.out.println("Кол-во букв: " + numberOfLetters);
        System.out.println("Кол-во гласных: " + numberOfVowels);
        System.out.println("Размер шрифта: " + fontSize);
        System.out.println("Число абзацев: " + numberOfParagraphs);
        System.out.println("Номер страницы: " + pageNumber);
        System.out.println("Число строк: " + numberOfRows);
    }
}
