
package com.sincapp.web;

import com.sincapp.domain.City;
import com.sincapp.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@RequestMapping("/City")
@Api(value = "Users microservice", description = "This API has a CRUD for users")
public class SampleController {

	@Autowired
	private CityService cityService;

        @RequestMapping(value = "all",method = RequestMethod.GET)
        @ApiOperation(value = "Find an city", notes = "Return a user by Id" )
	public City helloWorld() {
		return cityService.getCity("Cartagena", "Colombia");
	}

}
