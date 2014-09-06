package net.osgiliath.helpers.swagger.cdi;

/*
 * #%L
 * net.osgiliath.helpers.swagger.cdi
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

import java.util.ArrayList;
import java.util.Collection;

import net.osgiliath.helpers.cdi.cxf.jaxrs.CDICXFFacade;
import scala.collection.immutable.List;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.wordnik.swagger.config.Scanner;

class CXFBeanJaxrsScanner extends Scanner {
  def transform(x: Object): Class[_] = {
    x.getClass();
  }
  override def classes(): List[Class[_]] = {
    val providers = CDICXFFacade.getProviders();
    List(providers).map(x => transform(x));

  }

}