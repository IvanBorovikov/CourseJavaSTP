package org.example.university;

import java.util.ArrayList;

public class ApplicantManagement {

    public static ArrayList<Applicant> applicants = new ArrayList<>();

    /*
    а) вывод списка абитуриентов, имеющих неудовлетворительные оценки;
     */
    public static void findApplicantsWithUnsatisfactoryGrades() {
        System.out.println("Абитуриенты имеющие неудовлетворительные оценки: ");
        for (Applicant applicant : applicants) {
            for (int grade : applicant.getGrades()){
                if (grade <= 2){
                    applicant.show();
                    break;
                }
            }
        }
    }

    /*
    б) вывод списка абитуриентов, сумма баллов у которых не меньше заданной;
     */
    public static void findApplicantsWithMinTotalScore(int sum){
        System.out.printf("Абитуриенты, суммы баллов у которых не меньше заданной: %d\n", sum);
        for (Applicant applicant : applicants) {
            int total = 0;
            for (int grade : applicant.getGrades()){
                total += grade;
            }
            if (total >= sum){
                applicant.show();
                System.out.println();
            }
        }

    }

    /*
    в) выбрать абитуриента, имеющего самую высокую сумму баллов.
     */
    public static void findApplicantWithHighestScore(){
        System.out.println("Абитуриент имеющий самую высокую сумму баллов: ");
        int maxSum = 0;
        int applicantIndex = 0;
        for (int i = 0; i < applicants.size(); i++) {
            Applicant applicant = applicants.get(i);
            int total = 0;
            for (int grade : applicant.getGrades()) {
                total += grade;
            }
            if (total >= maxSum) {
                maxSum = total;
                applicantIndex = i;
            }
        }
        applicants.get(applicantIndex).show();
    }




//    public static void main(String[] args) {
//        applicants.add(new Applicant("Петров", "Петр", "Петрович", "ул. Пушкина, 20, кв. 12", new String[]{"Математика", "Литература"}, new int[]{1, 2, 4, 5}));
//        applicants.add(new Applicant("Петров", "Алексей", "Петрович", "ул. Пушкина, 20, кв. 12", new String[]{"Математика", "Литература"}, new int[]{5, 1, 1, 1}));
//        applicants.add(new Applicant("Глебов", "Алексей", "Петрович", "ул. Пушкина, 20, кв. 12", new String[]{"Математика", "Литература"}, new int[]{5, 5, 5, 4}));
//
//    }

}
