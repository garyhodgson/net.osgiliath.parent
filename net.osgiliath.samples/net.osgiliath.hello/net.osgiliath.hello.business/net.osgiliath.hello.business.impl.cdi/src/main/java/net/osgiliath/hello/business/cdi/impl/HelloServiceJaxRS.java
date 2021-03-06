package net.osgiliath.hello.business.cdi.impl;

/*
 * #%L
 * net.osgiliath.hello.business.impl
 * %%
 * Copyright (C) 2013 Osgiliath
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import net.osgiliath.hello.business.model.Hellos;
import net.osgiliath.hello.business.spi.services.HelloService;
import net.osgiliath.hello.model.jpa.model.HelloEntity;

/**
 * see how it configures REST web services URIs.
 * 
 * @author charliemordant
 *
 */
@Path("/hello")
@Api(value = "hello", description = "The hello resource access")
public interface HelloServiceJaxRS extends HelloService {
  /**
   * Saves Hello.
   * @param helloObject element to save
   */
  @POST
  @Consumes(MediaType.APPLICATION_XML)
  void persistHello(@NotNull @Valid HelloEntity helloObject);

  /**
   * Gets hellos.
   * @return all elements
   */
  @GET
  @Produces(MediaType.APPLICATION_XML)
  @ApiOperation(value = "Find all hellos", notes = "More notes about this method", response = Hellos.class)
  Hellos getHellos();

  /**
   * deletes all hello.
   */
  @DELETE
  void deleteAll();
}
