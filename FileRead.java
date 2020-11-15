/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SİMA SERENLİOĞLU
 */
public class FileRead {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader read = null;
        int total =0;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\simas\\Documents\\NetBeansProjects\\fileRead\\src\\fileread\\numbers.txt"));
            String line = null;
            while((line=read.readLine())!= null){//readLine ile satır satır okuma yapılır
                // boş olana kadar okuma yapar
               total += Integer.valueOf(line);
               //Integer sınıfına ait olan valueOf ile string tipi olan line değişkeni integer a dönüştürülür
               //eğer dosya içinde integer a çeviremeyeceği birşeyle karşılaşırsa NumberFormatException hatası üretir
            }
            System.out.println("total="+total);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        read.close();//dosya bulunamazsa kapatılacak bir dosya bulunmadığını belirtmek için ıoexception eklenir.
        // close için try-catch bloğu oluşturmak da aynı işlemi yapar
        }
    }
    
}