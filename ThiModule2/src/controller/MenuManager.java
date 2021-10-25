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
        System.out.println("Nhập số mới: ");
        String number = inputNumber.nextLine();

        boolean resultPhone = phoneNumberValidate(number);

        while (!resultPhone) {
            System.out.println("Định dạng số điện thoại sai!! Hãy nhập lại!!");
            Scanner inputNewNumber = new Scanner(System.in);
            System.out.println("Nhập số mới: ");
            number = inputNewNumber.nextLine();
            resultPhone = phoneNumberValidate(number);
        }


        Scanner inputGroup = new Scanner(System.in);
        System.out.println("Nhập nhóm mới: ");
        String group = inputGroup.nextLine();

        Scanner inputName = new Scanner(System.in);
        System.out.println("Nhập tên mới: ");
        String name = inputName.nextLine();

        Scanner inputSex = new Scanner(System.in);
        System.out.println("Nhập giới tính: ");
        String sex = inputSex.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Nhập địa chỉ mới: ");
        String address = inputAddress.nextLine();

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Nhập năm sinh: ");
        String year = inputYear.nextLine();

        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Nhập tháng sinh: ");
        String month = inputMonth.nextLine();

        Scanner inputDay = new Scanner(System.in);
        System.out.println("Nhập Ngày Sinh: ");
        String day = inputDay.nextLine();

        String dob = year + "-" + month + "-" + day;


        Scanner inputEmail= new Scanner(System.in);
        System.out.println("Nhập Email mới: ");
        String email = inputEmail.nextLine();

        boolean resultEmail = emailValidate(number);

        while (!resultEmail) {
            System.out.println("Định dạng email sai!! Hãy nhập lại!!");
            Scanner inputNewEmail = new Scanner(System.in);
            System.out.println("Nhập email mới: ");
            email = inputNewEmail.nextLine();
            resultEmail = phoneNumberValidate(email);
        }



        LoadingFileManager.phonebookManager.add(new Phonebook(number, group, name, sex, address, dob, email));
        System.out.println("Thêm thành công");
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
        System.out.println("Chọn số để sửa thông tin: ");
        Scanner choicePhonebook = new Scanner(System.in);
        int choice = choicePhonebook.nextInt();

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số mới: ");
        String number = inputNumber.nextLine();

        boolean resultPhone = phoneNumberValidate(number);

        while (!resultPhone) {
            System.out.println("Định dạng số điện thoại sai!! Hãy nhập lại");
            Scanner inputNewNumber = new Scanner(System.in);
            System.out.println("Nhập số mới: ");
            number = inputNewNumber.nextLine();
            resultPhone = phoneNumberValidate(number);
        }


        Scanner inputGroup = new Scanner(System.in);
        System.out.println("Nhập nhóm mới: ");
        String group = inputGroup.nextLine();

        Scanner inputName = new Scanner(System.in);
        System.out.println("Nhập tên mới: ");
        String name = inputName.nextLine();

        Scanner inputSex = new Scanner(System.in);
        System.out.println("Nhập giới tính: ");
        String sex = inputSex.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.println("Nhập địa chỉ mới: ");
        String address = inputAddress.nextLine();

        Scanner inputYear = new Scanner(System.in);
        System.out.println("Nhập năm sinh: ");
        String year = inputYear.nextLine();

        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Nhập tháng sinh: ");
        String month = inputMonth.nextLine();

        Scanner inputDay = new Scanner(System.in);
        System.out.println("Nhập ngày sinh: ");
        String day = inputDay.nextLine();

        String dob = year + "-" + month + "-" + day;


        Scanner inputEmail= new Scanner(System.in);
        System.out.println("Nhập email mới: ");
        String email = inputEmail.nextLine();

        boolean resultEmail = emailValidate(number);

        while (!resultEmail) {
            System.out.println("Định dạng email sai!! Hãy nhập lại");
            Scanner inputNewEmail = new Scanner(System.in);
            System.out.println("Nhập email mới: ");
            email = inputNewEmail.nextLine();
            resultEmail = phoneNumberValidate(email);
        }



        LoadingFileManager.phonebookManager.update(choice - 1, new Phonebook(number, group, name, sex, address, dob, email));
        System.out.println("Sửa thông tin thành công!!");


    }

    public static void deletePhonebook() throws IOException {
        LoadingFileManager.phonebookManager.showAllList();
        System.out.println("Chọn số để xóa: ");
        Scanner choicePhonebook = new Scanner(System.in);
        int choice = choicePhonebook.nextInt();

        LoadingFileManager.phonebookManager.deleteByIndex(choice-1);

        System.out.println("Xóa thành công!!");

    }

    public static void findPhoneBookByPhone() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số để tìm kiếm: ");
        String number = inputNumber.nextLine();

        for (Phonebook phonebook : LoadingFileManager.phonebookManager.getPhonebookList()) {
            if (phonebook.getNumber().equals(number)) {
                System.out.println(phonebook);
            }
        }
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        List<Phonebook> phonebooks = new ArrayList<>();
        System.out.println("Đọc file từ contacts.csv...");
        phonebooks = LoadingFileManager.filePhonebookManager.readFile();
        LoadingFileManager.phonebookManager.setPhonebookList(phonebooks);
        System.out.println("Đọc thành công!!");
        LoadingFileManager.phonebookManager.showAllList();

    }

    public static void writeFile() throws IOException, ClassNotFoundException {
        System.out.println("Ghi file contacts.csv...");
        LoadingFileManager.filePhonebookManager.writeFile(LoadingFileManager.phonebookManager.getPhonebookList());
        System.out.println("Ghi file thành công!!");

    }
}
