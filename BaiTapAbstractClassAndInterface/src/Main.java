import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CrispyFlour f1 = new CrispyFlour("1", "flour 1", LocalDate.of(2021, 3, 1), 20000, 2);
        CrispyFlour f2 = new CrispyFlour("2", "flour 2", LocalDate.of(2021, 4, 1), 30000, 3);
        CrispyFlour f3 = new CrispyFlour("3", "flour 3", LocalDate.of(2021, 5, 1), 40000, 4);
        CrispyFlour f4 = new CrispyFlour("4", "flour 4", LocalDate.of(2021, 6, 1), 50000, 5);
        CrispyFlour f5 = new CrispyFlour("5", "flour 5", LocalDate.of(2021, 7, 1), 60000, 6);

        Meat m1 = new Meat("6", "meat 1", LocalDate.of(2021, 9, 19), 25000, 2);
        Meat m2 = new Meat("7", "meat 2", LocalDate.of(2021, 9, 20), 26000, 3);
        Meat m3 = new Meat("8", "meat 3", LocalDate.of(2021, 9, 21), 27000, 4);
        Meat m4 = new Meat("9", "meat 4", LocalDate.of(2021, 9, 22), 28000, 5);
        Meat m5 = new Meat("10", "meat 5", LocalDate.of(2021, 9, 23), 29000, 6);

        List<Material> materialList = new ArrayList<>();
        materialList.add(f1);
        materialList.add(f2);
        materialList.add(f3);
        materialList.add(f4);
        materialList.add(f5);
        materialList.add(m1);
        materialList.add(m2);
        materialList.add(m3);
        materialList.add(m4);
        materialList.add(m5);

        MaterialManager materialManager = new MaterialManager();
        materialManager.setMaterialList(materialList);


        CrispyFlour f6 = new CrispyFlour("11", "flour 6", LocalDate.of(2021, 1, 1), 80000, 9);
        materialManager.addMaterial(f6);
        materialManager.removeMaterial(f2);

//        materialManager.changeMaterial();

        materialManager.displayMaterial();





    }
}
