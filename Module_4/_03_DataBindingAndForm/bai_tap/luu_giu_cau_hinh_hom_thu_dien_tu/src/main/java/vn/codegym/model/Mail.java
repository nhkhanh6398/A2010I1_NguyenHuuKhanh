package vn.codegym.model;

public class Mail {
    private String language;
    private int size;
    private String[] check;
    private String textAra;

    public Mail() {
    }

    public Mail(String language, int size, String[] check, String textAra) {
        this.language = language;
        this.size = size;
        this.check = check;
        this.textAra = textAra;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getCheck() {
        return check;
    }

    public void setCheck(String[] check) {
        this.check = check;
    }

    public String getTextAra() {
        return textAra;
    }

    public void setTextAra(String textAra) {
        this.textAra = textAra;
    }
}
