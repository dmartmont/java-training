package com.talos.javatraining.lesson9.commands.impl;

import com.talos.javatraining.lesson9.commands.AppCommand;
import com.talos.javatraining.lesson9.events.EventBus;
import com.talos.javatraining.lesson9.events.EventType;

import java.util.function.Supplier;


public class CommandTemplate implements AppCommand
{

	private String[] args;
	private EventBus eventBus;
	private Supplier<EventType> supplier;

	public CommandTemplate(EventBus eventBus, Supplier<EventType> supplier, String... args) {
		this.args = args;
		this.eventBus = eventBus;
		this.supplier = supplier;
	}

	@Override
	public void execute()
	{
		eventBus.notify(getEvent(), args);
	}

	public EventType getEvent() {
		return this.supplier.get();
	}
}
