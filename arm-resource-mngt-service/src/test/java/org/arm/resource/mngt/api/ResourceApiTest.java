package org.arm.resource.mngt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

import org.arm.resource.mngt.ArmRMSApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArmRMSApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ResourceApiTest {

	@LocalServerPort
	private int port;
	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();

	@SuppressWarnings("deprecation")
	@Test
	@DisplayName("getAllResourceApi Testing")
	public void testGetAllResource() {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<List> response = restTemplate.exchange(createURLWithPort("/resource/list"), HttpMethod.GET,
				entity, List.class);

		assertEquals(response.getBody().size(), 28);

	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
}


