package in.ravi.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvertor {
	
	public static void main(String[] args)throws Exception {
		
		Address a = new Address();
		a.setCity("pune");
		a.setState("MH");
		a.setState("India");
		
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("ravi");
		c.setEmail("ravi@gmail.com");
		c.setPhone(788993456);
		c.setAddr(a);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file is created..");
	}
}
