package exercici3;

public class Exercici1 {

    /**
     * Li arriba el un numero en forma de String i un valor minim i maxim
     * Retorna un boolean true i esta dins del rang o false si no ho esta
     *
     * @param cadena
     * @param num1
     * @param num2
     * @return
     */
    public boolean metode1(String cadena, int num1, int num2) {
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

    /**
     * Metode que li arriba un ip i comprova si la ip esta be formada. Retorna
     * un String[] on te separat per blocs la IP
     *
     * @param ip
     * @return
     * @throws IpErrorException Exception que salta quan la ip no esta ben
     * formada o buida
     */
    public String[] metode2(String ip) throws IpErrorException {
        boolean comprovat;
        if (ip == null) {
            throw new IpErrorException("Una IP no pot estar buida");
        }
        String[] partes = ip.split("\\.");
        if (partes.length != 4) {
            throw new IpErrorException("Ha de contenir 4 blocs");
        }
        return partes;
    }

    /**
     * Metode que comprova que la ip es valida Retorna un boolean true si es
     * correcta o false si no ho es.
     *
     * @param ip
     * @return
     */
    public boolean metode3(String ip) {
        boolean comprovacio = false;
        String[] campos;
        try {
            campos = metode2(ip);
            for (int i = 0; i < campos.length - 1; i++) {
                comprovacio = metode1(campos[i], 0, 255);
                if (!comprovacio) {
                    break;
                }
            }
        } catch (IpErrorException e) {
        }
        return comprovacio;
    }

}
