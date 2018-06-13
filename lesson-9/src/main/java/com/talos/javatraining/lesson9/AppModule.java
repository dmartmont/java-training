package com.talos.javatraining.lesson9;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.multibindings.Multibinder;
import com.talos.javatraining.lesson9.events.EventBus;
import com.talos.javatraining.lesson9.events.impl.EventBusImpl;
import com.talos.javatraining.lesson9.factories.CommandFactory;
import com.talos.javatraining.lesson9.factories.impl.CommandFactoryImpl;
import com.talos.javatraining.lesson9.strategies.Calculator;
import com.talos.javatraining.lesson9.strategies.CalculatorStrategy;
import com.talos.javatraining.lesson9.strategies.impl.CalculatorTemplate;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AppModule extends AbstractModule
{
	@Override
	protected void configure() {
		bind(EventBus.class).to(EventBusImpl.class).asEagerSingleton();
		bind(Calculator.class).asEagerSingleton();
		bind(CommandFactory.class).to(CommandFactoryImpl.class).asEagerSingleton();

		MapBinder<String, CalculatorStrategy> strategies = MapBinder.newMapBinder(binder(), String.class, CalculatorStrategy.class);
		strategies.addBinding("basic").toInstance(new CalculatorTemplate(number ->
				number.setScale(5, RoundingMode.HALF_UP).toString()));
		strategies.addBinding("scientific").toInstance(new CalculatorTemplate(number -> {
			DecimalFormat formatter = new DecimalFormat("0.00E00");
			formatter.setRoundingMode(RoundingMode.HALF_UP);
			formatter.setMinimumFractionDigits(10);
			return formatter.format(number);
		}));
	}
}
