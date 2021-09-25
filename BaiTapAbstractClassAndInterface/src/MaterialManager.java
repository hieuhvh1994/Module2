import java.util.List;
import java.util.Scanner;

//implements Discount
public class MaterialManager  {
    private List<Material> materialList;

    public MaterialManager() {
    }

    public MaterialManager(List<Material> materialList) {
        this.materialList = materialList;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }

    public void addMaterial(Material material) {
        materialList.add(material);
    }

    public void removeMaterial(Material material) {
        materialList.remove(material);
    }

    public void changeMaterial() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            displayMaterial();
            System.out.println("0. Exit!");
            System.out.println("\n Enter the material to change: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.println("\n Change the name of the material: ");
            String new_name = scanner1.nextLine();
            materialList.get(choice-1).setName(new_name);


            System.out.println("\n Change the cost: ");
            int new_cost = scanner2.nextInt();
            materialList.get(choice-1).setCost(new_cost);

            if (materialList.get(choice-1) instanceof Meat) {
                Meat m = new Meat();
                m = (Meat) materialList.get(choice-1);
                System.out.println("\n Enter the weight: ");
                double new_weight = scanner3.nextDouble();
                m.setWeight(new_weight);
            } else if (materialList.get(choice-1) instanceof CrispyFlour) {
                CrispyFlour c = new CrispyFlour();
                c = (CrispyFlour) materialList.get(choice-1);
                System.out.println("\n Enter the quantity: ");
                int new_quantity = scanner3.nextInt();
                c.setQuantity(new_quantity);
            }

        }


        System.out.println("\n Materials Changed!!");
        System.exit(0);

    }

    public void displayMaterial() {
        if (!materialList.isEmpty()) {
            System.out.println("List of Materials: ");
            int i = 1;
            for (Material material : materialList) {
                if (material instanceof Meat) {
                    Meat m = new Meat();
                    m = (Meat) material;
                    System.out.println(i +". " +m);
                    i++;
                } else if (material instanceof CrispyFlour) {
                    CrispyFlour c = new CrispyFlour();
                    c = (CrispyFlour) material;
                    System.out.println(i+ ". " +c);
                    i++;
                }

            }
        } else {
            System.out.println("No material in list!");
        }
    }

}
