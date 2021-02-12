class Television {
    private int volumen = 1;
    private Boolean onOff = false;
    private int channel = 1;

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen <= 50 && volumen >= 1) {
            this.volumen = volumen;
            System.out.println("El volumen ahora es " + getVolumen());
        } else {
            System.out.println("El volumen solo puede estar establecido entre 1 y 50");
            System.out.println("Se mantiene el volumen " + getVolumen());
        }
    }

    public Boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        if (this.onOff == false && onOff == true) {
            this.onOff = onOff;
            System.out.println("Enciendiendo la TV");
        }
        if (this.onOff == true && onOff == false) {
            this.onOff = onOff;
            System.out.println("Apagando la TV");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel <= 20 && channel >= 1) {
            this.channel = channel;
            System.out.println("Mostrando el canal: " + getChannel());
        } else {
            System.out.println("La programacion solo incluye los canales del 1 al 20");
            System.out.println("Se mantiene el canal: " + getChannel());
        }
    }

    public void turnOn() {
        if (isOnOff() == false) {
            setOnOff(true);
        } else {
            System.out.println("No puedes encender la TV si ya esta encendida");
        }
    }

    public void turnOff() {
        if (isOnOff() == true) {
            setOnOff(false);
        } else {
            System.out.println("No puedes apagar la TV si ya esta apagada");
        }
    }

    public void channelUp() {
        int c = channel;
        c++;
        setChannel(c);
    }

    public void channelDown() {
        int c = channel;
        c--;
        setChannel(c);
    }

    public void volumeUp() {
        int v = volumen;
        v++;
        setVolumen(v);
    }

    public void volumeDown() {
        int v = volumen;
        v--;
        setVolumen(v);
    }

}

public class App {
    public static void main(String[] args) {
        Television tv1 = new Television();

        tv1.turnOff();
        tv1.turnOn();
        tv1.turnOn();
        tv1.turnOff();
        tv1.volumeDown();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.channelDown();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
    }
}
