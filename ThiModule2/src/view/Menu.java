package view;

import controller.MenuManager;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void enable() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ---");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");

            Scanner choiceScanner = new Scanner(System.in);
            int choice = choiceScanner.nextInt();

            switch (choice){
                case 1:
                    MenuManager.showPhonebookList();
                    break;

                case 2:
                    MenuManager.addNewPhonebook();
                    break;

                case 3:
                    MenuManager.updatePhonebook();
                    break;

                case 4:
                    MenuManager.deletePhonebook();
                    break;

                case 5:
                    MenuManager.findPhoneBookByPhone();
                    break;

                case 6:
                    MenuManager.readFile();
                    break;

                case 7:
                    MenuManager.writeFile();
                    break;

                case 8:
                    System.out.println("Thoát Khỏi Chương Trình!!");
                    System.exit(0);
            }
        }
    }
}
