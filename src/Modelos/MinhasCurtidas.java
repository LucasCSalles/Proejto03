package Modelos;

import javax.swing.*;

public class MinhasCurtidas {
    public void incluido(Audio audio){
        if(audio.getClassificacao()>=9){
            JOptionPane.showMessageDialog(null,audio.getTitulo() +" Curtida por todos!");
        } else {
            JOptionPane.showMessageDialog(null,audio.getTitulo() +" Escute já!");

        }
    }

}
