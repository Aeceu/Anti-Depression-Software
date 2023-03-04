package com.raven.scores;
 
import com.raven.main.Main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



public final class Points {
    public static String name = null;
    public static String  age = null;
    public static String gender = null;
    public static int total;

    public Points(String name1, String  age1, String gender1) {
        name = name1;
        age = age1;
        gender = gender1;
        
        writeToCSV("Data.csv");
    }
    
    
    
    public void deleteContents(){
        File file = new File("Data.csv");
        if(file.exists()) {
            try {
                FileWriter fw = new FileWriter(file);
                fw.write("");
                fw.close();
            } catch (IOException e) {
            }
        }
    }
    public void writeToCSV(String fileName) {
        deleteContents();
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter pw = new PrintWriter(fw)) {
            String data = name + "," + age + "," + gender;
            pw.println(data);
        } catch (IOException e) {
        }
    } 
//    public void getinfo(int index){
//        String filePath = "Data.csv";
//        String line = "";
//        int lineNumber = index;
//        int currentLineNumber = 0;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            while ((line = br.readLine()) != null) {
//                currentLineNumber++;
//                if (currentLineNumber == lineNumber) {
//                    String[] data = line.split(",");
//                    name = data[0];
//                    age = data[1];
//                    gender = data[2];
//                    System.out.println("Name: " + name);
//                    System.out.println("Age: " + age);
//                    System.out.println("Gender: " + gender);
//                    break;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    
    public void getData(){
        System.out.print("Data: ");
        for(int i = 0; i < Main.total_score.length; i++)
        {
            if(i >= 0 && i < 10)
            {
                System.out.print(Main.total_score[i] + " ");
                total += Main.total_score[i];
            }
            else if (i > 9)
            {
                System.out.print(Main.total_score[i] + "-");
                total += Main.total_score[i];
            }
        }
        System.out.print(total);
        
    }
        
}

    





    

    
    
    
