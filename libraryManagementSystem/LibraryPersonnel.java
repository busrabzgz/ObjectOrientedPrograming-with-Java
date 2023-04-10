package org.example.studies.oopApplications.libraryManagementSystem;

public class LibraryPersonnel {
    private  String name;
    private String position;

    public LibraryPersonnel(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printLibraryPersonnelInfo(){
        System.out.println("Personnel name:" +name + '\n'+ "Position:" +position);
    }
}
