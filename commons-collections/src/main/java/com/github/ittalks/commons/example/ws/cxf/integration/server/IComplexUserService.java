package com.github.ittalks.commons.example.ws.cxf.integration.server;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by 刘春龙 on 2017/10/31.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IComplexUserService {

    User getUserByName(@WebParam(name = "uName") String name);
    void setUser(User user);
}