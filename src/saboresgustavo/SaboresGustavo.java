
package saboresgustavo;


public class SaboresGustavo {

    
    public static void main(String[] args) {
        String[] sabores = {"Dulce", "Salado", "Amargo", "Acido", "Umami", "Picante", "Astringente", "Starchy", "Adiposo"};
        System.out.println("Existen 10 tipos de sabores:");
        for(int i =0; i<8;i++){
            System.out.println("Sabor: "+ sabores[i]);
        }
    }
    
}
