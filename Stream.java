import java.util.ArrayList;
import java.util.List;

class Stream
{
    public static void main(String args[])
    {
        // Lista de cores
        List<String> cores = new ArrayList<>();

        // add cores direferentes e iguais para o teste
        cores.add("blue");
        cores.add("blue");
        cores.add("magent");
        cores.add("cian");
        cores.add("gray");
        cores.add("black");
        cores.add("blue");
        cores.add("red");

        // filter: retona uma nova stream com base no filtro aplicado
        cores.stream().filter(e -> e.equals("blue")).forEach(System.out::println);
    }
}