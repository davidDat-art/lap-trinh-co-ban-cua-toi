/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docghifile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Đạt Huỳnh
 */
public class ghiFile {
    

    public void ghiFile(ArrayList<String> list) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("dshs.txt"));

            for (String line : list) {
                bw.write(line);
                bw.newLine(); // xuống dòng
            }

            bw.close();
            System.out.println("Ghi file thành công !!!");

        } catch (IOException e) {
            System.out.println("Lỗi ghi file ko thành công !!!");
        }
    }
}

