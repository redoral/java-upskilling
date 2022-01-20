package com.revature.service;

import com.revature.beans.Employee;

// service for saving files
public class FileSaverService implements Saver {

    String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FileSaverService(String filename) {
        this.filename = filename;
    }

    public FileSaverService() {
    }


    @Override
    public void save(Employee employee) {
        System.out.println("Saving employee object in the file");
        System.out.println("The file name: "+filename);
        System.out.println("Employee is: "+employee);
    }
}