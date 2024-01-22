import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    private Scanner scanner = new Scanner((System.in));

    public void runMenu() {
        int choice;

        do {
            System.out.println("1 - Eleman Ekle");
            System.out.println("2 - Eleman Çıkar");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    printSorted();
                    break;
                case 2:
                    removeItem();
                    printSorted();
                    break;
                case 3:
                    System.out.println("Uygulama kapatılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        } while (choice != 3);
    }


    public void addItem() {
        System.out.println("Eklenmesini istediğiniz eleman(lar)ı giriniz.");
        String input = scanner.nextLine();
        String[] items = input.split(", ");

        for (String item : items) {
            if (!checkItemIsInList(item)) {
                groceryList.add(item);
            } else {
                System.out.println(item + " zaten listede var.");
            }
        }
    }

    public void removeItem() {
        System.out.println("Cıkarılmasını istediğiniz eleman(lar)ı giriniz.");

        String input = scanner.nextLine();
        String[] items = input.split(", ");

        for(String item: items) {
            if(checkItemIsInList(item)) {
                groceryList.remove(item);
            } else {
                System.out.println(item + " listede bulunamadi.");
            }
        }
    }
    private boolean checkItemIsInList(String item) {
        return groceryList.contains(item);
    }
    private void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Alışveriş Listesi:");
        for (String item : groceryList) {
            System.out.println("- " + item);
        }
        System.out.println();
    }
}
