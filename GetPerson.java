import java.io.FileWriter;
import java.util.Scanner;

public class GetPerson {
    
    public static void getPerson(){
        try (Scanner scanner = new Scanner(System.in, "ibm866")) {
            String person = scanner.nextLine();
            String[] data = person.split(" ");
            DataChecker.checkData(data);
            Person person2 = new Person(data);
            try (FileWriter fw = new FileWriter(data[0] + ".txt", true)) {
                fw.write(person2.toString() + "\n");
                fw.flush();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}
