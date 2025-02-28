package com.todddemone.studentmanager;

import java.util.UUID;
import java.time.LocalDate;

public class Student {
    private final String studentId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private Major major;
    private LocalDate enrollmentDate;

    public Student(String firstName,
                   String lastName,
                   LocalDate dob,
                   String address,
                   String phoneNumber,
                   String emailAddress,
                   Major major,
                   LocalDate enrollmentDate) {
        this.studentId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.major = major;
        this.enrollmentDate = enrollmentDate;
    }

    public String getStudentId() {
        return studentId;
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

    public LocalDate getDateOfBirth() {
        return dob;
    }

    public void setDateOfBirth(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
//        if (!phoneNumber.matches("\\+?[0-9\\-() ]+")) {
//            throw new IllegalArgumentException("Invalid phone number format.");
//        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
//        if (!emailAddress.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
//            throw new IllegalArgumentException("Invalid email address format.");
//        }
        this.emailAddress = emailAddress;
    }

    public Major getMajor() {
        return this.major;
    }

    public void setMajor(String majorName) {
        this.major = Major.fromString(majorName);
    }

    public LocalDate enrollmentDate() {
        return this.enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

}
