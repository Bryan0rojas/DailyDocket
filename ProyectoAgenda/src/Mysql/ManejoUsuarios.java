package Mysql;

import Agenda.agregarTarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManejoUsuarios {

    public static ConectarBase conexion = new ConectarBase();

    public static PreparedStatement sentenciaPreparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNumero = 0;

    public int guardar(String nombre, String correo, String contrasena) {
        int resultado = 0;
        Connection conexion = null;

        String sentenciaGuardar = ("INSERT INTO DatosUsuarios (nombre, correo, contrasena) VALUES (?, ?, ?)");

        try {
            conexion = ConectarBase.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, correo);
            sentenciaPreparada.setString(3, contrasena);

            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
    
    public int guardarActividad(String nombreAct, String descripcionAct, Date fecha, String contrasena) {
       int resultado = 0;
        Connection conexion = null;

        String sentenciaGuardar ="INSERT INTO actividad (nombreAct, descripcionAct, fecha, contrasena) VALUES (?,?,?,?)";
        try {
            conexion = ConectarBase.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            sentenciaPreparada.setString(1, nombreAct);
            sentenciaPreparada.setString(2, descripcionAct);
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String fechaFormateada = sdf.format(fecha.getTime());
            sentenciaPreparada.setString(3, fechaFormateada);
            sentenciaPreparada.setString(4, contrasena);

            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public static String buscar(String correo) {
        String busquedaNombre = null;
        Connection conexion = null;
        try {
            conexion = ConectarBase.conectar();
            String sentenciaBuscar = ("SELECT nombre FROM DatosUsuarios WHERE correo = '" + correo + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                busquedaNombre = nombre;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busquedaNombre;
    }

    public static String buscarUsuario(String correo, String contrasena) {
        String BusquedaUsuario = null;
        Connection conexion = null;
        try {
            conexion = ConectarBase.conectar();
            String sentenciaBuscarUsuario = ("SELECT nombre,correo,contrasena FROM DatosUsuarios WHERE correo = '" + correo + "' && contrasena = '" + contrasena + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscarUsuario);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                BusquedaUsuario = ("Usuario Encontrado");
            } else {
                BusquedaUsuario = ("Usuario NO Encontrado");
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return BusquedaUsuario;

    }
    
    public static String buscarActividad(String nombreAct, String descripcionAct, String Fecha, String contrasena){
        String BusquedaActividad = null;
        Connection conexion = null;
        try {
            conexion = ConectarBase.conectar();
            String sentenciaBuscarActividad = ("SELECT nombreAct,descripcionAct,fecha, contrasena FROM actividad WHERE nombreAct = '" + nombreAct + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscarActividad);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                String nombreTa = resultado.getString("nombreAct");
                String FechaTa = resultado.getString("fecha");
                BusquedaActividad = nombreTa + FechaTa;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return BusquedaActividad;
    }
}

