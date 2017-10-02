package cabd;

public class Information {
	@ColumnAnnotation (data="Cedula", llave_primaria=true)
	public int cedula;
	
	@ColumnAnnotation(data="Nombre")
	public String nombre;
	
	@ColumnAnnotation(data="Apellido")
	public String apellido;
	
		public void imprimir(int cedula, String nombre, String apellido) {
			System.out.println("CI: " + cedula + "\n" +
								"Nombre y apellido: " + nombre + " "+ apellido);
		}
		
		public void setCedula (int cedula) {
			this.cedula = cedula;
		}
		
		public int getCedula() {
			return cedula;
		}
		public String getNombre() {
			return nombre;
		}
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		public String getApellido() {
			return apellido;
		}
	
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}	
	
	}
