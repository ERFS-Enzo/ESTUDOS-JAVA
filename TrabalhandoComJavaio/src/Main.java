import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("========================");
        System.out.println(persistence.write("Lucas;lucas@lucas.com;09/11/2008"));
        System.out.println("========================");
        System.out.println(persistence.write("Maria;maria@maria.com;11/01/2007"));
        System.out.println("========================");
        System.out.println(persistence.write("Leo;leo@leo.com;23/07/2006"));
        System.out.println("========================");
        System.out.println(persistence.findAll());
        System.out.println("========================");
        System.out.println(persistence.remove("/01/20"));
        System.out.println("========================");
        System.out.println(persistence.remove("/06/202"));
        System.out.println("========================");
        System.out.println(persistence.findBy("Lucas;"));
        System.out.println("========================");
        System.out.println(persistence.findBy(";maria@"));
        System.out.println("========================");
        System.out.println(persistence.findBy("06"));
        System.out.println("========================");
        System.out.println(persistence.replace(".com;09/11/", "Carlos;carlos@carlos.com;22/12/2008"));
        System.out.println("========================");
        System.out.println(persistence.findAll());
        System.out.println("========================");

    }
}