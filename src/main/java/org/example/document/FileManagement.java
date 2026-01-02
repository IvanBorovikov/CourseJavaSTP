package org.example.document;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class FileManagement {

    public static ArrayList<File> files = new ArrayList<>();
    public static int countFile;

    public static void listOfProhibitedFiles(){
        boolean permission = false;
        for (File f : files){
            if (f.isEditFile() == permission){
                String str = String.format("Запрещено редактировать файл: %s", f.getTitle() + f.getFileExtension());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void exceedsTheSpecifiedSize(double size){
        for (File f : files){
            if (f.getFileSize() > size){
                String str = String.format("Файл превышает заданный размер: %s", f.getTitle() + f.getFileExtension());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void exceedingTheNumberOfRequests(int count){
        for (File f : files){
            if (f.getCountAppealFile() > count){
                String str = String.format("Файл превышающий заданное число обращений: %s", f.getTitle() + f.getFileExtension());
                System.out.println(str);
                System.out.println();

            }
        }
    }



    public static void main(String[] args) {
        files.add(new File("Текстовый документ", ".txt", 1.7, LocalDate.of(2025, 12, 22), 0, true));
        files.add(new File("Фотографии", ".zip", 2.8, LocalDate.of(2021, 3, 12), 0, false));
        files.get(0).getCountAppealFile();
        files.get(0).getCountAppealFile();
        System.out.println();
        files.get(0).show();
        exceedingTheNumberOfRequests(1);

    }
}
