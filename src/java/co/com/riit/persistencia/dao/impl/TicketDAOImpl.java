/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.riit.persistencia.dao.impl;

import co.com.riit.conexion.ConexionSQL;
import co.com.riit.modelo.dto.Estado_TO;
import co.com.riit.modelo.dto.Oportunidad_TO;
import co.com.riit.modelo.dto.Ticket_TO;
import co.com.riit.persistencia.dao.TicketDAO;
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
public class TicketDAOImpl implements TicketDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Ticket_TO registrarTicket(Ticket_TO ticket) throws Exception {
        Ticket_TO nuevoticket = new Ticket_TO();
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            try {
                String sql = "INSERT INTO ticket (idOportunidad, consulta, fechaInicio, horaInicio, solucion, fechaCierre, horaCierre, idEstado, cotizacion) "
                        + "VALUES ('" + ticket.getOportunidad().getIdOportunidad() + "', "
                        + "'" + ticket.getConsulta() + "', "
                        + "'" + formatoDeFecha.format(ticket.getFechaInicio()) + "', "
                        + "'" + ticket.getHoraInicio() + "', "
                        + "'" + ticket.getSolucion() + "', "
                        + "'" + formatoDeFecha.format(ticket.getFechaCierre()) + "', "
                        + "'" + ticket.getHoraCierre() + "', "
                        + "'" + ticket.getEstado().getIdEstado() + "', "
                        + "'" + ticket.getCotizacion() + "')";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoticket = new Ticket_TO();
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
    public Ticket_TO editarTicket(Ticket_TO ticket) throws Exception {
        Ticket_TO nuevoticket = new Ticket_TO();        
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            try {
                String sql = "UPDATE ticket SET idOportunidad= '" + ticket.getOportunidad().getIdOportunidad() + "', "
                        + "consulta = '" + ticket.getConsulta() + "', "
                        + "fechaInicio = '" + formatoDeFecha.format(ticket.getFechaInicio()) + "', "
                        + "horaInicio = '" + ticket.getHoraInicio() + "', "
                        + "solucion = '" + ticket.getSolucion() + "', "
                        + "fechaCierre = '" + formatoDeFecha.format(ticket.getFechaCierre()) + "', "
                        + "horaCierre = '" + ticket.getHoraCierre() + "', "
                        + "idEstado = '" + ticket.getEstado().getIdEstado() + "', "
                        + "cotizacion = '" + ticket.getCotizacion() + "'"
                        + "WHERE idTicket = '" + ticket.getIdTicket() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoticket = new Ticket_TO();
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
    public Ticket_TO eliminarTicket(Ticket_TO ticket) throws Exception {
        Ticket_TO nuevoticket = new Ticket_TO();
        try {
            try {
                String sql = "DELETE FROM ticket "
                        + "WHERE idTicket = '" + ticket.getIdTicket() + "'";
                st.execute(sql);
            } catch (SQLException e) {
                nuevoticket = new Ticket_TO();
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
    public List<Ticket_TO> consultarTickets() throws Exception {
        List<Ticket_TO> tickets = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idTicket, idOportunidad, consulta, fechaInicio, horaInicio, solucion, fechaCierre, horaCierre, idEstado, cotizacion "
                        + "FROM ticket";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tickets.add(new Ticket_TO(rs.getInt(1),
                            new Oportunidad_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getDate(4),
                            rs.getTime(5),
                            rs.getString(6),
                            rs.getDate(7),
                            rs.getTime(8),
                            new Estado_TO(rs.getInt(9)),
                            rs.getString(10)));
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
    public Ticket_TO consultarTicket(Ticket_TO ticket) throws Exception {
        Ticket_TO nuevoticket = new Ticket_TO();
        try {
            try {
                String sql = "SELECT idTicket, idOportunidad, consulta, fechaInicio, horaInicio, solucion, fechaCierre, horaCierre, idEstado, cotizacion "
                        + "FROM ticket "
                        + "WHERE idTicket = '" + ticket.getIdTicket() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nuevoticket = new Ticket_TO(rs.getInt(1),
                            new Oportunidad_TO(rs.getInt(2)),
                            rs.getString(3),
                            rs.getDate(4),
                            rs.getTime(5),
                            rs.getString(6),
                            rs.getDate(7),
                            rs.getTime(8),
                            new Estado_TO(rs.getInt(9)),
                            rs.getString(10));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoticket;
    }

}
