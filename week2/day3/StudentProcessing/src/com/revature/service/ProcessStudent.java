package com.revature.service;

import com.revature.beans.ProcessedStudent;
import com.revature.beans.Student;
import com.revature.exception.StudentParseException;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProcessStudent {
    static Logger logger = Logger.getLogger(ProcessStudent.class);
    public void process(){
        logger.debug("ProcessStudent - process() has started");
        try{
            logger.debug("Trying to open input.dat file");
            FileInputStream fileInputStream = new FileInputStream("input.dat");
            logger.debug("Trying to open output.dat file");
            FileOutputStream fileOutputStream = new FileOutputStream("output.dat");
            FileOutputStream errorOutputStream = new FileOutputStream("errors.dat");
            int nobytes = fileInputStream.available();
            byte[] data = new byte[nobytes];
            fileInputStream.read(data);
            String csv = new String(data);
            String[] studentCSV = csv.split("\n");
            logger.info("Looping through all records existing in the input file");
            for(int c = 0 ; c < studentCSV.length ; c++){
                try{
                    Student student = Student.parseStudent(studentCSV[c]);
                    logger.debug(c+" position student id is "+student.getId());
                    int total = student.getSub1() + student.getSub2() + student.getSub3() ;
                    double average = (double)total / 3;
                    ProcessedStudent processedStudent = new ProcessedStudent();
                    processedStudent.setId(student.getId());
                    processedStudent.setName(student.getName());
                    processedStudent.setSub1(student.getSub1());
                    processedStudent.setSub2(student.getSub2());
                    processedStudent.setSub3(student.getSub3());
                    processedStudent.setTotal(total);
                    processedStudent.setAverage(average);
                    String proStudent = processedStudent.toCSV()+"\n" ;
                    fileOutputStream.write(proStudent.getBytes());
                    logger.debug("Saved "+processedStudent.getId()+" into output file");
                }
                catch(StudentParseException studentParseException){
                    logger.error("Problem occurred while processing the data at the line : "+c +" - "+studentParseException.getMessage());
                    errorOutputStream.write((studentCSV[c]+"\n").getBytes());
                }

            }
            logger.info("Student processing has completed");
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch(FileNotFoundException e){
            logger.error(e.getMessage());
        }
        catch(IOException e){
            logger.error(e.getMessage());
        }
    }
}
