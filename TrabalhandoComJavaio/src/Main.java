import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import br.com.dio.persistence.NIO2FilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("========================");
        System.out.println(persistence.write("Luan;luan@luan.com;28/09/1989"));
        System.out.println("========================");
        System.out.println(persistence.write("Brian;brian@brian.com;10/10/2010"));
        System.out.println("========================");
        System.out.println(persistence.write("Felipe;felipe@felipe.com;05/05/2005"));
        System.out.println("========================");
        System.out.println(persistence.findAll());
        System.out.println("========================");
        System.out.println(persistence.remove("felipe@"));
        System.out.println("========================");
        System.out.println(persistence.remove("Luiz"));
        System.out.println("========================");
        System.out.println(persistence.findBy("@brian.com"));
        System.out.println("========================");
        System.out.println(persistence.findBy("felipe@felipe.com"));
        System.out.println("========================");
        System.out.println(persistence.replace("brian@", "Marcelo;marcelo@marcelo;24/04/2024"));
        System.out.println("========================");
        System.out.println(persistence.replace("Julia", "Marcelo;marcelo@marcelo;24/04/2024"));
        System.out.println("========================");
        System.out.println(persistence.findAll());
    }
}