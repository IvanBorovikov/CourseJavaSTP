package org.example.document;

import java.time.LocalDate;

public class File  {
    private String name;
    private String fileExtension;
    private int fileSize;
    private LocalDate dateOfCreation;
    private int countAppealFile;
    private boolean editable;

    public File(){

    }

    public File(File file){
        this.name = file.name;
        this.fileExtension = file.fileExtension;
        this.fileSize = file.fileSize;
        this.dateOfCreation = file.dateOfCreation;
        this.countAppealFile = file.countAppealFile;
        this.editable = file.editable;
    }

    public File(String name, String fileExtension, int fileSize,
                LocalDate dateOfCreation, int countAppealFile, boolean editable){
        this.name = name;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.dateOfCreation = dateOfCreation;
        this.countAppealFile = countAppealFile;
        this.editable = editable;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public int getFileSize() {
        return fileSize;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public int getCountAppealFile() {
        return countAppealFile;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setCountAppealFile(int countAppealFile) {
        this.countAppealFile = countAppealFile;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void show(){
        System.out.println("Имя файла: " + name);
        System.out.println("Расширение файла: " + fileExtension);
        System.out.println("Размер файла: " + fileSize);
        System.out.println("Дата создания: " + dateOfCreation);
        System.out.println("Кол-во обращений к файлу: " + countAppealFile);
        System.out.println("Признак возможность редактирования: " + (editable ? "Разрешено" : "Запрещено"));
    }

}
