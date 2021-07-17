package tarea6;
public class Tarea6{
      
 public static void main (String [ ] Args) {

      Doctor doctor= new Doctor("Maria","Hernandez", 31, "Doctor", "Univ. Catolica", "segundo");
      Deportista deportista=new Deportista("Dennis", "Gamez ", 18, "Deportista" , "Olimpia");
      
     
       System.out.println("Persona 1");
       System.out.println("Nombre :"+doctor.getNombre()+"\n"+"Apellido :"+doctor.getApellido()+"\n"+"Edad  :"+ 
               doctor.getEdad()+"\n"+"Dedicacion :"+doctor.getDedicacion()+"\n"+"Escuela:"+doctor.getEscuela()+"\n"+"Nivel:"+doctor.getNivel());
 
       System.out.println(" "); 
       System.out.println("Persona 2");
        
       System.out.println("Nombre :"+deportista.getNombre()+"\n"+"Apellido :"+deportista.getApellido()+"\n"+"Edad :"+
               deportista.getEdad()+"\n"+"Dedicacion :"+deportista.getDedicacion()+"\n"+"Equipo :"+deportista.getEquipo());
        
}
    
}
