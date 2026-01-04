/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package docghifile;

import java.util.ArrayList;

/**
 *
 * @author Đạt Huỳnh
 */
public class DocGhiFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocFile df = new DocFile();
        ArrayList<String> ds = df.docFile();

        for (String s : ds) {
            System.out.println(s);
        }

        ArrayList<String> data = new ArrayList<>();
        data.add("001;Nguyen Van A;20;CNTT");
        data.add("002;Tran Thi B;21;KTPM");

        // ghi file
        ghiFile gf = new ghiFile();
        gf.ghiFile(data);

    }
}
