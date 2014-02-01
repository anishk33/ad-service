package com.ads.service.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.springframework.stereotype.Service;

@Service("AppStatus")
@Path("/test")
public class AppTest {

	@GET
	@Path("/status")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAppStatus() {
		return Response.ok(new Status(true)).build();
	}

	@JsonAutoDetect
	public class Status {
		boolean status;

		public Status() {
		}

		public Status(final boolean status) {
			this.status = status;
		}

		public boolean getStatus() {
			return this.status;
		}
	}

}
