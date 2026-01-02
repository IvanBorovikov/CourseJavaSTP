package org.example.document;

import java.time.LocalDate;
import java.util.Date;

public class File  {
    private String title;
    private String fileExtension;
    private double fileSize;
    private LocalDate dateOfCreation;
    private int countAppealFile;
    private boolean editFile;

    public File(){

    }

    public File(File file){
        this.title = file.title;
        this.fileExtension = file.fileExtension;
        this.fileSize = file.fileSize;
        this.dateOfCreation = file.dateOfCreation;
        this.countAppealFile = file.countAppealFile;
        this.editFile = file.editFile;
    }

    public File(String title, String fileExtension, double fileSize,
                LocalDate dateOfCreation, int countAppealFile, boolean editFile){
        this.title = title;
        this.fileExtension = fileExtension;
        this.fileSize = fileSize;
        this.dateOfCreation = dateOfCreation;
        this.countAppealFile = countAppealFile;
        this.editFile = editFile;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public double getFileSize() {
        return fileSize;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public int getCountAppealFile() {
        return countAppealFile++;
    }

    public boolean isEditFile() {
        return editFile;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setCountAppealFile(int countAppealFile) {
        this.countAppealFile = countAppealFile;
    }

    public void setEditFile(boolean editFile) {
        this.editFile = editFile;
    }

    public void show(){
        System.out.println("Имя файла: " + title);
        System.out.println("Расширение файла: " + fileExtension);
        System.out.println("Размер файла: " + fileSize);
        System.out.println("Дата создания: " + dateOfCreation);
        System.out.println("Кол-во обращений к файлу: " + countAppealFile);
        System.out.println("Признак возможность редактирования: " + (editFile ? "Разрешено" : "Запрещено"));
    }

}
