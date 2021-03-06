package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;



@RestController
public class GreetingController {
	
	private static final String template ="Hello, %s!";
	private final AtomicLong counter= new AtomicLong();
	
	public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name) {
		
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
		
	}

}
