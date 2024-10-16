package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Encender la TV
        redRemote.turnOn();
        System.out.println("TV encendida. ON: " + redRemote.on );

        // Subir un canal
        redRemote.channelUp();
        System.out.println("Sube un canal. Previo: 0, actual: " + redRemote.channel);

        // Bajar un canal
        redRemote.channelDown();
        System.out.println("Baja un canal. Previo: 1, actual: " + redRemote.channel);

        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channelDown();
        System.out.println("Intenta bajar un canal menos que 0. Previo: 0, actual: " + redRemote.channel);

        // Subir el volumen
        redRemote.volumeUp();
        System.out.println("Subo el volumen. Previo: 20, actual: " + redRemote.volume);

        // Bajar el volumen
        redRemote.volumeDown();
        System.out.println("Bajar el volumen. Previo: 21, actual: " + redRemote.volume);

        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        for (int i = 0; i < 20; i++) {
            redRemote.volumeDown();
        }
        System.out.print("Cuando el volumen es: "+ redRemote.volume);
        redRemote.volumeDown();
        System.out.println(", volume down lo deja en: " + redRemote.volume);

        // Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println("Color del mando: " + redRemote.color);

        // Apagar la TV
        redRemote.turnOff();
        System.out.println("TV apagada. ON: " +redRemote.on);
    }

}