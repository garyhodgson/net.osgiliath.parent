package net.osgiliath.messaging.cdi;

/*
 * #%L
 * net.osgiliath.features.karaf-features.itests.jpa
 * %%
 * Copyright (C) 2013 Osgiliath corp
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

import java.io.Serializable;

import lombok.Data;

/**
 * Entity sample.
 * @author charliemordant
 */
@Data
public class HelloEntity implements Serializable {
  /**
   * serial
   */
  private static final long serialVersionUID = -559379928931329555L;
  /**
   * Id
   */
  protected Long entityId;
  /**
   * Message
   */
  private String helloMessage;
}
