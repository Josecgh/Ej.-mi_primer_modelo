package dev.jose;

public class Persona {

  private String nombre;
  private String apellidos;
  private int dni;
  private int nacimiento;
  private int edad;
  
  public Persona(String nombre, String apellidos, int dni, int nacimiento, int edad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.nacimiento = nacimiento;
    this.edad = edad;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getApellidos(){
    return apellidos;
  }

  public void setApellidos(String apellidos){
    this.apellidos = apellidos;
  }

  public int getDni(){
    return dni;
  }

  public void setDni(int dni){
    this.dni = dni;
  }

  public int getNacimiento(){
    return nacimiento;
  }

  public void setNacimiento(int nacimiento){
    this.nacimiento = nacimiento;
  }

  public int getEdad(){
    return edad;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }
}