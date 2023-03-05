package cuentas;
/**
 * Registra los movimientos y guarda los datos 
 * de los clientes de una entidad bancaria
 * @author Leopoldo Martínez
 *
 */
public class CCuenta {
	 private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInterés;
	    
	    public CCuenta()
	    {
	    }
	    /**
	     * constructor con parametros que proporciona el estado inicial 
	     * de los objetos tipo cuenta
	     * @param nom
	     * @param cue
	     * @param sal
	     * @param tipo
	     */

	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        setCuenta(cue);
	        setSaldo(sal);
	    }

	    public double estado()
	    {
	        return getSaldo();
	    }
	    /**
	     * metodo que incrementa la cantidad ingresada por parametro
	     * al saldo existente en la cuenta
	     * mientras que esta no sea negativa
	     * @param cantidad
	     * @throws Exception
	     */

	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        setSaldo(getSaldo() + cantidad);
	    }
	    /**
	     * Metodo que decrementa la cantidad ingresada por parametro
	     * siempre que no sea negativa o superior a la variable saldo 
	     * @param cantidad
	     * @throws Exception
	     */

	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        setSaldo(getSaldo() - cantidad);
	    }
	    //Metodos get y set para acceder a las variables de clase
	    /**
	     * 
	     * @return
	     */

		private String getNombre() {
			return nombre;
		}
		/**
		 * 
		 * @param nombre
		 */

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * 
		 * @return
		 */

		private String getCuenta() {
			return cuenta;
		}
		/**
		 * 
		 * @param cuenta
		 */

		private void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		/**
		 * 
		 * @return
		 */

		private double getTipoInterés() {
			return tipoInterés;
		}
		/**
		 * 
		 * @param tipoInterés
		 */

		private void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
		/**
		 * 
		 * @return
		 */

		private double getSaldo() {
			return saldo;
		}
		/**
		 * 
		 * @param saldo
		 */

		private void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		/**
		 * 
		 */
}
