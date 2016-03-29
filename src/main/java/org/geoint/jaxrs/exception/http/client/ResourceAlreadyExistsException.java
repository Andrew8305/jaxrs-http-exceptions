/*
 * Copyright 2016 geoint.org.
 *
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
 */
package org.geoint.jaxrs.exception.http.client;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Returns an HTTP 409 with an entity explaining the cause.
 *
 * @author steve_siebert
 */
public class ResourceAlreadyExistsException extends WebApplicationException {

    public ResourceAlreadyExistsException() {
        super(Response.status(Response.Status.CONFLICT)
                .entity("Unable to create resource, already exists.")
                .type(MediaType.TEXT_PLAIN).build());
    }

}
