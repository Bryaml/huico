package com.example.demo1.model;

import com.example.demo1.utils.ConnectionMySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoEncuesta {

    public boolean save (BeanEncuesta unCurso){
        try(Connection con = ConnectionMySQL.getConnection();){
            try(PreparedStatement pstm = con.prepareStatement(
                    "insert into encuesta (nombre,escuela,funcionalidad,confiabilidad,usabilidad,rendimiento,mantenimiento,portabilidad,seguridad,compatibilidad)values (?,?,?,?,?,?,?,?,?,?)");){
                pstm.setString(1,unCurso.getName());
                pstm.setString(2,unCurso.getEscuela());
                pstm.setInt(3,unCurso.getFuncionalidad());
                pstm.setInt(4,unCurso.getConfiabilidad());
                pstm.setInt(5,unCurso.getUsabilidad());
                pstm.setInt(6,unCurso.getRendimiento());
                pstm.setInt(7,unCurso.getMantenimiento());
                pstm.setInt(8,unCurso.getPortabilidad());
                pstm.setInt(9,unCurso.getSeguridad());
                pstm.setInt(10,unCurso.getCompatibilidad());
                return pstm.executeUpdate()==1;
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;

    }

    public List<BeanEncuesta> findAll() {
        List<BeanEncuesta> courseList = new ArrayList<>();
        try (
                Connection con = ConnectionMySQL.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select *  from encuesta ")
        ) {
            while (rs.next()){
                BeanEncuesta unCurso = new BeanEncuesta();
                unCurso.setId(rs.getInt("id"));
                unCurso.setName(rs.getString("nombre"));
                unCurso.setFuncionalidad(rs.getInt("funcionalidad"));
                unCurso.setConfiabilidad(rs.getInt("confiabilidad"));
                unCurso.setUsabilidad(rs.getInt("usabilidad"));
                unCurso.setRendimiento(rs.getInt("rendimiento"));
                unCurso.setMantenimiento(rs.getInt("mantenimiento"));
                unCurso.setPortabilidad(rs.getInt("portabilidad"));
                unCurso.setSeguridad(rs.getInt("seguridad"));
                unCurso.setCompatibilidad(rs.getInt("compatibilidad"));


                courseList.add(unCurso);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return courseList;
    }

}
