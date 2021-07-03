package vn.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Không được để trống")
    @Size(max = 45, min = 5,message = "Tối đa 45 kí tự, tối thiểu 5 kí tự")
    private String firstName;
    @NotBlank(message = "Không được để trống")
    @Size(max = 45, min = 5,message = "Tối đa 45 kí tự, tối thiểu 5 kí tự")
    private String lastName;
    @Pattern(regexp = "(036)[0-9]{7}",message = "Bắt đầu bằng 036-XXXXXXX")
    private String phone;
    @Min(value = 18)
    private int age;
    @Pattern(regexp = "[A-Za-z_.0-9]+@[a-z]+.[a-z]+.[a-z]+", message = "Email phải đúng định dạng")
    private String email;

    public User() {
    }

    public User(int id, @NotBlank(message = "Không được để trống") @Size(max = 45, min = 5, message = "Tối đa 45 kí tự, tối thiểu 5 kí tự") String firstName, @NotBlank(message = "Không được để trống") @Size(max = 45, min = 5, message = "Tối đa 45 kí tự, tối thiểu 5 kí tự") String lastName, @Pattern(regexp = "(036)[0-9]{7}", message = "Bắt đầu bằng 036-XXXXXXX") String phone, @Min(value = 18) int age, @Pattern(regexp = "[A-Za-z_.0-9]+@[a-z]+.[a-z]+.[a-z]+", message = "Email phải đúng định dạng") String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
