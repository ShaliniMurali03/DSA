package ExceptionHandling;
import java.io.*;
import java.util.Scanner;

//SingleResource
/*class TryWithResource
{
    public static void main(String[] args) throws IOException
    {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shali\\IdeaProjects\\Java Programs\\src\\ExceptionHandling\\testRead.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }

    }
}*/

//MultipleResources
class TryWithResource {
    public static void main(String[] args) throws IOException{
        try (Scanner scanner = new Scanner(new File("C:\\Users\\shali\\IdeaProjects\\Java Programs\\src\\ExceptionHandling\\test.txt"));
             PrintWriter writer = new PrintWriter(new File("C:\\Users\\shali\\IdeaProjects\\Java Programs\\src\\ExceptionHandling\\testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}
