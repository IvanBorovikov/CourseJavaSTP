package org.example.document;

import java.time.LocalDate;
import java.util.ArrayList;

public class FileManagement {

    public static ArrayList<File> files = new ArrayList<>();

    /*
    а) вывод список файлов, для которых запрещено редактирование;
     */
    public static void listOfProhibitedFiles(){
        System.out.println("Запрещено редактировать файл:");
        for (File f : files){
            if (!f.isEditable()){
                f.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод списка файлов, размер которых превышает заданный;
     */
    public static void listFilesGreaterThen(int size){
        System.out.printf("Файл превышает заданный размер: %d", size);
        for (File f : files){
            if (f.getFileSize() > size){
                f.show();
                System.out.println();
            }
        }
    }

    /*
    в) вывод списка файлов, число обращений к которым превышает заданное.
     */
    public static void listFilesExceedingTheNumberOfRequests(int count){
        System.out.printf("Файл превышающий заданное число обращений: %d", count);
        for (File f : files){
            if (f.getCountAppealFile() > count){
                f.show();
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        files.add(new File("Текстовый документ", ".txt", 1700, LocalDate.of(2025, 12, 22), 3, true));
        files.add(new File("Фотографии", ".zip", 2800, LocalDate.of(2021, 3, 12), 1, false));
        files.add(new File("Фотографии", ".jpeg", 2800, LocalDate.of(2021, 3, 12), 0, false));
        //listOfProhibitedFiles();
        //listFilesGreaterThen(1600);
        listFilesExceedingTheNumberOfRequests(0);

    }
}
