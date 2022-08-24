package com.hillel.javapro.pavlopashchevskyi.task3.subtask1;

public class Employee {
    private String surnameNamePatronymic;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String snp, String position, String email, String phone, int age) {
        surnameNamePatronymic = snp;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String output() {
        StringBuilder sb = new StringBuilder();
        sb.append("Відомості про співробітника\n");
        sb.append("ПІБ: ");
        sb.append(surnameNamePatronymic);
        sb.append("\n");
        sb.append("Посада: ");
        sb.append(position);
        sb.append("\n");
        sb.append("E-mail: ");
        sb.append(email);
        sb.append("\n");
        sb.append("Тел.: ");
        sb.append(phone);
        sb.append("\n");
        sb.append("Вік: ");
        sb.append(age);
        sb.append("\n");

        return sb.toString();
    }
}
