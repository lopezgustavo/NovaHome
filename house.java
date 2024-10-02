package NovaHom;
import javax.swing.JOptionPane;

import Practica_05.Dispositivo;

public class house {
    public static void main(String[] args) {
        int opcion, user = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido al gestor de una casa inteligente!");
        Dispositivo dispositivo = new Dispositivo(user);
        do { 
            opcion = dispositivo.capturarProgramar(user);
            switch (opcion) {
                case 1:
                    dispositivo.Televisor();
                break;

                case 2:

                break;

                case 4:
                    user = user.capturarUser();
                break;
                default:
                    throw new AssertionError();
            }
        } while (opcion !=4 );
    }
}
