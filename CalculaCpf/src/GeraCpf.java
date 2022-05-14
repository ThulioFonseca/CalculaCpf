import java.text.Format;

public class GeraCpf {

    public static Long cpf = 0L;

    public static boolean sinal = false;

    public static String cpfString = "";

    public static Long cpfsValidos = 0L;

    public static final Long MAX_VALUE = 99999999999L;

    public String IncrementaCpf(){    
        
        if(cpf<MAX_VALUE){            
            cpfString = String.format("%011d", cpf);
            cpf++;                

        }else if(cpf>=MAX_VALUE){

            sinal = true;
        }
       
        return cpfString;

    }

    public void CpfPrint() {
        
        System.out.println(cpfString);
    }
    
}
