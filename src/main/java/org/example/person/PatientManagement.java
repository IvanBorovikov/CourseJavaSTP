package org.example.person;

import java.util.ArrayList;

public class PatientManagement {
    public static ArrayList<Patient> patients = new ArrayList<>();

    /*
    а) вывод списка пациентов, имеющих данный диагноз;
     */
    public static void havingADiagnosis(String diagnosis){
        System.out.printf("Пациенты имеющих данный диагноз: %s\n", diagnosis);
        for (Patient p : patients){
            if (p.getDiagnosis().equalsIgnoreCase(diagnosis)){
                p.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод информации о пациенте по номеру медицинской карты;
     */
    public static void medicalCardInformation(int cardNum){
        System.out.printf("Пациент по номеру медицинской карты: %d\n", cardNum);
        for (Patient p : patients){
            if (p.getMedicalCardNumber() == cardNum){
                p.show();
                System.out.println();
                break;
            }
        }
    }

    /*
    в) вывод списка пациентов заданного лечащего врача.
     */
    public static void findAttendingPhysician(String ownerDoctor){
        System.out.printf("Пациенты заданного лечащего врача: %s\n", ownerDoctor);
        for (Patient p : patients){
            if (p.getLastNameOfTheAttendingPhysician().equalsIgnoreCase(ownerDoctor)){
                p.show();
                System.out.println();
            }
        }
    }



//    public static void main(String[] args) {
//        patients.add(new Patient("Сидоров", "Глеб", "Глебович", "ул. Малюгина", 2112, "Воспаление легких", "Негодов"));
//        patients.add(new Patient("Пушкин", "Дмитрий", "Валерьевич", "ул. Шолохова", 1123, "Астма", "Глебов"));
//        patients.add(new Patient("Хмеленко", "Илья", "Ильич", "ул. Солнечная", 1128, "Астма", "Глебов"));
//        patients.add(new Patient("Шмыглев", "Юрий", "Олегович", "ул. Степная", 4321, "Отравление", "Тихонов"));
//
//    }
}
