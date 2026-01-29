package org.example;

import org.example.order.*;
import org.example.organization.City;
import org.example.organization.CityManagement;
import org.example.organization.Country;
import org.example.organization.CountryManagement;
import org.example.page.Page;
import org.example.page.PageManagement;
import org.example.person.*;
import org.example.product.*;
import org.example.property.Apartment;
import org.example.property.ApartmentManagement;
import org.example.property.Dog;
import org.example.property.DogManagement;
import org.example.runners.ResultRunners;
import org.example.runners.ResultRunnersManagement;
import org.example.tornado.Tornado;
import org.example.tornado.TornadoManagement;
import org.example.transport.*;
import org.example.university.*;
import org.example.wheel.FerrisWheel;


import java.time.LocalDate;
import java.util.Scanner;

import static org.example.order.OrderRestaurantManagement.orderRestaurants;
import static org.example.order.OrderTaxiManagement.orderTaxis;
import static org.example.organization.CityManagement.cities;
import static org.example.organization.CountryManagement.countries;
import static org.example.person.ClientsBankManagement.clientsBanks;
import static org.example.person.EmployeeManagement.employees;
import static org.example.person.HumanManagement.humans;
import static org.example.person.PatientManagement.patients;
import static org.example.product.EngineManagement.engines;
import static org.example.product.PhoneManagement.phones;
import static org.example.product.RocketManagement.rockets;
import static org.example.product.TireManagement.tires;
import static org.example.property.ApartmentManagement.apartments;
import static org.example.property.DogManagement.dogs;
import static org.example.runners.ResultRunnersManagement.resultRunners;
import static org.example.tornado.TornadoManagement.tornadoes;
import static org.example.transport.BusManagement.*;
import static org.example.transport.TrainManagement.trains;
import static org.example.transport.WagonManagement.wagons;
import static org.example.university.ApplicantManagement.applicants;
import static org.example.university.StudentManagement.showAllStudents;
import static org.example.university.StudentManagement.students;
import static org.example.university.TeacherManagement.teachers;
import static org.example.wheel.FerrisWheelManagement.ferrisWheels;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        if (args.length == 0) {
            printHelp();
            return;
        }

        switch (args[0].toLowerCase()) {

            case "page":
                runPage();
                break;

            case "tornado":
                runTornado();
                break;

            case "bus":
               runBus();
                break;

            case "train":
                runTrain();
                break;

            case "wagon":
                runWagon();
                break;

            case "applicant":
                runApplicant();
                break;

            case "student":
                runStudent();
                break;

            case "teacher":
                runTeacher();
                break;

            case "ferris wheel":
                runFerrisWheel();
                break;

            case "result runners":
                runResultRunners();
                break;

            case "apartment":
                runApartment();
                break;

            case "dog":
                runDog();
                break;

            case "engine":
                runEngine();
                break;

            case "phone":
                runPhone();
                break;

            case "rocket":
                runRocket();
                break;

            case "tire":
                runTire();
                break;

            case "client bank":
                runClientBank();
                break;

            case "employee":
                runEmployee();
                break;

            case "human":
                runHuman();
                break;

            case "patient":
                runPatient();
                break;

            case "city":
                runCity();
                break;

            case "country":
                runCountry();
                break;

            case "order restaurant":
                runOrderRestaurant();
                break;

            case "order taxi":
                runOrderTaxi();
                break;
            default:
                System.out.println("Неизвестный режим: " + args[0]);
                printHelp();
        }
    }

    private static void printHelp() {
        System.out.println("Пример запуска:");
        System.out.println("  java Main page");
        System.out.println("  java Main tornado");
        System.out.println("  java Main client bank");
    }

    /*
    PAGE
     */

    private static void runPage() {


        //PageManagement.pages.clear();
        PageManagement.pages.add(new Page(3850, 1620, 12, 8, 1, 48));
        PageManagement.pages.add(new Page(320, 135, 18, 3, 2, 12));
        PageManagement.pages.add(new Page(1150, 500, 14, 5, 3, 32));

        while (true) {
            System.out.println("\n=== МЕНЮ: PAGE ===");
            System.out.println("1. Добавить страницу");
            System.out.println("2. Букв больше заданного");
            System.out.println("3. Номера страниц и гласные");
            System.out.println("4. Среднее количество букв");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addPage();
                    break;

                case 2:
                    System.out.print("Минимум букв: ");
                    int minLetters = scanner.nextInt();
                    PageManagement.findPagesWithLetterCountGreaterThan(minLetters);
                    break;

                case 3:
                    PageManagement.getPageSummaryStatistics();
                    break;

                case 4:
                    PageManagement.calculateAverageLetterCountPerPage();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");
            }

        }
    }

    private static void addPage() {
        System.out.print("Количество букв: ");
        int letters = scanner.nextInt();
        System.out.print("Количество гласных: ");
        int vowels = scanner.nextInt();
        System.out.print("Размер шрифта: ");
        int fontSize = scanner.nextInt();
        System.out.print("Количество абзацев: ");
        int paragraphs = scanner.nextInt();
        System.out.print("Номер страницы: ");
        int pageNumber = scanner.nextInt();
        System.out.print("Количество строк: ");
        int rows = scanner.nextInt();

        PageManagement.pages.add(
                new Page(letters, vowels, fontSize, paragraphs, pageNumber, rows)
        );
        System.out.println("Страница добавлена.");
    }

    /*
    TORNADO
     */
    private static void runTornado() {
        tornadoes.add(new Tornado("F4", 42, 1800, "Петров", true));
        tornadoes.add(new Tornado("W2", 18, 850, "Иванова", false));
        tornadoes.add(new Tornado("F1", 7, 400, "Сидоров", true));

        while (true) {
            System.out.println("\n=== МЕНЮ: TORNADO ===");
            System.out.println("1. Добавить торнадо");
            System.out.println("2. Список наземных торнадо, просуществовавших дольше указанного времени");
            System.out.println("3. Список наземных торнадо, описанных конкретным наблюдателем, с указанной категорией");
            System.out.println("4. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTornado();
                    break;

                case 2:
                    System.out.println("Укажите время: ");
                    int duration = scanner.nextInt();
                    TornadoManagement.findLongLastingLandTornadoes(duration);
                    break;

                case 3:
                    System.out.println("Укажите наблюдателя: ");
                    String observer = scanner.nextLine();
                    System.out.println("Укажите категорию: ");
                    String category = scanner.nextLine();
                    TornadoManagement.findOverlandTornadoesByObserverAndCategory(observer, category);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addTornado() {
        System.out.print("Категория урагана: ");
        String hurricaneCategory = scanner.nextLine();
        System.out.print("Длительность существования: ");
        int duration = scanner.nextInt();
        System.out.print("высота: ");
        double height = scanner.nextInt();
        System.out.print("фамилия наблюдателя: ");
        String lastNameOfTheObserver = scanner.nextLine();
        System.out.print("наземный/надводный.: ");
        boolean landOrSurface = scanner.nextBoolean();

        tornadoes.add(
                new Tornado(hurricaneCategory, duration, height, lastNameOfTheObserver, landOrSurface)
        );
        System.out.println("Торнадо добавлено.");
    }

    /*
    Bus
     */

    private static void runBus() {

        BusManagement.buses.add(new Bus("Сидоров", 217, 105, "ЛиАЗ-5292", 2022, 85450));
        BusManagement.buses.add(new Bus("Петров", 42, 301, "ПАЗ-3205", 2015, 324800));
        BusManagement.buses.add(new Bus("Козлов", 12, 111, "ГАЗель Next", 2010, 412500));

        while (true) {
            System.out.println("\n=== МЕНЮ: BUS ===");
            System.out.println("1. Добавить автобус");
            System.out.println("2. Вывод списка автобусов для заданного номера маршрута");
            System.out.println("3. Вывод списка автобусов, которые эксплуатируются больше заданного количества лет");
            System.out.println("4. Вывод списка автобусов, пробег у которых больше заданного количества км.");
            System.out.println("5. Редактировать автобус");
            System.out.println("6. Удалить автобус");
            System.out.println("7. Вывод всех автобусов");
            System.out.println("8. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addBus();
                    break;

                case 2:
                    System.out.println("Укажите номер маршрута: ");
                    int rout = scanner.nextInt();
                    scanner.nextLine();
                    BusManagement.findBusesByRouteNumber(rout);
                    break;

                case 3:
                    System.out.println("Укажите год: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    BusManagement.findBusesInServiceLongerThan(year);
                    break;

                case 4:
                    System.out.println("Укажите пробег: ");
                    int mileage = scanner.nextInt();
                    scanner.nextLine();
                    BusManagement.getBusesByMinMileage(mileage);
                    break;

                case 5:
                    editBusFromConsole();
                    break;

                case 6:
                    deleteBus();
                    break;

                case 7:
                    BusManagement.showAllBuses();
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Неверный выбор!");
            }
        }

    }
    private static void addBus() {
        System.out.print("Фамилия водителя: ");
        String lastNameDriver = scanner.nextLine();

        System.out.print("Номер автобуса: ");
        int numberOfTransport = scanner.nextInt();

        System.out.print("Номер маршрута: ");
        int routeNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Марка: ");
        String stamp = scanner.nextLine();

        System.out.print("Год начала эксплуатации: ");
        int yearOfStartOfOperation = scanner.nextInt();

        System.out.print("Пробег: ");
        int mileage = scanner.nextInt();

        buses.add(
                new Bus(lastNameDriver, numberOfTransport, routeNumber, stamp, yearOfStartOfOperation, mileage)
        );
        System.out.println("Автобус добавлен.");
    }

    private static void editBusFromConsole() {

        if (BusManagement.buses.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        BusManagement.showAllBuses();

        System.out.print("Введите id автобуса для редактирования: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Новая фамилия водителя: ");
        String lastNameDriver = scanner.nextLine();

        System.out.print("Новый номер автобуса: ");
        int numberOfTransport = scanner.nextInt();

        System.out.print("Новый номер маршрута: ");
        int routeNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Новая марка: ");
        String stamp = scanner.nextLine();

        System.out.print("Новый год начала эксплуатации: ");
        int yearOfStartOfOperation = scanner.nextInt();

        System.out.print("Новый пробег: ");
        int mileage = scanner.nextInt();
        scanner.nextLine();

        BusManagement.editBus(index, lastNameDriver, numberOfTransport,
                routeNumber, stamp, yearOfStartOfOperation, mileage);
    }


    private static void deleteBus() {
        System.out.println("=== УДАЛЕНИЕ АВТОБУСА ===");

        // Показываем все автобусы для информации
        BusManagement.showAllBuses();

        if (BusManagement.buses.isEmpty()) {
            System.out.println("Список автобусов пуст. Нечего удалять.");
            return;
        }

        System.out.print("Введите номер автобуса для удаления: ");
        int busNumber = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        // Подтверждение удаления
        System.out.print("Вы уверены, что хотите удалить автобус №" + busNumber + "? (да/нет): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("да")) {
            boolean deleted = BusManagement.deleteBusByNumber(busNumber);

            if (deleted) {
                System.out.println("Автобус №" + busNumber + " успешно удален!");
            } else {
                System.out.println("Автобус с номером " + busNumber + " не найден!");
            }
        } else {
            System.out.println("Удаление отменено.");
        }
    }


    /*
    Train
     */

    private static void runTrain() {

        trains.add(new Train("Москва", "Владивосток", "002H", 9302, 0, 264, 0));
        trains.add(new Train("Санкт-Петербург", "Мурманск", "016A", 1448, 58, 108, 162));

        while (true) {
            System.out.println("\n=== МЕНЮ: TRAIN ===");
            System.out.println("1. Добавить поезд");
            System.out.println("2. Вывод списка поездов, следующих до заданного пункта назначения;");
            System.out.println("3. Вывод общего числа мест в поезде с заданным номером");
            System.out.println("4. Вывод списка поездов, с протяженностью маршрута больше заданной");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTrain();
                    break;

                case 2:
                    System.out.println("Укажите пункт назначения: ");
                    String destination = scanner.nextLine();
                    TrainManagement.findTrainsByDestination(destination);
                    break;

                case 3:
                    System.out.println("Укажите номер: ");
                    String num = scanner.nextLine();
                    TrainManagement.calculateTotalSeatsByTrainNumber(num);
                    break;

                case 4:
                    System.out.println("Укажите протяженность маршрута: ");
                    int route = scanner.nextInt();
                    TrainManagement.findTrainsWithRouteLengthGreaterThan(route);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addTrain() {
        System.out.print("Пункт отправления: ");
        String departurePoint = scanner.nextLine();
        System.out.print("Пункт назначения: ");
        String destination = scanner.nextLine();
        System.out.print("Номер поезда: ");
        String numberOfTransport = scanner.nextLine();
        System.out.print("протяженность маршрута: ");
        int routeLength = scanner.nextInt();
        System.out.print("число общих мест: ");
        int numberOfCommonPlaces = scanner.nextInt();
        System.out.print("число купейных мест: ");
        int numberOfCompartments = scanner.nextInt();
        System.out.print("число плацкартных мест: ");
        int numberOfReservedSeats = scanner.nextInt();

        trains.add(
                new Train(departurePoint, destination, numberOfTransport, routeLength, numberOfCommonPlaces, numberOfCompartments, numberOfReservedSeats)
        );
        System.out.println("Поезд добавлен.");
    }

    /*
    Wagon
     */

    private static void runWagon() {

        wagons.add(new Wagon("Купейный", "09", 18, "Волкова", "002H", true, 7));
        wagons.add(new Wagon("Плацкартный", "07", 54, "Иванов", "016A", false, 22));
        wagons.add(new Wagon("Вагон-ресторан", "P-01", 48, "Петров", "002H", true, 15));

        while (true) {
            System.out.println("\n=== МЕНЮ: Wagon ===");
            System.out.println("1. Добавить вагон");
            System.out.println("2. Вывод списка вагонов, находящихся в эксплуатации больше указанного количества лет");
            System.out.println("3. Вывод списка вагонов, закрепленных за проводником с заданной фамилией");
            System.out.println("4. Вывод списка вагонов с кондиционером");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addWagon();
                    break;

                case 2:
                    System.out.println("Укажите год: ");
                    int period = scanner.nextInt();
                    WagonManagement.findCarsInServiceLongerThan(period);
                    break;

                case 3:
                    System.out.println("Укажите фамилию проводника: ");
                    String lastName = scanner.nextLine();
                    WagonManagement.findCarsByConductorLastName(lastName);
                    break;

                case 4:
                    WagonManagement.findCarsWithAirConditioning();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addWagon() {
        System.out.print("тип вагона: ");
        String typeOfCarriage = scanner.nextLine();
        System.out.print("номер вагона: ");
        String numberOfTransport = scanner.nextLine();
        System.out.print("число мест в вагоне: ");
        int numberSeats = scanner.nextInt();
        System.out.print("фамилия проводника: ");
        String conductorName = scanner.nextLine();
        System.out.print("номер поезда, к которому прикреплен вагон: ");
        String trainNumber = scanner.nextLine();
        System.out.print("признак наличия кондиционера: ");
        boolean isConditioner = scanner.nextBoolean();
        System.out.print("срок эксплуатации вагона: ");
        int operationPeriod = scanner.nextInt();

        wagons.add(
                new Wagon(typeOfCarriage, numberOfTransport, numberSeats, conductorName, trainNumber, isConditioner, operationPeriod)
        );
        System.out.println("Вагон добавлен.");
    }

    /*
    Applicant
     */

    private static void runApplicant() {

        applicants.add(new Applicant("Петров", "Петр", "Петрович", "ул. Пушкина, 20, кв. 12", new String[]{"Математика", "Литература"}, new int[]{1, 2, 4, 5}));
        applicants.add(new Applicant("Петров", "Алексей", "Петрович", "ул. Пушкина, 20, кв. 12", new String[]{"Математика", "Литература"}, new int[]{5, 1, 1, 1}));
        applicants.add(new Applicant("Глебов", "Алексей", "Петрович", "ул. Пушкина, 20, кв. 12", new String[]{"Математика", "Литература"}, new int[]{5, 5, 5, 4}));

        while (true) {
            System.out.println("\n=== МЕНЮ: Applicant ===");
            System.out.println("1. Добавить абитуриента");
            System.out.println("2. вывод списка абитуриентов, имеющих неудовлетворительные оценки");
            System.out.println("3. вывод списка абитуриентов, сумма баллов у которых не меньше заданной");
            System.out.println("4. Абитуриент имеющий самую высокую сумму баллов");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addApplicant();
                    break;

                case 2:
                    ApplicantManagement.findApplicantsWithUnsatisfactoryGrades();
                    break;

                case 3:
                    System.out.println("Укажите сумму баллов: ");
                    int sum = scanner.nextInt();
                    ApplicantManagement.findApplicantsWithMinTotalScore(sum);
                    break;

                case 4:
                    ApplicantManagement.findApplicantWithHighestScore();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addApplicant() {
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("Адрес: ");
        String address = scanner.nextLine();
        System.out.print("Предмет: ");
        String[] subject = new String[]{scanner.nextLine()};
        System.out.print("Оценка: ");
        int[] grades = new int[]{scanner.nextInt()};

        applicants.add(
                new Applicant(lastName, firstName, middleName, address, subject, grades)
        );
        System.out.println("Абитуриент добавлен.");
    }

    /*
    Student
     */

    private static void runStudent() {

        StudentManagement.students.add(
                new Student("Боровиков", "Иван", "Алексеевич",
                        "Ул. Новосёлов",
                        LocalDate.of(1999, 1, 20), "89081461708",
                        "Информационная безопасность", 3, true)
        );

        StudentManagement.students.add(
                new Student("Волков", "Валерий", "Олегович",
                        "Ул. Пушкина",
                        LocalDate.of(1929, 4, 20), "88007767667",
                        "Архитектура", 3, false)
        );

        StudentManagement.students.add(
                new Student("Волков", "Петр", "Олегович",
                        "Ул. Пушкина",
                        LocalDate.of(1939, 2, 20), "88007767667",
                        "Архитектура", 3, false)
        );

        while (true) {
            System.out.println("\n=== МЕНЮ: STUDENT ===");
            System.out.println("1. Добавить студента");
            System.out.println("2. Список студентов заданного факультета");
            System.out.println("3. Список студентов заданного факультета и курса");
            System.out.println("4. Список иногородних студентов");
            System.out.println("5. Редактировать студента");
            System.out.println("6. Удалить студента");
            System.out.println("7. Просмотр всех студентов");
            System.out.println("8. Назад");
            System.out.print("Выбор: ");
            System.out.println("==========================");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    System.out.print("Укажите факультет: ");
                    String faculty = scanner.nextLine();
                    StudentManagement.showByFaculty(faculty);
                    break;

                case 3:
                    System.out.print("Укажите факультет: ");
                    String faculty2 = scanner.nextLine();
                    System.out.print("Укажите курс: ");
                    int course = scanner.nextInt();
                    scanner.nextLine();
                    StudentManagement.showByFacultyAndCourse(faculty2, course);
                    break;

                case 4:
                    StudentManagement.showResidentStudents();
                    break;

                case 5:
                    editStudentFromConsole();
                    break;

                case 6:
                    deleteStudentFromConsole();
                    break;

                case 7:
                    showAllStudents();
                    break;

                case 8:
                    return;

                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }


    private static void addStudent() {

        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();

        System.out.print("Имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Адрес: ");
        String address = scanner.nextLine();

        System.out.print("Дата рождения (YYYY-MM-DD): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.print("Телефон: ");
        String phone = scanner.nextLine();

        System.out.print("Факультет: ");
        String faculty = scanner.nextLine();

        System.out.print("Курс: ");
        int course = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Иногородний (true/false): ");
        boolean resident = scanner.nextBoolean();
        scanner.nextLine();

        StudentManagement.students.add(
                new Student(lastName, firstName, middleName,
                        address,
                        dateOfBirth, phone,
                        faculty, course, resident)
        );

        System.out.println("Студент добавлен.");
    }


    private static void editStudentFromConsole() {

        if (StudentManagement.students.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        StudentManagement.showAllStudents();

        System.out.print("Введите id студента для редактирования: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Новая фамилия: ");
        String lastName = scanner.nextLine();

        System.out.print("Новое имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Новое отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Новый адрес: ");
        String address = scanner.nextLine();

        System.out.print("Новая дата рождения (YYYY-MM-DD): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.print("Новый телефон: ");
        String phone = scanner.nextLine();

        System.out.print("Новый факультет: ");
        String faculty = scanner.nextLine();

        System.out.print("Новый курс: ");
        int course = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Иногородний (true/false): ");
        boolean resident = scanner.nextBoolean();
        scanner.nextLine();

        StudentManagement.editStudent(index,
                lastName, firstName, middleName,
                address,
                dateOfBirth, phone,
                faculty, course, resident);
    }

    private static void deleteStudentFromConsole() {

        if (StudentManagement.students.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        StudentManagement.showAllStudents();

        System.out.print("Введите id студента для удаления: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Вы уверены, что хотите удалить этого студента? (да/нет): ");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("да")) {
            boolean deleted = StudentManagement.deleteStudentByIndex(index);

            if (deleted) {
                System.out.println("Студент успешно удалён.");
            } else {
                System.out.println("Неверный номер студента.");
            }
        } else {
            System.out.println("Удаление отменено.");
        }
    }





    /*
    Teacher
     */

    private static void runTeacher() {

        teachers.add(new Teacher("Иванов", "Александр", "Петрович", "Профессор", "Высшей математики", "Математический анализ"));
        teachers.add(new Teacher("Петров", "Дмитрий", "Сергеевич", "Старший преподаватель", "Иностранных языков", "Английский язык для профессиональных целей"));
        teachers.add(new Teacher("Смирнова", "Елена", "Владимировна", "Доцент", "Программной инженерии", "Базы данных"));

        while (true) {
            System.out.println("\n=== МЕНЮ: Teacher ===");
            System.out.println("1. Добавить преподавателя");
            System.out.println("2. вывод списка преподавателей, работающих на выбранной кафедре");
            System.out.println("3. Вывод фамилии, должности и кафедры преподавателя, ведущих заданный предмет");
            System.out.println("4. Вывести список кафедр и работающих на них преподавателей");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTeacher();
                    break;

                case 2:
                    System.out.println("Укажите кафедру: ");
                    String department = scanner.nextLine();
                    TeacherManagement.findTeachersByDepartment(department);
                    break;

                case 3:
                    System.out.println("Укажите предмет: ");
                    String object = scanner.nextLine();
                    TeacherManagement.findTeachersBySubject(object);
                    break;

                case 4:
                    TeacherManagement.getDepartmentsWithTeachers();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addTeacher() {
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("Должность: ");
        String post = scanner.nextLine();
        System.out.print("Кафедра: ");
        String department = scanner.nextLine();
        System.out.print("Предмет: ");
        String object = scanner.nextLine();



        teachers.add(
                new Teacher(lastName, firstName, middleName, post, department, object)
        );
        System.out.println("Преподаватель добавлен.");
    }


    /*
    FerrisWheel
     */

    private static void runFerrisWheel() {
        ferrisWheels.add(new FerrisWheel("Москва-Сити 360", 140, 30, 48, "ГК \"Столичные парки\"", 2022));
        ferrisWheels.add(new FerrisWheel("Небо Парк", 55, 15, 24, "ПКиО \"Зеленый остров\"", 1998));
        ferrisWheels.add(new FerrisWheel("Карусель-Небо", 25, 8, 12, "ИП Сидоров", 2010));


        while (true) {
            System.out.println("\n=== МЕНЮ: FerrisWheel ===");
            System.out.println("1. Добавить колесо обозрения");
            System.out.println("2. вывод списка преподавателей, работающих на выбранной кафедре");
            System.out.println("3. Вывод фамилии, должности и кафедры преподавателя, ведущих заданный предмет");
            System.out.println("4. Вывести список кафедр и работающих на них преподавателей");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTeacher();
                    break;

                case 2:
                    System.out.println("Укажите кафедру: ");
                    String department = scanner.nextLine();
                    TeacherManagement.findTeachersByDepartment(department);
                    break;

                case 3:
                    System.out.println("Укажите предмет: ");
                    String object = scanner.nextLine();
                    TeacherManagement.findTeachersBySubject(object);
                    break;

                case 4:
                    TeacherManagement.getDepartmentsWithTeachers();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addFerrisWheel() {
        System.out.print("Наименование колеса: ");
        String nameWheel = scanner.nextLine();
        System.out.print("Высота колеса: ");
        int wheelHeight = scanner.nextInt();
        System.out.print("длительность полного оборота(минуты): ");
        int theDurationOfCompleteRevolution = scanner.nextInt();
        System.out.print("количество мест: ");
        int numberOfSeats = scanner.nextInt();
        System.out.print("Наименование владельца: ");
        String nameOwner = scanner.nextLine();
        System.out.print("год постройки: ");
        int yearOfConstruction = scanner.nextInt();



        ferrisWheels.add(
                new FerrisWheel(nameWheel, wheelHeight, theDurationOfCompleteRevolution, numberOfSeats, nameOwner, yearOfConstruction)
        );
        System.out.println("Колесо обозрения добавлено.");
    }

     /*
    ResultRunners
     */

    private static void runResultRunners() {
        resultRunners.add(new ResultRunners("Кипчоге", "Кения", 39, 42.192, 9));
        resultRunners.add(new ResultRunners("Кипчоге", "Кения", 39, 42.192, 8));
        resultRunners.add(new ResultRunners("Ингебригтсен", "Норвегия", 23, 1500, 6));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, 10));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, 11));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, 12));


        while (true) {
            System.out.println("\n=== МЕНЮ: ResultRunners ===");
            System.out.println("1. Добавить результат забега");
            System.out.println("2. вывод списка спортсменов, пробежавших указанную дистанцию, результат которых укладывается во введенный диапазон");
            System.out.println("3. вывод отсортированного(по результатам) списка спортсменов, принадлежащих указанной стране.");
            System.out.println("4. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addResultRunners();
                    break;

                case 2:
                    System.out.println("Укажите дистанцию: ");
                    double distance = scanner.nextDouble();
                    System.out.println("Укажите результат: ");
                    int res = scanner.nextInt();
                    ResultRunnersManagement.findAthletesByDistanceAndTimeRange(distance, res);
                    break;

                case 3:
                    System.out.println("Укажите страну: ");
                    String country = scanner.nextLine();
                    ResultRunnersManagement.findAthletesByCountryOrderByResultAsc(country);
                    break;


                case 4:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addResultRunners() {
        System.out.print("Фамилия спортсмена: ");
        String lastNameOfTheAthlete = scanner.nextLine();
        System.out.print("страна, которую он представляет: ");
        String country = scanner.nextLine();
        System.out.print("Возраст: ");
        int age = scanner.nextInt();
        System.out.print("дистанция забега: ");
        double raceDistance = scanner.nextDouble();
        System.out.print("результат: ");
        int result = scanner.nextInt();



        resultRunners.add(
                new ResultRunners(lastNameOfTheAthlete, country, age, raceDistance, result)
        );
        System.out.println("Результат бегунов добавлен.");
    }

    /*
    Apartment
     */

    private static void runApartment() {
        apartments.add(new Apartment(85, 9, 2, 58.7, 34.2, "Иванов"));
        apartments.add(new Apartment(401, 4, 3, 112.5, 78.9, "Смирнова"));
        apartments.add(new Apartment(12, 1, 1, 32.4, 27.5, "Петров"));


        while (true) {
            System.out.println("\n=== МЕНЮ: Apartment ===");
            System.out.println("1. Добавить квартиру");
            System.out.println("2. вывод списка квартир, имеющих заданное число комнат");
            System.out.println("3. вывод списка квартир, принадлежащих заданному владельцу.");
            System.out.println("4. вывод средней площади комнату квартиры с указанным номером.");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addApartment();
                    break;

                case 2:
                    System.out.println("Укажите число комнат: ");
                    int rooms = scanner.nextInt();
                    ApartmentManagement.findApartmentsByRoomCount(rooms);
                    break;

                case 3:
                    System.out.println("Укажите владельца: ");
                    String owner = scanner.nextLine();
                    ApartmentManagement.findApartmentsByOwnerLastName(owner);
                    break;

                case 4:
                    System.out.println("Укажите номер квартиры: ");
                    int num = scanner.nextInt();
                    ApartmentManagement.calculateAverageRoomAreaForApartment(num);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addApartment() {
        System.out.print("Номер квартиры: ");
        int apartmentNumber = scanner.nextInt();
        System.out.print("номер этажа: ");
        int floorNumber = scanner.nextInt();
        System.out.print("количество комнат: ");
        int numberOfRooms = scanner.nextInt();
        System.out.print("общая площадь: ");
        double totalArea = scanner.nextDouble();
        System.out.print("жилая площадь: ");
        double livingArea = scanner.nextDouble();
        System.out.print("фамилия владельца: ");
        String ownerLastName = scanner.nextLine();



        apartments.add(
                new Apartment(apartmentNumber, floorNumber, numberOfRooms, totalArea, livingArea, ownerLastName)
        );
        System.out.println("Квартира добавлена.");
    }

    /*
    Dog
     */

    private static void runDog() {
        dogs.add(new Dog("Барон",  "Лабрадор-ретривер", 32.0, "Кузнецов", "Палевый", true, 58, 4));
        dogs.add(new Dog("Лакки",  "Той-пудель", 3.2, "Соколова", "Белый", false, 24, 1));
        dogs.add(new Dog("Арес",  "Немецкая овчарка", 42.2, "Иванов", "Чепрачный", true, 65, 6));


        while (true) {
            System.out.println("\n=== МЕНЮ: Dog ===");
            System.out.println("1. Добавить собаку");
            System.out.println("2. вывод списка собак, принадлежащих указанному владельцу");
            System.out.println("3. вывод списка собак, указанного окраса.");
            System.out.println("4. вывод информации по собакам, вес которых больше заданного.");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addDog();
                    break;

                case 2:
                    System.out.println("Укажите владельца: ");
                    String owner = scanner.nextLine();
                    DogManagement.findDogsByOwnerLastName(owner);
                    break;

                case 3:
                    System.out.println("Укажите окрас: ");
                    String color = scanner.nextLine();
                    DogManagement.findDogsByCoatColor(color);
                    break;

                case 4:
                    System.out.println("Укажите вес: ");
                    double weight = scanner.nextDouble();
                    DogManagement.findByWeightKgGreaterThan(weight);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addDog() {
        System.out.print("Кличка: ");
        String nickname = scanner.nextLine();
        System.out.print("Порода: ");
        String breed = scanner.nextLine();
        System.out.print("Вес: ");
        double weight = scanner.nextDouble();
        System.out.print("фамилия хозяина: ");
        String ownerLastName = scanner.nextLine();
        System.out.print("Окрас: ");
        String color = scanner.nextLine();
        System.out.print("Пол: ");
        boolean male = scanner.nextBoolean();
        System.out.println("Рост: ");
        int height = scanner.nextInt();
        System.out.println("Возраст: ");
        int age = scanner.nextInt();



        dogs.add(
                new Dog(nickname, breed, weight, ownerLastName, color, male, height, age)
        );
        System.out.println("Собака добавлена.");
    }

    /*
    Engine
     */

    private static void runEngine() {
        engines.add(new Engine("Toyota", 99.0, 1.33, true, 16, 4));
        engines.add(new Engine("Cummins", 360.0, 6.7, false, 24, 6));
        engines.add(new Engine("Ferrari", 800.0, 6.5, true, 48, 12));


        while (true) {
            System.out.println("\n=== МЕНЮ: Engine ===");
            System.out.println("1. Добавить двигатель");
            System.out.println("2. вывод списка двигателей, мощность которых больше указанной");
            System.out.println("3. вывод списка двигателей, с заданным количеством клапанов и цилиндров.");
            System.out.println("4. вывод информации по двигателям, заданного типа.");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addEngine();
                    break;

                case 2:
                    System.out.println("Укажите мощность: ");
                    double power = scanner.nextDouble();
                    EngineManagement.getEnginesByMinPower(power);
                    break;

                case 3:
                    System.out.println("Укажите кол-во клапанов: ");
                    int valves = scanner.nextInt();
                    System.out.println("Укажите кол-во цилиндров: ");
                    int countCylinders = scanner.nextInt();
                    EngineManagement.findEnginesByValvesAndCylinders(valves, countCylinders);
                    break;

                case 4:
                    System.out.println("Укажите тип двигателя(true - бензин, false - дизель): ");
                    boolean type = scanner.nextBoolean();
                    EngineManagement.findEnginesByType(type);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addEngine() {
        System.out.print("производитель: ");
        String manufacture = scanner.nextLine();
        System.out.print("мощность: ");
        double power = scanner.nextDouble();
        System.out.print("Объем цилиндров: ");
        double cylinderCapacity = scanner.nextDouble();
        System.out.print("тип двигателя(бензин/дизель): ");
        boolean engineType = scanner.nextBoolean();
        System.out.println("количество клапанов: ");
        int numberOfValves = scanner.nextInt();
        System.out.println("количество цилиндров: ");
        int numberOfCylinders = scanner.nextInt();



        engines.add(
                new Engine(manufacture, power, cylinderCapacity, engineType, numberOfValves, numberOfCylinders)
        );
        System.out.println("Двигатель добавлен.");
    }

    /*
    Phone
     */

    private static void runPhone() {
        phones.add(new Phone("Apple", "iPhone 15 Pro Max", 512, "Титан чёрный", 6.7, 4422));
        phones.add(new Phone("Samsung", "Galaxy A54 5G", 128, "Лаймовый", 6.4, 5000));
        phones.add(new Phone("Google", "Pixel 7a", 128, "Угольно-серый", 6.1, 4300));


        while (true) {
            System.out.println("\n=== МЕНЮ: Phone ===");
            System.out.println("1. Добавить телефон");
            System.out.println("2. вывод списка телефонов с заданным цветом корпуса");
            System.out.println("3. вывод списка телефонов заданного производителя с диагональю больше заданной.");
            System.out.println("4. вывод списка телефонов с емкостью аккумулятора больше заданной.");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addPhone();
                    break;

                case 2:
                    System.out.println("Укажите цвет корпуса: ");
                    String color = scanner.nextLine();
                    PhoneManagement.findPhonesByColor(color);
                    break;

                case 3:
                    System.out.println("Укажите производителя: ");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Укажите диагональ: ");
                    double diagonal = scanner.nextDouble();
                    PhoneManagement.findPhonesByBrandWithLargeScreen(manufacturer, diagonal);
                    break;

                case 4:
                    System.out.println("Укажите емкость аккумулятора: ");
                    int battery = scanner.nextInt();
                    PhoneManagement.findPhonesWithBatteryCapacityGreaterThan(battery);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addPhone() {
        System.out.print("производитель: ");
        String manufacture = scanner.nextLine();
        System.out.print("модель: ");
        String model = scanner.nextLine();
        System.out.print("Объем памяти: ");
        int memoryCapacity = scanner.nextInt();
        System.out.print("Цвет корпуса: ");
        String bodyColor = scanner.nextLine();
        System.out.println("диагональ экрана: ");
        double screenDiagonal = scanner.nextInt();
        System.out.println("емкость аккумулятора: ");
        int batteryCapacity = scanner.nextInt();



        phones.add(
                new Phone(manufacture, model, memoryCapacity, bodyColor, screenDiagonal, batteryCapacity)
        );
        System.out.println("Телефон добавлен.");
    }

    /*
    Rocket
     */

    private static void runRocket() {
        rockets.add(new Rocket("Государственный ракетный центр «Южный»", 2500, 11000, 200, 10, 550));
        rockets.add(new Rocket("КБ «Точность»", 800, 2500, 30, 1, 120));
        rockets.add(new Rocket("Завод «Молния»", 150, 120, 10, 1, 50));


        while (true) {
            System.out.println("\n=== МЕНЮ: Rocket ===");
            System.out.println("1. Добавить ракету");
            System.out.println("2. вывод списка ракет, с заданным количеством боеголовок и их количеством");
            System.out.println("3. вывод списка ракет, указанного производителя.");
            System.out.println("4. вывод информации по ракетам, с дальностью больше указанной.");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addRocket();
                    break;

                case 2:
                    System.out.println("Укажите кол-во боеголовок: ");
                    int countWarheads = scanner.nextInt();
                    RocketManagement.findRocketsByArmament(countWarheads);
                    break;

                case 3:
                    System.out.println("Укажите производителя: ");
                    String manufacturer = scanner.nextLine();
                    RocketManagement.findRocketsByManufacturer(manufacturer);
                    break;

                case 4:
                    System.out.println("Укажите дальность: ");
                    int range = scanner.nextInt();
                    RocketManagement.findRocketsWithRangeGreaterThan(range);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addRocket() {
        System.out.print("производитель: ");
        String manufacture = scanner.nextLine();
        System.out.print("мощность двигателя: ");
        int enginePower = scanner.nextInt();
        System.out.print("дальность: ");
        int range = scanner.nextInt();
        System.out.println("гарантированная точность (в метрах): ");
        int guaranteedAccuracyInMeters = scanner.nextInt();
        System.out.println("количество боеголовок: ");
        int numberOfWarheads = scanner.nextInt();
        System.out.println("Мощность боеголовок: ");
        int warheadPower = scanner.nextInt();



        rockets.add(
                new Rocket(manufacture, enginePower, range, guaranteedAccuracyInMeters, numberOfWarheads, warheadPower)
        );
        System.out.println("Ракета добавлена.");
    }

    /*
    Tire
     */

    private static void runTire() {
        tires.add(new Tire("Michelin", TireType.SUMMER, 17, 85000, TireCondition.NEW));
        tires.add(new Tire("Nokian", TireType.WINTER, 16, 15000, TireCondition.USED));
        tires.add(new Tire("Cordiant", TireType.WINTER, 14, 50000, TireCondition.NEW));


        while (true) {
            System.out.println("\n=== МЕНЮ: Tire ===");
            System.out.println("1. Добавить автопокрышку");
            System.out.println("2. вывод списка покрышек указанного типа с ожидаемым пробегом выше указанного");
            System.out.println("3. вывод списка новых покрышек нужного радиуса.");
            System.out.println("4. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTire();
                    break;

                case 2:
                    System.out.println("Укажите тип покрышки: ");
                    TireType type = TireType.valueOf(scanner.nextLine());
                    System.out.println("Укажите пробег: ");
                    int mileage = scanner.nextInt();
                    TireManagement.findTiresByTypeWithMileageAbove(type, mileage);
                    break;

                case 3:
                    System.out.println("Укажите радиус: ");
                    int radius = scanner.nextInt();
                    TireManagement.findNewTiresByRadius(radius);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addTire() {
        System.out.print("производитель: ");
        String manufacture = scanner.nextLine();
        System.out.print("тип покрышки(лето/зима): ");
        TireType tireType = TireType.valueOf(scanner.nextLine());
        System.out.print("радиус: ");
        int radius = scanner.nextInt();
        System.out.println("ожидаемый пробег: ");
        int expectedMileage = scanner.nextInt();
        System.out.println("новая/бу: ");
        TireCondition newOrBu = TireCondition.valueOf(scanner.nextLine());




        tires.add(
                new Tire(manufacture, tireType, radius, expectedMileage, newOrBu)
        );
        System.out.println("Автопокрышка добавлена.");
    }

    /*
    ClientBank
     */

    private static void runClientBank() {
        clientsBanks.add(new ClientBank("Боровиков", "Иван", "Алексеевич", "ул. Новосёлов", "+7-999-989-99-99", "1", 1000.0, 5000.0));
        clientsBanks.add(new ClientBank("Волков", "Андрей", "Алексеевич", "ул. Пушкинская", "+7-999-989-99-99", "2", 993.0, 5000.0));
        clientsBanks.add(new ClientBank("Федоров", "Артем", "Андреевич", "ул. Тверская", "+7-999-989-99-99", "3", 800.0, 5000.0));
        clientsBanks.add(new ClientBank("Лисицин", "Павел", "Александрович", "ул. Победы", "+7-999-989-99-99", "4", 800.0, 0.0));


        while (true) {
            System.out.println("\n=== МЕНЮ: ClientBank ===");
            System.out.println("1. Добавить клиента банка");
            System.out.println("2. вывод информации о клиенте по номеру банковского счета");
            System.out.println("3. вывод списка клиентов, количество денег на счете которых, меньше указанного");
            System.out.println("4. вывод списка клиентов, без овердрафта");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addClientBank();
                    break;

                case 2:
                    System.out.println("Укажите номер банковского счета: ");
                    String bankAccountNumber = scanner.nextLine();
                    ClientsBankManagement.showCustomerInformation(bankAccountNumber);
                    break;

                case 3:
                    System.out.println("Укажите кол-во денег: ");
                    double money = scanner.nextDouble();
                    ClientsBankManagement.showCustomersWithLessMoney(money);
                    break;

                case 4:
                    ClientsBankManagement.showWithoutAnOverdraft();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addClientBank() {
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("Адрес: ");
        String address = scanner.nextLine();
        System.out.print("Телефон: ");
        String phone = scanner.nextLine();
        System.out.print("Номер банковского счета: ");
        String bankAccountNumber = scanner.nextLine();
        System.out.print("Количество денег на счете: ");
        double amountOfMoneyAccount = scanner.nextDouble();
        System.out.print("Лимит овердрафта: ");
        double overdraftLimit = scanner.nextDouble();

        clientsBanks.add(
                new ClientBank(lastName, firstName, middleName, address, phone, bankAccountNumber, amountOfMoneyAccount, overdraftLimit)
        );
        System.out.println("Клиент банка добавлен.");
    }

    /*
    Employee
     */

    private static void runEmployee() {
        employees.add(new Employee("Шатунов", "Валерий", "Алексеевич", "Руководитель", "Управление", 2020, 2000));
        employees.add(new Employee("Бегунов", "Алексей", "Дмитриевич", "PM", "Отдел разработки", 2018, 2500));
        employees.add(new Employee("Варапаева", "Галина", "Генадьевна", "Тестировщик", "Отдел разработки", 2021, 1900));

        while (true) {
            System.out.println("\n=== МЕНЮ: Employee ===");
            System.out.println("1. Добавить сотрудника");
            System.out.println("2. вывод списка сотрудников, работающих в заданном подразделении");
            System.out.println("3. вывод списка сотрудников, зарплата которых больше заданной");
            System.out.println("4. вывод списка сотрудников, занимающих заданную должность");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    System.out.println("Укажите подразделение: ");
                    String department = scanner.nextLine();
                    EmployeeManagement.WorkingInTheDepartment(department);
                    break;

                case 3:
                    System.out.println("Укажите зарплату: ");
                    double salary = scanner.nextDouble();
                    EmployeeManagement.SalaryHigherThanTheSetOne(salary);
                    break;

                case 4:
                    System.out.println("Укажите должность: ");
                    String position = scanner.nextLine();
                    EmployeeManagement.currentPositions(position);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addEmployee() {
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("Должность: ");
        String position = scanner.nextLine();
        System.out.print("Подразделение: ");
        String department = scanner.nextLine();
        System.out.print("Год поступления на работу: ");
        int yearOfEmployment = scanner.nextInt();
        System.out.print("Зарплата: ");
        double salary = scanner.nextDouble();

        employees.add(
                new Employee(lastName, firstName, middleName, position, department, yearOfEmployment, salary)
        );
        System.out.println("Сотрудник добавлен.");
    }

    /*
    Human
     */

    private static void runHuman() {
        humans.add(new Human("Зверева", "София", "Александровна", "ул. Северная", Sex.FEMALE, "Высшее", 23));
        humans.add(new Human("Боровиков", "Иван", "Алексеевич", "ул. Пушкинская", Sex.MALE, "Среднее", 24));
        humans.add(new Human("Глебов", "Кирилл", "Русланович", "ул. Победы", Sex.MALE, "Среднее", 20));
        humans.add(new Human("Теряев", "Максим", "Анатольевич", "ул. Степная", Sex.MALE, "Среднее", 20));

        while (true) {
            System.out.println("\n=== МЕНЮ: Human ===");
            System.out.println("1. Добавить человека");
            System.out.println("2. вывод списка граждан, возраст которых превышает заданный");
            System.out.println("3. вывод списка граждан с высшим образованием");
            System.out.println("4. вывод списка граждан заданного пола");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addHuman();
                    break;

                case 2:
                    System.out.println("Укажите возраст: ");
                    int age = scanner.nextInt();
                    HumanManagement.showExceedsTheSpecifiedAge(age);
                    break;

                case 3:
                    System.out.println("Укажите образование: ");
                    String education = scanner.nextLine();
                    HumanManagement.showHigherEducation(education);
                    break;

                case 4:
                    System.out.println("Укажите пол(Мужчина/Женщина): ");
                    Sex male = Sex.valueOf(scanner.nextLine());
                    HumanManagement.showGender(male);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addHuman() {
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("Адрес: ");
        String address = scanner.nextLine();
        System.out.print("Пол: ");
        Sex male = Sex.valueOf(scanner.nextLine());
        System.out.print("Образование: ");
        String education = scanner.nextLine();
        System.out.print("Возраст: ");
        int age = scanner.nextInt();

        humans.add(
                new Human(lastName, firstName, middleName, address, male, education, age)
        );
        System.out.println("Человек добавлен.");
    }

    /*
    Patient
     */

    private static void runPatient() {
        patients.add(new Patient("Сидоров", "Глеб", "Глебович", "ул. Малюгина", 2112, "Воспаление легких", "Негодов"));
        patients.add(new Patient("Пушкин", "Дмитрий", "Валерьевич", "ул. Шолохова", 1123, "Астма", "Глебов"));
        patients.add(new Patient("Хмеленко", "Илья", "Ильич", "ул. Солнечная", 1128, "Астма", "Глебов"));
        patients.add(new Patient("Шмыглев", "Юрий", "Олегович", "ул. Степная", 4321, "Отравление", "Тихонов"));

        while (true) {
            System.out.println("\n=== МЕНЮ: Patient ===");
            System.out.println("1. Добавить человека");
            System.out.println("2. вывод списка пациентов, имеющих данный диагноз");
            System.out.println("3. вывод информации о пациенте по номеру медицинской карты");
            System.out.println("4. вывод списка пациентов заданного лечащего врача");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    System.out.println("Укажите диагноз: ");
                    String diagnosis = scanner.nextLine();
                    PatientManagement.havingADiagnosis(diagnosis);
                    break;

                case 3:
                    System.out.println("Укажите мед. карту: ");
                    int cardNum = scanner.nextInt();
                    PatientManagement.medicalCardInformation(cardNum);
                    break;

                case 4:
                    System.out.println("Укажите лечащего врача: ");
                    String ownerDoctor = scanner.nextLine();
                    PatientManagement.findAttendingPhysician(ownerDoctor);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addPatient() {
        System.out.print("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("Адрес: ");
        String address = scanner.nextLine();
        System.out.print("Номер медицинской карты: ");
        int medicalCardNumber = scanner.nextInt();
        System.out.print("Диагноз: ");
        String diagnosis = scanner.nextLine();
        System.out.print("Фамилия лечащего врача: ");
        String lastNameOfTheAttendingPhysician = scanner.nextLine();


        patients.add(
                new Patient(lastName, firstName, middleName, address, medicalCardNumber, diagnosis, lastNameOfTheAttendingPhysician)
        );
        System.out.println("Пациент добавлен.");
    }

    /*
    City
     */

    private static void runCity() {
        cities.add(new City("Москва", 13274285L, LocalDate.of(1147, 1, 2), "Собянин", 5000000000000L));
        cities.add(new City("Ростов-на-Дону", 1143123L, LocalDate.of(1749, 2, 1), "Слюсарь ", 79000000000L));
        cities.add(new City("Воронеж", 1143123L, LocalDate.of(1585, 3, 4), "Гусев ", 48000000000L));

        while (true) {
            System.out.println("\n=== МЕНЮ: City ===");
            System.out.println("1. Добавить город");
            System.out.println("2. вывод списка городов, с количеством жителей больше указанной");
            System.out.println("3. вывод списка губернаторов города под управлением которых имеют бюджет больше указанного и основаны позже указанной даты");
            System.out.println("4. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addCity();
                    break;

                case 2:
                    System.out.println("Укажите кол-во жителей: ");
                    Long num = scanner.nextLong();
                    CityManagement.getCitiesByMinPopulation(num);
                    break;

                case 3:
                    System.out.println("Укажите бюджет: ");
                    Long budget = scanner.nextLong();
                    System.out.println("Укажите дату: ");
                    LocalDate date = LocalDate.ofEpochDay(scanner.nextLong());
                    CityManagement.findByCity_BudgetGreaterThanAndCity_FoundationDateAfter(budget, date);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addCity() {
        System.out.print("Название города: ");
        String name = scanner.nextLine();
        System.out.print("Количество жителей: ");
        Long numberOfInhabitants = scanner.nextLong();
        System.out.print("Дата основания: ");
        LocalDate foundationYear = LocalDate.parse(scanner.nextLine());
        System.out.print("Фамилия губернатора: ");
        String lastNameOfGovernor = scanner.nextLine();
        System.out.print("Бюджет: ");
        Long budget = scanner.nextLong();



        cities.add(
                new City(name, numberOfInhabitants, foundationYear, lastNameOfGovernor, budget)
        );
        System.out.println("Город добавлен.");
    }

    /*
    Country
     */

    private static void runCountry() {
        countries.add(new Country("Россия", 17151442L, 146119928L, 36000000000000000L, LocalDate.of(862, 1, 1), "Путин"));
        countries.add(new Country("Франция", 551500L, 68605616L, 182508000L, LocalDate.of(843, 2, 2), "Макрон"));

        while (true) {
            System.out.println("\n=== МЕНЮ: Country ===");
            System.out.println("1. Добавить страну");
            System.out.println("2. вывод списка стран, основанных ранее указанного года");
            System.out.println("3. вывод списка стран, с площадью меньше указанной");
            System.out.println("4. вывод фамилии президента страны с указанным количеством граждан");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addCountry();
                    break;

                case 2:
                    System.out.println("Укажите год: ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    CountryManagement.findAncientCountries(date);
                    break;

                case 3:
                    System.out.println("Укажите площадь: ");
                    Long territory = scanner.nextLong();
                    CountryManagement.getCountriesByMaxArea(territory);
                    break;

                case 4:
                    System.out.println("Укажите кол-во граждан: ");
                    Long count = scanner.nextLong();
                    CountryManagement.findPresidentLastNameByExactPopulation(count);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addCountry() {
        System.out.print("Название страны: ");
        String name = scanner.nextLine();
        System.out.print("Площадь территории: ");
        Long areaOfTerritory = scanner.nextLong();
        System.out.print("Количество граждан: ");
        Long numberOfCitizens = scanner.nextLong();
        System.out.print("Бюджет: ");
        Long budget = scanner.nextLong();
        System.out.print("Дата основания: ");
        LocalDate foundationYear = LocalDate.parse(scanner.nextLine());
        System.out.print("Фамилия губернатора: ");
        String lastNameOfPresident = scanner.nextLine();




        countries.add(
                new Country(name, areaOfTerritory, numberOfCitizens, budget, foundationYear, lastNameOfPresident)
        );
        System.out.println("Страна добавлена.");
    }

    /*
    OrderRestaurant
     */

    private static void runOrderRestaurant() {
        orderRestaurants.add(new OrderRestaurant("Лисицин", 2, "Лазанья", 450.0, 100, PaymentType.CARD));
        orderRestaurants.add(new OrderRestaurant("Алипов", 4, "Картошка по деревенски", 300.0, 30, PaymentType.CASH));

        while (true) {
            System.out.println("\n=== МЕНЮ: OrderRestaurant ===");
            System.out.println("1. Добавить заказ в ресторане");
            System.out.println("2. вывод информации о заказах, принятых конкретным официантом");
            System.out.println("3. вывод списка заказов, стоимость которых больше указанной");
            System.out.println("4. вывод списка клиентов, платящих наличными");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addOrderRestaurant();
                    break;

                case 2:
                    System.out.println("Укажите официанта: ");
                    String service = scanner.nextLine();
                    OrderRestaurantManagement.findOrdersByWaiter(service);
                    break;

                case 3:
                    System.out.println("Укажите стоимость заказа: ");
                    double cost = scanner.nextDouble();
                    OrderRestaurantManagement.findHighValueOrders(cost);
                    break;

                case 4:
                    OrderRestaurantManagement.findCustomersWhoPreferCash();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addOrderRestaurant() {
        System.out.print("Поставщик услуг: ");
        String serviceProvider = scanner.nextLine();
        System.out.print("Номер стола: ");
        int tableNumber = scanner.nextInt();
        System.out.print("Наименование блюда: ");
        String dishName = scanner.nextLine();
        System.out.print("Стоимость заказа: ");
        double cost = scanner.nextDouble();
        System.out.print("Чаевые: ");
        int tipAmount = scanner.nextInt();
        System.out.print("Оплата наличными или по карте: ");
        PaymentType paymentType = PaymentType.valueOf(scanner.nextLine());

        orderRestaurants.add(
                new OrderRestaurant(serviceProvider, tableNumber, dishName, cost, tipAmount, paymentType)
        );
        System.out.println("Заказ добавлен.");
    }

    /*
    OrderTaxi
     */

    private static void runOrderTaxi() {
        orderTaxis.add(new OrderTaxi("Рожков", "Ул. Новосёлов", "Главный Вокзал", "A233BH", 340.0, 2000));
        orderTaxis.add(new OrderTaxi("Гулан", "Ул. Пушкинская", "Галерея Чижова", "B132AC", 460.0, 3000));

        while (true) {
            System.out.println("\n=== МЕНЮ: OrderTaxi ===");
            System.out.println("1. Добавить заказ в ресторане");
            System.out.println("2. вывод информации о заказах, по номеру машины");
            System.out.println("3. вывод списка заказов, протяженность которых больше указанной");
            System.out.println("4. вывод размера среднего чека по всем заказам");
            System.out.println("5. Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addOrderRestaurant();
                    break;

                case 2:
                    System.out.println("Укажите номер машины: ");
                    String numCar = scanner.nextLine();
                    OrderTaxiManagement.getOrdersForVehicle(numCar);
                    break;

                case 3:
                    System.out.println("Укажите протяженность: ");
                    double route = scanner.nextDouble();
                    OrderTaxiManagement.findLongDistanceOrders(route);
                    break;

                case 4:
                    OrderTaxiManagement.getAverageCheck();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Неверный выбор!");


            }
        }

    }
    private static void addOrderTaxi() {
        System.out.print("Поставщик услуг: ");
        String serviceProvider = scanner.nextLine();
        System.out.print("Пункт отправления: ");
        String departurePoint = scanner.nextLine();
        System.out.print("Пункт прибытия: ");
        String arrivalPoint = scanner.nextLine();
        System.out.print("Номер машины: ");
        String numberCar = scanner.nextLine();
        System.out.print("Стоимость заказа: ");
        double cost = scanner.nextDouble();
        System.out.print("Протяжность маршрута: ");
        int routeLength = scanner.nextInt();


        orderTaxis.add(
                new OrderTaxi(serviceProvider, departurePoint, arrivalPoint, numberCar, cost, routeLength)
        );
        System.out.println("Заказ добавлен.");
    }
}

