package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"11111111111", "John", "Smith"},
            {"22222222222", "Ivone", "Novak"},
            {"33333333333", "Walter", "White"},
            {"44444444444", "Clara", "Lanson"},
            {"55555555555", "Jessie", "Pinkman"}
    };

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
