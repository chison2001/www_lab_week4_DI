package org.example.auto_wiring;

public class Department {
    private String d_name;
    private Falcuty falcuty;

    public Department() {
    }

    public Department(String d_name, Falcuty falcuty) {
        this.d_name = d_name;
        this.falcuty = falcuty;
    }

    public Department(Falcuty falcuty) {
        this.falcuty = falcuty;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Falcuty getFalcuty() {
        return falcuty;
    }

    public void setFalcuty(Falcuty falcuty) {
        this.falcuty = falcuty;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_name='" + d_name + '\'' +
                ", falcuty=" + falcuty +
                '}';
    }
}
