package com.hillel.javapro.pavlopashchevskyi.task3.main;

import com.hillel.javapro.pavlopashchevskyi.task3.subtask1.Employee;
import com.hillel.javapro.pavlopashchevskyi.task3.subtask2_1.SameName;
import com.hillel.javapro.pavlopashchevskyi.task3.subtask3.Car;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Робота класу \"Employee\"");
        Employee e = new Employee(
                "Пащевський Павло Дмитрович",
                "Java-розробник",
                "googalltooth@gmail.com",
                "+380972409577",
                33
        );
        System.out.print(e.output());

        System.out.println("Робота класу \"SameName\" з пакету \"subtask2_1\"");
        SameName sn1 = new SameName("subtask2_1");
        System.out.print(sn1.output());

        System.out.println("Робота класу \"SameName\" з пакету \"subtask2_2\"");
        com.hillel.javapro.pavlopashchevskyi.task3.subtask2_2.SameName sn2 =
                new com.hillel.javapro.pavlopashchevskyi.task3.subtask2_2.SameName("subtask2_2");
        System.out.print(sn2.output());

        System.out.println("Робота класу \"Car\"");
        Car c = new Car();
        c.start();
    }
}
