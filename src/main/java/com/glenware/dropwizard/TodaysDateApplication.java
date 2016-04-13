package com.glenware.dropwizard;

import com.glenware.dropwizard.resources.TodaysDateResource;
import com.glenware.dropwizard.health.TodaysDateHealthCheck;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.joda.time.DateTimeZone;

public class TodaysDateApplication extends Application<TodaysDateConfiguration> {
	public static void main(String[] args) throws Exception {
		new TodaysDateApplication().run(args);
	}

	@Override
	public String getName() {
		return "TodaysDate-microservice";
	}

	@Override
	public void initialize(Bootstrap<TodaysDateConfiguration> bootstrap) {
	}

	@Override
	public void run(TodaysDateConfiguration configuration, Environment environment) throws Exception {
		environment.jersey().register(new TodaysDateResource());
		environment.healthChecks().register("TodaysDateHC", new TodaysDateHealthCheck());
	}   
}

