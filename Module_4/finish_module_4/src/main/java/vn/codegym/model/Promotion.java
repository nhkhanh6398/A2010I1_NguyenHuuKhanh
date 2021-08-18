package vn.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import java.util.Date;

@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "Không được để trống")
    private String title;
    @Future(message = "Ngày bắt đầu không hợp lệ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Không được để trống")
    private Date dayStart;
    @Future(message = "Ngày kết thúc không hợp lệ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Không được để trống")
    private Date dayEnd;
    @NotBlank(message = "Không được để trống")
    @Min(value = 10000)
    private String vocher;
    @NotBlank(message = "Không được để trống")
    private String chiTiet;

    public Promotion() {
    }

    public Promotion(Integer id, String title, Date dayStart, Date dayEnd, @Min(value = 10000) String vocher, String chiTiet) {
        this.id = id;
        this.title = title;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.vocher = vocher;
        this.chiTiet = chiTiet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getVocher() {
        return vocher;
    }

    public void setVocher(String vocher) {
        this.vocher = vocher;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}
