package test.code;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class writeandread {
    Product product = new Product();

    public void writeProduct(List<Product> productList, boolean selection) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\file\\danhsach.csv",selection);
             bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product: productList){
                bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getDay() + "," + product.getCount());
                bufferedWriter.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Product> readProduct() {
        ArrayList<Product> productArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2\\src\\test\\file\\danhsach.csv");
             bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arrayProduct = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayProduct = line.split(",");
                Product product = new Product(arrayProduct[0], arrayProduct[1], arrayProduct[2], Integer.parseInt(arrayProduct[3]));
                productArrayList.add(product);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productArrayList;
    }
}
