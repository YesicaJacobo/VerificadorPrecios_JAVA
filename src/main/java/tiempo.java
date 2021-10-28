
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yesica
 */
public class tiempo{
    boolean terminado;
    
    public void cal () throws InterruptedException {
        int  segundos = 0;
        
        NewJFrame b = new NewJFrame();
        boolean activo = b.cronometroActivo;
        
        while(true){
            if (segundos == 8) {
                activo = false;
                terminado = true;
            }else{
                
                //Mostrar
                if (segundos < 10) {
                System.out.print("0");
            }
            System.out.println(segundos);
            
            //Aumentar
            segundos++;
            //Espera
            Thread.sleep(1000);
            terminado = false;
            }
        }
        
        
    }
    
    
}
