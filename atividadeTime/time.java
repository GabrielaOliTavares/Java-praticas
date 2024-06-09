public class Time {

    private int hora;
    private int minuto;
    private int segundo;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hora) {
        this(hora, 0, 0);
    }

    public Time(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Time(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo inválido: " + segundo);
        }
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public static void main(String[] args) {
        Time time1 = new Time(); // Cria um objeto Time com o tempo padrão (0:0:0)
        System.out.println(time1); // Imprime o tempo: 00:00:00

        Time time2 = new Time(10); // Cria um objeto Time com a hora 10:00:00
        System.out.println(time2); // Imprime o tempo: 10:00:00

        Time time3 = new Time(10, 30); // Cria um objeto Time com o tempo 10:30:00
        System.out.println(time3); // Imprime o tempo: 10:30:00

        Time time4 = new Time(10, 30, 59); // Cria um objeto Time com o tempo 10:30:59
        System.out.println(time4); // Imprime o tempo: 10:30:59
    }
}
