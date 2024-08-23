package construtor;

public class principal {
    public static void main(String[] args) {
        Carros carro1 = new Carros("UP TSI","VOLSKWAGEM","HATCH",2019,38.000);
        Carros carro2 = new Carros("CRUZE","CREVROLET","SEDAN",2020,55.000);

        carro1.exibirCarro();
        carro2.exibirCarro();
    }
}
