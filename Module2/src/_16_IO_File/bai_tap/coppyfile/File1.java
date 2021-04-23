package _16_IO_File.bai_tap.coppyfile;

import java.io.*;

public class File1 {
    public static void writerAndRead1(){

        try {
            FileWriter fileWriter = new FileWriter("src/_16_IO_File/bai_tap/file1.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Nguyễn Văn A"+","+"12/3/1998");
            bufferedWriter.newLine();
            bufferedWriter.write("Nguyễn Văn b"+","+"12/3/1998");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader1 = new FileReader("src/_16_IO_File/bai_tap/file1.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader1);
            String line = "";
            String[] arrayFile1=line.split(",");
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                FileWriter fileWriterTarget = new FileWriter("src/_16_IO_File/bai_tap/file2.csv",true);
                BufferedWriter bufferedWriterTarget = new BufferedWriter(fileWriterTarget);
                bufferedWriterTarget.write(line);
                bufferedWriterTarget.newLine();
                bufferedWriterTarget.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        writerAndRead1();
}
}
