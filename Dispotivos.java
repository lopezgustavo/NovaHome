package NovaHom;
import javax.swing.JOptionPane;

public class Dispotivos{

    private int user;
    private float tv;

    public void Dispositivo(int user){
        this.tv = tv;
    }
    //Metodo para capturar la opcion del usuario a programar
    public void capturarProgramar(int user){
        this.user = Integer.parseInt(JOptionPane.showInputDialog(null,"~Ingrese la opcion que desee programar: \n1) Televisor\2)"));
        return user;
    }


    public float Televisor(){
        tv = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de inicio del televisor: "));
        return tv;
    }

    public int capturarUser(){
        this.user = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion que desee programar: "));
        return user;
    }
}
