package st.isacc.isacc.services.com.web.rest;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import st.isacc.isacc.services.com.entity.EmployeeBean;

import com.owlike.genson.Genson;
import com.owlike.genson.TransformationException;
import com.sun.jersey.api.JResponse;
import com.sun.jersey.api.client.ClientResponse;


@Path("users")
public class DemoRestController {


//    //it's ok for xml
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public JResponse<List<EmployeeBean>> getEmployees5() {
//        EmployeeBean emp = new EmployeeBean(1L, "John", "Doe");
//        List<EmployeeBean> list = new ArrayList<EmployeeBean>();
//        list.add(emp);
//        return JResponse.ok(list).build();
//   }
	
//    //it's ok for json
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getEmployees5() {
//        EmployeeBean emp = new EmployeeBean(1L, "John", "Doe");
//        EmployeeBean emp2 = new EmployeeBean(4L, "Johnsss", "Doesss");
//        List<EmployeeBean> list = new ArrayList<EmployeeBean>();
//        list.add(emp);
//        list.add(emp2);
//        Genson genson = new Genson();
//        String json="";
//		try {
//			json = genson.serialize(list);
//		} catch (TransformationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return json;
//        
//   }
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response  getEmployees5() {
		 EmployeeBean emp = new EmployeeBean(1L, "John", "Doe");
       List<EmployeeBean> list = new ArrayList<EmployeeBean>();
       list.add(emp);
		
		 return Response.ok(list).build();
	}
	


}
