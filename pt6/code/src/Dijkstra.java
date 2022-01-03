import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dijkstra {
    public static void main (String[] args){
        Graph g = new Graph();
        try{
            FileReader fin = new FileReader("/Users/german/Downloads/input.txt");
            Scanner graphFile = new Scanner(fin);

            String line;
            while (graphFile.hasNextLine())
            {
                line = graphFile.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                try
                {
                    if (st.countTokens() != 3)
                    {
                        System.out.println("Skipping bad line");
                        continue;
                    }
                    String source = st.nextToken();
                    String dest = st.nextToken();
                    int cost = Integer.parseInt(st.nextToken());
                    g.addEdge(source, dest, cost);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Skipping bad line " + line);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
        System.out.println("File read...applying dijkstra");
        g.dijkstra("E");
        g.printPath("C");
    }

}
