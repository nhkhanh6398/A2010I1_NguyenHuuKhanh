package _11_DSA_Stack_Queue.bai_tap.to_chuc_du_lieu;

import java.util.*;

public class ToChucDuLieuQueue {
    public static void main(String[] args) {
        Queue<Person> nu = new LinkedList<>();
        Queue<Person> nam = new LinkedList<>();
        List<Person> personList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number add: ");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < number; i++) {
            Person person = new Person();
            System.out.println("Input Name: ");
            person.setName(input.nextLine());
            System.out.println("Input Birthday: ");
            person.setBirthDay(input.nextLine());
            System.out.println("Input gender: ");
            person.setGender(input.nextLine());
            personList.add(person);
        }
        for (Person person1:personList){
            if (person1.getGender().equals("nu")){
                nu.offer(person1);
            }
            else if (person1.getGender().equals("nam")){
                nam.offer(person1);
            }
        }



        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i<nu.size()+nam.size();i++){
            if (!nu.isEmpty()){
                arrayList.add(nu.poll());
            }
            else if (!nam.isEmpty()){
                arrayList.add(nam.poll());
            }
        }
        for (Person i : arrayList){
            System.out.println(i);
        }


    }
}