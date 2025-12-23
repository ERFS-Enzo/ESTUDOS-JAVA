package curso.tiposprimitivos;
public class TesteTIpos {
    public static void main(String[] args) {
        
       /* int idade = 30;
        String valor = Integer.toString(idade);  
        System.out.println(valor);*/
       
       String valor = "30";
       int idade = Integer.parseInt(valor);
       System.out.println(idade+" anos");
       
       String valor2 = "18";
       float cm = Float.parseFloat(valor2);
        System.out.println(cm+ "cm");
    }
}
