package equiscero;
//Autor: Roberto Carlos Castro

import javax.swing.JOptionPane;

public class Equiscero {

    public static void main(String[] args) {
        int opcion;        
        do {            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Un Jugadores\n2. Dos Jugadores" ));
        } while (opcion<1||opcion>2);
        
        if(opcion==1){
            frmEquisceroUsuarioVsMaquina usuarioVsMaquina = new frmEquisceroUsuarioVsMaquina();
            usuarioVsMaquina.setLocationRelativeTo(null);
            usuarioVsMaquina.show();
        }
        if (opcion==2) {
            frmEquiscero juego = new frmEquiscero();
            juego.setLocationRelativeTo(null);
            juego.show();            
        }
    }
    
}
