import java.io.*;
/**
 * Write a description of class Test here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("c:\\windows\\system.ini");
            FileWriter os = new FileWriter("c:\\output.txt");
            int c;
            // int c = fr.read();
            // System.out.println((char)c);
            while((c = fr.read())!= -1){
                //System.out.print((char)c);
                os.write(c);
            }
            fr.close();
            os.close();
        }catch(IOException e){
            System.out.println("파일을 발견할 수 없습니다.");
        }
    }
}
