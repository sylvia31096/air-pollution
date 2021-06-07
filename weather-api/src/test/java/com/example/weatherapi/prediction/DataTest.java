package com.example.weatherapi.prediction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.BDDAssertions.then;

@Rule
public WireMockRule wireMockRule = new WireMockRule(8089); // No-args constructor defaults to port 8080

@Test
public void DataTest{
    stubFor(post("/my/resource")
        .withHeader("Content-Type", containing("xml"))
        .willReturn(ok()
            .withHeader("Content-Type", "text/xml")
            .withBody("<response>SUCCESS</response>")));

    Result result = myHttpServiceCallingObject.doSomething();
    assertTrue(result.wasSuccessful());

    verify(postRequestedFor(urlPathEqualTo("/my/resource"))
        .withRequestBody(matching(".*message-1234.*"))
        .withHeader("Content-Type", equalTo("text/xml")));
}