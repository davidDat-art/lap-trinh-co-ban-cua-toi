/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docghifile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Đạt Huỳnh
 */
class DocFile {

    public ArrayList<String> docFile() {
        ArrayList<String> list = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("dshs.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if ((!line.trim().isEmpty())) {
                    list.add(line);
                }
            }
            System.out.println("doc File thanh cong !!!");
        } catch (IOException e) {
            System.out.println(" Loi doc file ko thanh cong !!!");
        }
        return list;
    }
}
