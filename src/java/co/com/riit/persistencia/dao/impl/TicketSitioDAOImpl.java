/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.Estado_TO;
import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.modelo.dto.TicketSitio_TO;
import co.com.riit.persistencia.dao.TicketSitioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo_Planit
 */
public class TicketSitioDAOImpl implements TicketSitioDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public TicketSitio_TO registrarTicketSitio(TicketSitio_TO ticket) throws Exception {
        TicketSitio_TO nuevoticket = new TicketSitio_TO();
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            try {
                String sql = "INSERT INTO ticketsitio"
                        + "(idOportunidad, consulta, diagnostico, solucion, fechaInicio, horaInicio, fechaCierre, horaCierre, idEstado, foto1, foto2, foto3, foto4, foto5) "
                        + "VALUES ('" + ticket.getOportunidad().getIdOportunidad() + "', "
                        + "'" + ticket.getConsulta() + "', "
                        + "'" + ticket.getDiagnostico() + "', "
                        + "'" + ticket.getSolucion() + "', "
                        + "'" + formatoDeFecha.format(ticket.getFechaInicio()) + "', "
                        + "'" + ticket.getHoraInicio() + "', "
                        + "'" + formatoDeFecha.format(ticket.getFechaCierre()) + "', "
                        + "'" + ticket.getHoraCierre() + "', "
                        + "'" + ticket.getEstado().getIdEstado() + "', "
                        + "'" + ticket.getFoto1() + "', "
                        + "'" + ticket.getFoto2() + "', "
                        + "'" + ticket.getFoto3() + "', "
                        + "'" + ticket.getFoto4() + "', "
                        + "'" + ticket.getFoto5() + "')";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoticket = new TicketSitio_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoticket;
    }

    @Override
    public TicketSitio_TO editarTicketSitio(TicketSitio_TO ticket) throws Exception {
        TicketSitio_TO nuevoticket = new TicketSitio_TO();
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            try {
                String sql = "UPDATE ticketsitio SET idOportunidad= '" + ticket.getOportunidad().getIdOportunidad() + "', "
                        + "consulta = '" + ticket.getConsulta() + "', "
                        + "diagnostico = '" + ticket.getDiagnostico() + "', "
                        + "solucion = '" + ticket.getSolucion() + "', "
                        + "fechaInicio = '" + formatoDeFecha.format(ticket.getFechaInicio()) + "', "
                        + "horaInicio = '" + ticket.getHoraInicio() + "', "
                        + "fechaCierre = '" + formatoDeFecha.format(ticket.getFechaCierre()) + "', "
                        + "horaCierre = '" + ticket.getHoraCierre() + "', "
                        + "idEstado = '" + ticket.getEstado().getIdEstado() + "', "
                        + "foto1 = '" + ticket.getFoto1() + "', "
                        + "foto1 = '" + ticket.getFoto2() + "', "
                        + "foto1 = '" + ticket.getFoto3() + "', "
                        + "foto1 = '" + ticket.getFoto4() + "', "
                        + "foto1 = '" + ticket.getFoto5() + "' "
                        + "WHERE idTicket = '" + ticket.getIdTicket() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoticket = new TicketSitio_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoticket;
    }

    @Override
    public TicketSitio_TO eliminarTicketSitio(TicketSitio_TO ticket) throws Exception {
        TicketSitio_TO nuevoticket = new TicketSitio_TO();
        try {
            try {
                String sql = "DELETE FROM ticketsitio WHERE idTicket ='" + ticket.getIdTicket() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoticket = new TicketSitio_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoticket;
    }

    @Override
    public List<TicketSitio_TO> consultarTicketsSitio() throws Exception {
        List<TicketSitio_TO> tickets = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idTicket, idOportunidad, consulta, diagnostico, solucion, "
                        + "fechaInicio, horaInicio, fechaCierre, horaCierre, idEstado, cotizacion, foto1, foto2, foto3, foto4, foto5 "
                        + "FROM ticketsitio";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tickets.add(new TicketSitio_TO(rs.getInt(1),
                            new Oportunidad_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getDate(6),
                            rs.getTime(7),
                            rs.getDate(8),
                            rs.getTime(9),
                            new Estado_TO(rs.getInt(10)),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14),
                            rs.getString(15)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return tickets;
    }

    @Override
    public TicketSitio_TO consultarTicketSitio(TicketSitio_TO ticket) throws Exception {
        TicketSitio_TO nuevoTicket = new TicketSitio_TO();
        try {
            try {
                String sql = "SELECT idTicket, idOportunidad, consulta, diagnostico, solucion, "
                        + "fechaInicio, horaInicio, fechaCierre, horaCierre, idEstado, cotizacion, foto1, foto2, foto3, foto4, foto5 "
                        + "FROM ticketsitio "
                        + "WHERE idTicket = '" + ticket.getIdTicket() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nuevoTicket = new TicketSitio_TO(rs.getInt(1),
                            new Oportunidad_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getDate(6),
                            rs.getTime(7),
                            rs.getDate(8),
                            rs.getTime(9),
                            new Estado_TO(rs.getInt(10)),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14),
                            rs.getString(15));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoTicket;

    }

}
