package com.khadri.spring.core.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student std = context.getBean("std", Student.class);


        System.out.println(std.getId());
        System.out.println(std.getName());

        processAddress(std);

        processSubject(std);

        processFaculty(std);

        String grade = std.getGrade().getProperty("grade");

        System.out.println(grade);

    }

    private static void processFaculty(Student std) {
        Predicate<Subject> predicate = (subject) ->{
          if(subject.getName().equals("spring framework")) {
              return  true;
          }
          return false;
        };

        std.getSubjectFacultyMap().keySet().stream().filter(predicate).findFirst().ifPresent((sub)->{
            System.out.println(sub);
            Faculty faculty = std.getSubjectFacultyMap().get(sub);
            System.out.println(faculty);
        });
    }

    private static void processSubject(Student std) {
        Predicate<Subject> predicate = (subject) -> {

            if (subject.getName().equals("spring framework")) {
                return true;
            }
            return false;
        };


        Optional<Subject> optionalSubject = std.getSubjectSet().stream().filter(predicate).findAny();

        optionalSubject.ifPresent((subject) -> {
            System.out.println(subject);
        });
    }

    private static void processAddress(Student std) {
//        List<Address> addressList = std.getAddressList();
//
//        Predicate<Address> predicate = (address) -> {
//
//            if (address.getType() == 0) {
//                return true;
//            }
//            return false;
//        };
//
//        Optional<Address> addressOptional = addressList.stream().filter(predicate).findFirst();
//
//        addressOptional.ifPresent((address) -> {
//            System.out.println(address);
//        });


        std.getAddressList().stream().filter((address) -> {
            if (address.getType() == 0) {
                return true;
            }
            return false;
        }).findFirst().ifPresent((address) -> {
            System.out.println(address);
        });


    }
}