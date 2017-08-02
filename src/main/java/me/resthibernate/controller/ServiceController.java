package me.resthibernate.controller;

import me.resthibernate.model.Service;
import me.resthibernate.model.User;
import me.resthibernate.repository.ServiceRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tuanhpham.
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    ServiceRepsitory serviceDao;

    @RequestMapping("/list")
    public Iterable<Service> getAllServices(){
        Iterable<Service> serviceIterable = serviceDao.findAll();
        return serviceIterable;
    }
    /*
        get service by id
        get UserList like status
     */
    @RequestMapping("/{serviceid}")
    public Service getServiceStatusById(@PathVariable String serviceid){
        //TODO:
        return null;
    }
}
