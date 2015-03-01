package conf;

/*
 * #%L
 * CDI configured business module
 * %%
 * Copyright (C) 2013 - 2014 Osgiliath
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

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.jaxrs.config.BeanConfig;
import com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON;

/**
 * Swagger service
 * @author charliemordant
 *
 */
@Path("/api-docs")
@Api("/api-docs")
@Produces(value = MediaType.APPLICATION_JSON )
public class SwaggerAPIAccessService extends ApiListingResourceJSON {
  /**
   * Swagger configuration
   */
  @Inject
  private transient BeanConfig config;
  /**
   * Creates configuration
   */
  @PostConstruct
  private void injectConfig() {
    this.config.toString();
  }

}
