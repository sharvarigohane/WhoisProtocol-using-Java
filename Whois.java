import java.net.*;
import java.io.*;
public class Whois {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        int c;

        // Create a socket connected to internic.net, port 43.
        Socket s = new Socket ("whois.internic.net", 43);

        // obtain input and output streams.
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // Construct a request string.
        String str = (args.length == 0 ? "rknec.edu" : args[0])+"\n";
        // Convert to bytes..
        byte buf[]= str.getBytes();

        // send request.
        out.write(buf);

        // Read and display respond
        while (( c = in.read ()) != -1)
        {
        System.out.print((char) c);
        }
        s.close();
    }
}