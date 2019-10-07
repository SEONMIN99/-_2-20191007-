import java.io.*;
/**
 * Write a description of class Test2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test2
{
    public static void main(String[] args){
        try{
            InputStreamReader isr = new InputStreamReader(new FileInputStream("c:\\Users\\rlgh5\\OneDrive\\바탕 화면\\input.txt"),"MS949");
            int c;
            OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("c:\\Users\\rlgh5\\OneDrive\\바탕 화면\\output.txt"),"MS949");
            while((c = isr.read())!= -1){
                System.out.print((char)c);
            }
        }catch(IOException e){
            System.out.println("오류 발생!");
        }

}
}
