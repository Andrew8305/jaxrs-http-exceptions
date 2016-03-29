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
 * HTTP 409 Conflict.
 * <p>
 *
 * <h2>Specification Details</h2>
 * The request could not be completed due to a conflict with the current state
 * of the resource. This code is only allowed in situations where it is expected
 * that the user might be able to resolve the conflict and resubmit the request.
 * The response body SHOULD include enough information for the user to recognize
 * the source of the conflict. Ideally, the response entity would include enough
 * information for the user or user agent to fix the problem; however, that
 * might not be possible and is not required.
 *
 * Conflicts are most likely to occur in response to a PUT request. For example,
 * if versioning were being used and the entity being PUT included changes to a
 * resource which conflict with those made by an earlier (third-party) request,
 * the server might use the 409 response to indicate that it can't complete the
 * request. In this case, the response entity would likely contain a list of the
 * differences between the two versions in a format defined by the response
 * Content-Type.
 *
 *
 * @author steve_siebert
 */
public class ConflictException extends WebApplicationException {

    public ConflictException(String message) {
        super(Response.status(Response.Status.CONFLICT)
                .entity(message).type(MediaType.TEXT_PLAIN).build());
    }

}
