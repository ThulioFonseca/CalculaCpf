import java.io.File;
import java.util.List;


public class ThreadWork extends Thread {


    GeraCpf cpf = new GeraCpf();
    CpfValidation validation = new CpfValidation();
    
    public void run() {   
                          
        while(cpf.sinal == false) {
            if(validation.isValid(cpf.IncrementaCpf())){
               // System.out.println("CPF Valido");
                //System.out.println(cpf.cpfString); 
                cpf.cpfsValidos++;
            }
        }
    }
}
    