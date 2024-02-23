package az.edu.turing.miniproject;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String [][] schedule;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public int getIq() {
        return iq;
    }

    public int getYear() {
        return year;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father,
                 String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        String trick;
        if (pet.trickLevel > 50){
            trick = "Very sly";
        }
        else {
            trick = "Almost not sly";
        }
        System.out.printf("I have an %s is %d years old. He is %s.\n", pet.species, pet.age, trick);
    }
//    public boolean feedPet(boolean isTimeFeeding){
//        if (isTimeFeeding){
//            System.out.println("The owner feeds the pet");
//        }
//        else {
//            if (pet.trickLevel < new Random()){
//
//            }
//
//        }
//    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}