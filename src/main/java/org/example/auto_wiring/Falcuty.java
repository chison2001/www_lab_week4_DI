package org.example.auto_wiring;

public class Falcuty {
    private String f_name;

    public Falcuty(String f_name) {
        this.f_name = f_name;
    }

    public Falcuty() {
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    @Override
    public String toString() {
        return "Falcuty{" +
                "f_name='" + f_name + '\'' +
                '}';
    }
}
