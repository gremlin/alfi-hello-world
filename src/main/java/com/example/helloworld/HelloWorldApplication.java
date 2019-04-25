package com.example.helloworld;

import com.gremlin.*;

public class HelloWorldApplication {

	public static void main(String[] args) {

		final GremlinCoordinatesProvider coordinatesProvider = new GremlinCoordinatesProvider() {
			@Override
			public ApplicationCoordinates initializeApplicationCoordinates() {
				return new ApplicationCoordinates.Builder()
						.withType("HelloWorldExample")
						.withField("name", "ana-medina")
						.build();
			}
		};
		final GremlinServiceFactory gremlinServiceFactory = new GremlinServiceFactory(coordinatesProvider);
		final GremlinService gremlinService = gremlinServiceFactory.getGremlinService();

		final TrafficCoordinates injectionPoint = new TrafficCoordinates.Builder()
				.withType("main")
				.withField("name", "medina")
				.build();
		gremlinService.applyImpact(injectionPoint);
	}




}
