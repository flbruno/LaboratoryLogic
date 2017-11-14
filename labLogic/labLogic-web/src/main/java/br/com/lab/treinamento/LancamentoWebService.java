package br.com.lab.treinamento;

import br.com.lab.treinamento.local.LancamentoLocal;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author furlan
 */
@Stateless
@Path("/LancamentoService")
public class LancamentoWebService {

    @EJB
    private LancamentoLocal lancamentoService;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/teste")
    @Asynchronous
    public void detalhe(@Suspended
            final AsyncResponse asyncResponse) {
        asyncResponse.resume(doDetalhe());
    }

    private Response doDetalhe() {
        try {

            return Response.ok(lancamentoService.teste()).build();

        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

}
