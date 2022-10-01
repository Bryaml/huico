package com.example.demo1.controller;

import com.example.demo1.model.BeanEncuesta;
import com.example.demo1.model.DaoEncuesta;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletEncuesta", value = "/ServletEncuesta")
public class ServletEncuesta extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DaoEncuesta daoEncuesta = new DaoEncuesta();
        List<BeanEncuesta> listCourse = daoEncuesta.findAll();
        request.setAttribute("listaCursos", listCourse);
        request.setAttribute("saldototal", this.calcularSaldoTotal(listCourse));
        request.setAttribute("general", this.general(listCourse));
        request.getRequestDispatcher("/WEB-INF/aver/otro.jsp").forward(request, response);


    }


    private double calcularSaldoTotal(List<BeanEncuesta>listCourse  ) {
        double saldototal = 0;
        for (BeanEncuesta beanEncuesta : listCourse ) {
            saldototal = (beanEncuesta.getFuncionalidad() + beanEncuesta.getCompatibilidad() + beanEncuesta.getConfiabilidad()+ beanEncuesta.getMantenimiento()+ beanEncuesta.getPortabilidad()+ beanEncuesta.getRendimiento()+ beanEncuesta.getSeguridad()+ beanEncuesta.getUsabilidad())*100/40;
        }
        return saldototal;
    }
    private double general(List<BeanEncuesta>listCourse  ) {
        double saldototal = 0;
        for (BeanEncuesta beanEncuesta : listCourse ) {
            saldototal += (beanEncuesta.getFuncionalidad() + beanEncuesta.getCompatibilidad() + beanEncuesta.getConfiabilidad()+ beanEncuesta.getMantenimiento()+ beanEncuesta.getPortabilidad()+ beanEncuesta.getRendimiento()+ beanEncuesta.getSeguridad()+ beanEncuesta.getUsabilidad())*100/40;
        }
        return saldototal;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name") != null ? request.getParameter("name") : "";
        String escuela = request.getParameter("escuela") != null ? request.getParameter("escuela") : "";
        String funcionalidad = request.getParameter("funcionalidad") != null ? request.getParameter("funcionalidad") : "";
        String usabilidad = request.getParameter("usabilidad") != null ? request.getParameter("usabilidad") : "";
        String rendimiento = request.getParameter("redimiento") != null ? request.getParameter("redimiento") : "";
        String mantenimiento = request.getParameter("mantenimiento") != null ? request.getParameter("mantenimiento") : "";
        String portabilidad = request.getParameter("portabilidad") != null ? request.getParameter("portabilidad") : "";
        String seguridad = request.getParameter("seguridad") != null ? request.getParameter("seguridad") : "";
        String compatibilidad = request.getParameter("compatibilidad") != null ? request.getParameter("compatibilidad") : "";
        String confiabilidad = request.getParameter("confiabilidad") != null ? request.getParameter("confiabilidad") : "";
        BeanEncuesta unCurso = new BeanEncuesta();
        unCurso.setName(name);
        unCurso.setEscuela(escuela);
        unCurso.setFuncionalidad(Integer.parseInt(funcionalidad));
        unCurso.setUsabilidad(Integer.parseInt(usabilidad));
        unCurso.setRendimiento(Integer.parseInt(rendimiento));
        unCurso.setMantenimiento(Integer.parseInt(mantenimiento));
        unCurso.setConfiabilidad(Integer.parseInt(confiabilidad));
        unCurso.setPortabilidad(Integer.parseInt(portabilidad));
        unCurso.setSeguridad(Integer.parseInt(seguridad));
        unCurso.setCompatibilidad(Integer.parseInt(compatibilidad));

        DaoEncuesta daoCourse = new DaoEncuesta();
        System.out.println(escuela+name);
        boolean result = daoCourse.save(unCurso);
        if (result) {
            request.setAttribute("mensaje", "registro correcto");
        } else {
            request.setAttribute("mensaje", "registro incorrecto");
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
