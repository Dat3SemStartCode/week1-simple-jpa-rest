/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.jpa_rest_demo1.rest.service;

import dk.webtrade.jpa_rest_demo1.entities.Car;
import dk.webtrade.jpa_rest_demo1.facades.CarFacace;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author thomas
 */
@Stateless
@Path("car")
public class CarRessource {

    
    CarFacace cf = new CarFacace();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"succes\"}";
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Car entity) {
        cf.addCar(entity);
    }

//    @PUT
//    @Path("{id}")
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public void edit(@PathParam("id") Long id, Car entity) {
//        super.edit(entity);
//    }
//    @DELETE
//    @Path("{id}")
//    public void remove(@PathParam("id") Long id) {
//        super.remove(super.find(id));
//    }
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Car find(@PathParam("id") Long id) {
        return cf.getCar(id);
    }

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Car> findAll() {
        return cf.getCars();
    }

}
