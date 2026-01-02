package org.example.person;

import java.util.ArrayList;

public class PatientManagement {
    public static ArrayList<Patient> patients = new ArrayList<>();


    public static void havingADiagnosis(String diagnosis1){
        for (Patient p : patients){
            if (p.getDiagnosis().equalsIgnoreCase(diagnosis1)){
                String str = String.format("ФИО: %s", p.getLastName() + " " + p.getFirstName() + " " + p.getMiddleName());
                System.out.println(str);
            }
        }
    }

    public static void medicalCardInformation(int cardNum){
        for (Patient p : patients){
            if (p.getMedicalCardNumber() == cardNum){
                p.show();
                System.out.println();
            }
        }
    }

    public static void theAttendingPhysician(String ownerDoctor){
        for (Patient p : patients){
            if (p.getLastNameOfTheAttendingPhysician().equalsIgnoreCase(ownerDoctor)){
                String str = String.format("ФИО: %s", p.getLastName() + " " + p.getFirstName() + " " + p.getMiddleName());
                String str1 = String.format("Медицинская карта: %s", p.getMedicalCardNumber());
                System.out.println(str);
                System.out.println(str1);
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        patients.add(new Patient("Сидоров", "Глеб", "Глебович", "ул. Малюгина", 2112, "Воспаление легких", "Негодов"));
        patients.add(new Patient("Пушкин", "Дмитрий", "Валерьевич", "ул. Шолохова", 1123, "Астма", "Глебов"));
        patients.add(new Patient("Хмеленко", "Илья", "Ильич", "ул. Солнечная", 1128, "Астма", "Глебов"));
        patients.add(new Patient("Шмыглев", "Юрий", "Олегович", "ул. Степная", 4321, "Отравление", "Тихонов"));
        theAttendingPhysician("Глебов");
    }
}
