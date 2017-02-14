package exercici3;

public class Exercici1 {

    public boolean Metode1(String cadena, int num1, int num2) {
        boolean comprovacio = false;
        int valor;
        try {
            valor = Integer.parseInt(cadena);
            if (valor >= num1 && valor <= num2) {
                comprovacio = true;
            } else {
                comprovacio = false;
            }
        } catch (NumberFormatException ex) {
            System.err.println("La cadena de text no és un numero " + ex.getMessage());
        }
        return comprovacio;
    }

    public String[] Metode2(String ip) {
        String[] partes = ip.split("\\.");
        try {

        } catch (Exception e) {
            throws new IPErrorException("Error en la IP");
        }
        return partes;
    }
    
    public boolean Metode3(String ip){
        boolean comprovacio = false;
        
    }
    
    
}
