package _12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    static List<Product> stringList = new ArrayList<>();
    Product product = new Product();
    Scanner input = new Scanner(System.in);

    public void add() {

        Product product = new Product();
        System.out.println("Input ID: ");
        product.setId(input.nextLine());
        System.out.println("Input Name Product: ");
        product.setName(input.nextLine());
        System.out.println("Input Mount Product: ");
        product.setMount(Integer.parseInt(input.nextLine()));
        stringList.add(product);
        Collections.sort(stringList);

    }

    public String getList() {
        String list = " ";
        for (int i = 0; i < stringList.size(); i++) {
            list += (i + 1 + "Name: " + stringList.get(i).getName() + "\n");
        }
        return list;
    }

    public void showList() {
        System.out.println(getList());
    }

    public void showProduct() {
        showList();
        System.out.println("Input product: ");
        int choose = input.nextInt();
        input.nextLine();
        System.out.println("Information Product: " + showInfor(stringList.get(choose - 1)));
    }

    public String showInfor(Product product) {
        String infor = "1.ID:  " + product.getId() +
                "\n" + "2.Name: " + product.getName()
                + "\n" + "3.Mount: " + product.getMount();
        return infor;
    }

    public void edit() {
        System.out.println("Collection Product:  "+"\n" + getList());
        System.out.println("Input choose product: ");
        int choose = input.nextInt();
        input.nextLine();
        System.out.println("Information Product: " +"\n" + showInfor(stringList.get(choose - 1)));
        System.out.println("Input choose edit: ");
        int edit = Integer.parseInt(input.nextLine());
        switch (edit) {
            case 1:
                System.out.println("Edit ID: ");
                stringList.get(choose-1).setId(input.nextLine());
                break;
            case 2:
                System.out.println("Edit Name: ");
                stringList.get(choose-1).setName(input.nextLine());
                break;
            case 3:
                System.out.println("Edit Mount: ");
                stringList.get(choose-1).setMount(input.nextInt());
                break;
            default:
                System.out.println("Fail!!");
        }
    }
    public void del(){
        showList();
        System.out.println("Input product delete: ");
        int del = Integer.parseInt(input.nextLine());
        stringList.remove(del-1);
        showList();
    }
    public void search(){
        System.out.println("Input product search: ");
        String search = input.nextLine();
        for (Product product: stringList){
            if ((product.getName() != null && product.getName().contains(search))){
                System.out.println(product);
            }
        }
    }
    public void sort(){
       Collections.sort(stringList, new Comparator<Product>() {
           @Override
           public int compare(Product o1, Product o2) {
                  return o1.getName().compareTo(o2.getName());
           }
       });
       for (Product product : stringList){
           System.out.println(product);
       }
    }
}
