package controller;

import model.Phonebook;
import storage.FilePhonebookManager;
import storage.LoadingFileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuManager {
    public static void showPhonebookList() {
        LoadingFileManager.phonebookManager.showAllList();
    }

    public static void addNewPhonebook() throws IOException {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter new number: ");
        String number = inputNumber.nextLine();

        boolean resultPhone = phoneNumberValidate(number);

        while (!resultPhone) {
            System.out.println("The phone number is wrong!!");
            Scanner inputNewNumber = new Scanner(System.in);
            System.out.println("Enter new number: ");
            number = inputNewNumber.nextLine();
            resultPhone = phoneNumberValidate(number);
        }


        Scanner inputGroup = new Scanner(System.in);
        System.out.println("Enter new group: ");
        String group = inputGroup.nextLine();

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String name = inputName.nextLine();

        Scanner inputSex = new Scanner(System.in);
        System.out.println("Enter sex: ");
        String sex = inputSex.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter new address: ");
        String address = inputAddress.nextLine();

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Enter Year of Birth: ");
        String year = inputYear.nextLine();

        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Enter Year of Month: ");
        String month = inputMonth.nextLine();

        Scanner inputDay = new Scanner(System.in);
        System.out.println("Enter Year of Day: ");
        String day = inputDay.nextLine();

        String dob = year + "-" + month + "-" + day;


        Scanner inputEmail= new Scanner(System.in);
        System.out.println("Enter new email: ");
        String email = inputEmail.nextLine();

        boolean resultEmail = emailValidate(number);

        while (!resultEmail) {
            System.out.println("The email is wrong!!");
            Scanner inputNewEmail = new Scanner(System.in);
            System.out.println("Enter new email: ");
            email = inputNewEmail.nextLine();
            resultEmail = phoneNumberValidate(email);
        }



        LoadingFileManager.phonebookManager.add(new Phonebook(number, group, name, sex, address, dob, email));
        System.out.println("Added Successful");
    }

    public static boolean phoneNumberValidate(String str) {

        String regex = "[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean emailValidate(String str) {

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static void updatePhonebook() throws IOException {
        LoadingFileManager.phonebookManager.showAllList();
        System.out.println("Choose the phonebook to update information: ");
        Scanner choicePhonebook = new Scanner(System.in);
        int choice = choicePhonebook.nextInt();

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter new number: ");
        String number = inputNumber.nextLine();

        boolean resultPhone = phoneNumberValidate(number);

        while (!resultPhone) {
            System.out.println("The phone number is wrong!!");
            Scanner inputNewNumber = new Scanner(System.in);
            System.out.println("Enter new number: ");
            number = inputNewNumber.nextLine();
            resultPhone = phoneNumberValidate(number);
        }


        Scanner inputGroup = new Scanner(System.in);
        System.out.println("Enter new group: ");
        String group = inputGroup.nextLine();

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String name = inputName.nextLine();

        Scanner inputSex = new Scanner(System.in);
        System.out.println("Enter sex: ");
        String sex = inputSex.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Enter new address: ");
        String address = inputAddress.nextLine();

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Enter Year of Birth: ");
        String year = inputYear.nextLine();

        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Enter Year of Month: ");
        String month = inputMonth.nextLine();

        Scanner inputDay = new Scanner(System.in);
        System.out.println("Enter Year of Day: ");
        String day = inputDay.nextLine();

        String dob = year + "-" + month + "-" + day;


        Scanner inputEmail= new Scanner(System.in);
        System.out.println("Enter new email: ");
        String email = inputEmail.nextLine();

        boolean resultEmail = emailValidate(number);

        while (!resultEmail) {
            System.out.println("The email is wrong!!");
            Scanner inputNewEmail = new Scanner(System.in);
            System.out.println("Enter new email: ");
            email = inputNewEmail.nextLine();
            resultEmail = phoneNumberValidate(email);
        }



        LoadingFileManager.phonebookManager.update(choice - 1, new Phonebook(number, group, name, sex, address, dob, email));
        System.out.println("Updated Successful");

    }

    public static void deletePhonebook() throws IOException {
        LoadingFileManager.phonebookManager.showAllList();
        System.out.println("Choose the phonebook to delete: ");
        Scanner choicePhonebook = new Scanner(System.in);
        int choice = choicePhonebook.nextInt();

        LoadingFileManager.phonebookManager.deleteByIndex(choice-1);

        System.out.println("Deleted successful!!");

    }

    public static void findPhoneBookByPhone() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter the phone number to find phonebook: ");
        String number = inputNumber.nextLine();

        for (Phonebook phonebook : LoadingFileManager.phonebookManager.getPhonebookList()) {
            if (phonebook.getNumber().equals(number)) {
                System.out.println(phonebook);
            }
        }
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        List<Phonebook> phonebooks = new ArrayList<>();
        System.out.println("Reading file from contacts.csv...");
        phonebooks = LoadingFileManager.filePhonebookManager.readFile();
        LoadingFileManager.phonebookManager.setPhonebookList(phonebooks);
        System.out.println("Read successful!!");
        LoadingFileManager.phonebookManager.showAllList();

    }

    public static void writeFile() throws IOException, ClassNotFoundException {
        System.out.println("Writing file from contacts.csv...");
        LoadingFileManager.filePhonebookManager.writeFile(LoadingFileManager.phonebookManager.getPhonebookList());
        System.out.println("Writing successful!!");

    }
}
