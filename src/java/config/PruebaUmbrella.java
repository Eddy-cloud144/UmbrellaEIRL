
package config;

public class PruebaUmbrella {

    public static void main(String[] args) {
        UmbrellaDB umbrella=new UmbrellaDB();
        if(umbrella.getConexion()!=null){
            System.out.println("Conexion: Correcta");
        }else{
            System.out.println("Conexion: Incorrecta");
        }
    }
    
}
